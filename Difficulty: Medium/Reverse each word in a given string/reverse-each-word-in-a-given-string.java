class Solution {
    public String reverseWords(String s) {
       
        StringBuilder sb = new StringBuilder(s);
        StringBuilder es = new StringBuilder();
        for(int i=0;i<sb.length();i++){
            while(i<sb.length() && sb.charAt(i)==' '){
                i++;
            }
            if(i==sb.length()) break;
            int start=i;
            while(i<sb.length() && sb.charAt(i) != ' '){
                i++;
            }
            if (es.length() > 0) {
                es.append(" ");
            }
            int end =i;
            for (int k = end - 1; k >= start; k--) {
              es.append(sb.charAt(k));
            }
            
            i--;
        }
        
        return es.toString();
    }
}
