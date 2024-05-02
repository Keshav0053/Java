package Employees_Exp;

public class Student {
    private String std_name;
    private int std_rollno;
    private double std_fees;
    private String std_branch;
    private String std_course;
    private int std_year;

    public String getStd_name() {
        return std_name;
    }

    public int getStd_rollno() {
        return std_rollno;
    }

    public double getStd_fees() {
        return std_fees;
    }

    public String getStd_branch() {
        return std_branch;
    }

    public String getStd_course() {
        return std_course;
    }

    public int getStd_year() {
        return std_year;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public void setStd_rollno(int std_rollno) {
        this.std_rollno = std_rollno;
    }

    public void setStd_fees(double std_fees) {
        this.std_fees = std_fees;
    }

    public void setStd_branch(String std_branch) {
        this.std_branch = std_branch;
    }

    public void setStd_course(String std_course) {
        this.std_course = std_course;
    }

    public void setStd_year(int std_year) {
        this.std_year = std_year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "std_name='" + std_name + '\'' +
                ", std_rollno=" + std_rollno +
                ", std_fees=" + std_fees +
                ", std_branch='" + std_branch + '\'' +
                ", std_course='" + std_course + '\'' +
                ", std_year=" + std_year +
                '}';
    }
}
