package com.Rishabh.linklist;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
        LL first = new LL();
        LL second = new LL();
        first.insertFirst(1);
        first.insertFirst(2);
        first.insertFirst(3);
        first.insertFirst(4);
        second.insertFirst(1);
        second.insertFirst(2);
        second.insertFirst(3);
        LL ans = LL.merge(first,second);

//        list.insert(100, 3);
//        list.insertRec(10,2);
        ans.display();

//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(8, 65);
//
//        list.display();

//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.display();
//        list.delete(19);
//        list.display();
    }
}
