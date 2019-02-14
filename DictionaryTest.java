/*
* Name: Sidharth Naik
* ID: 1647945
* Class: 12B/M
* Date: February 14,2018
* Description: This is the code I used to test my Dictionary.java class
* File Name: DictionaryTest.java
*/
public class DictionaryTest{

    public static void main(String[] args){
        //Dictionary A = new Dictionary();
    /*A.insert("1","a");
    System.out.println(A.lookup("1"));*/

        /*A.insert("1","a");
        A.insert("2","b");

        System.out.println(A.lookup("2"));
        System.out.println(A.lookup("1"));

        A.delete("1");
        A.delete("2");

        System.out.println(A.lookup("2"));
        System.out.println(A.lookup("1"));

        A.delete("1");

        A.insert("3","c");

        System.out.println(A.lookup("3"));*/

        /*String v;
        Dictionary A = new Dictionary();
        A.insert("1","a");
        A.insert("2","b");
        A.insert("3","c");
        A.insert("4","d");
        A.insert("5","e");
        A.insert("6","f");
        A.insert("7","g");
        System.out.println(A);

        v = A.lookup("1");
        System.out.println("key=1 "+(v==null?"not found":("value="+v)));
        v = A.lookup("3");
        System.out.println("key=3 "+(v==null?"not found":("value="+v)));
        v = A.lookup("7");
        System.out.println("key=7 "+(v==null?"not found":("value="+v)));
        v = A.lookup("8");
        System.out.println("key=8 "+(v==null?"not found":("value="+v)));
        System.out.println();

        //A.insert("2","f");  // causes DuplicateKeyException

        A.delete("1");
        A.delete("4");
        A.delete("3");
        System.out.println(A);
        A.delete("7");
        System.out.println(A);*/

          /*A.insert("1","a");
            A.delete("1");
            A.insert("2","b");
            A.delete("2)"

            System.out.println(A.lookup("2"));
            A.insert("1","f");
            System.out.println(A.lookup("1"));

            A.insert("5","e");
            A.insert("6","f");
            A.insert("7","g");

            System.out.println(A.lookup("5"));
            System.out.println(A.lookup("7"));

            A.delete("1");

            A.insert("3","c");

            System.out.println(A.lookup("3"));*/


        String v;
        Dictionary A = new Dictionary();
        A.insert("1","a");
        A.insert("2","b");
        A.insert("3","c");
        A.insert("4","d");
        A.insert("5","e");
        A.insert("6","f");
        A.insert("7","g");
        System.out.println(A);

        v = A.lookup("1");
        System.out.println("key=1 "+(v==null?"not found":("value="+v)));
        v = A.lookup("3");
        System.out.println("key=3 "+(v==null?"not found":("value="+v)));
        v = A.lookup("7");
        System.out.println("key=7 "+(v==null?"not found":("value="+v)));
        v = A.lookup("8");
        System.out.println("key=8 "+(v==null?"not found":("value="+v)));
        System.out.println();

        // A.insert("2","f");  // causes DuplicateKeyException

        A.delete("1");
        A.delete("3");
        A.delete("7");
        System.out.println(A);

        // A.delete("8");  // causes KeyNotFoundException

        System.out.println(A.isEmpty());
        System.out.println(A.size());
        A.makeEmpty();
        System.out.println(A.isEmpty());
        System.out.println(A);

    }
}
