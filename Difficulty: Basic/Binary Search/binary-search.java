class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
       
        int result = binarySearch(arr, k, 0, arr.length - 1);
        if (result == -1) {
           return false;
        } else {
           return true;
        }
    }
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; 
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid; 
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, low, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, high);
        }
    }
    
}