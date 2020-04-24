public class Color extends ProductAttribute{
  private String hexValue;

  public Color(String name, String hexValue) {
    super(name);
    this.hexValue = hexValue;
  }


  public String getValue() {
    return hexValue;
  }

  public void setValue(String hexValue) {
    this.hexValue = hexValue;
  }
}
