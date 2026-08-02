class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int low =0;
        int high =m;
        //int a=0;
        while(low<=high){
             int mid = low + (high - low) / 2;
             int a=mid;
             for(int i=1; i<n; i++){
                 a*=mid;
             }
             if(a==m) return mid;
             else if(a>m){
                 high = mid-1;
                 a=0;
             }
             else{
                 low = mid+1;
                  a=0;
             }
        }
        return -1;
    }
}