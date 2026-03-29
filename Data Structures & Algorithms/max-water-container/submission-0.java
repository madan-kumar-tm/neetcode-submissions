class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxSum = 0;
        int left = 0;
        int rigth = n-1;
        while(left < rigth){
            int height = Math.min(heights[left], heights[rigth]);
            int width = rigth - left;
            int max = height * width;
            if(maxSum < max){
                maxSum = max;
            }
            if(heights[left] < heights[rigth]){
                left ++;
            }
            else{
                rigth--;
            }
            
        }
        return maxSum;
    }
}
