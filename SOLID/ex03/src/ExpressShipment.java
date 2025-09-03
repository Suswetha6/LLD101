public class ExpressShipment extends Shipment {

  ExpressShipment(double w) {
      super(w);
  }

  @Override
  double totalcost() {
      return 80 + 8*weightKg;
  }
  
}