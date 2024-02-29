public class MyLinkedList<E> extends MyAbstractList <E>{
    private Node<E> head, tail;
   
    
    public MyLinkedList() {
        
    } //MyLinkedList
    
    
    public MyLinkedList(E[] objects) {
        super(objects);
        
    } //MyLinkedList array
    
    
    public E getFirst() {
       if (size == 0) {
            return null;
        } //if
        
        else {
            return head.element;
        } //else
    }
    
    public E getLast() {
        if (size == 0) {
            return null;
        } //if
        else {
            return tail.element;
        }//else
        
    }//get last
    
    
    public void addFirst(E e) {
        Node<E> newNode = new Node<E>(e); // Create a new node
        newNode.next = head; // link the new node with the head
        head = newNode; // head points to the new node
        size++; // Increase list size
        if (tail == null) // the new node is the only node in list
        {
            tail = head;
        } //if
        
    } //add first
    
    
    public void addLast(E e) {
        Node<E> newNode = new Node<E>(e); // Create a new for element e
        if (tail == null) {
            head = tail = newNode; // new node is the only node in list
        } //if
        else {
            tail.next = newNode; // Link the new with the last node
            tail = tail.next; // tail now points to the last node

        } //else
        size++; // Increase size
        
    } //add last
    

    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e);
        } //if
        else if (index >= size) {
            addLast(e);
        } //else if
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            } //for
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            size++;
        } //else
        
    } //add

    
    public E removeFirst() {
        if (size == 0) {
            return null;
        } //if
        else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            } //if
            return temp.element;
        } //else
    } //remove first
    
   
    public E removeLast() {
        if (size == 0) {
            return null;
        } //if
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } //else if
        else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            } //for
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        } //else



    } //remove last
   
    
    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        } //if
        else if (index == 0) {
            return removeFirst();
        } //else if
        else if (index == size - 1) {
            return removeLast();
        } //else if
        else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            } //for
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        } //else
    } //remove
    
    
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(", "); // Separate two elements with a comma
            } //if
            else {
                result.append("]"); // Insert the closing ] in the string
            } //else
        } //for
        return result.toString();
    } //to string
    /** Clear the list */
    public void clear() {
        head = tail = null;
    } //clear
    



    public boolean contains(E e) {
        return false;
    }// contains
   
  
    
    public E get(int index) {
         return null;
    }// get
    ////// lab 6  #3
  
    public int indexOf(E e) {
        int index = -1;
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) {
                index = i;
                break;
            } //if
            current = current.next;
        } //for
        return index;
    } //index of
  
    
    public int lastIndexOf(E e) {
        return -1;
    } // last index of
    

    public E set(int index, E e) {
        
        
       
		return null;
    }//set
    ////////  this should be first!!!!
    private static class Node<E> {
        E element;
        Node<E> next;
        public Node(E element) {
            this.element = element;
        }//constructor
    }//node
}//class
