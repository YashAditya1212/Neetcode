class Solution {
    public static void divide(int[] nums, int s, int e){
        if(s>=e){
            return;
        }
        int mid = s+(e-s)/2;
        divide(nums, s, mid);
        divide(nums, mid+1, e);
        conquer(nums, s,mid, e);
    }
    public static void conquer(int[] nums, int s, int mid, int e){
        int[] merged = new int [e-s+1];

        int i=s;
        int j=mid+1;
        int k=0;

        while(i <= mid && j <=e){
            if(nums[i]<=nums[j]){
                merged[k++]= nums[i++]; 
            }
            else{
                merged[k++]= nums[j++];
            }
        }
            // Leftover elements in both arrays
            while(i<= mid){
                merged[k++]= nums[i++];
            }
            while(j<=e){
                merged[k++]= nums[j++];
            }

            // COpy back to original array
            for(int ind=0,ind2=s;ind<merged.length;ind++,ind2++){
                nums[ind2]=merged[ind];
            }
    }
    public int[] sortArray(int[] nums) {
     divide(nums, 0 ,nums.length-1);  // Location of last element will be n-1
     return nums;
    }

}