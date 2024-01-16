package jp.ac.uryukyu.ie.e235710;

import java.util.Scanner;

/**
 * Startクラス ゲームを開始するかを決めるクラス
 * Scanner scannerは入力を受け付けるために使用
 */

public class Start {
    Scanner scanner;
    /**
     * コンストラクタ scannerを使えるように設定する。
     */
    public Start(){
        scanner = new Scanner(System.in);
    }

    /**
     * scannerで受け取った値でゲームを開始するか判断するメソッド<br>
     * numberを用いて開始するか判断。<br>
     * 0は開始、1は終了、それ以外の数字は受け付けない。ただし、文字を入れると強制終了してしまう。<br>
     * @param number int型の変数、scannerで受け取った値を格納する
     */

    public void selectGame(){
        
        System.out.println("0:開始する");
        System.out.println("1:終了する");

        while (true) {
            int number = scanner.nextInt();
            if(number == 0){
                System.out.println("開始");
                break;
            }else if (number == 1) {
                System.out.println("終了");
                System.exit(0);
            }else{
                System.out.println("0か1を入力してください");
            }

        }
    }
}
