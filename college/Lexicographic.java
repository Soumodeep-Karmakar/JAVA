//Read at most 10 names of students and store them into an array of String
//nameOfStudents[10]. Sort the names into the lexicographic order. Display the sorted
//list of names.
package college;

import java.util.Scanner;

public class Lexicographic {
    public static void main(String[] args) {
        String temp;
        String[] nameOfStudents=new String[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of ten students");
        for(int i=0;i<10;i++){
            nameOfStudents[i]=sc.nextLine();
        }
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(nameOfStudents[i].compareTo(nameOfStudents[j])>0){
                    temp=nameOfStudents[i];
                    nameOfStudents[i]=nameOfStudents[j];
                    nameOfStudents[j]=temp;
                }
            }
        }
        System.out.println("Name of students after sorting :");
        for(int i=0;i<10;i++){
            System.out.println(nameOfStudents[i]);
        }
    }
}
