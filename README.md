Sure! Here's the README description for your problem:

---

## Rotated Sorted Array Search

### Problem Statement:
Given a rotated sorted array, the goal is to find the index of a target value. If the target is not present in the array, return `-1`.

### Solution Approach:
The solution uses **Binary Search** to efficiently locate the target. Since the array is rotated, the key challenge is to determine which half of the array is sorted. Based on this observation, the search is narrowed down as follows:

- If the left half of the array is sorted and the target lies between `nums[left]` and `nums[mid]`, the search continues in the left half.
- Otherwise, the right half is searched, which might also be rotated or sorted, and the process repeats.

### Time Complexity:
- **O(log n)** – This logarithmic complexity arises because the search space is halved at each step, typical of binary search.

### Edge Cases:
- If the array is empty, the function will return `-1`.
- If the target is not found in the array, the result will be `-1`.
- The solution handles both rotated and fully sorted arrays.

---
