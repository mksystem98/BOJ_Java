class Solution {
    public int solution(int num, int n) {
            int result = 0;

            if (num % n == 0) {
                result = 1;
            }
            if (num % n != 0) {
                result = 0;
            }

            return  result;
    }
}