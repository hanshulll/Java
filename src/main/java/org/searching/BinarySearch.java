// 30/Jan/2024

/*Binary Search is defined as a searching algorithm used in a sorted array by repeatedly dividing the search interval in half.
The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(log N).
 */

package org.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements (space separated): ");
        for (int i =0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the key to be searched in the array : ");
        int key = sc.nextInt();
        System.out.printf("Key exists in the array : "+binarySearch(arr,key));
    }

    static boolean binarySearch(int[] arr,int key) {
        int length = arr.length;
        int low = 0;
        int high = length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = arr[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return true;
                // return mid; // key found
        }
        // return -(low + 1);  // key not found.
        return false;
    }

}
