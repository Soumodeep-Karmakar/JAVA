package college.Assignment3;

public class Deleteconstant {
    public void delete(String s){
        String s1=s.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]", "");

        System.out.println("The result string is :\n"+s1);
    }
}
