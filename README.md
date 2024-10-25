# Binary Search Questions
<b>Search Insert Position</b> - Same binary search. But just return low outside while loop.
<br/>
<b>Squares of a Sorted Array</b> - Have 2 pointers. Use for loop from end. Use Math.abs() to compare pointer 1 and 2 and then save the squared result in target array. p1++ or p2--
<br/>
<b>Single Element in a Sorted Array</b> - Have 2 pointers. In same while loop, check if 2 adjacents are same from start, do start = start +2 . check same from end pointer and do end = end -2; we can use binary search as well.
<br/>
<b>Find Peak Element</b> - Part of array is monotonically increasing and other part decreasing. so find mid and check if nums[mid] < nums[mid+1], meansing until mid, it is still increasing and peak element is on right.so do left = mid+1. else if nums[mid] < nums[mid-1], peak element must be on left, becasue it has started the decreasing order now. do right = mid-1
