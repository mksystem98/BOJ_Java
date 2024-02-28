class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        char[] my_char = my_string.toCharArray();
        char[] overwrite_char = overwrite_string.toCharArray();

        for (int i = 0; i < overwrite_char.length; i++) {
            my_char[i+s] = overwrite_char[i];
        }

        String str = new String(my_char);
        return str;
    }
}