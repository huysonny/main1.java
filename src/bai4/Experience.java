package bai4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Experience extends Employee{
    private int exp;
    private String proSkill;
    public Experience(){
        super.setEmployeeType(0);
    }

    public Experience(int exp, String proSkill) {
        this.exp = exp;
        this.proSkill = proSkill;
        super.setEmployeeType(0);
    }

    public Experience(String id, String fullName, Date birthDay, String phoneNumber, String email, int exp, String proSkill) {
        super(id, fullName, birthDay, phoneNumber, email,0);
        this.exp = exp;
        this.proSkill = proSkill;
        super.setEmployeeType(0);
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public void showInfo() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(super.getId()+" "+super.getFullName()+" "+formatter.format(super.getBirthDay())+" "+super.getPhoneNumber()+" "+super.getEmail()+" "+getExp()+" "+getProSkill());
    }
}
