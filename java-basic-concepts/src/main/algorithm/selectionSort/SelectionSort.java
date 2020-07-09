package main.algorithm.selectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] selectionSort = {91, 73, 3, 123, 34, 29, 18, 78, 82, 16};
        int temp, indexMin;

        for(int i=0;i < selectionSort.length-1;i++){ //1 : 0~n-1까지 총 n회 반복
            indexMin = i;

            for (int j=i+1 ; j < selectionSort.length;j++){//2 : 수행후 다음 정렬에서는 0번 index를 제외해야하므로 j = i+1

                if(selectionSort[j] < selectionSort[indexMin]){ //3 : 두 수를 비교 후 작은 수를 indexMin으로 갱신
                    indexMin = j;
                }//if
            }//forInFor

            //4 : swap(selectionSort[indexMin], selectionSort[i])
            temp = selectionSort[indexMin];
            selectionSort[indexMin] = selectionSort[i];
            selectionSort[i] = temp;

            System.out.println((i+1)+"번째 수행 : "+Arrays.toString(selectionSort));
        }//for
    }//main()
}//SelectionSort
