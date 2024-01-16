package jp.ac.uryukyu.ie.e235710;

import java.util.Scanner;

/**
 * Cardクラス 選ばれた陣営からカードを選択させるクラス
 * int emperorCard; //皇帝のカードの枚数
 * int slaveCard; //奴隷のカードの枚数
 * int e_citizen; //皇帝陣営の市民カードの枚数
 * int s_citizen; //奴隷陣営の市民カードの枚数
 * String emperorName; //文字列:"皇帝"が格納されている
 * String slaveName; //文字列:"皇帝"が格納されている
 * String citizenName; //文字列:"皇帝"が格納されている
 * Scanner scanner;
 */

public class Card { 
    static int emperorCard = 1;
    private static int slaveCard = 1;
    private static int e_citizen = 4;
    private static int s_citizen = 4;
    private static String emperorName = "皇帝";
    private static String slaveName = "奴隷";
    private static String citizenName = "市民";
    int resultNum;

    Scanner scanner;
    /**
     * コンストラクタ scannerを使えるように設定
     */
    public Card(){
        scanner = new Scanner(System.in);
    }

    /**
     * 皇帝のカードの枚数を変更
     * @param _emperorCard
     */

    public static void setEmperorcard(int _emperorCard){
        emperorCard = _emperorCard;
    }

    /**
     * 奴隷のカードの枚数を変更
     * @param _slaveCard
     */

    public static void setSlaveCard(int _slaveCard){
        slaveCard = _slaveCard;
    }

    /**
     * 皇帝陣営の市民カードの枚数を変更
     * @param _e_citizen
     */

    public static void setE_citizen(int _e_citizen){
        e_citizen = _e_citizen;
    }

    /**
     * 奴隷陣営の市民カードの枚数を変更
     * @param _s_citizen
     */

    public static void setS_citizen(int _s_citizen){
        s_citizen = _s_citizen;
    }

    /**
     * 皇帝のカードの枚数を取得
     * @return
     */

    public static int getEmperorcard(){
        return emperorCard;
    }

    /**
     * 奴隷のカードの枚数を取得
     * @return
     */

    public static int getSlaveCard(){
        return slaveCard;
    }

    /**
     * 皇帝陣営の市民カードの枚数を取得
     * @return
     */

    public static int getE_citizen(){
        return e_citizen;
    }

    /**
     * 奴隷陣営の市民カードの枚数を取得
     * @return
     */

    public static int getS_citizen(){
        return s_citizen;
    }

    /**
     * "皇帝"を取得
     * @return
     */

    public static String getEmperorName(){
        return emperorName;
    }

    /**
     * "奴隷"を取得
     * @return
     */

    public static String getSlaveName(){
        return slaveName;
    }

    /**
     * "市民"を取得
     * @return
     */

    public static String getCitizenName(){
        return citizenName;
    }

    /**
     * 選ばれた陣営のカードを選択させるメソッド<br>
     * rolenumberを用いて、皇帝と奴隷のどちらが選ばれたかを判断。<br>
     * カードの残り枚数を表示して、プレイヤーの入力を待つ。<br>
     * card_checkメソッドを使って、選ばれたカードとそれが残っているかを確認する。<br>
     * 最後にBattleクラスを呼びたして、enemyと勝負する。
     * @param rolenumber int型の変数、皇帝は0,奴隷は1で陣営の判断に使う変数
     * @return resultNum int型の変数、Bttleクラスの戻り値。勝ち負けの判断に使う変数
     */

    public int show_restcard(int rolenumber){
        System.out.println("どのカードを選びますか？");
        while(true){
            if(rolenumber == 0){
                System.out.printf("%nあなたは%s陣営です。%n",getEmperorName());
                System.out.printf("0:皇帝 残り%d枚%n",getEmperorcard());
                System.out.printf("1:市民 残り%d枚%n",getE_citizen());
                int selectNum =card_check(getEmperorcard(), getE_citizen());
                if(selectNum == 0){
                    resultNum = Battle.battle_system(getEmperorName(),rolenumber);
                }else{
                    resultNum = Battle.battle_system(getCitizenName(),rolenumber);
                }
            }else{
                System.out.printf("%nあなたは%s陣営です。%n",getSlaveName());
                System.out.printf("0:奴隷 残り%d枚%n",getSlaveCard());
                System.out.printf("1:市民 残り%d枚%n",getS_citizen());
                int selectNum = card_check(getSlaveCard(), getS_citizen());
                if(selectNum == 0){
                    resultNum = Battle.battle_system(getSlaveName(),rolenumber);
                }else{
                    resultNum = Battle.battle_system(getCitizenName(),rolenumber);
                }
            }
        if(resultNum != 0){
            return resultNum;
        }
    }
}
    /**
     * どのカードが選ばれたか、そのカードが残っているかを判断するメソッド<br>
     * numberを用いて、どのカードが選ばれたか判断。<br>
     * roleCardやcitizenを用いて、そのカードが残ってるか判断。<br>
     * @param roleCard int型の変数、皇帝か奴隷のカードの枚数を格納する
     * @param citizen int型の変数、市民のカードの枚数を格納する
     * @return number int型の変数、scannerの値を格納する。選んだカードの変数が格納される。
     */
    public int card_check(int roleCard,int citizen){
        while(true){
            int number = scanner.nextInt();
            if(number == 0){
                if(roleCard != 0){
                    return number;
                }else{
                    System.out.println("選んだカードはもうありません。別のカードを選んでください。");
                }
            }else if (number == 1){
                if(citizen != 0){
                    return number;
                }else{
                    System.out.println("選んだカードはもうありません。別のカードを選んでください。");
                }
            }else{
                System.out.println("0か1を入力してください");
            }
        }
    }
}

