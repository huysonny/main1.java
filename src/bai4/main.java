package bai4;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class main {
    private static ArrayList<Employee> list=new ArrayList<>();
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("============== MENU ==============");
            System.out.println("1. thêm intern");
            System.out.println("2. thêm experience");
            System.out.println("3. thêm fresher ");
            System.out.println("4. in tất cả nhân viên intern");
            System.out.println("5. in tất cả nhân viên experience ");
            System.out.println("6. int tất cả nhân viên fresher ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    Intern temp=createIntern();
                    list.add(temp);
                    break;
                case 2:
                    Experience temp1=createExperience();
                    list.add(temp1);
                    break;
                case 3:
                    Fresher temp2=createFresher();
                    list.add(temp2);
                    break;
                case 4:
                    yc1();
                    break;
                case 5:
                    yc2();
                    break;
                case 6:
                    yc3();
                    break;
            }
        }while (choice!=0);

    }
    private static Intern createIntern() throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập ID : ");
        String id=sc.next();
        sc.nextLine();
        System.out.println("Nhập tên : ");
        String fullName=sc.nextLine();
        System.out.println("Nhập ngày sinh : ");
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate=sc.nextLine();
        date=formatter.parse(strDate);
        System.out.println("Nhập số điện thoại : ");
        String phoneNumber=sc.nextLine();
        System.out.println("Nhập Email : ");
        String email=sc.nextLine();
        System.out.println("nhập ngành đang học : ");
        String Majors=sc.nextLine();
        System.out.println("nhập kì đang học : ");
        int semester=sc.nextInt();
        System.out.println("Nhập tên trường đang học : ");
        String universityName=sc.nextLine();
        Intern in=new Intern(id,fullName,date,phoneNumber,email,Majors,semester,universityName);
        return in;
    }
    private static Experience createExperience() throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập ID : ");
        String id=sc.next();
        sc.nextLine();
        System.out.println("Nhập tên : ");
        String fullName=sc.nextLine();
        System.out.println("Nhập ngày sinh : ");
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate=sc.nextLine();
        date=formatter.parse(strDate);
        System.out.println("Nhập số điện thoại : ");
        String phoneNumber=sc.nextLine();
        System.out.println("Nhập Email : ");
        String email=sc.nextLine();
        System.out.println("nhập số năm kinh nghiệm : ");
        int exp=sc.nextInt();
        System.out.println("nhập kỹ năng chuyển ngành : ");
        String proskill=sc.nextLine();
        Experience ex=new Experience(id,fullName,date,phoneNumber,email,exp,proskill);
        return ex;
    }
    private static Fresher createFresher() throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập ID : ");
        String id=sc.next();
        sc.nextLine();
        System.out.println("Nhập tên : ");
        String fullName=sc.nextLine();
        System.out.println("Nhập ngày sinh : ");
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate=sc.nextLine();
        date=formatter.parse(strDate);
        System.out.println("Nhập số điện thoại : ");
        String phoneNumber=sc.nextLine();
        System.out.println("Nhập Email : ");
        String email=sc.nextLine();
        System.out.println("Nhập thời gian tốt nghiệp : ");
        Date date1=new Date();
        String strDate1=sc.nextLine();
        date1=formatter.parse(strDate);
        System.out.println("Nhập xếp loại : ");
        String  graduationRank=sc.nextLine();
        System.out.println("Nhập trường tốt nghiệp : ");
        String edcucation=sc.nextLine();
        Fresher fr=new Fresher(id,fullName,date,phoneNumber,email,date1,graduationRank,edcucation);
        return fr;
    }
    private static void yc1(){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getEmployeeType()==2){
                list.get(i).showInfo();
            }
        }
    }
    private static void yc2(){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getEmployeeType()==0){
                list.get(i).showInfo();
            }
        }
    }
    private static void yc3(){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getEmployeeType()==1){
                list.get(i).showInfo();
            }
        }
    }
}
