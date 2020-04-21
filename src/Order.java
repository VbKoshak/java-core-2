import java.time.LocalDateTime;

public class Order {
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
}
