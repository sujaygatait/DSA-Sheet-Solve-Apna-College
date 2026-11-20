class Solution {
    public String removeDuplicates(String s) {
        // code here
        if(s.length() == 1) return s;
        
        int temp = s.charAt(0);
        StringBuilder sb = new StringBuilder(s);
        int i = 1;
        while(i < sb.length()) {
            char ch = sb.charAt(i);
            
            if(ch == temp) {
                sb.deleteCharAt(i);
            }
            else  {
                temp = ch;
                i++;
            }
        }
        
        return sb.toString();
    }
}
