class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
                int sum = 0;
        int sum2 = 0;
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;


        for(int i=0; i<n; i++){
            sum = landStartTime[i] + landDuration[i];
            min = Math.min(sum, min);
        }
        for(int i=0; i<m; i++){
           
                sum2 =  Math.max(min,waterStartTime[i])+waterDuration[i];
                min2 = Math.min(sum2,min2);
            
        }

        sum = 0;
        sum2 = 0;
        int min1 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;
         for(int i=0; i<m; i++){
            sum = waterStartTime[i] + waterDuration[i];
            min1 = Math.min(sum, min1);
        }
        System.out.println(min1);

        for(int i=0; i<n; i++){
    
                sum2 = Math.max(min1,landStartTime[i])+landDuration[i];
                min3 = Math.min(sum2,min3);
            
        }
        return Math.min(min2,min3);
    }
}