public class Employee {
    private final String fullName;
    private int dept;
    private int salary;
    private static int grow;
    private final int id;

    public Employee(String fullName, int dept, int salary) {
        this.fullName = fullName;
        this.dept = dept;
        this.salary = salary;
        grow++;
        this.id = getGrow();
    }

    public int getGrow() {
        return grow;
    }

    public String getFullName() {

        return fullName;
    }

    public int getDept() {
        return dept;
    }

    public int getSalary() {

        return salary;
    }

    public int getId() {

        return id;
    }

    public void setDept(int dept) {

        this.dept = dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Ф.И.О: " + getFullName() + ", отдел: " + getDept() + ", зарплата: " + getSalary() + ", id: " + getId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && dept == employee.dept && java.util.Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(fullName, id, salary, dept);
    }
}
