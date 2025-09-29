package Ch79_Employee;

public class Test {
    public static void main(String[] args) {

        Employee emp = new Employee("Ck",23,30000);
        Employee employee = new Employee();

        employee.setName("Ak");
        employee.setAge(21);
        employee.setSalary(40000);
        System.out.println(employee);

        System.out.println(emp);
    }
}
