class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        
        // Start with the maximum being -1 (as required for the last element)
        int maxSoFar = -1;
        
        // Loop backwards from the last element to the first
        for (int i = n - 1; i >= 0; i--) {
            // Temporarily store the current value before we overwrite it
            int currentVal = arr[i];
            
            // Replace the current element with the greatest element found to its right
            arr[i] = maxSoFar;
            
            // Update the maximum for the next iteration (moving left)
            if (currentVal > maxSoFar) {
                maxSoFar = currentVal;
            }
        }
        
        return arr;
    }
}