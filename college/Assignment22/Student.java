package college.Assignment22;

public class Student {
    String name;
    int roll;
    String stream;

    Student(String name,int roll,String stream){
        this.name=name;
        this.roll=roll;
        this.stream=stream;
    }

    boolean isEqual(Student s1,Student s2){
        if(s1.name.equals(s2.name)&& s1.roll==s2.roll && s1.stream.equals(s2.stream))
        return true;
        else
        return false;
    }
}
