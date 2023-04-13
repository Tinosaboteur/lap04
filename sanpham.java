package lap06;

import java.util.Scanner;

public class sanpham {
    private String ten;
    private double gia;
    private String hang;

    public sanpham() {
    }

    public sanpham(String ten, double gia, String hang) {
        this.ten = ten;
        this.gia = gia;
        this.hang = hang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    @Override
    public String toString() {
        return "SanPham [ten=" + ten + ", gia=" + gia + ", hang=" + hang + "]";
    }

    public void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten ");
        this.setTen(input.nextLine());
        System.out.println("Nhap hang ");
        this.setHang(input.nextLine());
        System.out.println("Nhap gia");
        this.setGia(input.nextDouble());
    }
}
