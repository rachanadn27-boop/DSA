class Solution {
    public boolean checkDivisibility(int n) {
        int sd = 0;
        int pd = 1;
        int num = n;
        while (num > 0) {
            sd += num % 10;
            pd *= num % 10;
            num /= 10;
        }
        return n % (sd+ pd) == 0;
    }
}