// stub for the Cafe class */
public class Cafe extends Building{
private int nCoffeeOunces;
private int nSugarPackets;
private int nCreams;
private int nCups;
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
    /**
     * 
     * @return nCoffeeOunces
     */
    public int getNCoffeeOunces(){
        return nCoffeeOunces;
    }
    /**
     * 
     * @return nSugarPackets
     */
    public int getNSugarPackets(){
        return nSugarPackets;
    }
    /**
     * 
     * @return nCreams
     */
    public int getNCreams(){
        return nCreams;
    }
    /**
     * 
     * @return nCups
     */
    public int getNCups(){
        return nCups;
    }

    public void makeCoffee(int size, int sweetness, int creaminess){
        if (nCoffeeOunces>=size && nSugarPackets>=sweetness && nCreams >= creaminess) {
            nCoffeeOunces -= size;
            nSugarPackets -= sweetness;
            nCreams -= creaminess;
        } else {
            System.out.println("Hold on! Let us restock");
            reStock(100, 100, 100);
        }
        System.out.println("You have " + nCoffeeOunces + " ounces of coffee, " + nSugarPackets + " packets of sugar, and " + nCreams + " units of cream.");

    }
    public void makeCoffee(){
        if (nCoffeeOunces>=12 && nSugarPackets>=2 && nCreams >= 2) {
            nCoffeeOunces -= 12;
            nSugarPackets -= 2;
            nCreams -= 2;
        } else {
            System.out.println("Hold on! Let us restock");
            reStock(100, 100, 100);
        }
        System.out.println("There are " + nCoffeeOunces + " ounces of coffee, " + nSugarPackets + " packets of sugar, and " + nCreams + " units of cream.");
    }
    public void makeCoffee(int size){
        if (nCoffeeOunces>=size && nSugarPackets>=2 && nCreams >= 2) {
            nCoffeeOunces -= size;
            nSugarPackets -= 2;
            nCreams -= 2;
        } else {
            System.out.println("Hold on! Let us restock");
            reStock(100, 100, 100);
        }
        System.out.println("There are " + nCoffeeOunces + " ounces of coffee, " + nSugarPackets + " packets of sugar, and " + nCreams + " units of cream.");
    }
    /**
     * 
     * @param restockedCoffee
     * @param restockedSugar
     * @param restockedCream
     * adds the given amoutn of coffee sugar and cream to the inventory.
     */
    private void reStock(int restockedCoffee, int restockedSugar,  int restockedCream ){
        nCoffeeOunces += restockedCoffee;
        nSugarPackets += restockedSugar;
        nCreams += restockedCream;
        System.out.println("You have " + nCoffeeOunces + " ounces of coffee, " + nSugarPackets + " packets of sugar, and " + nCreams + " units of cream.");
    }

    public void goToFloor(int floorNum) {
        if (floorNum != 1) {
            throw new RuntimeException("You are not allowed on this floor");
        }
        System.out.println("You are now on floor #" + floorNum + " of " + this.name);
        this.activeFloor = floorNum;
    }
    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit()\n + getNCoffeeOunces() \n + getNSugarPackets()\n + getNCreams\n + getNCups\n + makeCoffee(size, sweetness, creaminess)");
      } 

     
    public static void main(String[] args) {
        Cafe c = new Cafe("Compass", "Neilson Library", 1, 200, 200, 200, 200);
        c.makeCoffee(12, 1, 1);
        c.showOptions();
    }
    
}

//private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
//private int nSugarPackets; // The number of sugar packets remaining in inventory
//private int nCreams; // The number of "splashes" of cream remaining in inventory
//private int nCups; // The number of cups remaining in inventory