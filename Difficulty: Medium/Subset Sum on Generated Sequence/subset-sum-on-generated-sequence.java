class Solution {
    public boolean isPossible(int[] arr, int s, int x) {
        // code here
        List<Long> list = new ArrayList<>();
        long sum = s;
        long sum2 = s;
        list.add((long) s);
        for(int i = 0; i < arr.length; i ++){
            sum = sum + arr[i];
            
            if(sum > x){
                break;
            }
            
            list.add(sum);
            
            sum2 += sum;
            sum = sum2;
        }
        
       long target = x; 
       
       for (int i = list.size() - 1; i >= 0; i--) {
           long currentNumber = list.get(i); 

          
           if (currentNumber <= target) {
               target = target - currentNumber; 
           }

           
           if (target == 0) {
               return true;
           }
       }

      
       return false;
       
    }
}