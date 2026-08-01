class Solution {
    int floorSqrt(int n) {
        int h=n;
        int l = 0;
        int s=0;
        for(int i=0;i<=n;i++){
           int m = l+(h-l)/2;
           if(m*m == n) return m;
           if(m*m > n){
               h = m - 1;
               
           }
           else{
               s = m;
               l = m + 1;
           }
        }
        return s;
        
    }
}