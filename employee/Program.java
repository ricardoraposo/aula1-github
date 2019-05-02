import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<employee> list = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Employee #" + i + ": ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new employee(id, name, salary));
        }
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter increase percentage: ");
            double increase = sc.nextInt();
            emp.increaseSalary(increase);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (employee obj : list) {
            System.out.println(obj);
        }

        sc.close();

    }
}
