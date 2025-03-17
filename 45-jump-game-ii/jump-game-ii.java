class Solution {
    public int jump(int[] nums) {
        int index=0;
        int reachable=0;
    int end=0;

        for(int i=0;i<nums.length-1;i++){

            reachable=Math.max(reachable,(i+nums[i]));

            if(i==end){
                index++;
                end=reachable;
            }
        
                if (end >= nums.length - 1) break; 
        }
        return index;
    }
}