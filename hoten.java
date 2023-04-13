package lab05;

import java.util.Scanner;

public class hoten implements Comparable<hoten> {
    private String hoVaTen;

    public hoten() {
    }

    public hoten(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    @Override
    public String toString() {
        return "HoTen [hoten=" + hoVaTen + "]";
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten");
        this.setHoVaTen(sc.nextLine());
    }

    public String getTen() {
        String s = this.hoVaTen.trim();
        if (s.indexOf(" ") >= 0) {
            int vt = s.lastIndexOf(" ");
            return s.substring(vt + 1);
        } else {
            return s;
        }
    }

    @Override
    public int compareTo(hoten o) {
        return this.hoVaTen.compareTo(o.hoVaTen);
    }

}
