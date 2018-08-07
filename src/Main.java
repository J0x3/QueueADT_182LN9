import ArrayBased.ArrayBased;
import ListBased.ListBased;
import ReferenceBased.ReferenceBased;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // ArrayBased Queue
        // "isEmpty()",  "enqueue()", "dequeue()", "dequeueAll()", and "peek()"
        System.out.println("~~~~~~~~ Array Based Queue: ");
        ArrayBased abQueue = new ArrayBased();
        abQueue.enqueue(12);
        abQueue.enqueue(99);
        System.out.println("Peek: " + abQueue.peek());
        System.out.println("Is empty?: " + abQueue.isEmpty());
        abQueue.dequeue();
        System.out.println("Peek: " + abQueue.peek());
        abQueue.dequeueAll();
        System.out.println("Is empty?: " + abQueue.isEmpty());

        // ReferenceBased Queue
        // "isEmpty()",  "enqueue()", "dequeue()", "dequeueAll()", and "peek()"
        System.out.println("~~~~~~~~ Reference Based Queue: ");
        ReferenceBased rbQueue = new ReferenceBased();
        System.out.println("Is empty?: " + rbQueue.isEmpty());
        rbQueue.enqueue(1337);
        rbQueue.enqueue(1015);
        System.out.println("Peek: " + rbQueue.peek());
        System.out.println("Is empty?: " + rbQueue.isEmpty());
        rbQueue.dequeue();
        System.out.println("Peek: " + rbQueue.peek());
        rbQueue.dequeueAll();
        System.out.println("Is empty?: " + rbQueue.isEmpty());

        // ListBased Queue
        // "isEmpty()",  "enqueue()", "dequeue()", "dequeueAll()", and "peek()"
        System.out.println("~~~~~~~~ List Based Queue: ");
        ListBased lbQueue = new ListBased();
        System.out.println("Is empty?: " + lbQueue.isEmpty());
        lbQueue.enqueue(1);
        System.out.println("Is empty?: " + lbQueue.isEmpty());
        lbQueue.enqueue(2);
        System.out.println("Peek: " + lbQueue.peek());
        lbQueue.enqueue(3);
        System.out.println("Peek: " + lbQueue.peek());
        lbQueue.enqueue(4);
        lbQueue.dequeueAll();
        System.out.println("Is empty?: " + lbQueue.isEmpty());

        // JCF Queue
        // "isEmpty()", "isFull()" , "add()", "remove()", and "peek()"
        System.out.println("~~~~~~~~ JCF Based Queue: ");
        LinkedList<Integer> aQueue = new LinkedList<>();
        aQueue.add(10);
        System.out.println("Peek: " + aQueue.peek());
        aQueue.add(114);
        System.out.println("Peek: " + aQueue.peek());
        aQueue.remove();
        System.out.println("Peek: " + aQueue.peek());
        aQueue.add(13);
        aQueue.add(9);
        System.out.println("Is empty?: " + aQueue.isEmpty());
        aQueue.remove();
        aQueue.remove();
        aQueue.remove();
        System.out.println("Is empty?: " + aQueue.isEmpty());
    }
}
