package org.sorting;

// 06/FEB/2024
public class SelectionSort {
    public static void main(String[] args) {
        for (int n : selectionSort(new int[]{4, 1, 3, 9, 7},5)){
            System.out.print(n+" ");
        }
    }

    static int[] selectionSort(int[] arr, int n) {
        int min_element;
        for (int i = 0; i < n-1; i++) {
            min_element = i;
            for (int j = i + 1; j < n ; j++) {
                if (arr[j] < arr[min_element]) min_element = j;
            }
            int temp = arr[i];
            arr[i] = arr[min_element];
            arr[min_element] = temp;
        }
        return arr;
    }
}
