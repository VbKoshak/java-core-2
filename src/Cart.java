import java.util.HashMap;

public class Cart {
  private HashMap<Long,String> purchases;
  private long subTotalPrice;

  public long getSubTotalPrice() {
    return this.subTotalPrice;
  }

  public void addToCart(long productId, String attributeHash){
    this.purchases.put(productId,attributeHash);
    addPrice(productId, attributeHash);
  }

  public HashMap<Long,String> getPurchases(){
    return this.purchases;
  }

  private void addPrice(long productId,String attributeHash){
    // add price to subTotalPrice
  }

  public void recalculatePrice(){
    // recalculate SubTotalPrice   just in case...
  }
}
