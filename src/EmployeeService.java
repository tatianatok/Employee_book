public class EmployeeService {
    //1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения
//всех полей (toString)).
    public static void printAllEmployees() {
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i] != null) {
                System.out.println(Main.employees[i]);
            }
        }
    }

    //2. Посчитать сумму затрат на зарплаты в месяц.
    public static void printSumSalary() {
        int sum = 0;
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i] != null) {
                sum += Main.employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц - " + sum + " руб.");
    }

    //3. Найти сотрудника с минимальной зарплатой.
    public static void printMinSalary() {
        double minSalary = Double.MAX_VALUE;
        Personal minSalaryName = null;
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i].getSalary() < minSalary) {
                minSalary = Main.employees[i].getSalary();
                minSalaryName = Main.employees[i].getPersonal();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryName);
    }

    //4. Найти сотрудника с максимальной зарплатой.
    public static void printMaxSalary() {
        double maxSalary = Double.MIN_VALUE;
        Personal maxSalaryName = null;
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i].getSalary() > maxSalary) {
                maxSalary = Main.employees[i].getSalary();
                maxSalaryName = Main.employees[i].getPersonal();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryName);
    }

    //5. Подсчитать среднее значение зарплат.
    public static void printAvgSalary() {
        double sum = 0;
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i] != null) {
                sum += Main.employees[i].getSalary();
            }
        }
        double avgSalary = sum / Main.employees.length;
        System.out.println("Среднее значение зарплат - " + avgSalary + " руб.");
    }

    //6. Получить Ф. И. О. всех сотрудников.
    public static void printAllNames() {
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i] != null) {
                System.out.println(Main.employees[i].getPersonal());
            }
        }
    }

    //7.Сеттеры для сотрудника Personal5: изменим должность - рабочий-специалист, зарплата - 35 000-45 000 руб.
    public static void printSetter() {
        Main.employees[4].setPost("Специалист");
        Main.employees[4].setSalary(45_000);
        System.out.println(Main.employees[4]);
    }
}


