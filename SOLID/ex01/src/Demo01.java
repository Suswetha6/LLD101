

public class Demo01 {
    public static void main(String[] args) {
        Notifier notifier = new EmailClient();
        OrderRepository repo = new InMemOrderRep();
        TaxCalculator taxCalculator = new DefaultTaxCalculator(0.18);

        OrderService orderService = new OrderService(taxCalculator, notifier, repo);

        orderService.checkout("a@shop.com", 100.0);
    }
}
