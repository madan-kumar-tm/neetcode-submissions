class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //List<Integer> a = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int temp1 = nums[i];
            for(int j = i+1; j < nums.length; j++){
                int temp2 = nums[j];
                for(int k = j+1; k < nums.length; k++){
                    if((temp1 + temp2 + nums[k]) == 0){
                        List<Integer> a = new ArrayList<>();
                        a.add(temp1);
                        a.add(temp2);
                        a.add(nums[k]);

                        Collections.sort(a);
                        //System.out.println(a);

                        if(!ans.contains(a)) {
                            ans.add(a);
                        }
                        //a.clear();
                    }
                    //Collections.sort(a);
                    //if(!ans.contains(a)) ans.add(a);
                }
            }
        }
        return ans;
        
    }
}
