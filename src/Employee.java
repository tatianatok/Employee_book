import java.util.Objects;

public class Employee {
    private Personal personal;
    private String post;
    private int salary;
    private static int count = 1;
    private int ID;

    public Employee(int ID, Personal personal, String post, int salary) {
        this.ID = count++;
        this.personal = personal;
        this.post = post;
        this.salary = salary;
    }

//Геттеры для всех полей.
    public Personal getPersonal() {
    return personal;
}
    public String getPost() {return post; }
    public int getSalary() {
        return this.salary;
        }

//Сеттеры для отдела и зарплаты.
    public void setPost(String post) {
        this.post = post;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

//Переопределенные методы
    @Override
    public String toString() {
        return "Cотрудник ID: " + ID + " ФИО: " + getPersonal() + "; Отдел: " + getPost() + "; Оклад: "
                + getSalary() + " руб.";
    }

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
}



