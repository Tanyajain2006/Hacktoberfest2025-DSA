# Missing Number in an Array  

## 🧠 Intuition  
We are given an array of size `N-1` that contains distinct numbers from `1` to `N`, with exactly one number missing.  

Key observations:  
1. The sum of the first `N` natural numbers can be computed using the formula:  
   \[
   \text{Sum} = \frac{N \cdot (N+1)}{2}
   \]  
2. If we calculate the sum of the given array and subtract it from the total sum, the difference will be the missing number.  

This avoids extra data structures and leverages simple arithmetic for efficiency.  

---

## ⚙️ Algorithm  

1. Compute the **expected sum** of numbers from `1` to `N` using the formula:  
   \[
   \text{totalSum} = \frac{N \cdot (N+1)}{2}
   \]  
2. Traverse the given array and calculate its sum → `arraySum`.  
3. Find the missing number as:  
   \[
   \text{missing} = \text{totalSum} - \text{arraySum}
   \]  
4. Return the missing number.  

---

## ⏱️ Time and Space Complexity  
- **Time Complexity**: `O(N)` → to compute the sum of array elements.  
- **Space Complexity**: `O(1)` → only a few variables used.  

---