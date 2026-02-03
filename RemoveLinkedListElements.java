// Remove Linked List Elements
// Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        return remove(head, val);
    }
    ListNode remove(ListNode node, int val){
        if(node == null) return null;

        node.next = remove(node.next, val);
        if(node.val == val) return node.next;

        else    return node;
    }
}
