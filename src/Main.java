public class Main {
    public static Employee[] employees = new Employee[10];

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
        Employee.printAllEmployee(employees);
        System.out.println(Employee.salariesAmount(employees));
        System.out.println(Employee.averageSalary(employees));
        Employee.printFullNames(employees);
        Employee.getMinSalary(employees);
        Employee.getMaxSalary(employees);
    }
}