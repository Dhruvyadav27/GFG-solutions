class Solution {
    public void sortInWave(int arr[]) {
        // code here
        int c;
        int n=arr.length;
        for(int i=0;i<n-1;i+=2){
            c=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=c;
        }
    }
}