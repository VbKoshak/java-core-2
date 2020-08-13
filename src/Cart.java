import java.util.HashMap;

public class Cart {
  private HashMap<Product,String> purchases;
  private long subTotalPrice;

  public Cart(){
    //..
  }

  public long getSubTotalPrice() {
    return this.subTotalPrice;
  }

  public void addToCart(Product product, String attributeHash){
    this.purchases.put(product,attributeHash);
    addPrice(product, attributeHash);
  }

  public HashMap<Product,String> getPurchases(){
    return this.purchases;
  }

  private void addPrice(Product productId,String attributeHash){
    // add price to subTotalPrice
  }

  public void recalculatePrice(){
    // recalculate SubTotalPrice   just in case...
  }
}
