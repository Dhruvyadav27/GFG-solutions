class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
         int i=0;

        int n=mat[0].length;
        int m =mat.length;
        int j=n-1;
        while(i<m){
            if (mat[i][j]==x) return true;
            else if(mat[i][j]<x) i++;
            else{
                if(j>0) j--;
                else return false;
               
            }
        }
        return false;
    }
}
