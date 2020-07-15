package main.algorithm.quickSort;

import main.accessModifier.testPack1.A;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        //정렬을 원하는 배열
        int[] array = {132, 64, 82, 71, 93, 16, 38, 24, 87, 55};

        //회차를 나타내기 위한 숫자
        int count = 0;

        //정렬 전 배열 출력
        System.out.println("시행 전 배열 상태 : " + Arrays.toString(array));

        //퀵 정렬 시작
        quicksort(array, 0, array.length - 1, count);

    }//main

    public static void quicksort(int[] array, int left, int right, int count) {
        // for문 대신 메소드 재귀호출로 반복시행
        if (left >= right) { //
            // left>=right 조건은 left와 right가 같을 때 즉 비교할 원소가 하나밖에 없을 때 반복 종료된다.
            return;
        }//if

        int[] result = partition(array, left, right);

        count++;//회차를 1 증가

        //결과 출력
        System.out.println(count + "번째 시행결과 :   " + Arrays.toString(array) + ", 피봇(pivot) = " + result[1] + ",  정렬 후 배열 내 피봇의 위치 : " + (result[0] + 1) + "번째");


        quicksort(array, left, result[0] - 1, count);//피봇을 기준으로 피봇의 배열 내 위치보다 선순위 원소들끼리 정렬
        quicksort(array, result[0] + 1, right, count);//피봇을 기준으로 피봇의 배열 내 위치보다 후순위 원소들끼리 정렬
    }//quicksort

    public static int[] partition(int[] array, int left, int right) {
        //최초 시행 pivot을 배열의 맨 왼쪽에 위치한 값으로 선정 = array[0], left : 0, right : 9
        int pivot = array[left];
        int l = left, r = right;


        while (l < r) {
            while (pivot < array[r]) {
                r--;
            }//pivotLeft
            while (l < r && pivot >= array[l]) {
                l++;
            }//pivotRight

            //조건에 맞게 원소 배치 변경 후 반복 종료
            swap(array, l, r);
        }//while

        array[left] = array[l];
        array[l] = pivot;

        int[] result = {l, pivot}; // 이때 l은 피봇의 위치(index)
        return result;
    }//partition

    //위치 A와 위치 B의 값을 교체
    public static void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexB];
        array[indexB] = array[indexA];
        array[indexA] = temp;
    }//swap


}//QuickSort
