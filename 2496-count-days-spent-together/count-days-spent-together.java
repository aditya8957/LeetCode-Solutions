class Solution {
    public int find(String arriveAlice){
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month1 = Integer.parseInt(arriveAlice.substring(0,2));
        int date1 = Integer.parseInt(arriveAlice.substring(3,5));

        int aliceA = 0;
        for(int i=0; i<month1-1; i++){
            aliceA += daysInMonth[i];
        }
        aliceA += date1;
        return aliceA;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

       
        int arrAlice = find(arriveAlice); //227
        int lAlice = find(leaveAlice); //230
        int arrBob = find(arriveBob); //228
        int lBob = find(leaveBob); //231

        if(lAlice<arrBob || lBob<arrAlice)
            return 0;
      
        return Math.min(lAlice,lBob) - Math.max(arrAlice,arrBob)+1;
    }
}