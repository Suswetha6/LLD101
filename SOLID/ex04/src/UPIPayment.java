class UPIPayment extends Payment {

  UPIPayment(double a) {
      super(a);
  }

  @Override
  String process() {
      return "Paid using UPI: " + amount;
  }
  
}