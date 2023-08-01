package lesson10_collections_1.task3_newCollection;

import java.util.LinkedList;

public class customCollection<T> {

    public LinkedList<T> list;

    public customCollection() {
        this.list = new LinkedList<>();
    }

    public T get() {
        return list.getFirst();
    }

    public void add(T t) {
        list.addFirst(t);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public String toString() {
        return "customCollection{" +
                "list=" + list +
                '}';
    }
}
