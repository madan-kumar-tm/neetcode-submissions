class Solution {
    public boolean validPalindrome(String s) {
        int left  = 0, rigth = s.length()-1, cnt = 0;
        while(left <= rigth){
            if(s.charAt(left) == s.charAt(rigth)){
                left++;
                rigth--;
            }
            else{
                return validPalindrome1(s, left+1, rigth) || 
                    validPalindrome1(s, left, rigth-1);
            }
        }
        return true;
    }
    private boolean validPalindrome1(String s, int left, int rigth){
        while(left < rigth){
            if(s.charAt(left)== s.charAt(rigth)){
                left++;
                rigth--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}