class Solution {
    public int maximumGap(String skill, String station) {
        int n = skill.length();
        int m = station.length();
        int[] arr = new int[n];

        int i=0;
        int j = 0;

        while(i<n && j<m){
            if(skill.charAt(i) == station.charAt(j)){
                arr[i] = j;
                i++;
                j++; 
            }
            else{
                j++;
            }
        }
        j = station.length()-1;
        int[] suff = new int[n];
        i = n-1;
        while(i>= 0 && j>=0){
            if(station.charAt(j) == skill.charAt(i)){
                suff[i] = j;
                i--;
                j--;
            }
            else
                j--;
        }
        int ans = 0;
       
        for(int k=0; k<n-1; k++){
            ans = Math.max(ans, Math.abs(arr[k]-suff[k+1]));
        }
        return ans;
    }
}