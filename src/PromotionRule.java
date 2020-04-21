abstract class PromotionRule {
  private enum discountType{
    percents,
    discount,
    gift,
    payback
  }
  protected long value;
  protected discountType discount; //like percents, for free, or minus absolute value
}
