public class Switchdemo {
    public static void main(String[] args) {
        String day="pizzaday";

        switch (day) {
            case "Sunday":System.out.println("It's Sunday");
                break;
            case "Monday":System.out.println("It's Monday");
                break;
            case "Tuesday":System.out.println("It's Tuesday");
                break;
            case "Wednesday":System.out.println("It's Wednesday");
                break;
            case "Thursday":System.out.println("It's Thursday");
                break;
            case "Friday":System.out.println("It's Friday");
                break;
            case "Saterday":System.out.println("It's Saterday");
                break;
            default:System.out.println("Wrong Day");
                break;
        }
    }
}
