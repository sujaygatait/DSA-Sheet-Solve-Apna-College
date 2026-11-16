class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int n = s.length();

        char[] arr1 = new char[n];
        for(int i=0; i<n; i++) {
            arr1[i] = s.charAt(i);
        }

        char[] arr2 = new char[n];
        for(int i=0; i<n; i++) {
            arr2[i] = t.charAt(i);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<n; i++) {
            if(arr1[i] != arr2[i]) return false;
        }

        return true;
    }
}
