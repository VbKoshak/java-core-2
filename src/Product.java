import java.util.HashMap;

public class Product {
  private long id;
  private String name;
  private ProductAttribute[] attributes;
  private PriceBook priceBook;
  private String description;
  private HashMap<String, String> pictures = new HashMap<>(); //attributeHash(String), link to photo (string)


}
