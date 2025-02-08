package college.Assignment4;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1=new MyPoint();
        System.out.println("Seted value by default constructor ("+p1.x+","+p1.y+")");
        System.out.println();

        MyPoint p2=new MyPoint(5, 6);
        System.out.println("Seted value by overloaded constructor ("+p2.x+","+p2.y+")");
        System.out.println();

        p2.setXY(15, 6);
        System.out.println();

        MyPoint p3=new MyPoint(10, 15);

        int[] ar=new int[2];

        ar=p3.getXY();
        System.out.println("GetXY point is ("+ar[0]+","+ar[1]+")");
        System.out.println();

        MyPoint p4=new MyPoint(50, 30);

        String P=p4.toString();
        System.out.println(P);
        System.out.println();

        double Distance =p4.distance(-10, 9);
        System.out.println("The distance is : "+Distance);
    }
}
