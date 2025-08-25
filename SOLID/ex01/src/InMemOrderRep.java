public class InMemOrderRep implements OrderRepository {
  @Override
    public void save(double total) {
        System.out.println("Order saved with total: " + total);
    }
}
