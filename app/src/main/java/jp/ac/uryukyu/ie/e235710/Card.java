package jp.ac.uryukyu.ie.e235710;

import java.util.Scanner;

public class Card {
    int emperorCard = 1;
    int slaveCard = 1;
    int e_citizen = 4;
    int s_citizen = 4;
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
        return this.emperorCard;
    }

    public int getSlaveCard(){
        return this.slaveCard;
    }

    public int getE_citizen(){
        return this.e_citizen;
    }

    public int getS_citizen(){
        return this.s_citizen;
    }

    public Card(){
        scanner = new Scanner(System.in);
    }

    public void show_restcard(int rolenumber){
        System.out.println("どのカードを選びますか？");
            if(rolenumber == 0){
                System.out.printf("0:皇帝 残り%d枚%n",emperorCard);
                System.out.printf("1:市民 残り%d枚%n",e_citizen);
                card_check(emperorCard, e_citizen);
            }else{
                System.out.printf("0:奴隷 残り%d枚%n",slaveCard);
                System.out.printf("1:市民 残り%d枚%n",s_citizen);
                card_check(slaveCard, s_citizen);
            }
    }

    public void card_check(int roleCard,int citizen){
        while(true){
            int number = scanner.nextInt();
            if(number == 0){
                if(roleCard != 0){
                    //ここでBattle.javaのメソッドを入れる
                }else{
                    System.out.println("選んだカードはもうありません。別のカードを選んでください。");
                }
            }else if (number == 1){
                if(citizen != 0){
                    //ここでBattle.javaのメソッドを入れる
                }else{
                    System.out.println("選んだカードはもうありません。別のカードを選んでください。");
                }
            }else{
                System.out.println("0か1を入力してください");
            }
        }
    }
}
/*if( || ){

                }else{
                    
                }
            }else{
*/
