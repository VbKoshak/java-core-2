public class Guest {
  protected Cart[] savedCarts;
  protected long userId;

  public Guest(Cart currentCart){
    //..
  }

  public void saveCart(Cart a){
    //...
  }

  public long getUserId(long id){
    return userId;
  }
}
