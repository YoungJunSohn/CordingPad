package main.algorithm.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] array = {132, 64, 82, 71, 93, 16, 38, 24, 87, 55};

        mergeSort(array, 0, array.length-1);


    }//main

    public static void mergeSort(int[] array, int left, int right){
        if(left < right){
            int mid = (left+right)/2;

            mergeSort(array, left, mid);
            mergeSort(array, mid+1, right);

            merge(array, left, mid, right);
        }//if
    }//mergeSort()

    public static void merge(int[] array, int left, int mid, int right){
        //copyOfRange(배열복사) - Arrays.copyOfRange(원본배열, 복사시작인덱스, 복사끝인덱스)
        int[] l = Arrays.copyOfRange(array, left, mid+1);
        int[] r = Arrays.copyOfRange(array, mid+1, right+1);

        int i = 0, j = 0, k = left;
        int leftSide = l.length, rightSide = r.length;

        while(i < leftSide && j < rightSide){

            if( l[i] <= r[j] ){
                array[k] = l[i++];
            }else {
                array[k] = r[j++];
            }//if

            k++;
        }//while1

        while(i < leftSide){
            array[k++] = l[i++];
        }//while2

        while(j < rightSide){
            array[k++] = r[j++];
        }//while3

        System.out.println("시행 결과 : "+Arrays.toString(array));
    }//merge
}//MergeSort
