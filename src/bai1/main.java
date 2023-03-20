package bai1;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    private static int capacity = 10;// sức chứa
    private static ArrayList<CD> list = new ArrayList<>(capacity);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("============== MENU ==============");
            System.out.println("1. thêm mới 1 CD ");
            System.out.println("2. số lượng CD hiện có ");
            System.out.println("3. tổng giá thành của các CD ");
            System.out.println("4. sắp xếp danh sách giảm dần theo giá thành");
            System.out.println("5. sắp xếp danh sách tăng dần theo giá thành ");
            System.out.println("6. in toàn bộ danh sách ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    CD cd = createCD();
                    if (checkIdCD(cd.getId()) == true && capacity > 0) {
                        list.add(cd);
                    } else {
                        System.out.println("ID da ton tai khong the them ");
                    }
                    break;
                case 2:
                    int number = numberOfCd();
                    System.out.println(number);
                    break;
                case 3:
                    int sum = sumOfprice();
                    System.out.println(sum);
                    break;
                case 4:
                    sortDescending();
                    break;
                case 5:
                    sortInAscendingOrder();
                    break;
                case 6:
                    showlist();
                    break;
            }
        } while (choice != 0);

    }

    private static CD createCD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã CD : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên CD: ");
        String name = sc.nextLine();
        System.out.println("Nhập ca sĩ : ");
        String singer = sc.nextLine();
        System.out.println("Nhập số bài hát : ");
        int numOfSong = sc.nextInt();
        System.out.println("Nhập giá thành : ");
        int price = sc.nextInt();
        CD cd = new CD(id, name, singer, numOfSong, price);
        capacity--;
        return cd;
    }

    private static int numberOfCd() {
        return list.size();
    }

    private static boolean checkIdCD(int j) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == j) {
                return false;
            }
        }
        return true;
    }

    private static void showlist() {
        for (int i = 0; i < list.size(); i++) {
            showCD(list.get(i));
        }
    }

    private static void showCD(CD cd) {
        System.out.println(cd.getId() + " " + cd.getName() + " " + cd.getSinger() + " " + cd.getNumberOfSong() + " " + cd.getPrice());
    }

    private static int sumOfprice() {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getPrice();
        }
        return sum;
    }

    private static void sortDescending() {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getPrice() < list.get(j).getPrice()) {
                    CD temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
    private static void sortInAscendingOrder(){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getPrice() > list.get(j).getPrice()) {
                    CD temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
