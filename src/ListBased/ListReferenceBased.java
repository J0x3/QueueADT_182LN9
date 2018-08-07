package ListBased;

import Exception.ListIndexOutOfBoundsException;

class ListReferenceBased {

    private Node head;
    private int numItems;

    ListReferenceBased() {
        numItems = 0;
        head = null;
    } // end Default Constructor

    Node find(int index) {
        Node curr = head;
        for (int skip = 0; skip < index; skip++) {
            curr = curr.next;
        }
        return curr;
    } // end find

    boolean isEmpty() {
        return numItems == 0;
    } // Eed isEmpty

    int size() {
        return numItems;
    } // end size

    void add(int index, Object item) throws ListIndexOutOfBoundsException {
        if (index >= 0 && index < numItems+1) {
            if (index == 0) {
                // insert at start of list
                Node newNode = new Node(item, head);
                head = newNode;
            }
            else {
                Node prev = find(index-1);
                // insert after prev reference
                Node newNode = new Node(item, prev.next);
                prev.next = newNode;
            }
            numItems++;
        }
        else {
            throw new ListIndexOutOfBoundsException("List index out of bounds on add");
        }
    } // end add

    void remove(int index) throws ListIndexOutOfBoundsException {
        if (index >= 1 && index < numItems) {
            if (index == 1) {
                // delete first node
                head = head.next;
            }
            else {
                Node prev = find(index-1);
                // delete after prev reference
                Node curr = prev.next;
                prev.next = curr.next;
            }
            numItems--;
        }
        else {
            throw new ListIndexOutOfBoundsException("List index out of bounds on remove");
        }
    } // end remove

    Object get(int index) throws ListIndexOutOfBoundsException {
        if (index >= 0 && index < numItems) {
            // get reference to node, and data
            Node curr = find(index);
            Object dataItem = curr.item;
            return dataItem;
        }
        else {
            throw new ListIndexOutOfBoundsException("List index out of bounds on get");
        }
    } // end get

    void removeAll() {
        // if head is null, the list becomes unlinked
        // and marked for garbage collection
        head = null;
        numItems = 0;
    } // end removeAll

    void display() {
        for (int i = 0; i < numItems; i++) {
            System.out.println("Index " + i + ": " + get(i));
        }
    }
}
