package Encapsulation;

public class Main {

    public static void main(String[] args)
    {
        Encapsulate nerdInfo = new Encapsulate();

        nerdInfo.setGeekName("Harsh");
        nerdInfo.setGeekAge(19);
        nerdInfo.setGeekRoll(Level.LOW);

        System.out.println("Geek's name: " + nerdInfo.getGeekName());
        System.out.println("Geek's age : " + nerdInfo.getGeekAge());
        System.out.println("Geek's roll: " + nerdInfo.getGeekRoll());
    //  System.out.println("Geek's roll: " +  nerdInfo.geekName);-   <- Direct access of geekRoll is not possible due to encapsulation

        System.out.println(nerdInfo.toString());
    }
}
