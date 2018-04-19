package com.company;

public class Main {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Marsel");
        list.add("Shamil");
        list.add("Roman");
        list.add("Adel");
        list.add("Rustem");
        list.add("Sergey");
        list.add("Damir");
        list.add("Nastya");
        list.add("Egor");
        list.add("Ilya");
        list.add("Nailya");
        list.add("Boris");

        list.delete(5);
        System.out.println(list.size());
    }
}
