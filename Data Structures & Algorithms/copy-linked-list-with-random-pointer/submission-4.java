/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }

        Node curr = head;
        while(curr!=null){
            Node copyCurr = new Node(curr.val);
            copyCurr.next = curr.next;
            curr.next = copyCurr;
            curr = copyCurr.next;
        }

        curr = head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        Node dummy = new Node(0);
        Node copy = dummy;
        curr = head;
        while(curr!=null){
            Node copyNode = curr.next;
            curr.next = copyNode.next;
            copy.next = copyNode;
            curr = curr.next;
            copy = copy.next;
        }

        return dummy.next;
    }        
}
