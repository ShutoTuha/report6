package jp.ac.uryukyu.ie.e235710;

import java.util.Random;

public class Enemy {
    public static String enemy_system(String roleName){
        Random rnd = new Random();
        int number = rnd.nextInt(2);
        while (true) {
            if(roleName.equals("奴隷")){
                if(number == 0){
                    if(Card.getSlaveCard() != 0){
                        return Card.getSlaveName();
                    }
                }else if (number == 1){
                    if(Card.getS_citizen() != 0){
                        return Card.getCitizenName();
                    }
                }
            }else if(roleName.equals("皇帝")){
                if(number == 0){
                    if(Card.getEmperorcard() != 0){
                        return Card.getEmperorName();
                    }
                }else if (number == 1){
                    if(Card.getE_citizen() != 0){
                        return Card.getCitizenName();
                    }
                }
            }
        }
    }
}
