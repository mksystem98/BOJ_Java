class Solution {
    public String solution(String str1, String str2) {
       
        String str = "";
            
        for (int i = 0; i < str1.length(); i++) {
            str += str1.charAt(i);
            str += str2.charAt(i);
        }
            
        return str;
    }
}