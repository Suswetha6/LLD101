public class StandardShipment extends Shipment {

  StandardShipment(double w) {
      super(w);
  }

  @Override
  double totalcost() {
      return 50 + 5*weightKg;
  }
  
}