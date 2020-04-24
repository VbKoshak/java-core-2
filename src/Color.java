public class Color extends ProductAttribute{
  private String hexValue;

  public Color(String name, String hexValue) {
    super(name);
    this.hexValue = hexValue;
  }


  public int getValue() {
    return hexValue;
  }

  public void setValue(int hexValue) {
    this.hexValue = hexValue;
  }
}
