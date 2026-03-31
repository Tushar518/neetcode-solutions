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
        if(head==null){
            return head;
        }

        Node curr = head;
        while(curr!=null){
            Node copyNode = new Node(curr.val);
            copyNode.next = curr.next;
            curr.next = copyNode;
            curr = copyNode.next;
        }

        curr = head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;  
        }


        Node dummy = new Node(0);
        Node copyNode = dummy;

        curr = head;
        while(curr!=null){
            Node copy = curr.next;
            copyNode.next = copy;
            curr.next = copy.next;
            curr = curr.next;
            copyNode = copy;
        }

        return dummy.next;
    }
}
