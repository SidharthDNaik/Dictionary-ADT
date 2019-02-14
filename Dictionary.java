/*
* Name: Sidharth Naik
* ID: 1647945
* Class: 12B/M
* Date: February 14,2018
* Description: This is the Dictionary ADT with all the ADT methods
* File Name: Dictionary.java
* Note: Created two extra helper methods findPrevKey and myString. Also used a inner class named pair to hold the two string values
* Instructions: Use DictionaryClient to run the program
* type: DictonaryClient in the console
*/
public class Dictionary implements DictionaryInterface{
    // private inner Node class
    private class Node {
        Pair pair = new Pair();
        Node next;

        Node(String key, String value){
            pair.setKey(key);
            pair.setValue(value);
            next = null;
        }

        Pair getPair(){
            return pair;
        }

    }

    // private inner pair class
    private class Pair {
        String key;
        String value;

        Pair(){
            this.key = " ";
            this.value = " ";
        }

        Pair(String key, String value){
            this.key = key;
            this.value = value;
        }

        String getKey(){
            return key;
        }

        String getValue(){
            return value;
        }

        void setKey(String key){
            this.key = key;
        }

        void setValue(String value){
            this.value = value;
        }

    }

    // Fields for the Dictionary class
    private Node head;     // reference to first Node in List
    private int numItems; // number of items in the Dictionary

    // Dicationary()
    // constructor for the Dictionary class
    public Dictionary(){
        head = null;
        numItems = 0;
    }

    // private helper function -------------------------------------------------

    // findKey()
    // returns a reference to the Node with the value key
    private Node findKey(String key){

        for(Node N = head; N != null; N = N.next){
            if(N.getPair().getKey().equals(key)){
                return N;
            }
        }
        return null;
    }

    // findPrevKey()
    // returns a refernce to the node before the specific key value
    private Node findPrevKey(String key){
        int i = 0;
        for(Node N = head; N != null; N = N.next, i++){
            if(N.getPair().getKey().equals(key)){
                break;
            }
        }
        int k = 0;
        for(Node N = head; k < i; N = N.next, k++){
            if(k == i-1){
                return N;
            }
        }
        return null;
    }

    // ADT operations ----------------------------------------------------------

    // isEmpty()
    // pre: none
    // post: returns true if the Dictionary is empty, false otherwise
    public boolean isEmpty(){
        return(numItems == 0);
    }

    // size()
    // pre: none
    // post: returns the number of elements in the Dictionary
    public int size() {
        return numItems;
    }

    // lookup()
    // pre:
    // post: returns value for specific key
    public String lookup(String key) {
        Node N = findKey(key);
        if( N == null ){
            return null;
        }
        else{
            return N.getPair().getValue();
        }
    }

    // insert()
    // inserts new item with a key and value
    // pre: Dictionary does not currenlty contain the argument key
    // post: item is in the list
    public void insert(String key, String value) throws DuplicateKeyException {
        if ( lookup(key) != null ) {
            throw new DuplicateKeyException(
                    "cannot insert duplicate keys ");
        }
        if(numItems==0){
            Node N = new Node(key,value);
            N.next = head;
            head = N;
        }else{
            Node P = findPrevKey(key); // at this point index >= 2
            Node C = P.next;
            P.next = new Node(key,value);
            P = P.next;
            P.next = C;
        }
        numItems++;
    }

    // delete()
    // deletes item with key value
    // pre: key exists
    // post: item is deleted
    public void delete(String key) throws KeyNotFoundException {
        if( lookup(key) == null ){
            throw new KeyNotFoundException(
                    "cannot delete non-existent key ");
        }
        if( findPrevKey(key) == null ){
            Node N = head;
            head = head.next;
            N.next = null;
        }else{
            Node P = findPrevKey(key);
            Node N = P.next;
            P.next = N.next;
            N.next = null;
        }
        numItems--;
    }

    // MakeEmpty()
    // pre: none
    // post: isEmpty()
    public void makeEmpty(){
        head = null;
        numItems = 0;
    }

    // toString()
    // pre: none
    // post:  prints current state to stdout
    // Overrides Object's toString() method
    public String toString(){
        return myString(head);
    }

    private String myString(Node H){
        if(H == null){
            return " ";
        }
        else{
            if( H.next != null ){
                return (H.getPair().getKey() + " " + H.getPair().getValue() + "\n") + myString(H.next);
            }else{
                return (H.getPair().getKey() + " " + H.getPair().getValue() + "\n");
            }
        }
    }
}
