package bai3;

public class Account {
    private long stk;
    private String tentk;
    private double tien;
    private final double laisuat=0.035f;
    public Account(){

    }

    public Account(long stk, String tentk, double tien) {
        this.stk = stk;
        this.tentk = tentk;
        this.tien = tien;
    }

    public long getStk() {
        return stk;
    }

    public void setStk(long stk) {
        this.stk = stk;
    }

    public String getTentk() {
        return tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    @Override
    public String toString() {
        return "Account{" +
                "stk=" + stk +
                ", tentk='" + tentk + '\'' +
                ", tien=" + tien +"đ"+
                '}';
    }
    private double naptien(double amount){
        return getTien()+amount;
    }
    private double ruttien(double amount,double phi){
        return getTien()-(amount+phi);
    }
    private double daohan(){
        double sotien1=getTien()+getTien()*laisuat;
        setTien(sotien1);
        return getTien();
    }
   private double chuyenkhoan(Account other,double amount){
        double sotien1=getTien()-(amount);
        setTien(sotien1);
        return getTien();
   }
}
