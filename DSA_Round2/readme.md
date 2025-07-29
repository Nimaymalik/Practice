# Problems

6 TCP,API,DNS
7 About Project

# Cycle Detection in Directed Graphs
 # LeetCode 207: Course Schedule
Determine if you can finish all courses given prerequisites—essentially detecting a cycle in a directed graph. Common approaches: DFS with color marking or recursion stack, or Kahn’s topological sort. 

# LeetCode 802: Find Eventual Safe States
Identify nodes that are not part of any cycle and all paths from them lead to terminals—using DFS with cycle detection coloring.

# Cycle Detection in Undirected Graphs
 # LeetCode 261: Graph Valid Tree
Check whether given edges form a tree—i.e., the graph is connected and acyclic. Commonly solved using Union‑Find or DFS with parent tracking. 

# LeetCode 684: Redundant Connection
Given an undirected graph that starts as a tree and one extra edge creates a cycle, find the redundant edge. Efficiently solved with Union‑Find (DSU). 

# LeetCode 2360: Longest Cycle in a Graph
Directed graph where each node has at most one outgoing edge—find the longest cycle length if any. DFS with tracking of visit indices works well. 

# LeetCode 2204: Distance to a Cycle in Undirected Graph
Each node measures its distance to the unique cycle in a graph containing exactly one cycle. Solved using a combination of degree stripping (topological trimming) and BFS/DFS. 

15 Ticket Encoding Sequence
18 Combination Sum 2

22 Partion dp MCM problem
27 Applications: Parentheses balancing, expression evaluation, next greater element, browser history, "undo" functionality. In stack

29 BST,Binary Tree
30 BST properties: Insertion, deletion, searching.
31 Height/depth of a tree.
32 Level Order Traversal (BFS for trees Rotten Oranges Problem (BFS on a grid)).

34 Representations: Adjacency Matrix, Adjacency List.

37 All sorting time complexity and implementation
38 Identifying overlapping subproblems and optimal substructure for DP.

41 Implement Stack using Linked List: Write the push, pop, peek, isEmpty methods for a stack.

42 Implement Queue using Array/Linked List: Write the enqueue, dequeue, peek, isEmpty methods for a queue.



# 54 Rotten Oranges: You are given an m x n grid where each cell can have one of three values: 0 representing an empty cell, 1 representing a fresh orange, 2 representing a rotten orange. Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten. Return the minimum number of minutes that must elapse until no fresh oranges are present. If this is impossible, return -1.


# question 6
Ask me to design Zomato's dish rating feature.
Ans. Design a dish rating feature for Zomato to enhance user engagement and improve restaurant visibility.
User Interface: Simple star rating system (1-5 stars) for quick feedback.

Detailed Reviews: Allow users to write reviews with pros and cons for each dish.

Photo Upload: Enable users to upload photos of the dishes they rated.

Filter Options: Users can filter dishes by ratings, cuisine, or popularity.

Incentives: Reward users with points or discounts for submitting ratings and reviews.

Social Sharing: Allow users to share their ratings on social media platforms.

Analytics Dashboard: Provide restaurants with insights on dish performance based on ratings.
