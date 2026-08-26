class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int idx = -1;
        int lidx = -1;
        int n = s.length();
        int sum = 0;
        int i = 0;
        int j = 0;
        int minLen = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();
        while(j<n){
            if(s.charAt(j)=='1') sum += 1;

            while(sum>=k && i<n){
                
                int len = j-i+1;
                if(minLen>=len){
                    minLen = len;
                    idx = i;
                    lidx = j;
                    String s1 = s.substring(idx,lidx+1);
                    if(list.size()>0 && s1.length()<list.get(list.size()-1).length()){
                        list.clear();
                    }
                    list.add(s1);
                }
                if(s.charAt(i)=='1') sum -= 1;
                i++;
            }
            j++;
        }
        if(idx == -1 || lidx == -1) return "";
        Collections.sort(list);
        return list.get(0);
    }
}