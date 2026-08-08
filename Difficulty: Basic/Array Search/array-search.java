class Solution {
    public int search(int arr[], int x) {
        // code here
        return s(arr, 0, x);
    }
    public int s(int [] arr, int i, int x){
        if(i>=arr.length) return -1;
        if(arr[i]==x) return i;
        return s(arr, i+1, x);
        
    }
}
