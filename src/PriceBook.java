import java.util.Hashtable;

public class PriceBook {
  // all attributes going through hash function to get HashString (String) that will lead to price (long)
  private Hashtable<Integer, Long> book  = new Hashtable<>();

  public void getPrice(Integer hash){
    //...
  }

  public void addItem(Integer hash, long price){
    //..
  }
}
