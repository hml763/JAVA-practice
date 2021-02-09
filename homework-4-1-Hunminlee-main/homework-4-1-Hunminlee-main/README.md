[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=3346473&assignment_repo_type=AssignmentRepo)
# Homework 4: Trees

* [Due Dates](#due-dates)
* [Read Me Before Starting](#read-me-before-starting)
* [Q1: Autocomplete](#q1-autocomplete)
* [Q2: Runtime](#q2-runtime)
* [Q3: Optimization](#q3-optimization)

## Due Dates
|   Section   |    Date    | Time (Eastern) |
|:-----------:|:----------:|:--------------:|
| Lecture 002 | 10/12/2020 | 09:59am        |
| Lecture 004 | 10/13/2020 | 12:44pm        |
| Lecture 006 | 10/13/2020 | 05:29pm        |


## Read Me Before Starting
This homework covers part of week 6, namely Trees. We'll cover BSTs and AVL trees in Quiz 2.

This is our first assignment in Github Classroom + regular Repl.it. If you have
any issues, please ask on Piazza for help!


## Q1: Autocomplete
We want to create an autocomplete program, where we can provide a string
`prefix`, and output a list of possible words that start with `prefix`. We do
this by designing a Tree where each value is a `Character`, and traversing
through the Tree spells out words by collecting each character and forming
strings as you traverse **depth-first**. Here is an example of one such tree:

![example of autocomplete tree](trie.png)

* This tree spells out "ace", "acne", "and", "andrew", "beam",
  "beef", "bees", "cat", "cow", and "cut".
* Notice that the value in the root of the tree should be ignored when making
  words.
* Notice that an extra node with a "$" character denotes when a word has ended.

Write a method `candidates` that takes in a TreeNode `root` and a string
`prefix`, and returns the list of all possible words that can be made starting
with the letters in `prefix`. For example:

```java
TreeNode example = new TreeNode('*', ...);

System.out.println(candidates(example, "c")); // Outputs ["cat", "cow", "cut"]
System.out.println(candidates(example, "ca")); // Outputs ["cat"]
System.out.println(candidates(example, "an")); // Outputs ["and", "andrew"]

// Outputs ["ace", "acne", "and", "andrew", "beam", "beef", "bees", "cat", "cow", "cut"]
System.out.println(candidates(example, ""));

System.out.println(candidates(example, "deer"); // Outputs []
System.out.println(candidates(example, "bean"); // Outputs []
```

(The Tree we define here is a very basic version of a
[Trie](https://en.wikipedia.org/wiki/Trie), but the same basic idea we see here
powers your phone's keyboard autocomplete!

## Q2. Runtime
What's the worst-case runtime of `candidates`? Explain your answer within
`runtime.txt`.
* **Hint #2:** which of the examples in Q1 took the most number of steps?
* **Hint #2:** the runtime of adding Strings to Characters is `O(n)` in Java,
where `n` is the length of the String. Java strings are immutable, so you have
to create a brand new String each time you concat a String with Character.
This means you must copy over all `n` letters within the String, hence `O(n)`.

## Q3. Optimization (Optional)
**This question is optional and is worth extra credit.**
Can you do better than your answer in Q2? Ensure that `candidates` method
takes the least amount of steps possible by creating an `Autocomplete2.java`
which re-implements `candidates` to be have the optimal runtime. Be sure to
provide the new runtime in comments and justify your answer. If your answer
to Q1 is already optimal, then simply copy your original implementation over.
