public class UserOrderInfo {

  public enum shippingWay {
    air,
    ship,
    land
  }

  private String countryCode;
  private String city;
  private String address;
  private shippingWay shipping;

  public UserOrderInfo(String countryCode, String city, String address, shippingWay shipping){
    this.countryCode = countryCode;
    this.city = city;
    this.address = address;
    this.shipping = shipping;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public shippingWay getShipping() {
    return shipping;
  }

  public void setShipping(shippingWay shipping) {
    this.shipping = shipping;
  }

}
