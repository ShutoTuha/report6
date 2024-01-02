package jp.ac.uryukyu.ie.e235710;

import java.util.Scanner;

public class Role {
    Scanner scanner;

    public Role(){
        scanner = new Scanner(System.in);
    }
    

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
