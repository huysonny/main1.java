package bai4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fresher extends Employee{
    private Date graduationDate;
    private String graduationRank;
    private String edcucation;
    public Fresher(){
        super.setEmployeeType(1);
    }

    public Fresher(Date graduationDate, String graduationRank, String edcucation) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.edcucation = edcucation;
        super.setEmployeeType(1);
    }

    public Fresher(String id, String fullName, Date birthDay, String phoneNumber, String email, Date graduationDate, String graduationRank, String edcucation) {
        super(id, fullName, birthDay, phoneNumber, email, 1);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.edcucation = edcucation;
        super.setEmployeeType(1);
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEdcucation() {
        return edcucation;
    }

    public void setEdcucation(String edcucation) {
        this.edcucation = edcucation;
    }

    @Override
    public void showInfo() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(super.getId()+" "+super.getFullName()+" "+formatter.format(super.getBirthDay())+" "+super.getPhoneNumber()+" "+super.getEmail()+" "+formatter.format(getGraduationDate())+" "+getGraduationRank()+" "+getEdcucation());
    }
}
