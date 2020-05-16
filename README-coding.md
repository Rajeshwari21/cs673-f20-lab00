## Coding Exercises

There are four coding exercises below, which you can solve in preparation for taking CS673.

### Task 0: IDE Setup
- Here's a step-by-step guide to using intelliJ and Gradle to import this starter code: [README](https://github.com/hadenlee/cs673-f20-lab00/blob/master/intelliJ/README.md)  
- Note that in your remote Github repository, you can visit `Actions` which will simply run all unit tests on their server.   
As such, you can push your commits to the remote repo, and wait for the server to 'grade' your commits.
- Not familiar with Github and/or Github Actions? Learn more about them [here](https://missing.csail.mit.edu/2020/version-control/) and [here](https://help.github.com/en/actions/getting-started-with-github-actions/about-github-actions).

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
   Note that the answer can easily become large, so you should return the answer modulo 99991 (i.e., `return (answer) % MOD` in your code).

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

### Task 5: Extra Stuff (optional)
- Task 1: If `n` could be as large as `10^9`, would your solution still work fast enough?
- Task 2: If `n` could be as large as `10^6`, would your solution still work fast enough?
- Task 3: If `n` could be as large as `10^5`, would your solution still work fast enough?
- Task 4: If `n` could be as large as `10^5`, would your solution still work fast enough? (for the sake of simplicity, let's not worry about precision here.)
