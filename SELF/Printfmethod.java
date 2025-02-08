public class Printfmethod {
    public static void main(String[] args) {
        
        boolean Myboolean=true;
        char mychar='@';
        String mystring="silentman";
        int myint=100;
        double mydouble=1000.00;

        System.out.printf("the value is %10b \n",Myboolean);
        System.out.printf("the value is %-10b\n",Myboolean);
        System.out.printf("the value is %c\n",mychar);
        System.out.printf("the value is %s\n",mystring);
        System.out.printf("the value is %+d\n",myint);
        System.out.printf("the value is %010d\n",myint);
        System.out.printf("the value is %.5f\n",mydouble);
        System.out.printf("the value is %,f\n",mydouble);
    }
}
