class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // HashMap to store: number -> last seen index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Check if we've seen this number before
            if (map.containsKey(nums[i])) {
                // Get the previous index
                int prevIndex = map.get(nums[i]);
                
                // Check if distance is within k
                if (i - prevIndex <= k) {
                    return true;
                }
            }
            
            // Update the index for this number
            map.put(nums[i], i);
        }
        
        return false;
    }
}