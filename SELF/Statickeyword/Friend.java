package Statickeyword;

public class Friend {
    
    String name;
    static int numofFriend;

    Friend(String name){
        this.name=name;
        numofFriend++;
    }

    static void displayfriends(){
        System.out.println("You have "+numofFriend+" friends");
    }
}
