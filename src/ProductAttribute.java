public class ProductAttribute {
  private String name;
  private String[] values; // all possible values of this attribute

  public ProductAttribute(String name, String[] values){
    this.name = name;
    this.values = values;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String[] getValues() {
    return values;
  }

  public void setValues(String[] values) {
    this.values = values;
  }

  public void addValue(String val){
    //..
  }


}
