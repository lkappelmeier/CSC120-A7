/* This is a stub for the Library class */
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
public class Library extends Building {
  private Hashtable<String, Boolean> collection;
  private boolean hasElevator;
    public Library(String name, String address, int nFloors, Hashtable<String, Boolean> collection) {
      super(name, address, nFloors);
      this.collection = collection;
      System.out.println("You have built a library: 📖");
    }
/**
 * 
 * @return true if has elevator
 */
  public boolean getElevator(){
    return hasElevator;
  }
  /**
   * adds Title to collection
   * @param title
   */
    public void addTitle(String title){
      collection.put(title, true);
      System.out.println("You have successfully added " + title + " to the collection!");
    }
    public ArrayList<String> toAddToCollection;
    public void addTitle(ArrayList<String> toAddToCollection, Hashtable<String, Boolean> collection){
      for (String title : toAddToCollection){
        collection.put(title, true);
      }
    }
   
/**
 * Checks out title
 * @param title
 */
    public void checkOut(String title){
      if (collection.containsKey(title)) {
        if (collection.get(title)) {
          collection.replace(title, false);
          System.out.println("You have successfully checked out " + title + "!");
        } else {
          System.out.println("Uh oh! This title is already checked out. Try again soon.");
        }
      } else {
        System.out.println("This collection does not carry " + title +"!");
      }
      
    }
    
/**
 * Returns book to collection
 * @param title
 */
    public void returnBook(String title){
      if (collection.containsKey(title)) {
        if (collection.get(title)) {
          System.out.println("You cannot check in a book that has not been checked out!");
        } else {
          System.out.println("You have successfully checked in " + title + "!");
        }
      } else {
        System.out.println("Ummmm... We do not even carry that book, so I don't know what you're trying to do.");
      }
      collection.replace(title, true);
    }

/**
 * returns TRUE if the collection contains the title
 * @param title
 * @return
 */
    public boolean containsTitle(String title){
      return(collection.containsKey(title));
    }
  /**
   * Returns true if the title is currently available, false otherwise
   * @param title
   * @return
   */
public boolean isAvailable(String title){
  return(collection.get(title));
}

/**
 * 
 * @return ArrayList<String> of available titles
 */
public ArrayList<String> isAvailable() {
  ArrayList<String> availableTitles = new ArrayList<>();

  for (String title : collection.keySet()) {
      if (collection.get(title)) {
          availableTitles.add(title);
      }
  }
  System.out.println(availableTitles);
  return availableTitles;
}
// Used chat gpt to help me do this one

/**
 * prints collection
 */
public void printCollection(){
  for(Map.Entry<String, Boolean> entry : collection.entrySet()){
    String title = entry.getKey();
    boolean isBorrowed = entry.getValue();
    System.out.println(title + ": " + (isBorrowed ? "Not Borrowed" : "Borrowed"));
    // Used chat gpt to help me do this part with printing it. I did where it just said the title and true or false but thought this would be easier to read
  }
}
public void goToFloor(int floorNum){
  if (getElevator()) {
    super.goToFloor(floorNum);
  } else { 
    throw new RuntimeException("This building does not have an elevator.");
  }
  }

public void showOptions() {
  super.showOptions();
  System.out.println("+ addTitle(title)\n + checkOut(title)\n + returnBook(title)\n + containsTitle(title)\n + isAvailable(title)\n + printCollection()");
}
    public static void main(String[] args) {
      Hashtable<String,Boolean> collection = new Hashtable<>();
      Library lib = new Library("Neilson", "7 Neilson Drive, Northampton MA", 4, collection);
      lib.addTitle("The Communist Manifesto");
      lib.addTitle("Diary of a Wimpy Kid");
      lib.addTitle("Twilight");
      lib.checkOut("The Communist Manifesto");
      lib.returnBook("The Communist Manifesto");
      lib.printCollection();
      lib.showOptions();
      lib.isAvailable();
    }
  
  }