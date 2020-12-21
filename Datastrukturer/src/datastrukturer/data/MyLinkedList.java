package datastrukturer.data;

public class MyLinkedList {

    private Node first;
    private Node last;
    private int size = 0;

    public MyLinkedList(Node first, Node last) {
        this.first = first;
        this.last = last;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    private Node getNode(int index) {
        Node result = first;
        if (index < 0) {
            throw new IndexOutOfBoundsException("" + index);
        }
        if (index == 0) {
            return first;
        }
        if (index >= size) {
            throw new IndexOutOfBoundsException("" + index);
        }
        try {
            for (int i = 1; i <= index; i++) {
                result = result.getNext();
            }
        } catch (NullPointerException ex) {

        }
        return result;
    }

    public void add(String value) {
        Node n = new Node(value);
        last.setNext(n);
        n.setNext(null);
        n.setPrev(last);
        last = n;
        if (first == null) {
            first = n;
        }
        size++;
    }

    public void add(int index, String value) {
        Node n = new Node(value);
        Node prev = getNode(index - 1);
        Node next = getNode(index);
        if (index < 0) {
            throw new IndexOutOfBoundsException("" + index);
        }
        if (index >= size) {
            throw new IndexOutOfBoundsException("" + index);
        }
        if (index == 0) {
            n.setPrev(null);
            first = n;
        } else {
            n.setPrev(prev);
        }
        if (index == size) {
            n.setNext(null);
            last = n;
        } else {
            n.setNext(next);
        }
        prev.setNext(n);
        next.setPrev(n);
        size++;
    }

    public String get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("" + index);
        }
        if (index >= size) {
            throw new IndexOutOfBoundsException("" + index);
        }
        return getNode(index).getValue();
    }

    public String remove(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("" + index);
        }
        if (index >= size) {
            throw new IndexOutOfBoundsException("" + index);
        }
        if (getNode(index) == first){
            first = getNode(1);
        }
        if (getNode(index) == last){
            last = getNode(size-2);
        }
        Node prev = getNode(index - 1);
        Node next = getNode(index + 1);
        prev.setNext(next);
        next.setPrev(prev);
        size--;
        return getNode(index).getValue();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }
    
    public void clear(){
        Node n = first;
        while (n != last) {
            n = first.getNext();
//            getNode(i).getPrev().setPrev(null);
//            getNode(i).getPrev().setNext(null);
        }
        last.setPrev(null);
        size = 0;
        first = null;
        last = null;
    }

}
