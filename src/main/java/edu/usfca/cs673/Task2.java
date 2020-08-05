package edu.usfca.cs673;

import java.util.Arrays;

public class Task2 {

  public static int getNumberOfInversions(int[] A) {
    int n = A.length, cnt = 0;
    cnt += getInversionCount(A, 0, n-1);
    return cnt;
  }

  /**
   * Divide the array into left & right sub arrays and get the inversion count.
   *
   * @param array
   *  Initial array.
   * @param left
   *  Start index of array.
   * @param right
   *  End index of array.
   * @return int
   *  Number of inversions.
   */
  public static int getInversionCount(int[] array, int left, int right) {
    int count = 0;
    if (left < right) {
      int mid = (left + right) / 2;
      count += getInversionCount(array, left, mid);
      count += getInversionCount(array, mid+1, right);
      count += sortAndGetInversionCount(array, left, mid, right);
    }
    return count;
  }

  /**
   * Getting the count of the inversions while performing sort operations.
   *
   * @param arr
   *  Initial array.
   * @param left
   *  Starting index of array.
   * @param mid
   *  Midpoint of the divided array.
   * @param right
   *  End index of the array.
   * @return int
   *  Inversion counts while sorting.
   */
  public static int sortAndGetInversionCount(int[] arr, int left, int mid, int right) {
    int[] leftArray = Arrays.copyOfRange(arr, left, mid+1);
    int[] rightArray = Arrays.copyOfRange(arr, mid+1, right+1);
    int i=0, j=0, k=left, inversionCount =0;
    while(i < leftArray.length && j < rightArray.length) {
      if (leftArray[i] <= rightArray[j]) {
        arr[k] = leftArray[i];
        i++;
      } else {
        arr[k] = rightArray[j];
        inversionCount += (mid+1)-(left+i);
        j++;
      }
      k++;
    }
    while (i < leftArray.length) {
      arr[k] = leftArray[i];
      i++; k++;
    }
    while (j < rightArray.length) {
      arr[k] = rightArray[j];
      j++;
      k++;
    }
    return inversionCount;
  }
}
