package main.practice.iteration;

public class Iteration_forRe {
    //4x+5y = 60 의 모든 해를 구해서 (x, y)형태로 출력하라

    public static void result(int x, int y){
        System.out.println("("+x+", "+y+")");
    }//result

    public static void main(String[] args) {

        //1. x, y는 10 이하 자연수 (0<x<11, 0<y<11)

        for (int x=1; x < 11 ; x++){
            for (int y=1; y < 11 ; y++){
                if(4*x+5*y==60){
                    result(x,y);
                }
            }
        }


    }//main
}//Iteration_forRe
