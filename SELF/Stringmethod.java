public class Stringmethod {
    public static void main(String[] args) {
        String name="   Silentman   ";

        boolean result1=name.equals("silentman");
        boolean result2=name.equalsIgnoreCase("silentman");
        int result3=name.length();
        char  result4=name.charAt(5);
        int result5=name.indexOf("t");
        boolean result6=name.isEmpty();
        String result7 = name.toUpperCase();
        String result8 = name.toLowerCase();
        String result9=name.trim();
        String result = name.replace("e", "a");
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);

    }
}
