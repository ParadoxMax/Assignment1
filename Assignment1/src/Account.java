public class Account {

    private String accountId;
    private String name;
    public int balance;

    public String toString1() {
        return " Id: " + this.accountId + "\n Name: " + this.name + "\n Balance: " + this.balance + "DT" ;

    }

    public int credit(int deposit) {    //Declaring the credit method
        this.balance += deposit;
        System.out.println(" Deposit to the balance " + deposit + "DT. The updated balance: " + this.balance + "DT");
        return balance;
    }

    public int debit(int withdrawal) {
        if (this.balance >= withdrawal) {
            this.balance -= withdrawal;
            System.out.println(" Withdrawal to the balance: " + withdrawal + "DT. The update balance: " + this.balance + "DT");

        } else {
            System.out.println(" operation is not processed. Insufficient credit. ");
        }
        return balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
