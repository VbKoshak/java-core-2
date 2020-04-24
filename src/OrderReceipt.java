import java.time.LocalDateTime;

public class OrderReceipt {
  public OrderReceipt(receiptStatus status, long sum, String bankCredentials, LocalDateTime transferTime, paymentWay paymentMethod, currencies currency) {
    this.status = status;
    this.sum = sum;
    this.bankCredentials = bankCredentials;
    this.transferTime = transferTime;
    this.paymentMethod = paymentMethod;
    this.currency = currency;
  }

  public receiptStatus getStatus() {
    return status;
  }

  public void setStatus(receiptStatus status) {
    this.status = status;
  }

  public long getSum() {
    return sum;
  }

  public void setSum(long sum) {
    this.sum = sum;
  }

  public String getBankCredentials() {
    return bankCredentials;
  }

  public void setBankCredentials(String bankCredentials) {
    this.bankCredentials = bankCredentials;
  }

  public LocalDateTime getTransferTime() {
    return transferTime;
  }

  public void setTransferTime(LocalDateTime transferTime) {
    this.transferTime = transferTime;
  }

  public paymentWay getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(paymentWay paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public currencies getCurrency() {
    return currency;
  }

  public void setCurrency(currencies currency) {
    this.currency = currency;
  }

  private enum currencies {
    usd,
    rub,
    byn
  }

  private enum paymentWay {
    card,
    cash,
    kiosk,
    bankTransfer
  }

  private enum receiptStatus {
    waitingAccept,
    accepted,
    denied
  }



  private receiptStatus status;
  private long sum;
  private String bankCredentials;
  private LocalDateTime transferTime;
  private paymentWay paymentMethod;
  private currencies currency;
}
