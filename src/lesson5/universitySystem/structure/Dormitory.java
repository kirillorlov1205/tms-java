package lesson5.universitySystem.structure;

import java.util.ArrayList;

public class Dormitory {
    private String address;
    private String name;
    private ArrayList<Room> rooms;

    public Dormitory(String address, String name) {
        this.address = address;
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", rooms=" + rooms +
                '}';
    }
}