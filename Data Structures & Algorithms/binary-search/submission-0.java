class Solution {
    public int search(int[] nums, int target) {
        // int s=0;
        // int e=nums.length-1;
        return binarySearch(0,nums.length-1,nums,target);
        
    }
        public int binarySearch(int s, int e, int[] nums, int target){
            if(s>e){
                return -1;
            }
            int mid=s+(e-s)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                return binarySearch(s,mid-1,nums,target);
            }
            else if(target>nums[mid]){
                return binarySearch(mid+1,e,nums, target);
            }
            return -1;
        }
        
       
}

