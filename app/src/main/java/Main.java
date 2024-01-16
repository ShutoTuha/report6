import jp.ac.uryukyu.ie.e235710.*;

public class Main {
    public static void main(String[] args){
        int rolenumber;
        int resultNum;
        int playerScore = 0;
        int enemyScore = 0;
        int role_initial_value = 1;
        int initial_value = 4;
        var select_game = new Start();
        var select_role = new Role();
        var player = new Card();
        var score = new Score();


        select_game.selectGame();
        rolenumber = select_role.selectRole();
        while (playerScore < 5 && enemyScore < 5) {
            Card.setEmperorcard(role_initial_value);
            Card.setSlaveCard(role_initial_value);
            Card.setE_citizen(initial_value);
            Card.setS_citizen(initial_value);
            if(rolenumber == 0){
                resultNum = player.show_restcard(rolenumber);
                rolenumber += 1;
            }else{
                resultNum = player.show_restcard(rolenumber);
                rolenumber -= 1;
            }
            int[] array = score.Score_calculation(resultNum);
            playerScore += array[0];
            enemyScore += array[1];
            System.out.printf("you: %d点 enemy: %d点%n%n",playerScore,enemyScore);
        }
        System.out.println("最終結果");
        System.out.printf("you: %d点 enemy: %d点",playerScore,enemyScore);
        if(playerScore > enemyScore){
            System.out.println("playerの勝ち(・-・)v");
        }else{
            System.out.println("playerの負け(^ ω ^)");
        }
        
    }
}
