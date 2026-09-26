class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> mp = new HashMap<>();

        for(int i=0; i<knowledge.size(); i++){
            mp.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }

        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                i++;
                String temp = "";
                while(i<n && s.charAt(i) != ')'){
                    temp += s.charAt(i);
                    i++;
                }
                if(mp.containsKey(temp)){
                    sb.append(mp.get(temp));
                }
                else{
                    sb.append("?");
                }
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}