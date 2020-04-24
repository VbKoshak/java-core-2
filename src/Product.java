import java.util.HashMap;

public class Product {
  private long id;
  private String name;
  private ProductAttribute[] attributes;
  private PriceBook priceBook;
  private String description;
  private HashMap<String, String> pictures = new HashMap<>(); //attributeHash(String), link to photo (string)

  public Product(long id, String name,ProductAttribute[] attributes, PriceBook priceBook, String description){
    this.id = id;
    this.name = name;
    this.attributes = attributes;
    this.priceBook = priceBook;
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

  public PriceBook getPriceBook() {
    return priceBook;
  }

  public void setPriceBook(PriceBook priceBook) {
    this.priceBook = priceBook;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void addPicture(String hash, String link){
    //..
  }
}
