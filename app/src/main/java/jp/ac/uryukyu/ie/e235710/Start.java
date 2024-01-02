package jp.ac.uryukyu.ie.e235710;

import java.util.Scanner;

public class Start {
    Scanner scanner;

    public Start(){
        scanner = new Scanner(System.in);
    }

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
