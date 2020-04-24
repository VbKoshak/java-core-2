public class ProductCatalog {
  private String name;
  private String locale;
  private ProductCategoty[] catalog;
  private PriceBook priceBook;

  public ProductCatalog(String name, String locale, ProductCategoty[] catalog, PriceBook priceBook) {
    this.name = name;
    this.locale = locale;
    this.catalog = catalog;
    this.priceBook = priceBook;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public ProductCategoty[] getCatalog() {
    return catalog;
  }

  public void setCatalog(ProductCategoty[] catalog) {
    this.catalog = catalog;
  }

  public void addToCatalog(ProductCategoty category){
    //..
  }

  public PriceBook getPriceBook() {
    return priceBook;
  }

  public void setPriceBook(PriceBook priceBook) {
    this.priceBook = priceBook;
  }
}
