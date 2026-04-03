class Solution {
    public int compress(char[] chars) {
        StringBuffer s = new StringBuffer();
        char index = chars[0];
        int len = 1;
        for(int i = 1; i < chars.length; i++){
            if(chars[i] == index){
                System.out.println(chars[i]);
                len++;
            }
            else{
                s.append(index);
                if(len > 1){
                    s.append(len);
                }    
                index = chars[i];
                len = 1;
            }
        }
        s.append(index);
        if(len > 1){
            s.append(len);
        }
        for(int i = 0; i < s.length(); i++){
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}