
public class Main {
    public static void main(String[] args) {
        CreditCard myCard = new CreditCard("Kelvin Register", "Maybank","270245876",
                5000, 5000.0);
        System.out.println("\nCustomer name: "+myCard.getCustomer());
        System.out.println("Bank name: "+myCard.getBank());
        System.out.println("Account number: "+myCard.getAccount());
        System.out.println("Credit card limit: $"+myCard.getLimit());
        System.out.println("Credit balance: $"+myCard.getBalance());

        double paymentAmount = 1000;
        System.out.println("\nYour payment: $" + myCard.makePayment(paymentAmount));

        double chargeAmount = 400;
        boolean charge = myCard.charge(chargeAmount);
        if (charge){
            System.out.println("Your credit card has been charged $" + chargeAmount);
        } else {
            System.out.println("Your credit card failed to charge");
        }

        System.out.println("Your current balance: $" + myCard.getBalance());
    }

}