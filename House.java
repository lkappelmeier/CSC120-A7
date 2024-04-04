/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {
  private boolean hasDiningRoom;
  private boolean hasElevator;
  private ArrayList<String> residents; 
  private int nResidents;
  private String resident;
  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElevator) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.hasElevator = hasElevator;
    this.residents = new ArrayList<String>();
  }

  public boolean getElevator(){
    return hasElevator;
  }
  public int getNResidents(){
    return nResidents;
  }
  public String getResident(){
    return resident;
  }
 public String toString(){
  String desc = super.toString();
  if (this.hasDiningRoom){
    desc+= " It has a dining room.";
  }
  return desc;
 }
/**
 * moves in a resident
 * @param resident
 */
public void moveIn(String resident){
  residents.add(resident);
}
/**
 * 
 * @param residents
 * moves in an arraylist of residents
 */
public void moveIn(ArrayList<String> residents){
  residents.addAll(residents);
}
/**
 * moves out a resident, returns resident
 * @param resident
 * @return
 */
public String moveOut(String resident){
  residents.remove(resident);
  return resident;
}

public ArrayList<String> moveOut(ArrayList<String> residents){
  residents.removeAll(residents);
  return residents;
}
/**
 * checks if resident is in house, returns boolean
 * @param resident
 * @return
 */
public boolean isResident(String resident){
  
  if (residents.contains(resident)) {
    System.out.println(resident + " is a resident");
  } else {
    System.out.println(resident + " is not a residnet");
  }
  return residents.contains(resident);
}

public void showOptions(){
if (nFloors==1) {
  System.out.println("Available options at " + this.name + ":\n + enter() \n + exit()");
} else { if (getElevator()) {
    super.showOptions();
  } else {
    System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown() \n");
  }
  System.out.println("+ getElevator()\n + getNResidents()\n + getResident()\n + moveIn(resident)\n + moveOut(resident)\n + isResident(resident)");
}}
public void goToFloor(int floorNum){
if (getElevator()) {
  super.goToFloor(floorNum);
} else { 
  throw new RuntimeException("This building does not have an elevator.");
}
}


  public static void main(String[] args) {
    House morris = new House("Morris House", "101 Green Street in NoHo", 4, false, false);
    System.out.println(morris);
    morris.showOptions();
  }

}