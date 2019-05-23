public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();
        InvoiceItem item1 = new InvoiceItem();
        //Examples---------------------------
        account1.setName("Mehdi M'sallem");
        account1.setAccountId("135629061999");
        account1.setBalance(00);
        System.out.println(account1.toString1());
        account1.credit(230);
        account1.debit(50);
        account1.debit(300);
        System.out.println(" Balance: "+ account1.getBalance() + "DT\n");


        account2.setBalance(100);
        account2.setName("Zied Hamda");
        account2.debit(75);
        account2.credit(400);
        account2.setAccountId("120019031999");
        System.out.println(account2.toString1() + "\n");

        /*public void transfer(int amount) {
            account1.credit(amount);
            account2.debit(amount);
            System.out.println(account1.getName() + " transferred to" + account2.getName() + " " + amount + "DT");
        }*/

        item1.setId("Baguette");
        item1.setDescription("Viennoise");
        item1.setQuantity(50);
        item1.setUnitPrice(180.00);
        System.out.println(item1.toString2());
        System.out.println(" Total price: " + item1.getTotal() + "DT");

    }
}
