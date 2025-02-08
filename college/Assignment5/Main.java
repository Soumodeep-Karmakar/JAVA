package college.Assignment5;

public class Main {
    public static void main(String[] args) {
        Person p=new Person("Sunny", "Habra");
        String s1=p.toString();
        System.out.println(s1);
        System.out.println();
        p.setPerson();
        String s2=p.toString();
        System.out.println(s2);
        System.out.println();

        Student s=new Student("Sunny", "Habra", "B.Sc", "2", 15000);
        String s3=s.toString();
        System.out.println(s3);
        System.out.println();
        s.setPerson();
        String s4=s.toString();
        System.out.println(s4);
        System.out.println();

        Stuff st=new Stuff("Sunny", "Habra", "Gurudas", 15000);
        String s5=st.toString();
        System.out.println(s5);
        System.out.println();
        st.setPerson();
        String s6=st.toString();
        System.out.println(s6);
        System.out.println();
    }
}
