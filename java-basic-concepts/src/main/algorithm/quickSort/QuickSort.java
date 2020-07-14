package main.algorithm.quickSort;

public class QuickSort {
    public static void main(String[] args) {

        int[] array = {132, 64, 82, 71, 93, 16, 38, 24, 87};

        //퀵 정렬
        quicksort(array, 0, array.length-1);

        //결과 출력
        for(int result : array){
            System.out.println(result);
        }//for

    }//main

    public static int partition(int[] array, int left, int right){
        int mid = (left+right)/2;
        swap(array, left, mid);

        int pivot = array[left];
        int i = left, j = right;

        while(i < j){

            while(pivot < array[j]){
                j--;
            }//whileInWhile1
            while(i < j && pivot >= array[i]){
                i++;
            }//whileInWhile2
            swap(array, i, j); //정렬 완료 후 반복 종료
        }//while

        array[left] = array[i];
        array[i] = pivot;

        return i;
    }//partition

    //위치 A와 위치 B의 값을 교체
    public static void swap(int[] array, int indexA, int indexB){
        int temp = array[indexB];
        array[indexB] = array[indexA];
        array[indexA] = temp;
    }//swap

    public static void quicksort(int[] array, int left, int right){
        if(left >= right){ // for문 대신 메소드 재귀호출(조건에 맞지 않을 경우)로 반복시행
            return;
        }//if

        int pivot = partition(array,left, right);

        quicksort(array, left, pivot -1);
        quicksort(array, pivot+1, right);
    }//quicksort
}//QuickSort
