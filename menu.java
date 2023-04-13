package lab05;

import java.util.Scanner;

public class menu {
    dshoten list = new dshoten();
    hoten ht;
    Scanner sc = new Scanner(System.in);

    public void menu() {
        int chon;
        do {
            System.out.println("1.Nhap ds ho ten ");
            System.out.println("2.Xuat ds vua nhap ");
            System.out.println("3.Xuat danh sach ngau nhien");
            System.out.println("4.Xuat ds sach giam dan ");
            System.out.println("5.Xoa ho ten");
            System.out.println("6.Ket thuc chuong trinh");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1: {
                    ht = new hoten();
                    ht.nhap();
                    this.list.nhap(ht);
                    break;
                }
                case 2: {
                    this.list.xuat();
                    break;
                }
                case 3: {
                    this.list.NgauNhien();
                    this.list.xuat();
                    break;
                }
                case 4: {
                    this.list.sapXepGiamDan();
                    this.list.xuat();
                    break;
                }
                case 5: {
                    System.out.println("Nhap ho ten muon xoa");
                    String ten = sc.nextLine();
                    System.out.println("Đa xoa : " + this.list.xoaTheoTen(ten));
                    break;
                }
                case 6: {
                    System.out.println("Thoat");
                    break;
                }
            }

        } while (chon != 6);
    }
}
