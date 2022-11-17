public class Employee {
    private final String fullName;
    private int dept;
    private int salary;
    private static int grow = 1;
    private final int id;

    public Employee(String fullName, int dept, int salary) {
        this.fullName = fullName;
        this.dept = dept;
        this.salary = salary;
        this.id = grow++;
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

    public static void getMinSalary(Employee[] employees) {
        int minSalary = employees[0].salary;
        for (Employee employee : employees) {
            if (employee.salary < minSalary) {
                minSalary = employee.salary;
            }
        }
        System.out.println(minSalary);
    }

    public static void getMaxSalary(Employee[] employees) {
        int maxSalary = employees[0].salary;
        for (Employee employee : employees) {
            if (employee.salary > maxSalary) {
                maxSalary = employee.salary;
            }
        }
        System.out.println(maxSalary);
    }

    public static void printAllEmployee(Employee[] employees) {
        for (Employee allEmployee : employees) {
            System.out.println(allEmployee);
        }
    }

    public static int salariesAmount(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.salary;
        }
        return sum;
    }

    public static float averageSalary(Employee[] employees) {
        return salariesAmount(employees) / (float) employees.length;
    }

    public static void printFullNames(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.fullName);
        }
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
