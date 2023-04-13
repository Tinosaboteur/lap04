package lab04;

public class sanpham {
    public sanpham() {
    }
    public sanpham(String tenSP, double donGia) {
        // this.tenSP = tenSP;
        // this.donGia = donGia;
        this(tenSP, donGia, 0);
    }
    public sanpham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public String tenSP;
    public double donGia,giamGia;
    public double getThueNhapKhau(){
        return this.donGia*0.1;
    }
    public void xuat(){
        System.out.println(this.tenSP+":"+this.donGia+":"+this.giamGia);
    }
    public String getTenSP() {
        return tenSP;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getGiamGia() {
        return giamGia;
    }
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    private void thuenhapkhau(){
        
    }

}
