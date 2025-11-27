interface Payment{
  public void pay(double amount); 
}

class UPI implements Payment{
  @Override
  public void pay(double amount){
    System.out.println("Payment of " + amount + " done using UPI");
  }
}

class Card implements Payment{
  @Override
  public void pay(double amount){
    System.out.println("Payment of " + amount + " done using Card");
  }
}

public class PaymentMain{
  public static void main(String[] args){
    Payment upi = new UPI();
    upi.pay(50.56);
    Payment card = new Card();
    card.pay(69.88);
  }
}