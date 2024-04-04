import java.util.ArrayList;
import java.util.Hashtable;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }
   
    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Lawrence House", "99 Green Street", 4));
        myMap.addBuilding(new Building("Albright House", "7 Bedford Terrace", 4));
        myMap.addBuilding(new Building("Sage Hall", "144 Green Street", 4));
        myMap.addBuilding(new Cafe("Campus Center Cafe", "100 Elm Street", 1, 100, 100, 100, 100));
        Hashtable<String, Boolean> collection = new Hashtable<>();
        myMap.addBuilding(new Library("Josten Library", "122 Green Street",3, collection));
        myMap.addBuilding(new Building("Comstock House", "Mandelle Road"));
        myMap.addBuilding(new Building("College Hall", "Seelye Dr"));
        myMap.addBuilding(new House("Wilson House","16 Kensington Ave", 4, false, true));
        myMap.addBuilding(new House("Emerson House", "Pardise Road", 4, true, false));
        myMap.addBuilding(new House("Morris House", "101 Green Street",4, false, false));
        System.out.println(myMap);
    }
    
}
