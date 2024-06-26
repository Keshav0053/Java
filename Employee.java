package Employees_Exp;

class Employee {
    private String name ;
    private int age;
private double salary;



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary=salary;
    }
}
