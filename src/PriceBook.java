import java.util.Hashtable;

public class PriceBook {
  // all attributes going through hash function to get HashString (String) that will lead to price (long)
  private Hashtable<String, Long> book  = new Hashtable<>();

  public void getPrice(String hash){
    //...
  }

  public void addItem(String hash, long price){
    //..
  }
}
