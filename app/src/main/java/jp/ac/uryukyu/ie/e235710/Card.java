package jp.ac.uryukyu.ie.e235710;

import java.util.Scanner;

public class Card { static int emperorCard = 1;
    private static int slaveCard = 1;
    private static int e_citizen = 4;
    private static int s_citizen = 4;
    private static String emperorName = "皇帝";
    private static String slaveName = "奴隷";
    private static String citizenName = "市民";
    int resultNum;

    Scanner scanner;

    public static void setEmperorcard(int _emperorCard){
        emperorCard = _emperorCard;
    }

    public static void setSlaveCard(int _slaveCard){
        slaveCard = _slaveCard;
    }

    public static void setE_citizen(int _e_citizen){
        e_citizen = _e_citizen;
    }

    public static void setS_citizen(int _s_citizen){
        s_citizen = _s_citizen;
    }

    public static int getEmperorcard(){
        return emperorCard;
    }

    public static int getSlaveCard(){
        return slaveCard;
    }

    public static int getE_citizen(){
        return e_citizen;
    }

    public static int getS_citizen(){
        return s_citizen;
    }

    public static String getEmperorName(){
        return emperorName;
    }

    public static String getSlaveName(){
        return slaveName;
    }

    public static String getCitizenName(){
        return citizenName;
    }

    public Card(){
        scanner = new Scanner(System.in);
    }

    public int show_restcard(int rolenumber){
        System.out.println("どのカードを選びますか？");
        while(true){
            if(rolenumber == 0){
                System.out.printf("%nあなたは%s陣営です。%n",getEmperorName());
                System.out.printf("0:皇帝 残り%d枚%n",getEmperorcard());
                System.out.printf("1:市民 残り%d枚%n",getE_citizen());
                int selectNum =card_check(getEmperorcard(), getE_citizen());
                if(selectNum == 0){
                    resultNum = Battle.battle_system(getEmperorName(),rolenumber);
                }else{
                    resultNum = Battle.battle_system(getCitizenName(),rolenumber);
                }
            }else{
                System.out.printf("%nあなたは%s陣営です。%n",getSlaveName());
                System.out.printf("0:奴隷 残り%d枚%n",getSlaveCard());
                System.out.printf("1:市民 残り%d枚%n",getS_citizen());
                int selectNum = card_check(getSlaveCard(), getS_citizen());
                if(selectNum == 0){
                    resultNum = Battle.battle_system(getSlaveName(),rolenumber);
                }else{
                    resultNum = Battle.battle_system(getCitizenName(),rolenumber);
                }
            }
        if(resultNum != 0){
            return resultNum;
        }
    }
}

    public int card_check(int roleCard,int citizen){
        while(true){
            int number = scanner.nextInt();
            if(number == 0){
                if(roleCard != 0){
                    return number;
                }else{
                    System.out.println("選んだカードはもうありません。別のカードを選んでください。");
                }
            }else if (number == 1){
                if(citizen != 0){
                    return number;
                }else{
                    System.out.println("選んだカードはもうありません。別のカードを選んでください。");
                }
            }else{
                System.out.println("0か1を入力してください");
            }
        }
    }
}

