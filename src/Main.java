import java.util.Arrays;

public class Main {
    static Employee[] employees = new Employee[5];

    public static void main(String[] args) {
        Personal personal1 = new Personal("Иван", "Иванович", "Иванов");
        Personal personal2 = new Personal("Петр", "Петрович", "Петров");
        Personal personal3 = new Personal("Василий", "Васильевич", "Васильев");
        Personal personal4 = new Personal("Николай", "Николаевич", "Николаев");
        Personal personal5 = new Personal("Илья", "Ильич", "Ильин");

        int count = 1;

        employees[0] = new Employee(count, personal1, "Директор", 150_000);
        employees[1] = new Employee(count, personal2, "Заместитель директора", 90_000);
        employees[2] = new Employee(count, personal3, "Менеджер", 75_000);
        employees[3] = new Employee(count, personal4, "Специалист", 45_000);
        employees[4] = new Employee(count, personal5, "Рабочий", 35_000);

        EmployeeService.printAllEmployees();
        EmployeeService.printSumSalary();
        EmployeeService.printMinSalary();
        EmployeeService.printMaxSalary();
        EmployeeService.printAvgSalary();
        EmployeeService.printAllNames();
        EmployeeService.printSetter();
    }
}










