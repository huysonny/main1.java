package bai4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Intern extends Employee{
    private String majors;
    private int semester;
    private String universityName;
    public Intern(){
        super.setEmployeeType(2);
    }

    public Intern(String majors, int semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
        super.setEmployeeType(2);
    }

    public Intern(String id, String fullName, Date birthDay, String phoneNumber, String email, String majors, int semester, String universityName) {
        super(id, fullName, birthDay, phoneNumber, email, 2);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
        super.setEmployeeType(2);
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public void showInfo() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(super.getId() + " " + super.getFullName() + " " + formatter.format(super.getBirthDay()) + " " + super.getPhoneNumber() + " " + super.getEmail() + " " + getMajors() + " " + getSemester() + " " + getUniversityName());
    }
}
