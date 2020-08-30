package main.practice.iteration;

public class Iteration_star1 {
    //직사각형 단면의 우측하단 모양으로 * 출력
    public static void tri1(){
        for (int i=0; i < 4;i++){
            for(int j=0;j < 4;j++){
                if (i - j < 0){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }//forInFor
            System.out.println();
        }//for
    }//tri1

    public static void tri2(){
        for (int i=0; i < 4;i++){
            for(int j=0;j < 4;j++){
                if ( i + j < 3 ){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }//forInFor
            System.out.println();
        }//for
    }


    public static void main(String[] args) {
        tri1();
        tri2();
    }//main
}//Iteration_star1
