class Solution {
    public int countWays(int n) {
        // code here
        if(n==1) return 1;
      if(n==2) return 2;

      int ans = countWays(n-1)+countWays(n-2);
      return ans;
    }
}