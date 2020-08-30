package main.practice.iteration;

public class Iteration_for {
    //for 문을 이용하여 1~100까지 정수 중 3의 배수 총합을 구하는 코드

    public static void main(String[] args) {
        int sum = 0;

        for(int i=0;i<100;i++){

            if(i%3==0){
                sum=sum+i;
                System.out.print("현재 i 값은 "+i+"입니다");
                System.out.println("/  현재까지 총합은 "+sum+"입니다");
            }//if
        }//for

        System.out.println(" \n\n 최종 합은 "+sum+"입니다");
    }
}//Iteration_for
