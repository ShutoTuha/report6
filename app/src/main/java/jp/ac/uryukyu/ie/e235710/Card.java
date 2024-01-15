package jp.ac.uryukyu.ie.e235710;

import java.util.Scanner;

public class Card {
    int emperorCard = 1;
    int slaveCard = 1;
    int e_citizen = 4;
    int s_citizen = 4;
    String emperorName = "皇帝";
    String slaveName = "奴隷";
    String citizenName = "市民";

    Scanner scanner;

    public void setEmperorcard(int _emperorCard){
        emperorCard = _emperorCard;
    }

    public void setSlaveCard(int _slaveCard){
        slaveCard = _slaveCard;
    }

    public void setE_citizen(int _e_citizen){
        e_citizen = _e_citizen;
    }

    public void setS_citizen(int _s_citizen){
        s_citizen = _s_citizen;
    }

    public int getEmperorcard(){
        return emperorCard;
    }

    public int getSlaveCard(){
        return slaveCard;
    }

    public int getE_citizen(){
        return e_citizen;
    }

    public int getS_citizen(){
        return s_citizen;
    }

    public String getEmperorName(){
        return emperorName;
    }

    public String getSlaveName(){
        return slaveName;
    }

    public String getCitizenName(){
        return citizenName;
    }

    public Card(){
        scanner = new Scanner(System.in);
    }

    public void show_restcard(int rolenumber){
        System.out.println("どのカードを選びますか？");
        while(true){
            if(rolenumber == 0){
                System.out.printf("0:皇帝 残り%d枚%n",getEmperorcard());
                System.out.printf("1:市民 残り%d枚%n",getE_citizen());
                int selectNum =card_check(getEmperorcard(), getE_citizen());
                if(selectNum == 0){
                    Battle.battle_system(getEmperorName(),rolenumber);
                }else{
                    Battle.battle_system(getCitizenName(),rolenumber);
                }
            }else{
                System.out.printf("0:奴隷 残り%d枚%n",getSlaveCard());
                System.out.printf("1:市民 残り%d枚%n",getS_citizen());
                int selectNum = card_check(getSlaveCard(), getS_citizen());
                if(selectNum == 0){
                    Battle.battle_system(getSlaveName(),rolenumber);
                }else{
                    Battle.battle_system(getCitizenName(),rolenumber);
                }
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
