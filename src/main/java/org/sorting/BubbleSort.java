// 31/Jan/2024
/* Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. */

package org.sorting;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7,72,90,21,60};
        bubbleSort(arr,5);
        for (int n : arr){
            System.out.print(n+" ");
        }
    }
    static void bubbleSort(int arr[], int n)
    {
        boolean isSwapped = false;
        for(int i = 0; i<n-1; i++) {
            for(int j = 0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
    }
}
