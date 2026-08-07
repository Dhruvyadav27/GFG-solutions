class Solution {
    public static int largest(int[] arr) {
        // code here
        // if(i >= arr.length){
        //     return max;
        // }
        int max = arr[0];
        return k(arr , max, 0);
        
        
    }
    public static int k(int [] arr, int max, int i){
        if (i >= arr.length) {
            return max;
        }
        if (arr[i] > max) {
            max = arr[i];
        }
        return k(arr, max, i + 1);
    }
}
