package main.practice.iteration;


public class Iteration_while {
    //while 문과 Math.random() 메소드를 이용해 2개의 주사위를 던졌을 때 나오는 눈을 눈1, 눈2로 출력하고
    //눈의 합이 5가 아닌 경우 계속 주사위를 던지고 눈의 합이 5일때 실행을 멈추는 코드

    public static int pickOne(){
        return (int)Math.ceil(Math.random()*10);// 1~10까지 정수 하나 픽
    }//pickOne()

    public static int diceRoll(String str){
        int dice = pickOne();
        while(dice > 6){ // 주사위 숫자 1~6까지만 나오도록
            dice = pickOne();
        }
        System.out.println(str+dice);
        return dice;
    }

    public static int sum(int n1, int n2){
        return n1+n2;
    }

    public static String str(int diceNum,int count){
        return diceNum+"번 주사위 "+count+" 번째 주사위수 : ";
    }

    public static void main(String[] args) {
        int count = 1;
        int n1 = 0;
        int n2 = 0;

        while (sum(n1,n2)!=5) {

            n1 = diceRoll(str(1, count));
            n2 = diceRoll(str(2, count));
            System.out.println();
            count++;
        }
        System.out.println("주사위의 합이 5("+n1+"+"+n2+")가 되었으므로 연산을 종료합니다.(총 "+count+"회 연산)");
    }//main
}//Iteration_while
