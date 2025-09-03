class OvernightShipment extends Shipment {

  OvernightShipment(double w) {
      super(w);
  }

  @Override
  double totalcost() {
      return 120 + 10*weightKg;
  }

} 