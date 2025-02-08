package Statickeyword;

public class Main {
    public static void main(String[] args) {
        
        Friend friend1=new Friend("Sreyangshu");
        Friend friend2=new Friend("Shakyo");
        Friend friend3=new Friend("Debottom");
    
        System.out.println(Friend.numofFriend);//static variable
        System.out.println();
        Friend.displayfriends();//static method
    }
}
