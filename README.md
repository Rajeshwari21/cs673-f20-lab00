# Coding Exercises

There are four coding exercises below, which you can solve in preparation for taking CS673.


### Task 1: Climbing Steps
- Description

   Let's say you need to climb a staircase that has `n` steps (`1 <= n <= 2020`).  
   You can climb either 1 step or 2 steps at a time.  
   You're wondering in how many different ways you can climb up the `n` steps to the top.  
- Examples

   When `n = 1`: You can take 1 step to reach the top, and the answer is 1.  
   When `n = 2`: You can either two separate 1-steps or you can take two steps all at once. The answer is 2.  
   When `n = 3`: There are three different ways: `1 + 1 + 1` or `1 + 2` or `2 + 1`.  
   When `n = 4`: There are four different ways: `1 + 1 + 1 + 1` or `1 + 1 + 2` or `1 + 2 + 1` or `2 + 1 + 1`.  
- Implementations and Tests

   Try to solve this problem once iteratively and once recursively.  
   See [`Task1.java`](java/student/src/main/java/edu/usfca/cs673/).
   See [`TestTask1.java`](java/student/src/test/java/edu/usfca/cs673/) for unit tests with more examples.
   Note that the answer can easily become large, so you should return the answer modulo 99991 (i.e., `return (answer) % MOD` in your code).

### Task 2: Inversions
- Description
   You are given an array `A` of `n` *distinct* integers (`1 <= n <= 100`).  
   An *inversion* is a pair of indices (i, j) where (i < j) and `A[i] > A[j]` are both true (with `0 <= i, j, < n`, using 0-based index).  
   Given `A` as input, write a method that counts and returns the number of inversions in `A`.

- Examples

  When `A = [1, 2, 3]`: There are no inversions. The answer is 0.  
  When `A = [20, 10]`: There is one inversion, `(0, 1)` as 0 < 1 and `A[0] > A[1]`.  
  When `A = [20, 10, 30]`: There is still one inversion, `(0, 1)` as 0 < 1 and `A[0] > A[1]`.  
  When `A = [30, 20, 10]`: There are three inversions: `(0, 1)`, `(0, 2)`, and `(1, 2)`.

- Implementations and Tests
   Try to solve this problem with an efficient algorithm (i.e., better than a quadratic algorithm that's trivial). If you can't solve this in sub-quadratic time, that's OK because we'll study it in CS673. :)
   See [`Task2.java`](java/student/src/main/java/edu/usfca/cs673/).
   See [`TestTask2.java`](java/student/src/test/java/edu/usfca/cs673/) for unit tests with more examples.

### Task 3: Counting
- Description
  
   Suppose we have `2n` students in a class, and we need to divide them into two teams of `n` students each (for a friendly match between the teams).  
   In how many different ways can we divide them into two teams of the same size?  
   Assume that `1 <= n <= 30`.

- Examples
   
   When `n = 1`: There are two students, say `A` and `B`. We can divide them into `[A]` and `[B]` (hence, the answer is 1).  
   When `n = 2`: There are four students, say `A, B, C, D`. We can do: `[A, B], [C, D]`, `[A, C], [B, D]`, and `[A, D], [B, C]`. The answer is 3. (Note that `[A, C] vs [B, D]` and `[B, D] vs [A, C]` would be the same split, so it's counted only once.)  
   When `n = 3`: There are six students (`A`-`F`). The answer is 10: `[A, B, C], [D, E, F]`, `[A, B, D], [C, E, F]`, `[A, B, E], [C, D, F]`, `[A, B, F], [C, D, E]`, `[A, C, D], [B, E, F]`, `[A, C, E], [B, D, F]`, `[A, C, F], [B, D, E]`, `[A, D, E], [B, C, F]`, `[A, D, F], [B, C, E]`, and `[A, E, F], [B, C, D]`.
- Implementations and Tests

   See [`Task3.java`](java/student/src/main/java/edu/usfca/cs673/).
   See [`TestTask3.java`](java/student/src/test/java/edu/usfca/cs673/) for unit tests with more examples.

### Task 4: Probability
- Description
  
   Suppose that you have `n` [fair coins](https://en.wikipedia.org/wiki/Fair_coin), which you toss at the same time. Let `n1` be the number of coins with heads and `n2 = n - n1` be the number of coins with tails.
   Let `p(k)` be the probability that `|n1 - n2| = k`.
   Calculate this probability, given `n` and `k` (assume `0 <= k <= n <= 20`).
   
- Examples

   When `n = 2, k = 0`: As `k = 0`, we must have one head and one tail. Out of four (equiprobable) outcomes (`HH`, `HT`, `TH`, `TT`), there are two such outcomes -- the answer is 0.5.  
   When `n = 3, k = 0`: This is impossible because `n = 3` (`|n1 - n2|` can get as small as 1, but not 0). The answer is 0.  
   When `n = 4, k = 0`: This means we must have two heads and two tails. Out of sixteen (equiprobable) outcomes, there are six such outcomes, and the answer is 6/16 = 0.375.   
   When `n = 4, k = 4`: This means either we have all tails or all heads. The answer is 2/16 = 0.125.  
   When `n = 5, k = 1`: This means we get two heads and three tails OR three heads and two tails. 20/32 = 0.625 is the answer.
- Implementations and Tests
   See [`Task4.java`](java/student/src/main/java/edu/usfca/cs673/).
   See [`TestTask4.java`](java/student/src/test/java/edu/usfca/cs673/) for unit tests with more examples.


# Review of Discrete Math

Note that CS673 focuses on designing and analyzing algorithms, rather than implementing them.

As such, it is important for you to review some of the materials from Discrete Math.

Relevant references are provided below, which you should take a look before the beginning for the fall semester.

We will quickly review these materials (during the first week), and the course will assume that you are familiar with these topics, after the first week.

Below, you will find two (textbook) references (DS and MCS), which are **available online** and **for free**.

You do NOT have to read the entire references, but you will find them useful in preparation for taking CS673.

- Mathematical Proofs
  - Direct Proof 
    - Reference (DS): Claim 2.1
  - Proof by contrapositive 
    - Reference (DS): Claim 2.2
  - Proof by contradiction 
    - Reference (DS): Claim 2.2, Theorem 2.3, and Theorem 2.4
    - Reference (MCS): Section 1.8
  - Proof by cases and counterexamples
    - Reference (DS): Claim 2.5, Claim 2.6, Claim 2.7, and Claim 2.8
    - Reference (DS, optional): Theorem 2.9 and Theorem 2.10
    - Reference (MCS): Section 1.7
  - Proof by induction
    - Reference (DS): Claim 2.11, Claim 2.12, and Claim 2.13     
    - Reference (DS): Theorem 2.17 and Theorem 2.18.
    - Reference (DS): Claim 2.19 (strong induction)
    - Reference (DS, optional): Theorem 2.14, Theorem 2.15, and Theorem 2.16
    - Reference (MCS): Section 5.1 and Section 5.2
    
    *(Note: the statement in Claim 2.12, DS, contains a typo, as the RHS should be `2^{|S|}`, which means that the term on RHS is a power of 2 whose exponent is `|S|`.)*
- Counting    
  - Product and Sum Rule
    - Reference (DS): Examples 4.1 - 4.6
    - Reference (MCS): Section 15.2.4 'Counting Passwords'
  - Permutations and Combinations
    - Reference (DS): Definition 4.7, Theorem 4.8, Example 4.9, Definition 4.10, Theorem 4.11, Example 4.12, Example 4.13, and Example 4.14
    - Reference (MCS): Section 15.5.2 (Bit Sequences), Section 15.7.1 (Hands with a Four-of-a-Kind), Section 15.7.2 (Hands with a Full House), and Section 15.7.3 (Hands with Two Pairs)
- Probability
  - Random Variables
    - Reference (DS): Definition 5.25, Definition 5.26, Example 5.27, and Definition 5.28
    - Reference (MCS): Section 19.1 'Random Variable Examples'
  - Expectation and Linearity of Expectation
    - Reference (DS): Definition 5.29, Claim 5.30, Example 5.31, and Example 5.32
    - Reference (DS): Theorem 5.33 and Example 5.34
    - Reference (MCS): Section 19.4 'Great Expectations' (19.4.1, 19.4.2, 19.4.3, and 19.4.4 only) and Section 19.5 'Linearity of Expectation' (19.5.1 and 19.5.2 only)
- References (DS and MCS)  
  - Reference **DS**: "A Course in Discrete Structures" by Pass and Tseng. [link](https://courses.cs.cornell.edu/cs2800/2017sp/handouts/pass_tseng_discmath.pdf)
  - Reference **MCS**: "Mathematics for Computer Science" (MCS) by Lehman, Leighton, and Meyer. [link](https://courses.cs.cornell.edu/cs2800/2017fa/handouts/mcs.pdf)

