class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        int i = 0;
        while(i < sb.length()) {
            if(sb.charAt(i)==' ') {
                sb.deleteCharAt(i);
            }
            i++;
        }
        i = 0;
        while(i < sb.length()) {
            if('A'<=sb.charAt(i) && sb.charAt(i)<='Z') {
                sb.setCharAt(i, (char)(sb.charAt(i)+32));
            }
            i++;
        }
        i = 0;
        while(i < sb.length()) {
            if('0'<=sb.charAt(i) && sb.charAt(i)<='9'){
                i++;
                continue;
            } 
            if(!('a'<=sb.charAt(i) && sb.charAt(i)<='z')) {
                sb.deleteCharAt(i);
            }
            else i++;
        }

        i = 0;
        int j = sb.length()-1;
        while(i < j) {
            if('A'<=sb.charAt(i) && sb.charAt(i)<='Z') {
                sb.setCharAt(i, (char)(sb.charAt(i)+32));
            }

            if(sb.charAt(i) != sb.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}
