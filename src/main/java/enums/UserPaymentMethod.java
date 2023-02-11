package enums;

public enum UserPaymentMethod {
    CREDIT("Credit", 0),
    DEBIT("Debit", 1.99),
    MASTER("Master", 2.99);
 private  String  paymentMethod;
    private double fee;
    UserPaymentMethod(String paymentMethod, double fee) {
        this.paymentMethod = paymentMethod;
        this.fee = fee;
    }

}
