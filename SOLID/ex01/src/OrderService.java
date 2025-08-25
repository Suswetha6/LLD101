public class OrderService {
    private final TaxCalculator taxCalculator;
    private final Notifier notifier;
    private final OrderRepository repository;

    public OrderService(TaxCalculator taxCalculator, Notifier notifier, OrderRepository repository) {
        this.taxCalculator = taxCalculator;
        this.notifier = notifier;
        this.repository = repository;
    }

    public void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.totalWithTax(subtotal);
        notifier.send(customerEmail, "Thanks! Your total is " + total);
        repository.save(total);
    }
}