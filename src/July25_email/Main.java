package July25_email;

public class Main {
    public static void main(String[] args) {
        // Create an employee
        Employee employee = new Employee("Alice Johnson", "alice@example.com", 65000.00);

        // Generate PDF report
        PdfReportGenerator pdfGenerator = new PdfReportGenerator();
        pdfGenerator.generate(employee);

        // Send email
        EmailService emailService = new EmailService();
        emailService.sendEmail(employee);
    }
}
