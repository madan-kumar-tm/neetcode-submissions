class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> num = new HashSet<>();
        for(int i = 0; i < n; i++){
            num.add(nums[i]);
        }
        int m = num.size();
        if(n == m){
            return false;
        }
        else{
            return true;
        }
        
    }
}