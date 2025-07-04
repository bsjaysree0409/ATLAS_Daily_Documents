package worked_codes;

public class Task07 {
    public static void main(String[] args) {
         Customer myCustomer = new Customer();
         myCustomer.display();
         myCustomer.accept();
    }
}

class Customer {
    void display(){
        System.out.println("Display is called");
    }

    void accept(){
        System.out.println("Accept is called");
    }
}


