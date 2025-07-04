package Task33;

public class Mart extends Customer{

    public void billing(){
        super.items = "onions";
        System.out.println("Items are "+items);
    }

    public static void main(String[] args) {
        Customer myCustomer = new Customer();
        myCustomer.purchaseList();

        Mart myMart = new Mart();
        myMart.purchaseList();
        myMart.billing();

        myCustomer.purchaseList();

    }
}
