class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            int remainder =  target - nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] == remainder){
                    int[] arr ={i,j};
                    return arr;
                }
            }
        }
        int[] arr = {-1,-1};
        return arr;
        
    }
}
