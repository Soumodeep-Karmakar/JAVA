public class Twodarray {
    public static void main(String[] args) {
        
        String[][] cars={{"Mustang","Ferrari"},{"Thar","Lambo"}};

        for(int i=0;i<cars.length;i++){
            System.out.println();
            for(int j=0;j<cars[i].length;j++){
                System.out.print(cars[i][j]+" ");
            }
        }

        String[][] days = new String[2][2];
        
        days[0][0]="Sunday";
        days[0][1]="Monday";
        days[1][0]="Tuesday";
        days[1][1]="Wednesday";

        for(int i=0;i<days.length;i++){
            System.out.println();
            for(int j=0;j<days[i].length;j++){
                System.out.print(days[i][j]+" ");
            }
        }
    }
}
