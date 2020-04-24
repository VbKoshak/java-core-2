public class User extends Guest{
  private Order[] orderHistory;
  private long[] starred;
  private String login;
  private String passwordHash;
  private UserOrderInfo[] orderInfo;

  public User(Order[] orderHistory, long[] starred, String login, String passwordHash, UserOrderInfo[] orderInfo, Cart currentCart) {
    super(currentCart);
    this.orderHistory = orderHistory;
    this.starred = starred;
    this.login = login;
    this.passwordHash = passwordHash;
    this.orderInfo = orderInfo;
  }


  public Order[] getOrderHistory() {
    return orderHistory;
  }

  public void setOrderHistory(Order[] orderHistory) {
    this.orderHistory = orderHistory;
  }

  public void pushOrder(Order ord){
    //..
  }


  public long[] getStarred() {
    return starred;
  }

  public void setStarred(long[] starred) {
    this.starred = starred;
  }

  public void addStarred(long productId){
    //..
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPasswordHash() {
    return passwordHash;
  }

  public void setPasswordHash(String passwordHash) {
    this.passwordHash = passwordHash;
  }

  public UserOrderInfo[] getOrderInfo() {
    return orderInfo;
  }

  public void setOrderInfo(UserOrderInfo[] orderInfo) {
    this.orderInfo = orderInfo;
  }

  public void addOrderInfo(UserOrderInfo orderInfo){
    //..
  }
}
