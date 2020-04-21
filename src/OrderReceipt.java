import java.time.LocalDateTime;

public class OrderReceipt {
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
