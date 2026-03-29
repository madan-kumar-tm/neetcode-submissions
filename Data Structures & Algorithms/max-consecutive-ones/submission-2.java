class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = 0;
        int cur = 0;
        for(int i = 0; i < nums.length; i++){ 
            if(nums[i]!=0){
                cur++;
            }
            if(nums[i] == 0 || i == (nums.length - 1)){
                if(cur >= len){
                    System.out.println(i);
                    len = cur;
                    cur = 0;
                }
                else{
                    cur = 0;
                }
            }
        }
        return len;
    }
}