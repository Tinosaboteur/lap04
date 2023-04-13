package lap06;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten");
        String hoVaTen = sc.nextLine();
        String s = hoVaTen.trim();
        if (s.indexOf(" ") >= 0) {
            int viTriTen = s.lastIndexOf(" ");
            System.out.println("Ten :" + s.substring(viTriTen + 1).toUpperCase());

            int viTriHo = s.indexOf(" ");
            System.out.println("Ho:" + s.substring(0, viTriHo).toUpperCase());
            if (viTriTen != viTriHo) {
                System.out.println("Ten dem :" + s.substring(viTriHo + 1, viTriTen).toUpperCase());
            } else {
                System.out.println("Khong co ten dem");
            }
        } else {
            System.out.println("Ten :" + s.toUpperCase());
            System.out.println("Khong co ten dem va ho ");
        }
    }
}
