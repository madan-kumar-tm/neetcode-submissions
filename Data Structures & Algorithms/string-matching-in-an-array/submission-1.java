class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans  = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            String temp = words[i];
            for(int j = 0; j < words.length; j++){
                if(words[j].contains(temp) && j != i && !ans.contains(words[i])){
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}