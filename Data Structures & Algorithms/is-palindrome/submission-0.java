class Solution {
    public boolean isPalindrome(String s) {
        String result = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int rigth = result.length() - 1;
        while(left <= rigth){
            if(result.charAt(left) != result.charAt(rigth)){
               // System.out.println(result);
                return false;
            }
            else{
                left++;
                rigth--;
            }
        }
        return true;
        
    }
}
