class Solution {
    public int heightChecker(int[] heights) {
        int largest=0;
        for(int i=0;i<heights.length;i++){
            largest=Math.max(largest, heights[i]);
        }
        int [] count= new int[largest+1];
        for(int i=0; i<heights.length;i++){
            count[heights[i]]++;
        }
        int [] expected=new int[heights.length];
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                expected[j]=i;
                count[i]--;
                j++;
            }
        }
        int notEqual=0;
        for(int i=0;i<expected.length;i++){
            if(expected[i]!=heights[i]){
                notEqual++;
            }
        }
        return notEqual;
    }
}