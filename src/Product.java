import java.util.HashMap;

public class Product {
  private long id;
  private String name;
  private ProductAttribute[] attributes;
  private String description;
  private HashMap<String, Image> pictures = new HashMap<>(); //attributeHash(String), Image object

  public Product(long id, String name,ProductAttribute[] attributes, String description){
    this.id = id;
    this.name = name;
    this.attributes = attributes;
    this.description = description;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductAttribute[] getAttributes() {
    return attributes;
  }

  public void setAttributes(ProductAttribute[] attributes) {
    this.attributes = attributes;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void addPicture(String hash, Image img){
    //..
  }

  public Image getPiture(String hash){
    //..
    return null;
  }

  @Override
  public int hashCode() {
    //..
    return 0;
  }
}
