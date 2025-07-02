package OfflinePrac;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//Room class representing a room in the temple 
class Room {
    String description;
    List<String> treasures;
    Map<String,Room> exits;
    public Room(String description) {
        this.description = description;
        this.treasures = new ArrayList<>();
        this.exits = new HashMap<>();
    }

    public void addTreasure(String treasure) {
        treasures.add(treasure);
    }
    public void addExit(String direction, Room room){
        exits.put(direction, room);
    }

}
    
// Player class representing the player
class Player {
    Room currentRoom;
    List<String> inventory;
    public Player(Room startingRoom) {
        this.currentRoom = startingRoom;
        this.inventory = new ArrayList<>();
    }
    public void move (String direction) {
        Room nextRoom = currentRoom.exits.get(direction);
        if (nextRoom != null){
            currentRoom = nextRoom;
            System.out.println("You are now in: "+ currentRoom.description);

        }else {
            System.out.println("You can't go that way!");
        }
    }
}

public class AdventureGame {
    public static void main(String[] args) {
        //create rooms
        Room entrance = new Room("Entrance of the Lost Temple");
        Room hall = new Room("Grand Hall");
        Room treasureRoom = new Room("Treasure Room");

        //Add exits

        entrance.addExit("north", hall);
        hall.addExit("south", entrance);
        hall.addExit("east", treasureRoom);
        treasureRoom.addExit("west", hall);

        // add treasures
        treasureRoom.addTreasure("Golden Idol");

        // create player
        Player player = new Player(entrance);

        // Game loop
        Scanner scanner = new Scanner(System.in);
        while (true)  {
            System.out.println("You are in: "+player.currentRoom.description);
            System.out.println("Exits: "+ player.currentRoom.exits.keySet());
            System.out.println("Treasures: "+player.currentRoom.treasures);
            System.out.println("What do you want to do?(move/collect/iventory/quit): ");
            String action = scanner.nextLine();

            switch(action) {
                case "move":
                   System.out.println("Which direction? (north/south/east/west): ");
                   String direction = scanner.nextLine();
                   player.move(direction);
                   break;
                case "collect":
                   System.out.println("What treasure? ");
                   String treasure = scanner.nextLine(); 
                   player.move(treasure); 
                   break;
                case "inventory":
                    System.out.println("Your inventory: "+player.inventory);  
                    break;
                case "quit":
                    System.out.println("Thanks for playing!");
                    return;
                default:
                    System.out.println("Invalid action!");
                
            }           
        }
    }

}