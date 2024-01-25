package DuplicatesInList;
class Main{
    public static void main(String[] args){
        ListNode head = new ListNode(-1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next = new ListNode(3);

        Code code = new Code();
        System.out.print("\n\nGreetings fellow netizen.\nLooks like you hate seeing lists with duplicate integers..especially in a sorted order..\noccupying all the space in memory, as much as I do, because why else would you be here, right?\nToday I'll show you how to fix this problem that even doctors are clueless about. \nTake a look at this horrible list infected with duplicate integers.\n\n");
        ListNode track1 = head.next;
        while(track1 != null){
            System.out.println(track1.val);
            track1 = track1.next;
        }
        System.out.println("\nAwful, isn't it? Now watch me remove them with this miracle alrogithm.");
        head = code.deleteDuplicates(head);
        System.out.println("\nReady for it?...");
        System.out.println("\nI bet you aren't...");
        System.out.println("\nIn fact, I bet you think this list will STILL have duplicates:");
        System.out.println("\nWell...you're wrong.\n");
        ListNode track2 = head.next;
        while(track2 != null){
            System.out.println(track2.val);
            track2 = track2.next;
        }
        System.out.println("\nI hate to say it..but..I told you so :)");
        System.out.println("You, my fellow netizen, need to drink some blueberry tea :|\n");
        System.out.println("\nSigning off, have a good rest of your day.\n");
    }
}