
class CardPayment extends Payment {

  CardPayment(double a) {
      super(a);
  }

  @Override
  String process() {
      return "Charged card: " + amount;
  }
  
}
