class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        

        int n=mat[0].length;
        int m =mat.length;
        for(int i=0;i<m;i++){
           for(int j=0;j<n ;j++){
               if(mat[i][j]==x) return true;
           }  
        }
        return false;
       
    }
}
