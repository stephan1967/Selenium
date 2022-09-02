package Various;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Tonen(cars);
        cars.set(0, "Opel");
        Tonen(cars);
        cars.remove(2);
        Tonen(cars);
    }

    static void Tonen(ArrayList<String> cars) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("");

    }
}
