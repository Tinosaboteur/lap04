package lap06;
import java.util.ArrayList;

public class qlsanpham {
private ArrayList<sanpham>list;
public qlsanpham(ArrayList<sanpham> list) {
this.list = list;
}
public qlsanpham() {
this.list=new ArrayList<sanpham>();
}
public void nhap(sanpham sp) {
this.list.add(sp);
}
public void xuat_TheoNoKia() {
for (sanpham sanPham : list) {
if(sanPham.getHang().equals("Nokia"))
System.out.println(sanPham);
}
}
public void xuat() {
for (sanpham sanPham : list) {
System.out.println(sanPham);
}
}
}


