package edu.usfca.cs673;

import java.util.HashMap;

public class Task1 {
  // TODO: When returning your answer, take the answer modulo MOD (i.e., "answer" % MOD),
  // because the numbers can get really large and lead to integer overflow.

  final static int MOD = 99991;
  static HashMap<Integer, Integer> cacheNoOfWays = new HashMap<>();

  public static int getNumberOfWaysRecursive(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    if (cacheNoOfWays.containsKey(n)) {
      return cacheNoOfWays.get(n);
    }
    int leftChild = getNumberOfWaysRecursive(n - 1);
    cacheNoOfWays.put(n - 1, leftChild);
    int rightChild = getNumberOfWaysRecursive(n - 2);
    cacheNoOfWays.put(n - 2, rightChild);
    int answer = leftChild + rightChild;
    return answer % MOD;
  }

  public static int getNumberOfWaysIterative(int n) {
    int prev = 0;
    int next = 1;
    for (int i = 1; i <= n; i++) {
      int answer = (prev + next) % MOD;
      prev = next;
      next = answer;
    }
    return next;
  }
}
