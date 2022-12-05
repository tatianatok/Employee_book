public class Employee {
    public Personal personal;
    public String post;
    public int salary;

    private static int count = 1;
    private int ID;

    public Employee(int ID, Personal personal, String post, int salary) {
        this.ID = count++;
        this.personal = personal;
        this.post = post;
        this.salary = salary;

    }

    public String toString() {
        return "Cотрудник ID: " + ID + " ФИО: " + this.personal + "; Отдел: " + this.post + "; Оклад: "
                + this.salary + " руб.\n";
    }

    public int getSalary() {
        return this.salary;
        }

    public Personal getPersonal() {
        return personal;
    }

    public void getPost(String post) {
        this.post = post;
    }
    public void getSalary(int salary) {
        this.salary = salary;
    }
}



