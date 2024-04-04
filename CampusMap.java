import java.util.ArrayList;

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
        myMap.addBuilding(new Building("Campus Center", "100 Elm Street", 3));
        myMap.addBuilding(new Building("Josten Library", "122 Green Street"));
        myMap.addBuilding(new Building("Comstock House", "Mandelle Road"));
        myMap.addBuilding(new Building("College Hall", "Seelye Dr"));
        myMap.addBuilding(new Building("Wilson House","16 Kensington Ave"));
        myMap.addBuilding(new Building("Emerson House", "Pardise Road"));
        myMap.addBuilding(new Building("Morris House", "101 Green Street"));
        System.out.println(myMap);
    }
    
}
