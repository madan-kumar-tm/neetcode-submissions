class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> s1 = new ArrayList<>();
        List<Integer> s2 = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                s1.add(nums[i]);
            }
            else{
                s2.add(nums[i]);
            }
        }
        //Collections.sort(s1);
        //Collections.sort(s2);
        int[] ans = new int[nums.length];
        for(int i = 0; i < s1.size(); i++){
            ans[i]=s1.get(i);
        }
        for(int i = 0; i < s2.size(); i++){
            ans[s1.size()+i]=s2.get(i);
        }
        return ans;
    }
}