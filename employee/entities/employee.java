package entities;

public class employee {
    private Integer id;
    private String name;
    private Double salary;

    public employee() {

    }

    public employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void increaseSalary(double increase) {
        salary = salary * (1 + (increase / 100));
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}