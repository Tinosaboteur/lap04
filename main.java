package lab04;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        sanpham sanpham = new sanpham();
        sanpham sp2 = new sanpham();
        sanpham sp1 = new sanpham();

        System.out.println("nhap vao don gia:");
        double a = input.nextDouble();
        sanpham.setDonGia(a);
        System.out.println("nhap vao tensp");
        input.nextLine();
        String b = input.nextLine();
        sanpham.setTenSP(b);
        System.out.println(sanpham.getThueNhapKhau());
        System.out.println(sanpham.getTenSP());

        System.out.println("nhap vao don gia:");
        double c = input.nextDouble();
        sp1.setDonGia(c);
        System.out.println("nhap vao tensp");
        input.nextLine();
        String d = input.nextLine();
        sp1.setTenSP(d);
        sp1.xuat();

        System.out.println("nhap vao don gia:");
        double e = input.nextDouble();
        sp2.setDonGia(e);
        System.out.println("nhap vao tensp");
        input.nextLine();
        String f = input.nextLine();
        sp2.setTenSP(f);
        sp2.xuat();
        
    }
}
