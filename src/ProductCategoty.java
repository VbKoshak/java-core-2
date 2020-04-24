public class ProductCategoty {
  private String name;
  private Campaign[] promoCampaigns;
  private Product[] productList;

  public ProductCategoty(String name, Campaign[] promoCampaigns, Product[] productList) {
    this.name = name;
    this.promoCampaigns = promoCampaigns;
    this.productList = productList;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Campaign[] getPromoCampaigns() {
    return promoCampaigns;
  }

  public void setPromoCampaigns(Campaign[] promoCampaigns) {
    this.promoCampaigns = promoCampaigns;
  }

  public void addPromoCampaign(Campaign[] promoCampaigns){
    //..
  }

  public Product[] getProductList() {
    return productList;
  }

  public void setProductList(Product[] productList) {
    this.productList = productList;
  }

  public void addProduct(Product product){
    //..
  }
}
