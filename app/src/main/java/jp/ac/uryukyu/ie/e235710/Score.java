package jp.ac.uryukyu.ie.e235710;
/**
 * Scoreクラス プレイヤーとenemyどちらが勝ったか判断し、勝ち点を振り分けるクラス
 */
public class Score {
    /**resultNumを用いて、どちらが勝ったか判断し、勝ち点を振り分けるメソッド。<br>
     * rusultNumが1の時はプレイヤーの勝ち点を1点増やす。2の時はenemyの勝ち点を1点増やす。<br>
     * 3の時は特殊勝利のためプレイヤーの勝ち点を2点増やす。4の時は特殊敗北のためenemyの勝ち点を2点増やす。<br>
     * int playerScore; プレイヤーの勝ち点を格納する変数。<br>
     * int enemyScore; 敵の勝ち点を格納する変数。<br>
     * @param resultNum int型の変数。勝敗の数字を格納する変数。
     * @return array list型の変数。playerScoreとenemyScoreの２つを格納する。
     */
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
