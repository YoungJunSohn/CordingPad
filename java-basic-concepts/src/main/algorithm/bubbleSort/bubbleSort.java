package main.algorithm.bubbleSort;

public class bubbleSort {

    public static void main(String[] args) {
        //배열로 거품정렬
        int[] arr = {1, 9, 64, 75, 55, 97,8, 6};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }//if
            }//forInFor
        }//for

        for(int i=0;i < arr.length;i++){
            System.out.println(arr[i]);
        }//for

    }//main

}//bubbleSort
