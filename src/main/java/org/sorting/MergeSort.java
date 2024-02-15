// 15 FEB 2024

package org.sorting;

import java.util.Scanner;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements (space separated) : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n - 1);
        System.out.print("Sorted Array : ");
        Arrays.stream(arr).forEach(element-> System.out.print(element+" "));
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (r > l) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    static void merge(int[] arr, int l, int mid, int r) {
        int left = mid - l + 1;
        int right = r - mid;
        int[] leftArr = new int[left];
        int[] rightArr = new int[right];
        System.arraycopy(arr, l, leftArr, 0, left);
        System.arraycopy(arr, mid + 1, rightArr, 0, right);
        int i = 0, j = 0, index = l;
        while (i < left && right > j) {
            if (leftArr[i] <= rightArr[j]) arr[index++] = leftArr[i++];
            else arr[index++] = rightArr[j++];
        }
        while (i < left) arr[index++] = leftArr[i++];
        while (j < right) arr[index++] = rightArr[j++];
    }
}