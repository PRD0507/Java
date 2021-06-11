package com.company;

public class Main {

    public static void main(String[] args) {

        LinkedList list =  new LinkedList();

        list.insertEnd(10);
        list.insertEnd(20);
        list.print();

        list.insertBeginning(30);
        list.print();

        list.checkCycle();


    }


}
