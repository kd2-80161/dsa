import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double salary;
    Employee next;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.next = null;
    }
}

class EmployeeLinkedList {
    private Employee head;

    public EmployeeLinkedList() {
        head = null;
    }

    public void addEmployee(int empId, String name, double salary) {
        Employee newEmployee = new Employee(empId, name, salary);
        if (head == null) {
            head = newEmployee;
        } else {
            Employee current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newEmployee;
        }
    }

    public void displayEmployees() {
        Employee current = head;
        while (current != null) {
            System.out.println("Employee ID: " + current.empId);
            System.out.println("Name: " + current.name);
            System.out.println("Salary: " + current.salary);
            System.out.println();
            current = current.next;
        }
    }

    public Employee searchEmployeeByName(String name) {
        Employee current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void deleteEmployee(int empId) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.empId == empId) {
            head = head.next;
            return;
        }
        Employee current = head;
        while (current.next != null && current.next.empId != empId) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void updateSalary(int empId, double newSalary) {
        Employee current = head;
        while (current != null) {
            if (current.empId == empId) {
                current.salary = newSalary;
                return;
            }
            current = current.next;
        }
        System.out.println("Employee not found.");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeLinkedList employeeList = new EmployeeLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Delete Employee by EmpID");
            System.out.println("5. Update Salary of Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int empId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    employeeList.addEmployee(empId, name, salary);
                    break;
                case 2:
                    System.out.println("Employee List:");
                    employeeList.displayEmployees();
                    break;
                case 3:
                    System.out.print("Enter Employee Name to Search: ");
                    String searchName = scanner.nextLine();
                    Employee employee = employeeList.searchEmployeeByName(searchName);
                    if (employee != null) {
                        System.out.println("Employee Found:");
                        System.out.println("Employee ID: " + employee.empId);
                        System.out.println("Name: " + employee.name);
                        System.out.println("Salary: " + employee.salary);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteEmpId = scanner.nextInt();
                    employeeList.deleteEmployee(deleteEmpId);
                    break;
                case 5:
                    System.out.print("Enter Employee ID to Update Salary: ");
                    int updateEmpId = scanner.nextInt();
                    System.out.print("Enter New Salary: ");
                    double newSalary = scanner.nextDouble();
                    employeeList.updateSalary(updateEmpId, newSalary);
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

