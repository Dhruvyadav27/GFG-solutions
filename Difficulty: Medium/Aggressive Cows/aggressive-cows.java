class Solution {
    public int aggressiveCows(int[] arr, int k) {
        // code here
      Arrays.sort(arr);
      int n = arr.length;
      int e = arr[n - 1] - arr[0];
      int s = 0;
      int ans = 0;
      while(e>=s){
          int mid = s + (e - s) / 2;
          if(isValid(mid, arr, k)){
              ans = mid;
              s = mid + 1;
          }
          else{
            e = mid - 1;
          }
      } 
      return ans; 
    }
    static boolean isValid(int mid, int []arr, int m){
        int ball = 1;
        int lp = 0;
        for(int i = 1; i < arr.length; i++){
            if(mid <= arr[i] - arr[lp]){
                ball++;
                lp = i;
                if(ball == m) return true;
            }
            else{

            }
        }
        return false;
    }
    
}