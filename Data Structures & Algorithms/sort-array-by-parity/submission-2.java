class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, rigth = nums.length - 1;
        while(left < rigth){
            if(nums[left] % 2 > nums[rigth] % 2){
                int temp =nums[left];
                nums[left] = nums[rigth];
                nums[rigth] = temp;
            }
            if(nums[left] % 2 == 0) left++;
            if(nums[rigth] % 2 == 1) rigth--;
        }
        return nums;
    }
}