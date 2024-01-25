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
class ListNode{
    ListNode node;
    int val;
    ListNode next;

    public ListNode(int val){
        //this(val, null);
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next; 
    }
}