public class CouponCode  extends PromotionRule{
  private int code;
  private String name;

  public CouponCode(int code, String name,long value, discountType type) {
    this.code = code;
    this.name = name;
    this.value = value;
    this.discount = type;
  }


  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
