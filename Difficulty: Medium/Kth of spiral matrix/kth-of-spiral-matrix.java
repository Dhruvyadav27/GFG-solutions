class Solution {

 public int findK(int[][] mat, int k) {

    int t = 0;
    int b = mat.length - 1;
    int l = 0;
    int r = mat[0].length - 1;

    int count = 0;

    while (t <= b && l <= r) {

        for (int i = l; i <= r; i++) {
            count++;
            if (count == k) return mat[t][i];
        }
        t++;

       
        for (int i = t; i <= b; i++) {
            count++;
            if (count == k) return mat[i][r];
        }
        r--;

      
        if (t <= b) {
            for (int i = r; i >= l; i--) {
                count++;
                if (count == k) return mat[b][i];
            }
            b--;
        }

    
        if (l <= r) {
            for (int i = b; i >= t; i--) {
                count++;
                if (count == k) return mat[i][l];
            }
            l++;
        }
    }

    return -1;
   }
}