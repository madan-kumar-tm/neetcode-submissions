class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> s1 = new ArrayList<>();
        List<Character> t1 = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            s1.add(s.charAt(i));
        }
        for(int i = 0; i < t.length(); i++){
            t1.add(t.charAt(i));
        }
        Collections.sort(s1);
        Collections.sort(t1);
        int i = 0;
        if(s1.size()!=t1.size()){
            return false;
        }
        else{
            while(i < s1.size() && i < t1.size()){
                if(s1.get(i)!=t1.get(i)){
                    return false;
                }
                i++;
            }
            return true;
        }

    }
}
