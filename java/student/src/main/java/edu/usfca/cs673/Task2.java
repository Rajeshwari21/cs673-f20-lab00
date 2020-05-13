package edu.usfca.cs673;

public class Task2 {
  public static int getNumberOfInversions(int[] A) {
    // TODO: Implement this.
    int n = A.length, cnt = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (A[i] > A[j])
          cnt++;
      }
    }
    return cnt;
  }
}
