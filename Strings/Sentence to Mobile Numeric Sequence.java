class Solution {
    public String printSequence(String s) {
        // code here
        String numeric[] = {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                sb.append("0");
                continue;
            }
            int idx = (int)s.charAt(i) - 65;
            String val = numeric[idx];
            
            sb.append(val);
        }
        
        return sb.toString();
    }
}
