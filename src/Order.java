import java.time.LocalDateTime;

public class Order {

  public UserOrderInfo getOrderInfo() {
    return orderInfo;
  }

  public void setOrderInfo(UserOrderInfo orderInfo) {
    this.orderInfo = orderInfo;
  }

  public orderStatus getStatus() {
    return status;
  }

  public void setStatus(orderStatus status) {
    this.status = status;
  }

  public OrderReceipt getReceipt() {
    return receipt;
  }

  public void setReceipt(OrderReceipt receipt) {
    this.receipt = receipt;
  }

  public Cart getCart() {
    return cart;
  }

  public void setCart(Cart cart) {
    this.cart = cart;
  }

  public String getCourierName() {
    return courierName;
  }

  public void setCourierName(String courierName) {
    this.courierName = courierName;
  }

  public int getUserRating() {
    return userRating;
  }

  public void setUserRating(int userRating) {
    this.userRating = userRating;
  }

  public String getUserComment() {
    return userComment;
  }

  public void setUserComment(String userComment) {
    this.userComment = userComment;
  }

  public long getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(long totalPrice) {
    this.totalPrice = totalPrice;
  }

  private enum orderStatus{
    delivered,
    declined,
    waitingPayment,
    delivering
  }

  private UserOrderInfo orderInfo;
  private orderStatus status;
  private OrderReceipt receipt;
  private Cart cart;
  private LocalDateTime createTime;
  private String courierName; // can be changed to curierId (delivering campaign, delivermen_id)
  private int userRating;
  private String userComment;
  private long totalPrice;

  public Order(UserOrderInfo orderInfo, orderStatus status, OrderReceipt receipt, Cart cart, LocalDateTime createTime, String courierName, int userRating, String userComment, long totalPrice) {
    this.orderInfo = orderInfo;
    this.status = status;
    this.receipt = receipt;
    this.cart = cart;
    this.createTime = createTime;
    this.courierName = courierName;
    this.userRating = userRating;
    this.userComment = userComment;
    this.totalPrice = totalPrice;
  }


}
