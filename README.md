# Find-Pair-with-Given-Sum (Hash Table / Big O)
This is a sample coding problem that I saw on Google while practicing. It is also similar to one of the worksheets that we had to solve at the Google algorithms workshop that I attended. 

Given a sum and an array of integers, the program has to find two numbers in the array that can be added together to equal the sum. I came up with both a naive solution and a more efficient solution:
- The naive solution which I initially thought of was to iterate through the array multiple times and check each element against one another. This would have had a Big O complexity of O(n^2) where n is the size of the array.
- The more efficient solution that I opted for utilises a hash table. The elements in the array can then be checked against the elements in the hash table instead. Therefore only having to iterate through the array once, and resulting in a better Big O complexity of O(n). 
