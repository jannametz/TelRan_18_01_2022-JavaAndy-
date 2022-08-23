


public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> mylist = new MyLinkedList<>();
        mylist.pushToHead("a");
        mylist.pushToHead("b");
        mylist.pushToHead("c");
        mylist.pushToHead("d");
        mylist.pushToHead("e");
        mylist.pushToHead("f");
        for(int i=0; i<mylist.getSize(); i++){
            System.out.println(mylist.get(i));
        }
    }
}