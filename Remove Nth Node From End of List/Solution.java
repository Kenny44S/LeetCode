import java.util.HashMap;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head.next == null)
        {
            head = null;
            return head;
        }
        
        int counter = 1;

        HashMap<Integer, ListNode> hmap = new HashMap();
        
        ListNode node = head;
        
        while(node != null)
        {
            hmap.put(counter, node);
            counter++;
            node = node.next;
        }
        
        if( (counter-1) == n)
        {
            head = hmap.get(2);
            return head;
        }
        hmap.get(counter - n -1).next = hmap.get(counter - n + 1);
        
        return head;
    }
}