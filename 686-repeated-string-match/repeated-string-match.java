class Solution {

    public int KmpMatch(String haystack, String needle) {
        return  haystack.indexOf(needle);
    }

    public int repeatedStringMatch(String a, String b) {

        if(a.equals(b)) return 1;

        int repeat = 1;
        StringBuilder s = new StringBuilder(a);

        while(s.length() < b.length()){
            s.append(a);
            repeat++;
        }
        // Kmp Pattern Match
        if(KmpMatch(s.toString() , b) != -1)
        return repeat;

        // add 1 more time
        if(KmpMatch(s.append(a).toString() , b) != -1)
            return repeat + 1;

        return -1; 
    }
}