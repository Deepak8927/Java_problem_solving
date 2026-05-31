/*
=========================================================================================
Problem Statement 8:
Create a base class Building that stores the number of floors of a building, number of
rooms and it’s total footage. Create a derived class House that inherits Building and
also stores the number of bedrooms and bathrooms. Demonstrate the working of the classes. 
=========================================================================================
*/

class Building {
    protected int floors, rooms; 
    protected double footage;

    Building (int floors, int rooms, double footage){
        this.floors = floors;
        this.rooms = rooms;
        this.footage = footage;
    }

    void showData() {
        System.out.println("No. of Floors: " + floors);
        System.out.println("No. of Rooms: " + rooms);
        System.out.println("Total Footage: " + footage + " sq.ft");
    }
}

class House extends Building {
    private int bedrooms, bathrooms;

    House (int floors, int rooms, double footage, int bedrooms, int bathrooms){
        super(floors, rooms, footage);
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    void showData() {
        super.showData();

        System.out.println("No. of Bedrooms: " + bedrooms);
        System.out.println("No. of Bathrooms: " + bathrooms);
    }
}

public class Problem8 {
    public static void main(String[] args) {
        House house = new House(
            2, 
            8, 
            1200, 
            4, 
            2
        );

        System.out.println("----- House Details -----");
        house.showData();
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
----- House Details -----
No. of Floors: 2
No. of Rooms: 8
Total Footage: 1200.0 sq.ft
No. of Bedrooms: 4
No. of Bathrooms: 2
============================================================================
*/
