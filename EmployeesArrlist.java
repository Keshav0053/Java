package Employees_Exp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EmployeesArrlist {
    public static void main(String[] args) {
        ArrayList<Employee> EmpList = new ArrayList<Employee>();

        Employee myobj = new Employee("keshav",27,1000);
        Employee myobj1 = new Employee("lalit",30,1000);


        EmpList.add(myobj); //EmpList[0]
        EmpList.add(myobj1);

       for (Employee a : EmpList){
           System.out.println(a.toString());
       }

    }
}
