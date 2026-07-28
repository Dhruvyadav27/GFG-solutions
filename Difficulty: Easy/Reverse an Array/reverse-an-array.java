class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        int j=n-1;
        for(int i=0; i<n/2;i++){
           int t= arr[i];
           arr[i]=arr[j];
           arr[j]=t;
           j--;
        }
    }
}