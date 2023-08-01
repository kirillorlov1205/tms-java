package lesson10_collections_1.task3_newCollection;

public class Main {

    public static void main(String[] args) {
        customCollection<String> arr = new customCollection<>();

        arr.add("element1");
        arr.add("element2");

        System.out.println("All list in the custom array: \n" +
                arr.list);
        System.out.println("Get function returns: '" + arr.get() + "'");
        System.out.println("IsEmpty function returns: '" + arr.isEmpty() + "'");
    }

    /*1) Реализовать свою коллекцию FIFO (first in first out)
   tail        head
   add => [] -> [] -> [] <= get
2) Обязательные методы:
   isEmpty();
   add(...);
   get();
3) Внутри 2 LIFO (stack)*/


}
