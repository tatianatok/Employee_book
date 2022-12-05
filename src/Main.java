import java.util.Arrays;

public class Main {

     public static void main(String[] args) {
        Personal personal1 = new Personal("Иван", "Иванович", "Иванов");
        Personal personal2 = new Personal("Петр", "Петрович", "Петров");
        Personal personal3 = new Personal("Василий", "Васильевич", "Васильев");
        Personal personal4 = new Personal("Николай", "Николаевич", "Николаев");
        Personal personal5 = new Personal("Илья", "Ильич", "Ильин");

        int count = 1;

        Employee[] employees = new Employee[5];
        employees[0] = new Employee(count, personal1, "Директор", 150_000);
        employees[1] = new Employee(count, personal2, "Заместитель директора", 90_000);
        employees[2] = new Employee(count, personal3, "Менеджер", 75_000);
        employees[3] = new Employee(count, personal4, "Специалист", 45_000);
        employees[4] = new Employee(count, personal5, "Рабочий", 35_000);

//1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения
//всех полей (toString)).

        System.out.println(Arrays.toString(employees).replaceAll(",", ""));
        System.out.println(" ");

//2. Посчитать сумму затрат на зарплаты в месяц.
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                sum += employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц - " + sum + " руб.");

//3. Найти сотрудника с минимальной зарплатой.

        double minSalary = Double.MAX_VALUE;
        Personal minSalaryName = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                minSalaryName = employees[i].getPersonal();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryName);

//4. Найти сотрудника с максимальной зарплатой.

        double maxSalary = Double.MIN_VALUE;
        Personal maxSalaryName = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                maxSalaryName = employees[i].getPersonal();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryName);

//5. Подсчитать среднее значение зарплат.

        System.out.println("Среднее значение зарплат - " + sum / employees.length + " руб.");

//6. Получить Ф. И. О. всех сотрудников.
        System.out.println("\n" + personal1 + "\n" + personal2 + "\n" + personal3 + "\n" + personal4 + "\n" + personal5 + "\n");

//7.Сеттеры для сотрудника Personal5: изменим должность - рабочий-специалист, зарплата - 35 000-45 000 руб.

        employees[4].getPost("Специалист");
        employees[4].getSalary(45_000);

         System.out.println(employees[4]);
    }
}






