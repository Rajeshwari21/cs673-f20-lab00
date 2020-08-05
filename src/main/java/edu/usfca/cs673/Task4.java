package edu.usfca.cs673;

import java.util.HashMap;

public class Task4{

  static HashMap<Integer, Integer> outcomes = new HashMap<>();
  public static double getProbability(int n, int k) {
    Task3 task3 = new Task3();
    double val = 0;
    if (n % 2 == 0 && k == 0) {
      int r = n / 2;
      long answer = task3.combination(n, r);
      val = answer / (Math.pow(2, n));
    }
    else if (n % 2 != 0 && k == 0) {
      return val;
    }
    else if (n == k) {
      val = 2 / (Math.pow(2, n));
    }
    else {
      int[] heads = possibleHeads(n);
      int[] tails = possibleTails(n);
      for (int i = 0; i < n; i++) {
        int ans = heads[i] - tails[i];
        if (ans > 0) {
          outcomes.put(ans, i);
        }
      }
      if (outcomes.containsKey(k)) {
        int r = outcomes.get(k);
        long answer = task3.combination(n, r);
        val = (answer + answer) / (Math.pow(2, n));
      }
       outcomes.clear();
    }
    return val;
  }

  /**
   * Get the heads when coins are tossed.
   *
   * @param n
   *  n is the Number of coins tossed.
   * @return array
   *  Number of heads.
   */
  public static int[] possibleHeads(int n) {
    int []heads = new int[n];
    for (int i = 0; i < n; i++) {
      heads[i] = n-i;
    }
    return heads;
  }

  /**
   * Get the tails when coins are tossed.
   *
   * @param n
   *  n is the Number of coins tossed.
   * @return array
   *  Number of tails.
   */
  public static int[] possibleTails(int n) {
    int []tails = new int[n];;
    for (int i = n; i > 0; i--) {
      tails[n-i] = n-i;
    }
    return tails;
  }

}
