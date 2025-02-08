package GenericDemo;

public class Main {
    
    public static void main(String[] args) {
       /* This is for generic method
        Integer[] iar={1,2,3,4,5};
    Double[] dar={1.1,2.2,3.3,4.4,5.5};

     display(iar);
     display(dar);*/
      //this is for generic Class
        MyGenericClass<Integer,Integer> a=new MyGenericClass<Integer,Integer>(1, 2);
        MyGenericClass<Double,Double> b=new MyGenericClass<Double,Double>(1.2, 2.3);

       // MyGenericClass<Character,Character> c=new MyGenericClass<Character,Character>('a', 'b');//it is not possible as we bound 1st item to number at generic class 

        System.out.println(a.getitem());
        System.out.println(b.getitem());

    }
    //generic method
    
    public static <Thing>void display (Thing array[]){
        for(Thing x:array){
            System.out.print(x+",");
        }
        System.out.println();
    } 

}
