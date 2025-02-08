package Innerclassdemo;

public class OutSide {
    String x="Hello";
    public class InSide {
    
        String y="World";

        public void greeting(){
            System.out.println(x+y);
        }
    }
}
