class Solution {
    public int findPages(int[] arr, int k) {
        int n = arr.length;
        if (n < k) return -1;
        
       
        long s = 1;
        long sum = 0;
        
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
      
        long e = sum;
        long ans = -1;
        
        while(s <= e){
           
            long mid = s + (e - s) / 2;
            
            if(isValidAnswer(arr, k, mid)){
               ans = mid;
               e = mid - 1;
            }
            else{
               s = mid + 1; 
            }
        }
        
       
        return (int) ans; 
    }
    
   
    static boolean isValidAnswer(int[] arr, int k, long mid){
        int studentCount = 1;
       
        long pages = 0; 
        
        for(int i = 0; i < arr.length; i++){
            if(pages + arr[i] <= mid){
                pages += arr[i];
            }
            else{
                studentCount++;
                if(studentCount > k || arr[i] > mid){
                    return false;
                }
                else{
                    pages = arr[i];
                }
            }
        }
        return true;
    }
}