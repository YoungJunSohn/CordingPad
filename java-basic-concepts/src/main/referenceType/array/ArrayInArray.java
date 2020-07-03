package main.referenceType.array;

public class ArrayInArray {
    public static void main(String[] args) {
        int[][] codingScores = new int[2][]; //배열 A
        codingScores[0] = new int[2];//배열 B
        codingScores[1] = new int[3];//배열 C

//        for (int i=0; i < codingScores.length ; i++){
//            for (int j=0; j < codingScores.length ; j++){
//                System.out.println("scores["+i+"]["+j+"] = "+codingScores[i][j]);
//            }//forInFor
//        }//for
        System.out.println(codingScores.length); //배열 A는 배열B와 배열C를 참조함, 총 길이는 2
        System.out.println(codingScores[0].length); //배열 B의 길이 2
        System.out.println(codingScores[1].length); //배열 C의 길이 3
    }//main()
}//ArrayInArray
