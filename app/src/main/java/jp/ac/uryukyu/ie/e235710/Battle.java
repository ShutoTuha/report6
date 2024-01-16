package jp.ac.uryukyu.ie.e235710;
/**
 * Battleクラス プレイヤーとenemyの選んだカードをもとに勝ち負けを判断するクラス
 */
public class Battle extends Card{

    /**
     * 勝ち負けを判断するメソッド。<br>
     * 最初にp_rolenumを用いて、enemyの陣営を決める。<br>
     * Enemyクラスのメソッドを呼び出して、enemyにカードを選ばせる。<br>
     * roleNameとe_roleNameを用いて、勝敗を決める。<br>
     * String e_roleName; //enemyが選んだカード名を格納する変数。<br>
     * @param roleName String型の変数。選ばれたカード名を格納する変数。
     * @param p_rolenum int型の変数。選ばれた陣営の数字が格納されている。皇帝は0,奴隷は1
     * @return resultNum int型の変数。勝敗の数字が格納されている。勝ちが1,負けが2,特殊勝利が3,特殊敗北は4
     */
    public static int battle_system(String roleName, int p_rolenum){
        String e_roleName;
        int resultNum = 0;
        if(p_rolenum == 0){
            e_roleName = Enemy.enemy_system(getSlaveName());
        }else{
            e_roleName = Enemy.enemy_system(getEmperorName());
        }

        System.out.printf("you:%s enemy:%s%n",roleName,e_roleName);
        if(roleName.equals("市民") && e_roleName.equals("市民")){
            System.out.println("あいこ");
            int citizenNum = Card.getE_citizen();
            Card.setE_citizen(citizenNum - 1);
            Card.setS_citizen(citizenNum - 1);
        }else if((roleName.equals("市民") && e_roleName.equals("奴隷")) 
                ||(roleName.equals("皇帝") && e_roleName.equals("市民")) ){
            System.out.println("勝ち");
            resultNum = 1;
        }else if((roleName.equals("市民") && e_roleName.equals("皇帝"))
                ||(roleName.equals("奴隷") && e_roleName.equals("市民"))){
            System.out.println("負け");
            resultNum = 2;
        }else if(roleName.equals("奴隷") && e_roleName.equals("皇帝")){
            System.out.println("特殊勝利");
            resultNum = 3;
        }else if(roleName.equals("皇帝") && e_roleName.equals("奴隷")){
            System.out.println("特殊敗北");
            resultNum = 4;
        }
        return resultNum;
    }
}
