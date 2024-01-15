package jp.ac.uryukyu.ie.e235710;

import java.util.Random;

public class Enemy {
    public static String enemy_system(String roleName){
        Random rnd = new Random();
        int number = rnd.nextInt(2);
        var enemy = new Card();
        while (true) {
            if(roleName.equals("奴隷")){
                if(number == 0){
                    if(enemy.slaveCard != 0){
                        return enemy.getSlaveName();
                    }
                }else if (number == 1){
                    if(enemy.s_citizen != 0){
                        return enemy.getCitizenName();
                    }
                }
            }else if(roleName.equals("皇帝")){
                if(number == 0){
                    if(enemy.slaveCard != 0){
                        return enemy.getEmperorName();
                    }
                }else if (number == 1){
                    if(enemy.s_citizen != 0){
                        return enemy.getCitizenName();
                    }
                }
            }
        }
    }
}
