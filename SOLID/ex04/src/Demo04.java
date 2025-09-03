
public class Demo04 {
    public static void main(String[] args) {
        Payment p = new UPIPayment(499);
        System.out.println(new PaymentService().pay(p));
    }
}
