package lesson5_oop.universitySystem.structure;

import java.util.ArrayList;
import java.util.Arrays;

public class Dormitory {
    private String address;
    private String name;
    private ArrayList<Room> rooms;

    public Dormitory(String address, String name) {
        this.address = address;
        this.name = name;
        this.rooms = new ArrayList<>(Arrays.asList(new Room(1), new Room(2),
                new Room(3), new Room(4), new Room(5)));
    }

    public Dormitory() {
    }

    public String getName() {
        return name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public Room getRoomByNumber(int number) {
        for (Room room : rooms
        ) {
            if (room.getNumber() == number) {
                return room;
            }
        }
        System.out.println("There is no room with number: '" + number + "'");
        return null;
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