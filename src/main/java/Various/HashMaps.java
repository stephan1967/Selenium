package Various;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();    // hover eens over de <String, String> hiernaats
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
    }
}
