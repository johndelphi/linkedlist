import java.util.LinkedList;

//JOHN MUEMA MICHAEL
//DATE  03/07/2021
//COSC   2436
//DESCRIPTION generic linked list

public class linkedlist1 {
    String element;// list element
    Node next; // list successor link

    Node(String el,Node n){
    element=el;
    next=n;
}

Node(String el){
    element=el;
    next=null;
}}

    private Node first; // linked list first node also referred to as head
    private Node last; // the last element in the list
    // constructor

public LinkedList(){
    first=null;
    last= null;
}

    // create a function which if the list is empty
    // @ returns true if the list is empty
    public boolean isEmpty() {
        return first == null;
    }

    // this method below returns the length of a list.
    // @ returns the number of elements in a list
public <string> int size(){
    int count=0;
    Node p = first;
    while(p !=null){
        count++;
        p=p.next;
        return count;
    }

    // the add method adds an element to the list at the end
    // end of the list
    public Void add (string e) {
    	
        if(isEmpty()){
        	
            first=new node(e);
            last=first;
        }
        else{
        	
            last.next=new Node(e);
            last=last.next;
        }

    /*
     * the add method adds an element at position
     * 
     * @param e the element is added to the list
     * 
     * @exception IndexOutOfBoundsException when index is out of bounds
     */
    public void add(int index, string e) {
        if (index < 0 || index > size()) {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }
        // when index is at last 0
        if (index == 0)
            last = first;
        return;
    }

    Node pred =first;for(
    int k = 1;<=index-1;k++)
    {
        pred = pred.next;
    }pred.next=new Node(e,pred.next);

    // check if there is a new element
    if(pred.next.next==null)last=pred.next;
}

    /*
     * the remove method removes an element
     * 
     * @param element to remove
     * 
     * @return true if removal was a success else false
     */
    public boolean remove(string e)
    {
    	if (isEmpty())
    		return false;
    	if(element.equals(first.element)
    	{
    		first=first.next;
    		if(first == null)
    			last == null
    			return true;
    		// find the predecessor of the element to remove
    		Node pred = first;
    		while(pred.next != null&& !pred.next.value.equals(e))
    		{
    			pred = pred.next;
    		}
    		
    
    	}
    	Public String

    toString() {
    		StringBuilder strBuilder = new StringBuilder();
    		Node p = first;
    		while(p != null) {
    			strBuilder.append(p.element+"\n")
    		}
    		return strBuilder.toString();
    	}

    public static void main(String []args) {
    		LinkedList<E> my = new LinkedList();
    	
            my.add("jeff");
            my.add("jimmy");
            System.out.println(my);
    	
    	}
}}