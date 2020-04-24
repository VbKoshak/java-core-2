abstract class PromotionRule {

  public enum discountType{
    percents,
    discount,
    gift,
    payback
  }

  protected long value;
  protected discountType discount; //like percents, for free, or minus absolute value

  public long getValue(){
    return this.value;
  }

  public void setValue(long value){
    this.value = value;
  }

  public discountType getDiscount(){
    return this.discount;
  }

  public void setDiscount(discountType discount){
    this.discount = discount;
  }
}
