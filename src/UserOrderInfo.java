public class UserOrderInfo {

  private enum shippingWay {
    air,
    ship,
    land
  }

  private String countryCode;
  private String city;
  private String address;
  private shippingWay shipping;
}
