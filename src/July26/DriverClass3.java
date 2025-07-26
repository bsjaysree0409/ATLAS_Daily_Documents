package July26;

import java.util.List;
import java.util.ArrayList;

// Interfaces
interface IPaymentStatus {
    Object status();
}

interface IPaymentHistory {
    List<Object> getListOfPayment();
}

interface IBankPayment {
    void initiatePayment();
    void stopPayment();
}

interface ILoanPayment {
    void initiateRepayment();
    void initiateFinalSettlement();
}

// Concrete Class 1: BankPayment
class BankPayment implements IPaymentStatus, IPaymentHistory, IBankPayment {
    @Override
    public Object status() {
        System.out.println("BankPayment Status: SUCCESS");
        return "SUCCESS";
    }

    @Override
    public List<Object> getListOfPayment() {
        System.out.println("Fetching list of bank payments");
        return new ArrayList<>();
    }

    @Override
    public void initiatePayment() {
        System.out.println("Bank payment initiated");
    }

    @Override
    public void stopPayment() {
        System.out.println("Bank payment stopped");
    }
}

// Concrete Class 2: LoanPayment
class LoanPayment implements IPaymentStatus, IPaymentHistory, ILoanPayment {
    @Override
    public Object status() {
        System.out.println("LoanPayment Status: PENDING");
        return "PENDING";
    }

    @Override
    public List<Object> getListOfPayment() {
        System.out.println("Fetching list of loan repayments");
        return new ArrayList<>();
    }

    @Override
    public void initiateRepayment() {
        System.out.println("Loan repayment initiated");
    }

    @Override
    public void initiateFinalSettlement() {
        System.out.println("Final loan settlement initiated");
    }
}

// Driver Class
public class DriverClass3 {
    public static void main(String[] args) {
        BankPayment bank = new BankPayment();
        bank.initiatePayment();
        bank.status();
        bank.getListOfPayment();
        bank.stopPayment();

        System.out.println("---");

        LoanPayment loan = new LoanPayment();
        loan.initiateRepayment();
        loan.initiateFinalSettlement();
        loan.status();
        loan.getListOfPayment();
    }
}

