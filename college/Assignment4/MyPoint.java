package college.Assignment4;

public class MyPoint {
    int x,y; //1
    MyPoint(){ //2
        this.x=0;
        this.y=0;
    }
    MyPoint(int x,int y){  //3
        this.x=x;
        this.y=y;
    }
    public void setXY(int x,int y){ //4
        this.x=x;
        this.y=y;
        System.out.println("SetXY point is ("+x+","+y+")");
    }
    public int[] getXY(){  //5
        int[] ar=new int[2];
        ar[0]=this.x;
        ar[1]=this.y;
        return ar;
    }

    public String toString(){ //6
        return ("The point is returned by toString ("+this.x+","+this.y+")");
    }
     
    public double distance(int x,int y){//7
        int p=this.x-x;
        int q=this.y-y;
        double d=Math.sqrt((p*p)+(q*q));

        return d;
    }
}
