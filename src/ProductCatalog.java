public class ProductCatalog {
  private String name;
  private String locale;
  private ProductCategoty[] catalog;

  public ProductCatalog(String name, String locale, ProductCategoty[] catalog) {
    this.name = name;
    this.locale = locale;
    this.catalog = catalog;
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
}
