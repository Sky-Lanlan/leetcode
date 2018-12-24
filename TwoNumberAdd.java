import com.sun.corba.se.impl.orbutil.graph.Node;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
        this.next = null;
    }
}


class Solution{
    public ListNode addTwoListNode(ListNode l1, ListNode l2){

        ListNode listC =null, cur = null;
        int carry = 0;
        int sum = 0;
        listC = new ListNode(0);
        cur = listC;
        while(l1 != null || l2 != null){
            
            int x = (l1 != null) ? l1.val: 0;
            int y = (l2 != null) ? l2.val: 0;
            sum = x + y + carry;
            cur.val = sum % 10;
            carry = sum / 10;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            if(l1 == l2 && carry ==0 ){
                break;
            }
            cur.next = new ListNode(carry);
            cur = cur.next;
        }
        return listC;
    }

}

public class TwoNumberAdd{
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(8);
        // a.next.next = new ListNode(3) ;


        ListNode b = new ListNode(0);
        // b.next = new ListNode(6);
        // b.next.next = new ListNode(4) ;

        Solution s = new Solution();
        ListNode c = s.addTwoListNode(a, b);

        
    }
    
}