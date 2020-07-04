package main.referenceType.array;

public class ArrayInArray {
    public static void main(String[] args) {
        int[][] codingScores = new int[2][]; //배열 A
        codingScores[0] = new int[2];//배열 B
        codingScores[1] = new int[3];//배열 C
        System.out.println("codingScores 길이"+codingScores.length); //배열 A는 배열B와 배열C를 참조함, 총 길이는 2
        System.out.println("codingScores[0] 길이"+codingScores[0].length); //배열 B의 길이 2
        System.out.println("codingScores[1] 길이"+codingScores[1].length); //배열 C의 길이 3
        System.out.println();

        codingScores = new int[2][3];// 2x3 배열 생성, 배열은 인덱스 0부터 시작임에 주의/ 출력하려면 어떻게 해야할까

        for (int i=0; i < codingScores.length ; i++){
            for (int j=0; j < codingScores[i].length ; j++){
                System.out.println("scores["+i+"]["+j+"] = "+codingScores[i][j]);
            }//forInFor
        }//for

        System.out.println();

        int[][] arrayTest = {{95, 22}, {65, 77, 89}};

        for(int i=0 ;i < arrayTest.length ;i++){
            for(int j=0;j < arrayTest[i].length ; j++){
                System.out.println("arrayTest["+i+"]["+j+"] =" +arrayTest[i][j]);
            }//for in for
        }//for

    }//main()
}//ArrayInArray
