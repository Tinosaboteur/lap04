package lap06;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        qlsanpham list = new qlsanpham();
        sanpham sp;
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("1.Nhap vao ds ");
            System.out.println("2.Xuat thong tin sp");
            System.out.println("3.Xuat thong tin theo hang");
            System.out.println("4.Thoat");
            chon = sc.nextInt();
            switch (chon) {
                case 1: {
                    sp = new sanpham();
                    sp.nhap();
                    list.nhap(sp);
                    break;
                }
                case 2: {
                    list.xuat();
                    break;
                }
                case 3: {
                    list.xuat_TheoNoKia();
                    break;
                }
                case 4: {
                    System.out.println("Thoat");
                    break;
                }
            }

        } while (chon != 4);
    }
}
