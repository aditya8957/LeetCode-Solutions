import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        HashMap<Integer, boolean[]> map = new HashMap<>();

        for (int i = 0; i < reservedSeats.length; i++) {

            int row = reservedSeats[i][0];
            int col = reservedSeats[i][1];

            if (!map.containsKey(row)) {
                map.put(row, new boolean[11]);
            }

            map.get(row)[col] = true;
        }

        int count = 0;

        for (boolean[] seats : map.values()) {

            boolean check = true;

            for (int j = 2; j <= 5; j++) {
                if (seats[j]) {
                    check = false;
                    break;
                }
            }

            if (check) {
                count++;

                boolean flag = true;

                for (int j = 6; j <= 9; j++) {
                    if (seats[j]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    count++;
                }
            }

            else {

                boolean flag = true;

                for (int j = 4; j <= 7; j++) {
                    if (seats[j]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    count++;
                }

                if (!flag) {

                    boolean flag1 = true;

                    for (int j = 6; j <= 9; j++) {
                        if (seats[j]) {
                            flag1 = false;
                            break;
                        }
                    }

                    if (flag1) {
                        count++;
                    }
                }
            }
        }

        count += (n - map.size()) * 2;

        return count;
    }
}
