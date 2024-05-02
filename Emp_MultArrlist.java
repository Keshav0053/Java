package Employees_Exp;

import java.util.ArrayList;

public class Emp_MultArrlist {
    public static void main(String[] args) {
        ArrayList<Employee> EmpList = new ArrayList<Employee>();

        EmpList.add(new Employee("keshav" , 23,1000));
        EmpList.add(new Employee("keshav" , 23,1000));
        EmpList.add(new Employee("keshav" , 23,1000));
        EmpList.add(new Employee("keshav" , 23,1000));
        EmpList.add(new Employee("keshav" , 23,1000));
        EmpList.add(new Employee("keshav" , 23,1000));
        EmpList.add(new Employee("keshav" , 23,1000));
        EmpList.add(new Employee("keshav" , 23,1000));
        EmpList.add(new Employee("keshav" , 23,1000));
        EmpList.add(new Employee("keshav" , 23,1000));
        EmpList.add(new Employee("keshav" , 23,1000));
        EmpList.add(new Employee("keshav" , 23,1000));

 for(Employee a:EmpList) {
     System.out.println(a.toString());
 }}
}