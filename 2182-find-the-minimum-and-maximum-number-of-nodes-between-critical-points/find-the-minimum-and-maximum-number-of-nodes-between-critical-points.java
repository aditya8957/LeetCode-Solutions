/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int prev = head.val;
        ListNode temp = head.next;
        int c = 2;
        int first = -1;
        int last = -1;
        int crCurr = -1;
        int crPrev = -1;
        int min = Integer.MAX_VALUE;

        while(temp.next != null){
            int curr = temp.val;
            int nxt = temp.next.val;
            if((curr>prev && curr >nxt) ||  (curr<prev && curr <nxt)){
                if(first == -1){
                    first = c;
                    last = c;
                }
                else{
                    last = c;
                }

                //min
                if(crCurr == -1){
                    crCurr = c;
                    crPrev = crCurr;
                }
                else{
                    crCurr = c;
                    min = Math.min(min,crCurr-crPrev);
                    crPrev = crCurr;
                }
            }
            prev = curr;
            c++;
            temp = temp.next;
        }
        int max = last-first;
        if(max == 0) max = -1;
        if(min == Integer.MAX_VALUE) min = -1;
        System.out.println(max);
        return new int[]{min,max};
    }
}