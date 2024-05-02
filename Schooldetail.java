package School;

public class Schooldetail {
    private String school_name;
    private int school_fee;
    private double school_Rollno;
    private String name;
    private int year;

    public String getSchool_name() {
        return school_name;
    }

    public int getSchool_fee() {
        return school_fee;
    }

    public double getSchool_Rollno() {
        return school_Rollno;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }



    public Schooldetail(String school_name, int school_fee, double school_Rollno, String name, int year) {
        this.school_name = school_name;
        this.school_fee = school_fee;
        this.school_Rollno = school_Rollno;
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Schooldetail{" +
                "school_name='" + school_name + '\'' +
                ", school_fee=" + school_fee +
                ", school_Rollno=" + school_Rollno +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
