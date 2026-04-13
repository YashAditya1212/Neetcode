class Solution {
    public void sortColors(int[] nums) {
      
        for(int k=0; k<nums.length; k++){
            for(int i=0;i<nums.length-1;i++){
                int j=i+1;
                if(nums[i]>nums[j]){
                    int temp= nums[i];
                    nums[i]= nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}