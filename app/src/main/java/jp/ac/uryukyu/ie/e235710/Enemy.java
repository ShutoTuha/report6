package jp.ac.uryukyu.ie.e235710;

import java.util.Random;
/**
 * Enemyクラス 敵がどの陣営かを判断し、自動でカードを選択するクラス
 */
public class Enemy {
    /**
     * 敵の陣営を判断し、カードを選択するメソッド。
     * roleNameを使い、enemyの陣営を判断する。
     * そして、numberを使って選ばれたカードが残っているか確認し、カードの選択を確定する。
     * int number; //0~1の中からランダムな値を格納する。
     * @param roleName
     * @return getterメソッドから文字列を返す。getEmperorName(),getSlaveName(),getCitizenName()の中から選ばれる。
     */
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
