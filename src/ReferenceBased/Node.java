package ReferenceBased;

public class Node {
    Object item;
    Node next;

    Node(Object newItem) {
        item = newItem;
        next = null;
    } // end Constructor

    Node(Object newItem, Node nextNode) {
        item = newItem;
        next = nextNode;
    } // end Constructor
}
