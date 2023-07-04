import java.util.TreeMap;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet
        TreeMap<String, String> party = new TreeMap<>();
        party.put(hulk.getName(), rose.getName());
        party.put(thor.getName(), rose.getName());
        party.put(scarletWitch.getName(), rose.getName());
        party.put(vision.getName(), tulip.getName());
        party.put(captainAmerica.getName(), lily.getName());
        party.put(doctorStrange.getName(), violet.getName());
        party.put(blackWidow.getName(), violet.getName());

        // TODO 2 : Print if `begonia` is contained in the TreeMap
        System.out.println(party.containsKey(begonia.getName()));

        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        for (String hero : party.keySet()) {
            String flower = party.get(hero);
            System.out.println(hero + ": " + flower);
        }
    }
}
