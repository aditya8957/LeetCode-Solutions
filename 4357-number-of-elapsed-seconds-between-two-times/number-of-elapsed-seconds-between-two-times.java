class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] str1 = startTime.split(":");
        String[] str2 = endTime.split(":");

        long val1 = 0;
        long val2 = 0;

        for(int i=0; i<str1.length; i++){
            int val = Integer.parseInt(str1[i]);
            int v = Integer.parseInt(str2[i]);
            if(i == 0){
                val1 += val*3600;
                val2 += v*3600;}
            else if(i == 1){
                val1 += val*60;
                val2 += v*60;
            }
            else{
                val1 += val;
                val2 += v;

            }
        }
        return (int)(val2-val1);
    }
}