class Solution {
    public static int sumSubstrings(String s) {
        //String str="0";
        int sum=0;
        for(int i =0; i<=s.length(); i++){
            for(int j =i; j<=s.length();j++){
                String str=s.substring(i,j);
                if(str.length()>0){
                    sum+=Integer.parseInt(str);
                }
            }
        }
        return sum;
    }
}