package main.practice.iteration;

import java.util.Scanner;

public class ATM {

    public static void message(int deposit, String action){
        smg("현재 "+action+"액은 "+deposit+"원입니다.");
        smg(action+"하실 금액을 입력해주세요(단위/원)");
    }//message

    public static void smg(String msg){
        System.out.println(msg);
    }
    public static void plz(){
        smg("올바른 번호를 입력해주세요!");
    }
    public static void result(int deposit){
        smg("잔고는 "+deposit+"원 입니다.");
        smg("이용해 주셔서 감사합니다!");
    }

    public static void main(String[] args) {
        int deposit = 0;
        Scanner scan = new Scanner(System.in);
        String action = null;


        while(true){
            smg("");
            smg("------------------------------------------");
            smg(" 1. 예금  | 2. 출금  | 3. 잔고  | 4. 종료");
            smg("------------------------------------------");
            smg("> 선택하세요");


            String num = scan.nextLine();

            switch (num){
                case "1":
                    action = "예금";
                    message(deposit, action);

                    String plus = scan.nextLine();
                    try{
                        deposit = deposit + Integer.parseInt(plus);
                        result(deposit);

                    }catch (Exception e){
                        plz();
                        System.out.println();
                        System.out.println();
                    }
                    break;
                case "2":
                    action = "출금";
                    message(deposit, action);
                    String minus = scan.nextLine();
                    try{
                        deposit = deposit - Integer.parseInt(minus);
                        if(deposit > 0){
                            result(deposit);
                        }else{
                            deposit = deposit + Integer.parseInt(minus);
                            smg("잔액이 부족합니다. (현재 "+deposit+"원 출금 가능)");
                        }

                    }catch (Exception e){
                        plz();
                        System.out.println();
                        System.out.println();
                    }
                    break;
                case "3":
                    result(deposit);
                    break;
                case "4":
                    smg("프로그램이 곧 종료됩니다. 잠시만 기다려주세요");
                    break;
                default:
                    plz();
            }//switch

            if(num.equals("4")){
                smg("프로그램을 종료합니다.");
                break;
            }
        }//while

    }//
}//ATM
