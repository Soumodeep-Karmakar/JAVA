package Interfacedemo;

public class Fish implements Prey,Predator{
    @Override
    public void flee(){
        System.out.println("*Fish  is fleeing from long fish*");
    }
    @Override
    public void hunt(){
        System.out.println("The Fish is hunting small fish");
    }
}
