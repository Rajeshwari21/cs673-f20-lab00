package edu.usfca.cs673;

public class Task3 {
  // TODO: When returning your answer, take the answer modulo MOD (i.e., "answer" % MOD),
  // because the numbers can get really large and lead to integer overflow.

  final static int MOD = 99991;

  public static long getNumberOfTeamFormations(int n) {
    // TODO: Implement this.
    long val = combination(2*n, n);
    long teamOfTwo = val / 2; // As said we need to divide the students into two team.
    return teamOfTwo % MOD;
  }

  /**
   * Perform the combination operation i.e nCr.
   *
   * @param n
   *  The higher limit of the Combination.
   * @param r
   *  The lower limit of the Combination.
   * @return int
   *  The answer after performing Combination operation.
   */
  public static long combination(long n, long r) {
    long comb = 1;
    if (r > n - r) {
      r = n - r;
    }
    for (int i=1; i<= r; i++) {
      comb *= (n - r + i);
      comb /= i;
    }
    return comb;
  }
}
