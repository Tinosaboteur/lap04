package lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class dssothuc {
    private ArrayList<Double> list;

    public dssothuc(ArrayList<Double> list) {
        this.list = list;
    }

    public dssothuc() {
        this.list = new ArrayList<Double>();
    }

    public void nhap() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap Y/N");
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("N"))
                break;
            else if (s.equalsIgnoreCase("Y")) {
                System.out.println("Nhap so thuc ");
                double x = sc.nextDouble();
                this.list.add(x);
            } else {
                System.out.println("Nhap Y or N");
            }
        }
    }

    public void xuat() {
        for (Double double1 : list) {
            System.out.println(double1);
        }
    }

    public void tinhTong() {
        double tong = 0.0;
        for (Double double1 : list) {
            tong += double1;
        }
        System.out.println("Tong: " + tong);
    }

}
