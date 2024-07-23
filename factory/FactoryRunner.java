package dhiraj.design.factory;

public class FactoryRunner {

    public static void main(String args[]) {
        System.out.println("Hello World");
        Employee employee = EmployeeFactory.getEmployee("android developer");
        employee.getSalary();
    }
}
