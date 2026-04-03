class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int index = 0;
        while(index < nums.length){
            if(index == 0){
                leftSum = 0;
            }
            else{
                leftSum += nums[index-1];
            }    
            int rigthSum = 0;
            for(int i = index+1; i < nums.length; i++){
                rigthSum += nums[i];
            }
            if(leftSum == rigthSum){
                return index;
            }
            index++;
        }
        return -1;
        
    }
}