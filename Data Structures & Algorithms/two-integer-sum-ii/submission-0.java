class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++){
            int rem = target - numbers[i];
            for(int j = i+1; j < numbers.length; j++){
                if(rem == numbers[j]){
                    int[] arr = {i+1, j+1};
                    return arr;
                }
            }
        }
        int[] arr = {-1,-1};
        return arr;
        
    }
}
