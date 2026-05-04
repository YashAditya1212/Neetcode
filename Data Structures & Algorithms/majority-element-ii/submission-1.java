
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        // Step 1: Count frequencies of all elements
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        
        // Step 2: Check which elements appear more than n/3 times
        int threshold = nums.length / 3;
        for (int key : hm.keySet()) {
            if (hm.get(key) > threshold) {
                result.add(key);
            }
        }
        
        return result;
    }
}