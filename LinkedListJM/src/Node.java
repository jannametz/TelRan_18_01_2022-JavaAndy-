public class Node<E> {
        private E data;
        private Node<E> prev;
        private Node<E> next;

        public Node(E data, Node<E> next, Node<E> prev ) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
        public Node<E> getPrev() {
        return prev;
        }

        public void setPrev(Node<E> prev) {
        this.prev = prev;
        }
    }

