package main.algorithm.insertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] array =  {132, 64, 82, 71, 93, 16, 38, 24, 87};

        for(int index =1 ;index < array.length ; index++){
            //첫 번째 위치[index]에는 어떠한 원소도 갖고 있지 않기 때문에, 두번째 위치(index : 1)부터 탐색을 시작
            int temp = array[index];

            //변수 temp에 임시로 배열의 해당 위치(index)값을 저장하고, prev에는 배열의 이전 위치값을 저장
            int prev = index - 1; //prev는 0부터 시작


            while((prev >=0) && (array[prev] > temp)){

                array[prev+1] = array[prev];
                prev--;
                //현재 temp값보다 작은 값들 중 제일 큰 값의 위치(index) 가 prev에 남게 됨
            }//while

            array[prev+1] = temp; //해당 회차에 정렬이 완료 된 값을 prev+1 위치에 저장

            System.out.println(index+"회차 : "+Arrays.toString(array));
        }//for


    }//main
}//InsertionSort
