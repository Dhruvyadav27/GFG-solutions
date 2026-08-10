class Solution {
    static int sumOfDigits(int n) {
        // code here
        int ans =0;
        return sumOfDigits(n, ans);
    }
    public static int sumOfDigits(int n, int ans){
       ans += n % 10;
        if(n<10) return ans;
        return sumOfDigits(n/10, ans);
    }
}
