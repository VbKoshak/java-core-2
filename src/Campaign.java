import java.time.LocalDateTime;

public class Campaign {
  private String name;
  private Promotion[] promos;
  private CouponCode[] coupons;
  private LocalDateTime startDate;
  private LocalDateTime endDate;


  public Campaign(String name, LocalDateTime startDate, LocalDateTime endDate) {
    this.name = name;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public Promotion[] getPromos() {
    return promos;
  }

  public CouponCode[] getCoupons() {
    return coupons;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDateTime startDate) {
    this.startDate = startDate;
  }

  public LocalDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDateTime startDate) {
    this.endDate = startDate;
  }

  void addPromo(Promotion a){
    //..
  }

  void addCoupon(CouponCode a){
    //..
  }

}
