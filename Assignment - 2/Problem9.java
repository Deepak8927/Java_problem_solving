/*
=========================================================================================
Problem Statement 9:
In the earlier program, create a second derived class Office that inherits Building and stores 
the number of telephones and tables. Now demonstrate the working of all three classes.
=========================================================================================
*/

class Building {
    protected int floors, rooms;
    protected double footage;

    Building(int floors, int rooms, double footage) {
        this.floors = floors;
        this.rooms = rooms;
        this.footage = footage;
    }

    void showBuilding() {
        System.out.println("Number of Floors: " + floors);
        System.out.println("Number of Rooms: " + rooms);
        System.out.println("Total Footage: " + footage + " sq.ft");
    }
}

class House extends Building {
    private int bedrooms, bathrooms;

    House(int floors, int rooms, double footage,
          int bedrooms, int bathrooms) {

        super(floors, rooms, footage);
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    void showHouse() {
        showBuilding();
        System.out.println("Number of Bedrooms: " + bedrooms);
        System.out.println("Number of Bathrooms: " + bathrooms);
    }
}

class Office extends Building {
    private int telephones, tables;

    Office(int floors, int rooms, double footage,
           int telephones, int tables) {

        super(floors, rooms, footage);
        this.telephones = telephones;
        this.tables = tables;
    }

    void showOffice() {
        showBuilding();
        System.out.println("Number of Telephones: " + telephones);
        System.out.println("Number of Tables: " + tables);
    }
}

public class Problem9 {
    public static void main(String[] args) {

        House house = new House(
                2,
                8,
                2500,
                3,
                2
        );

        Office office = new Office(
                5,
                20,
                10000,
                15,
                25
        );

        System.out.println("----- HOUSE -----");
        house.showHouse();

        System.out.println("\n----- OFFICE -----");
        office.showOffice();
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
----- HOUSE -----
Number of Floors: 2
Number of Rooms: 8
Total Footage: 2500.0 sq.ft
Number of Bedrooms: 3
Number of Bathrooms: 2

----- OFFICE -----
Number of Floors: 5
Number of Rooms: 20
Total Footage: 10000.0 sq.ft
Number of Telephones: 15
Number of Tables: 25
============================================================================
*/