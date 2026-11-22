import java.util.Stack;
class main
{
    public static void main(String[] args) {
        String s = "mississippi";

        int count[] = new int[26];
        for(int i=0; i<s.length(); i++) {
            int idx = (int)s.charAt(i) - 97;
            count[idx]++;
        }

        for(int i=0; i<26; i++) {
            if(count[i] > 1){
                System.out.println("'" + (char)(i+97) + "', " + count[i]);
            }
        }
    }
}
