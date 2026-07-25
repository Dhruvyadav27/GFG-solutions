class Solution {
    public int median(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int [] arr= new int[n*m];
        int a=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[a]=mat[i][j];
                a++;
            
            }
        
        }
        Arrays.sort(arr);
        return arr[arr.length/2];
        
    }
}