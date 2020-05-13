### Task 1: Climbing Stairs
- Description

   Let's say you need to climb a staircase that has `n` steps (`n >= 1`).  
   You can climb either 1 step or 2 steps at a time.  
   You're wondering in how many different ways you can climb up the `n` steps to the top.  
- Examples

   When `n = 1`: You can take 1 step to reach the top, and the answer is 1.  
   When `n = 2`: You can either two separate 1-steps or you can take two steps all at once. The answer is 2.  
   When `n = 3`: There are three different ways: `1 + 1 + 1` or `1 + 2` or `2 + 1`.  
   When `n = 4`: There are four different ways: `1 + 1 + 1 + 1` or `1 + 1 + 2` or `1 + 2 + 1` or `2 + 1 + 1`.  
- Implementations and Tests

   In `Task1.java` (under `edu.usfca.cs673` package), you'll find two blank methods (`getNumberOfWaysRecursive()` and `getNumberOfWaysIterative()`), which should return the correct answer, given a positive integer `n` (assume that `1 <= n <= 2020`).  
   Try to solve this problem once iteratively and once recursively.  
   In `TestTask1.java` you'll find a few unit tests (with correct answers for some values of `n`).  
   Note that the answer can easily become large, so you should return the answer modulo 99991 (i.e., `return (answer) % MOD` in your code).

### Task 2: Counting Inversions
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
   In `Task2.java` (under `edu.usfca.cs673` package), you'll find a blank method, which should return the correct answer, given an array of distinct integers.
   Try to solve this problem with an efficient algorithm.
   In `TestTask2.java` you'll find a few unit tests which you can utilize to check correctness of your solution.
 - Task 3: Counting (combinatorics)
   - Description
   - Examples
   - Implementations and Tests
 - Task 4: Probability
   - Description
   - Examples
   - Implementations and Tests


# References (Discrete Math)

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

