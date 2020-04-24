abstract class User {
  protected Cart[] savedCarts;
  protected long userId;
  protected String nickname;

  public User(Cart currentCart){
    //..
  }
  public User(){
    //..
  }

  public void saveCart(Cart a){
    //...
  }

  public long getUserId(long id){
    return userId;
  }

  public String getNickname(){
    return nickname;
  }
}
