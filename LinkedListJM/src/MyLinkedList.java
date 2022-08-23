import java.util.LinkedList;

public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int idx; // = 0;
    public int getSize() {
        return idx;
    }
    public MyLinkedList() {
        tail = new Node<E>(null, head, null);
        head = new Node<E>(null,null, tail);
    }

    public void pushToHead(E data) {
        Node<E> next = head;
        next.setData(data);
        head = new Node<E>(null,null,next);
        next.setPrev(head);
        idx++;
        }

    public void pushToTail(E data) {
        Node<E> prev = tail;
        prev.setData(data);
        tail = new Node<E>(null,prev,null);
        prev.setNext(tail);
        idx++;

    }

    public void pushToIndex(int index, E data) {
        Node<E> currentNode = head;
        for (int i = 0; i <= index-1; i++) {
            currentNode = currentNode.getNext();
        }
        Node<E> addElement = new Node<E>(data,currentNode, currentNode.getNext());
        currentNode.getNext().setPrev(addElement);
        currentNode.setNext(addElement);
        idx++;

        System.out.println("This element: " + addElement.getData() + "new");
    }

    public void removeHead() {
        System.out.println("This element: " + head.getPrev().getData() + " deleted");
        head = head.getPrev();
        idx--;
        }

    public void removeTail() {
        System.out.println("Element : " + tail.getPrev().getData() + " deleted");
        tail = tail.getPrev();
        idx--;

    }
    public void removeIndex(int index) {
        Node<E> currentNode = head;
        for (int i = 0; i <= index; i++) {
            currentNode = currentNode.getNext();
        }
        currentNode.getPrev().setNext(currentNode.getNext());
        currentNode.getNext().setPrev(currentNode.getPrev());
        System.out.println("This element: " + currentNode.getData() + "was deleted");
        currentNode = null;
        idx--;
    }

   public E get(int index) {
       Node<E> currentNode = head;
       for (int i = 0; i <= index; i++) {
           currentNode = currentNode.getNext();
       }
       return currentNode.getData();
   }

    public void print() {
        Node<E> currentNode = head.getNext();
        while (currentNode != tail) {
            System.out.println(currentNode.getData());
            currentNode  = currentNode.getNext();
        }
    }
}
