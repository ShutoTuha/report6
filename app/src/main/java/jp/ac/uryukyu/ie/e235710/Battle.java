package jp.ac.uryukyu.ie.e235710;

public class Battle extends Card{

    public static void battle_system(String roleName, int p_rolenum){
        var enemy = new Card();
        String e_roleName;
        if(p_rolenum == 0){
            e_roleName = Enemy.enemy_system(enemy.getSlaveName());
        }else{
            e_roleName = Enemy.enemy_system(enemy.getEmperorName());
        }

        System.out.printf("you:%s enemy:%s%n",roleName,e_roleName);
        if(roleName.equals("市民") && e_roleName.equals("市民")){
            System.out.println("あいこ");
            int num = enemy.getE_citizen();
            System.out.println(num);
            enemy.setE_citizen( num - 1);
            int num1 = enemy.getE_citizen();
            System.out.println(num1);
            enemy.setS_citizen( num - 1);
        }else if((roleName.equals("市民") && e_roleName.equals("奴隷")) 
                ||(roleName.equals("皇帝") && e_roleName.equals("市民")) 
                ||(roleName.equals("奴隷")) && e_roleName.equals("皇帝")){
            System.out.println("勝ち");
            System.exit(0);
        }else if((roleName.equals("市民") && e_roleName.equals("皇帝"))
                ||(roleName.equals("皇帝") && e_roleName.equals("奴隷"))
                ||(roleName.equals("奴隷")) && e_roleName.equals("市民")){
            System.out.println("負け");
            System.exit(0);
        }
    }
}
