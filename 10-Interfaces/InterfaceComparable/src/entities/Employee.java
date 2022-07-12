package entities;

public class Employee implements Comparable<Employee> {

    private String name;
    private String sobreNome;
    private Double salary;

    public Employee(String name, String sobreNome, Double salary) {
        this.name = name;
        this.sobreNome = sobreNome;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
    }
}
