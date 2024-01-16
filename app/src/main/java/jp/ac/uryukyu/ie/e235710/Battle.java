package jp.ac.uryukyu.ie.e235710;

public class Battle extends Card{

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
