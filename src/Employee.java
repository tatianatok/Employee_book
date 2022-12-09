import java.util.Objects;

public class Employee {
    private Personal personal;
    private String post;
    private int salary;
    private static int count = 1;
    private int ID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return ID == employee.count && Objects.equals(personal, employee.personal) &&
                Objects.equals(post, employee.post) && Objects.equals(salary, employee.salary) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, personal, post, salary);
    }

    public Employee(int ID, Personal personal, String post, int salary) {
        this.ID = count++;
        this.personal = personal;
        this.post = post;
        this.salary = salary;

    }

    public int getSalary() {
        return this.salary;
        }

    public Personal getPersonal() {
        return personal;
    }

    public void setPost(String post) {
        this.post = post;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Cотрудник ID: " + ID + " ФИО: " + this.personal + "; Отдел: " + this.post + "; Оклад: "
                + this.salary + " руб.";
    }
}



