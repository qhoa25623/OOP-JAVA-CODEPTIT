package J05028_DANH_SACH_DOANH_NGHIEP_NHAN_SINH_VIEN_THUC_TAP_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<doanhNghiep> dn = new ArrayList<>();
        int t = sc.nextInt();
        while (t-- > 0) {
            sc.nextLine();
            dn.add(new doanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        Collections.sort(dn, new Comparator<doanhNghiep>() {
            @Override
            public int compare(doanhNghiep o1, doanhNghiep o2) {
                if (o1.getSoLuong() != o2.getSoLuong())
                    return o2.getSoLuong() - o1.getSoLuong();
                else return o1.getMaDN().compareTo(o2.getMaDN());
            }
        });
        for (doanhNghiep x : dn) {
            System.out.println(x);
        }
    }
}
