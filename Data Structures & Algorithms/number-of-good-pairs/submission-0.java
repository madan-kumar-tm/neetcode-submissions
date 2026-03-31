class Solution {
    public int numIdenticalPairs(int[] nums) {
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            for(int j = i+1; j < nums.length; j++ ){
                if(nums[j] ==  temp){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}