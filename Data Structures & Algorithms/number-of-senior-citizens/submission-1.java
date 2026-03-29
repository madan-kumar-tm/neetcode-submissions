class Solution {
    public int countSeniors(String[] details) {
        int cnt = 0;
        for(int i = 0; i < details.length; i++){
            String temp = details[i];
            int n = temp.length();
            System.out.println(temp.charAt(n-4));
            if((temp.charAt(n-4) >= '6' && temp.charAt(n-3) > '0') || (temp.charAt(n-4) > '6' && temp.charAt(n-3) >= '0')){
                cnt++;
                System.out.println(temp.charAt(n-4));
            }
        }
        return cnt;
        
    }
}