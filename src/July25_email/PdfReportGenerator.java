package July25_email;

public class PdfReportGenerator {
    public void generate(Employee employee) {
        // Simulate PDF generation logic
        System.out.println("================================");
        System.out.println("        EMPLOYEE REPORT         ");
        System.out.println("================================");
        System.out.println("Name   : " + employee.getName());
        System.out.println("Email  : " + employee.getEmail());
        System.out.println("Salary : $" + employee.getSalary());
        System.out.println("================================");
        System.out.println("PDF report generated successfully.\n");
    }
}

