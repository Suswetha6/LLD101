abstract class Shipment {
    final double weightKg;
    
    Shipment(double w) { 
        this.weightKg=w; 
    }

    abstract double totalcost();

}