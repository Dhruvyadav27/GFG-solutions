class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
       ArrayList<Integer> arr= new ArrayList<>();
       int n=mat.length;
       int m = mat[0].length;
       int a=0;
       int b=0;
       int c=mat.length;
       int d=mat[0].length;
       while(arr.size()<d*c){
          
           for(int i=b; i<m; i++){
               arr.add(mat[a][i]);
               
           }
           a++;
           if(arr.size()==d*c) break;
           for(int i=a; i<n; i++){
                arr.add(mat[i][m-1]);
            
           }
           m--;
           if(arr.size()==d*c) break;
           for(int i=m-1;i>=b; i--){
              arr.add(mat[n-1][i]); 
             
           }
           n--;
           if(arr.size()==d*c) break;
           for(int i=n-1;i>=a; i--){
              arr.add(mat[i][b]); 
             
           }
           b++;
           
           
           
       }
       return arr;
       
    }
}
