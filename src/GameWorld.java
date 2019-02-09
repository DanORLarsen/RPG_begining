import java.util.ArrayList;
import java.util.List;

public class GameWorld {

    public static void Launch(String[] args) {
        String[] cityNameRandom = {"Valdor", "Faldor", "Naestved","Elder","Meme"};
        List<City> cities = new ArrayList<City>();
        for(int i = 0; i < 11; i++) {
            cities.add(new City());
            cities.get(i).setName((cityNameRandom[(int) (Math.random()*5)]) + " City");
        }
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i).name);
            System.out.println("The population is at: " + cities.get(i).population + "000");
            System.out.println("Armor price  = " + cities.get(i).armor);
            System.out.println("Sword price  = " + cities.get(i).sword);
            System.out.println("Dagger price = " + cities.get(i).dagger);
            System.out.println("Iron price   = " + cities.get(i).iron);
            System.out.println();
        }
    }

}
