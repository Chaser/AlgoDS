src 	  	  	  	 
 +-- main 	  	  	 
     +-- java 	  	Main Java source directory. Under version control.
     +-- resources   	General resources. Under version control.
         +-- database 		Embedded databases such as Cloudscape.
         +-- scripts 		Shell or batch files.
         +-- images 		Optional: images and icons.
         +-- sounds 		Optional
         +-- xml 		XML and XSLT files.
     +-- config 	Configuration files. Under version control
     +-- help 	  	JavaHelp files. Under version control.
  	  	  	  	 
  	  	  	  	 
     +-- site 	  	Maven settings for the documentation site. Under version control.
  	  	  	 	 
     +-- test 	  	Test source files. Under version control
         +-- java 	  	 
         +-- resources 	Any resources needed by the tests.
  	  	  	  	   	  	  	  	 
docs 	  	  	General document repository. Under version control.	  	 
     +-- library		Any general documents, articles of interest or relevance 	  	  	 
     +-- project       		A project plan
     +-- design	       		Design documents  
     +-- apis			Javadocs
  	  	  	  	 
libs 	  	  	Third party JARs. Under version control for now, but these could be externalised at some point.
  	  	  	  	 
installer 	  	BuildDesk or InstallAnywhere project files. Under version control.
  	  	  	  	 
target 	  	  	The target directory is used to house all output of the build.  	  	  	  	 
  	  	  	  	 
distrib 	  	Created and deleted by the build file. Not under version control.
     +-- libs 	  	  	 
     +-- docs 	  	  	 

build 	  	  	Build output. Created and deleted by the build file. Not under version control.
     +-- libs 	  	  	 
     +-- classes 	  	  	 
     +-- test


Build Notes
  Compiling Command Line
    -In project root directory call javac ./src/main/java/*.java -d ./build/classes
    *Build/classes has to exist!

  Running Command Line
    -In project root directory call java -classpath ./build/classes (PackageName)/(entrypoint)
    *Example java -classpath ./build/classes Strategy.MiniDuckSimulator


********************************************************************************
Source:
Cracking the code interview Chapter 1 Question 1.
Question)
Implement an algorithm to determine if a string has all unique characters. What if
you cannot use additional data structures?

Solution)
StringUnique.java
--------------------------------------------
Source:
Cracking the code interview Chapter 1 Question 2.
Question)
Implement a function void reverse(char* str) in C or C++ which reverses a null-
terminated string.

Solution)
StringReverse.java
--------------------------------------------
Source:
Cracking the code interview Chapter 1 Question 3.
Question)
Given two strings,write a method to decide if one is a permutation of the other.

Solution)
StringAnagram.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 1 Question 4.
Question)
Write a method to replace all spaces in a string with '%20'. You may assume that 
the string has sufficient space at the end of the string to hold the additional 
characters, and that you are given the "true" length of the string. 
(Note: if implementing in Java, please usea character array so that you can 
perform this operation inplace.)

Solution)
StringCharChanger.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 1 Question 5.
Question)
Implement a method to perform basic string compression using the counts of
repeated characters. For example, the string aabcccccaaa would become a2blc5a3.
If the "compressed" string would not become smaller than the original string, 
your method should return the original string.

Solution)
***
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 1 Question 6.
Question)
Given an image represented by an NxN matrix, where each pixel in the image is
4 bytes, write a method to rotate the image by 90 degrees. Can you do this in 
place?

Solution)
***
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 1 Question 7.
Question)
Write an algorithm such that if an element in an MxN matrix is 0, its entire 
row and column are set to 0.

Solution)
***
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 1 Question 8.
Question)
Assume you have a method isSubstring which checks if one word is a substring of
another.
Given two strings,s1 and s2, write code to check If s2 is a rotation of s1 using
only one call to isSubstring (e.g.,"waterbottle" is a rotation of "erbottlewat").

Solution)
StringRotation.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 2 Question 1.
Question)
Write code to remove duplications from an unsorted link list
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?

Solution)
LinkedListDeleteDuplicates.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 2 Question 2.
Question)
Implement an algorithm to find the kth to last element of a singly linked list.

Solution)
LinkedListKthToLast.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 2 Question 3.
Question)
Implement an algorithm to delete a node in the middle of a singly linked list,
given only access to that node

Solution)
LinkedListDeleteMiddleNode.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 2 Question 4.
Question)
Write code to partition a linked list around a value x, such that all nodes 
less than x come before alt nodes greater than or equal to x.

Solution
***LinkedListPartitionAroundValue.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 2 Question 5.
Question)
You have two numbers represented by a linked list, where each node contains a 
single digit. The digits are stored in reverse order, such that the 1's digit 
is at the head of the list. 
Write a function that adds the two numbers and returns the sum as a linked list.

FOLLOW UP
Suppose the digits are stored in forward order. Repeat the above problem.

Solution
***LinkedListTwoNumbersAdd.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 2 Question 6.
Question)
Given a circular linked list, implement an algorithm which returns the node at
the beginning of the loop.

Solution)
***
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 2 Question 7.
Question)
Implement a function to check if a linked list is a palindrome

Solution)
***
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 3 Question 1.
Question)
Describe how you could usea single array to implement three stacks.

Solution)
StackThreeStackSingleArray.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 3 Question 2.
Question)
How would you design a stack which, in addition to push and pop, also has a 
function min which returns the minimum element? 
Push, pop and min should all operate in 0(1) time

Solution)
StackWithMin.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 3 Question 3.
Question)
Imagine a (literal) stack of plates. If the stack gets too high, it might topple. 
Therefore, in real life, we would likely start a new stack when the previous 
stack exceeds some threshold. Implement a data structure SetOfStacks that mimics 
this. SetOfStacks should be composed of several stacks and should create a new 
stack once the previous one exceeds capacity. 
SetOfStacks.push() and SetOfStacks.pop() should behave identically to a single 
stack(thatis,pop() should return the same values as it would if there were just 
a single stack).

FOLLOW UP
Implement a function popAt(int index) which performs a pop operation on a 
specific sub-stack

Solution)
StacksSetOf.java

Follow up - Not implemented
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 3 Question 4.
Question)
In the classic problem of the Towers of Hanoi, you have 3 towers and N disks of 
different sizes which can slide onto any tower. The puzzle starts with disks 
sorted in ascending order of size from top to bottom 
(i.e., each disk sits on top of an even larger one). 
You have the following constraints:
(T) Only one disk can be moved at a time.
(2) A disk is slid off the top of one tower onto the next rod.
(3) A disk can only be placed on top of a larger disk.
Write a program to move the disks from the first tower to the last using Stacks.

Solution)
***StacksTowerOfHanoi.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 3 Question 5.
Question)
Implement a MyQueue class which implements a queue using two stacks.

Solution)
StackMyQueue.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 3 Question 6.
Question)
Write a program to sort a stack in ascending order (with biggest items on top)
You may use at most one addition stack to hold items, buy you may not copy
the elements into any other data structure (such as an array)
The stack supports the following oerations: push, pop, peek, and isEmpty

Solution)
StackAscendingOrder.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 3 Question 7.
Question)
An animal shelter holds only dogs and cats, and operates on a strictly 
"first in, first out" basis. People must adopt either the "oldest" 
(based on arrival time) of all animals at the shelter, or they can select whether
they would prefer a dog or a cat (and will receive the oldest animal of that type). 
They cannot select which specific animal they would like. Create the data 
structures to maintain this system and implement opera- tions such as enqueue, 
dequeueAny, dequeueDog and dequeueCat. 
You may use the built-in Linked List data structure

Solution)
AnimalShelter.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 4 Question 1.
Question)
Implement a function to check if a binary tree is balanced. 
For the purposes of this question, a balanced tree is defined to be a tree such
that the heights of the two subtrees of any node never differ by more than one.

Solution)
TreeBinaryBalanceCheck.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 4 Question 2.
Question)
Given a directed graph, design an algorithm to find out whether there is a 
route between two nodes.

Solution)
***GraphRouteCheck.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 4 Question 3.
Question)
Given a sorted (increasing order) array with unique integer elements, write an 
algorithm to create a binary search tree with minimal height.

Solution)
TreeBSTCreate.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 4 Question 4.
Question)
Given a binary tree, design an algorithm which creates a linked list of all the
nodes at each depth (e.g., if you have a tree with depth D, you'll have D linked 
lists).

Solution)
***TreeBSTtoLinkedList.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 4 Question 5.
Question)
Implement a function to check if a binary tree is a binary search tree.

Solution)
TreeBSTCheck.java

--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 4 Question 6.
Question)
Write an algorithm to find the 'next'node (i.e., in-order successor) of a given
node in a binary search tree. You may assume that each node has a link to its 
parent.

Solution)
***TreeBSTNextNode.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 4 Question 7.
Question)
Design an algorithm and write code to find the first common ancestor of two 
nodes in a binary tree. Avoidstoring additional nodes in a data structure.
NOTE: This is not necessarily a binary search tree.

Solution)
***
--------------------------------------------------------------------------------
Source:
Source:
Cracking the code interview Chapter 4 Question 8.
Question)
You have two very large binary trees: Tl, with millions of nodes, and T2, with
hundreds of nodes. Create an algorithm to decideifT2 isa subtree ofTl.
A tree T2 is a subtree of Tl if there exists a node n in Tl such that the subtree of
n is identical to T2. That is, if you cut off the tree at node n, the two trees would be identical.

Solution)
***
--------------------------------------------------------------------------------
Source:
Source:
Cracking the code interview Chapter 4 Question 9.
Question)
You are given a binary tree in which each node contains a value. Design an 
algorithm to print all paths which sum to a given value. Thepath does not need to start or end at the root or a leaf.

Solution)
****
--------------------------------------------------------------------------------


Source:
Cracking the code interview Chapter 5 Question 1.
Question)
You are given two 32-bit numbers, N and M, and two bit positions, Write a method
to insert M into Nsuch that M starts at bit j and ends at bit i. You can assume
that the bits j through i have enough space to fit all of M. 
That is, if M= 10011, you can assume that there areat least 5 bits between j 
and i.
You would not,for example, have j = 3 and i = 2,because M could not fully fit 
between bit 3 and bit 2.
EXAMPLE
Input: N=10000000000,M=10011,i=2,j=6 Output:N = 10001001100


--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 9 Question 1.
Question)

A child is running up a staircase with n steps, and can hop either 1 step, 
2 steps, or 3 steps at a time.
Implement a method to count how many possible ways the child can run up the 
stairs.

Solution)
RecursionStepCounter.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 9 Question 2.
Question)

Imagine a robot sitting on the upper left comer of an X by Y grid. The robot can
only move in two directions: right and down. How many possible paths are there
for the robot to go from (0,0) to (X, Y)

FOLLOW UP

Imagine certain spots are "off limits," such that the robot cannot step on them. 
Design an algorithm to find a path for the robot from the top left to the bottom
right.

Solution)
***RecursionRobotSteps.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 9 Question 3.
Question)

Imagine a robot sitting on the upper left comer of an X by Y grid. The robot can
only move in two directions: right and down. How many possible paths are there
for the robot to go from (0,0) to (X, Y)

FOLLOW UP

Imagine certain spots are "off limits," such that the robot cannot step on them. 
Design an algorithm to find a path for the robot from the top left to the bottom
right.

Solution)
***RecursionRobotSteps.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 9 Question 4
Question)
A magic index in an array A[l...n-l] is defined to be an index such that A[i] = i. 
Given a sorted array of distinct integers, write a method to find a magic index, 
if one exists, in array A.
FOLLOW UP
What if the values are not distinct?

Solution)
***RecursionMagicIndex.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 9 Question 4
Question)
Write a method to return all subsets of a set.

Solution)
***RecursionSetPermuation.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 9 Question 5
Question)
Write a method to compute all permutations of a string

Solution)
RecursionStringPermutation.java
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 9 Question 6
Question)
Implement an algorithm to print all valid (i.e., properly opened and closed) 
combinations of n-pairs of parentheses.

Solution)
***RecursionParentheses
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 9 Question 7
Question)
Implement the "paint fill" function that one might see on many image editing
programs. That is, given a screen (represented by a two-dimensional array of 
colors), a point, and a new color, fill in the surrounding area until the color
changes from the original color.

Solution)
***RecursionPaintFill
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 9 Question 8
Question)
Given an infinite number of quarters (25 cents), dimes (10 cents), nickels
(5 cents) and pennies (1 cent), write code to calculate the number of ways of
representing n cents.

Solution)
***RecursionChange
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 9 Question 9
Question)
Write an algorithm to print all ways of arranging eight queens on an 8x8 chess
board so that none of them share the same row, column or diagonal. 
In this case, "diagonal" means all diagonals, not just the two that bisect the
board.

Solution)
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 9 Question 10
Question)
You have a stack of n boxes, with widths w., heights l and depths d. 
The boxes cannot be rotated and can only be stacked on top of one another if 
each box in the stack is strictly larger than the box above it in width, height,
and depth. Implement a method to build the tallest stack possible, where the
height of a stack is the sum of the heights of each box.
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 9 Question 11
Question)

Given a boolean expression consisting of the symbols 0,1, &, /, and A, and a
desired boolean result value result,implement a function to count the number of
ways of parenthesizing the expression such that it evaluates to result.
--------------------------------------------------------------------------------
Source:
Cracking the code interview Chapter 11 Question 1
Question)
You are given two sorted arrays, A and B, where A has a large enough buffer at
the end to hold B. Write a method to merge B into A in sorted order.

Solution)
SortMerge.java
--------------------------------------------------------------------------------
Cracking the code interview Chapter 11 Question 2
Question)
Write a method to sort an array of strings so that all the anagrams are next to
each other.

Solution)
SortAnagram.java
--------------------------------------------------------------------------------
Cracking the code interview Chapter 11 Question 3
Question)
Given a sorted array of n integers that has been rotated an unknown number of times, write code to find an element in the array. You may assume that the array was originally sorted in increasing order.

Solution)
***SearchRotatedArray.java
--------------------------------------------------------------------------------
Cracking the code interview Chapter 11 Question 4
Question)
Imagine you have a 20 GB file with one string per line. Explain bow you would sort the file.

Solution)
We'll divide the file into chunks which are x megabytes each, where x is the amount of memory we have available. Each chunk is sorted separately and then saved back to the file system.
Once all the chunks are sorted, we then merge the chunks, one by one. At the end, we have a fully sorted file.

This algorithm is known as external sort.
--------------------------------------------------------------------------------
Cracking the code interview Chapter 11 Question 5
Question)
Given a sorted array of strings which is interspersed with empty strings, write a method to find the location of a given string.

Solution)
SearchStringArray.java
--------------------------------------------------------------------------------
Cracking the code interview Chapter 11 Question 6
Question)
Given an M x N matrix in which each row and each column is sorted in ascending order, write a method to find an element.

Solution)
***
--------------------------------------------------------------------------------
Cracking the code interview Chapter 11 Question 7
Question)
A circus is designing a tower routine consisting of people standing a top one 
another's shoulders. For practical and aesthetic reasons, each person must be both shorter and lighter than the person below him or her. Given the heights and weights of each person in the circus, write a method to compute the largest possible number of people in such a tower.

Solution)
****
--------------------------------------------------------------------------------
Cracking the code interview Chapter 11 Question 8
Question)
Imagine you are reading in a stream of integers. Periodically, you wish to be able to look up the rank of a number x (the number of values less than or equal to x). 
Implement the data structures and algorithms to support these operations. 
That is,implement the method track(int x), which is called when each number is generated, and the method getRankOfNumber (int x), which returns the number of values less than or equal to x (not including x itself).

Solution)
SearchRank.java

















