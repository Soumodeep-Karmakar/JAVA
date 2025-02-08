public class Overloadedmethod {
    public static void main(String[] args) {
        int x=add(1,2,5,6);
        System.out.println(x);
    }

    static int add(int x,int y){
        System.out.println("Method 1");
        return x+y;
    }
    static int add(int x,int y,int z){
        System.out.println("Method 2");
        return x+y+z;
    }
    static int add(int x,int y,int z,int a){
        System.out.println("Method 3");
        return x+y+z+a;
    }
}
