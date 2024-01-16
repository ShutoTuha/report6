package jp.ac.uryukyu.ie.e235710;
/**
 * Jadgeクラス プレイヤーとenemyの勝ち点を元に最終的な勝利を決めるクラス
 */
public class Jadge {
    /**どちらかの勝ち点が5点以上になるまで、勝負が続く。
     * 1ターンごとに陣営は自動で入れ替わる。
     * 1ターンごとにどっちが勝ったか判定し、勝ち点を増やしていく。
     * int playerScore; プレイヤーの勝ち点が格納されている。
     * int enemyScore; 敵の勝ち点が格納されている。
     * int role_initial_value; 皇帝や奴隷のカードの初期値が格納されている。初期値は1
     * int initial_value; 市民のカードの初期値が格納されている。初期値は4
     * int resultNum; 勝敗の数字が格納されている変数。
     * @param rolenumber int型の変数。プレイヤーの選んだ陣営の数字が格納されている。
     */
    public static void jadge_game(int rolenumber){
    int playerScore = 0;
    int enemyScore = 0;
    int role_initial_value = 1;
    int initial_value = 4;
    int resultNum;
    var player = new Card();
    var score = new Score();

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
    System.out.printf("you: %d点 enemy: %d点%n",playerScore,enemyScore);
    if(playerScore > enemyScore){
        System.out.println("playerの勝ち(・-・)v");
    }else{
        System.out.println("playerの負け(^ ω ^)");
    }
    }
    
}
