package July25_email;

public class EmailService {
    public void sendEmail(Employee employee) {
        // Simulate sending an email
        System.out.println("Sending email to " + employee.getEmail());
        System.out.println("Subject: Your Salary Details");
        System.out.println("Dear " + employee.getName() + ",");
        System.out.println("Your salary is $" + employee.getSalary());
        System.out.println("Email sent successfully.\n");
    }
}
