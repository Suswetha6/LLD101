class WalletPayment extends Payment {

  WalletPayment(double a) {
      super(a);
  }

  @Override
  String process() {
      return "Paid using wallet: " + amount;
  }
  
}