#CS113-HW06-RecursionTrees
## HW #6 for CS113 - Recursion and Tree Problems

**[//Insert Build Status Image//]**

## [Recursive] Change Calculator (based on Programming Project #7, pg. 291):

>Make sure to use the `edu.miracosta.cs113.change` to store your solution (files described below are within this package).

Using the provided ChangeCalculator class, implement the recursive method `calculateChange(int)` which will dispense change for a given amount of money. The method will **display and return** the total number of combinations of quarters, dimes, nickels, and pennies that equal the desired amount and all of the combinations as well. Avoid duplication.

If you choose to use a data structure, it must be one that we've covered and you must thoroughly justify why it was the best choice (based on run-time efficiency): **[//here//]**

Next, you will implement the method `printCombinationsToFile(int)`, which should contain a call to the recursive solution that you created. Creating a text file in the program's directory named `"CoinCombinations.txt"`, this method will write each combination produced to separate lines. This file will be read by the tester class to verify that your recursive solution avoids duplicate values.

**_NOTE:_** _Your program should dispense the highest coin first (quarters, then dimes, then nickels, then pennies)._ The format for printing each combination is otherwise up to you- as long as the output is consistent. Valid String values include "1 quarter/s, 2 dime/s, 3 nickel/s, 4 penny/ies", "1Q 2D 3N 4P", and "[1, 2, 3, 4]". For example, the generated text file would then contain the following contents, where the given input is 10 cents:

`CoinCombinations.txt`

```
[0, 1, 0, 0]
[0, 0, 2, 0]
[0, 0, 1, 5]
[0, 0, 0, 10]
```

The two methods will be tested using 5 cent increments between 5 cents and 30 cents, larger tests for 75 cents through 100, and values that are not multiples of 5 (3 through 101 cents). For example, 75 cents equates to 121 unique combinations.

## Tree Intro problems (based on Self-Check problems on p. 303):

>For the following problems, create a `doc` folder to store images in and insert them into the spaces provided using markdown.  You can scan low-resolution images, use websites like draw.io, or any software of your choosing as long as it is legible.

1. Draw binary expression trees for the following infix expressions.  Your trees should enforce the Java rules for operator evaluation (higher-precedence operators before lower-precedence operators and left associativity.) Note: they should also preserve the order seen in the expressions.
- `x / y + a - b * c`

![1_infix_tree](doc/1_infix_trees.png)

- `(x * a) - y / b * (c + d)`

![2_infix_tree](doc/2_infix_trees.png)

- `(x + (a * (b - c)))/ d`

![3_infix_tree](doc/3_infix_trees.png)

2. Using the Huffman tree in the figure below:

![Image of huffman code tree](doc/problemImages/huffman.png)

- Write the binary string for the message "scissors cuts paper":
    - Binary String = 00011010000000101110000111011100010010011011010110110111100
    - work for binary string is in 
![scissors_cuts_paper_huffman_tree](doc/scissors_cuts_paper.png)
- Decode the following binary string using the tree above:
  `1100010001010001001011101100011111110001101010111101101001`
  `     w   h e    r  e  -   i   s  -     w   a    l    d   o`  
    - ANSWER: Decoded String = `where is waldo`

3. For each of the two trees shown below, answer these questions:
- What is its height?
- Is it a full tree?
- Is it a complete tree?
- Is it a binary search tree? If not, make it into a binary seach tree.

![Image of tree for problem 3A](doc/problemImages/problem3A.png)

height?
It is a height of 3 because there are 3 nodes in the longest path from root to leaf. 

full tree?
It is not a full tree because all nodes do not have either 2 children or 0 children.  
The (30) node only has one child node.

complete tree?
It is not a complete tree because not every level, except the last one, is full.
The (30) node only has one child node, so the level that has node (32) is not full.

binary search tree?
Because the left subtree of node 30 has value 32 (not less than 30), it is not a binary search tree.  If the 32 node was the right subtree then it would be a binary search tree.   

![Image of tree for problem 3B](doc/problemImages/problem3B.png)

height?
It is a height of 3 because there are 3 nodes in the longest path from root to leaf. 

full tree?
It is not a full tree because all nodes do not have either 2 children or 0 children.  
The (55) node only has one child node.

complete tree?
It is not a complete tree because not every level, except the last one,  is full.
The (55) node only has one child node, so the level that has node (50) is not full.

binary search tree?
It is not a binary search tree because the left subtree of the (30) node is greater than 30.  The left subtree of the (30) node is 32, which is greater than 30.

4. For the binary trees shown below, indicate whether each tree is full, perfect, complete, or none of the above (note that a tree could be more than one of these!)

![Image of tree for problem 4A](doc/problemImages/problem4A.png)

Figure 6.2 is neither full, perfect, nor complete.

![Image of tree for problem 4B](doc/problemImages/problem4B.png)

Figure 6.3 is the same tree as figure 6.2 just with null leaf nodes.  So, figure 6.3 is neither full, perfect, nor complete.

![Image of tree for problem 4C](doc/problemImages/problem4C.png)

Figure 6.4 is a full binary tree because all nodes have either 2 or 0 children. It is not a complete tree, because not all full nodes are towards the left.

![Image of tree for problem 4A](doc/problemImages/huffman.png)

Figure 6.5 is a full tree because all nodes have either 2 or 0 children.

5. Represent the general tree below as a binary tree

![Image of general tree for problem 5](doc/problemImages/problem5-general.png)

My solution:

![solution_5](doc/solution_5.png)
----------

### Make sure to commit + push *before* the deadline to have your code be considered for grading.

>Pro-Tip:

>- Refer to the given documentation in the ChangeCalculator class as you plan and design your implementation of its methods.
