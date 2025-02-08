package Hashmapdemo;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        HashMap<String,String> countries=new HashMap<String,String>();

        countries.put("USA", "Washinton DC");
        countries.put("India", "New Delhi");
        countries.put("Russia", "Moscow");
        countries.put("Chaina", "Beijing");

        //countries.remove("USA");
        //System.out.println(countries.get("Russia"));
        //countries.clear();
        //System.out.println(countries.size());
        //countries.replace("USA", "Detroit");
        //System.out.println(countries.containsKey("England"));
        //System.out.println(countries.containsValue("Beijing"));

        //System.out.println(countries);

        for(String i:countries.keySet()){
            System.out.println(i+"\t"+"="+"\t"+countries.get(i));
        }
    }
}
