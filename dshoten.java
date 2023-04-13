package lab05;

import java.util.ArrayList;
import java.util.Collections;

public class dshoten {

    private ArrayList<hoten> list;
    hoten ht;

    public dshoten(ArrayList<hoten> list) {
        this.list = list;
    }

    public dshoten() {
        this.list = new ArrayList<hoten>();
    }

    public void nhap(hoten ht) {
        this.list.add(ht);
    }

    public void xuat() {
        for (hoten hoten : list) {
            System.out.println(hoten);
        }
    }

    public void NgauNhien() {
        Collections.shuffle(list);
    }

    public void sapXepGiamDan() {
        Collections.sort(list);
        Collections.reverse(list);
    }

    public boolean xoaTheoTen(String ten) {
        for (int i = 0; i < this.list.size(); i++) {
            ht = this.list.get(i);
            if (ht.getHoVaTen().equalsIgnoreCase(ten)) {
                System.out.println("Đa xoa " + ht.getHoVaTen());
                this.list.remove(i);
                return true;
            }
        }
        System.out.println("khong ton tai ");
        return false;
    }
}
