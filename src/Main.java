public class Main {
    private static Employee[] employees = new Employee[10];

    public static void printAllEmployee() {
        for (Employee allEmployee : employees) {
            System.out.println(allEmployee);
        }
    }

    public static Employee getMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static Employee getMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static int salariesAmount() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public static float averageSalary() {
        return salariesAmount() / (float) employees.length;
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
    public static void main(String[] args) {
        employees = new Employee[]{
            new Employee("Семенов Семен Семенович", 1, 60_000),
            new Employee("Игорев Игорь Игоревич", 4, 65_000),
            new Employee("Сергеев Сергей Сергеевич", 3, 79_000),
            new Employee("Иванов Иван Иванович", 5, 118_000),
            new Employee("Дмитриев Дмитрий Дмитриевич", 2, 113_000),
            new Employee("Петров Петр Петрович", 2, 87_000),
            new Employee("Андреев Андрей Андреевич", 1, 75_000),
            new Employee("Васильев Василий Васильевич", 3, 55_500),
            new Employee("Романов Роман Романович", 5, 90_000),
            new Employee("Максимов Максим Максимович", 1, 81_000),
        };
        printAllEmployee();
        System.out.println(getMaxSalary());
        System.out.println(getMinSalary());
        System.out.println(salariesAmount());
        System.out.println(averageSalary());
        printFullNames();
    }
}