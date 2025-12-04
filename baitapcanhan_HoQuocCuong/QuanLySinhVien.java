package baitapcanhan_HoQuocCuong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySinhVien implements IQuanLySinhVien {
    private List<SinhVien> dsSinhVien;
    
    public QuanLySinhVien() {
        dsSinhVien = new ArrayList<>();
    }
    
    @Override
    public void ThemMoi(SinhVien sv) {
        dsSinhVien.add(sv);
        System.out.println("Them sinh vien thanh cong!");
    }
    
    @Override
    public void Xoa(String ma) {
        for (int i = 0; i < dsSinhVien.size(); i++) {
            if (dsSinhVien.get(i).getMaSv().equals(ma)) {
                dsSinhVien.remove(i);
                System.out.println("Xoa sinh vien thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien co ma: " + ma);
    }
    
    @Override
    public boolean TimKiem(String ma) {
        for (SinhVien sv : dsSinhVien) {
            if (sv.getMaSv().equals(ma)) {
                System.out.println("Tim thay sinh vien: " + sv);
                return true;
            }
        }
        System.out.println("Khong tim thay sinh vien co ma: " + ma);
        return false;
    }
    
    @Override
    public void CapNhat(String ma) {
        Scanner sc = new Scanner(System.in);
        for (SinhVien sv : dsSinhVien) {
            if (sv.getMaSv().equals(ma)) {
                System.out.println("Nhap thong tin moi cho sinh vien:");
                sv.Nhap();
                System.out.println("Cap nhat thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien co ma: " + ma);
    }
    
    @Override
    public void HienThi() {
        if (dsSinhVien.isEmpty()) {
            System.out.println("Danh sach sinh vien trong!");
            return;
        }
        System.out.println("===== DANH SACH SINH VIEN =====");
        for (SinhVien sv : dsSinhVien) {
            System.out.println(sv);
        }
    }
    
    public List<SinhVien> getDsSinhVien() {
        return dsSinhVien;
    }
}