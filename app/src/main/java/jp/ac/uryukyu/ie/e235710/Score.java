package jp.ac.uryukyu.ie.e235710;

public class Score {
    public int[] Score_calculation(int resultNum){
        int playerScore = 0;
        int enemyScore = 0;
        int[] array = new int[2];
        if(resultNum == 1){
            playerScore += 1;
        }else if(resultNum == 2){
            enemyScore += 1;
        }else if(resultNum == 3){
            playerScore += 2;
        }else if(resultNum == 4){
            enemyScore += 2;
        }
        array[0] = playerScore;
        array[1] = enemyScore;
        return array;
    }
}
