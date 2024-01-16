package jp.ac.uryukyu.ie.e235710;

import java.util.Scanner;
/**
 * Roleクラス プレイヤーがどっちの陣営からスタートするか決めるクラス
 * Scanner scannerは入力を受け付けるために使用
 */
public class Role {
    Scanner scanner;

    /**
     * コンストラクタ scannerを使えるように設定する。
     */

    public Role(){
        scanner = new Scanner(System.in);
    }
    
    /**
     * scannerで受け取った値で皇帝か奴隷の陣営を決めるメソッド<br>
     * numberを用いて判断する。<br>
     * 0は皇帝、1は奴隷、それ以外の数字は受け付けない。ただし、文字を入れると強制終了してしまう。<br>
     * @param number int型の変数、scannerからの値を格納する
     * @return number int型の変数、Cardクラスで使う変数を返す。
     */

    public int selectRole(){
        System.out.println("皇帝か奴隷どちらの役からゲーム始めますか");
        System.out.println("0:皇帝");
        System.out.println("1:奴隷");

        while(true){
            int number = scanner.nextInt();
            if(number == 0){
                System.out.println("皇帝を選択しました");
                return number;
            }else if (number == 1) {
                System.out.println("奴隷を選択しました");
                return number;
            }else{
                System.out.println("0か1を入力してください");
            }

        }
    }
}
