package Employees_Exp;

import java.util.ArrayList;

public class StudentArrlist {
    public static void main(String[] args) {
        ArrayList<Student> stdlist=new ArrayList<Student>();
        Student mystd=new Student();
        mystd.setStd_name("Keshav");
        mystd.setStd_rollno(06);
        mystd.setStd_course("btech");
        mystd.setStd_branch("core");
        mystd.setStd_fees(40000);
        mystd.setStd_year(2);
        stdlist.add(mystd);
        for(Student a :stdlist){
            System.out.println(a.toString());

        }

    }
}
