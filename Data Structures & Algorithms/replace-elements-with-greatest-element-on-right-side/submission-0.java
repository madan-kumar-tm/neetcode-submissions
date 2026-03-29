class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
       for(int i = 0; i < n - 1; i++){
        int temp = arr[i+1];
        for(int j = i + 2; j < n; j ++){
            if(temp < arr[j]){
                temp = arr[j];
            }
        }
        arr[i] = temp;
       } 
       arr[n-1] = -1;
       return arr;
    }
}