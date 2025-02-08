package AccessModifier.package1;
import AccessModifier.package2.*;
public class A {
    protected String protectedMessage="This is Protected";
    public static void main(String[] args) {
        C c=new C();

       // System.out.println(c.defaultMessage);//because of different package(not accessable)
       System.out.println(c.publicMessage);

       B b=new B();

       //System.out.println(b.privateMessage);//because of different class(not accessable)
    }
}
