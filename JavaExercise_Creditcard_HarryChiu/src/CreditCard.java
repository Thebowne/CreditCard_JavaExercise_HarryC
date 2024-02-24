public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    private double balance;

    /**
        @param customer stores customer name
        @param bank stores bank name
        @param account stores account number
        @param limit Limit of credit card spending
        @param balance The account balance
     */

    public CreditCard(String customer, String bank, String account,
                      int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public String getCustomer(){return customer;}
    public String getBank(){return bank;}
    public String getAccount(){return account;}
    public int getLimit(){return limit;}
    public double getBalance(){return balance;}
    public double makePayment(double paymentAmount){
        balance -= paymentAmount;
        return paymentAmount;
    }
    public boolean charge(double price){
        if(balance + price <= limit) {
            balance += price;
            return true;
        } else {
            return false;
        }
    }

}
