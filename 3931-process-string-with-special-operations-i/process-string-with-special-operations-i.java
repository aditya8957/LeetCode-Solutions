class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >='a' && s.charAt(i)<='z') sb.append(s.charAt(i));
            else if(sb.length()>0 && s.charAt(i) == '*') sb.deleteCharAt(sb.length()-1);
            else if(s.charAt(i) == '#') sb.append(sb);
            else sb = sb.reverse();
        }
        return sb.toString();
    }
}