package jp.ac.uryukyu.ie.e235710;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BattleTest {
    @Test
    void jadgeTest() {
        /**
         * プレイヤーが市民選んだ時の勝敗が2パターンあることを検証。
         * 検証手順
         * (1) 最後に出るであろう、勝敗の数字をfinalの変数に格納する。
         * (2) 自分が選ぶカードをselectCardに格納する。
         * (3) 最後に(1)で選んだ2つのパターンになることを確認する。
         */
        int resultNum;
        int final_resultNum_p1 = 1;
        int final_resultNum_p2 = 4;
        String selectCard = "市民";
        resultNum = Battle.battle_system(selectCard,0);
        if(resultNum == final_resultNum_p1){
            assertEquals(final_resultNum_p1, resultNum);
        }else if(resultNum == final_resultNum_p2){
            assertEquals(final_resultNum_p2, selectCard);
        }
        
    }
}
