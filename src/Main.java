import courseWork1.Employee;

public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Джони Деп ", 1, 2000);
        employees[1] = new Employee("Иванов Иван ", 2, 2500);
        // Добавьте остальные записи о сотрудниках

        printAllEmployees();
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateTotalSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary().getFullName());
        System.out.println("Сотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary().getFullName());
        System.out.println("Среднее значение зарплат: " + calculateAverageSalary());
        printAllEmployeeNames();
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }


    public static double calculateAverageSalary() {
        double totalSalary = calculateTotalSalary();
        int employeeCount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                employeeCount++;
            }
        }
        return totalSalary / employeeCount;
    }

    public static void printAllEmployeeNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
