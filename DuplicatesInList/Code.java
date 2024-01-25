package DuplicatesInList;
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

class Code{
    public ListNode deleteDuplicates(ListNode head) {
        // check if list is empty first
        if(head == null){
            return head;
        }
        ListNode track = head;
        // -1 2 4 5 6 2
        // -1
        // 1
        while(track != null && track.next != null){ // add everything to hashset
        // -1 3 2 5 5 3 5 4
            if (track.val == track.next.val){
                track.next = track.next.next; 
            } else{
                track = track.next;
            }
        }
        return head;
    }
 
}