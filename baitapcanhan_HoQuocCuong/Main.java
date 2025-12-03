package baitapcanhan_HoQuocCuong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<HocPhan> dsHocPhan = new ArrayList<>();
    private static List<Khoa> dsKhoa = new ArrayList<>();
    
    public static void main(String[] args) {
        QuanLySinhVien qlsv = new QuanLySinhVien();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n===== MENU QUAN LY SINH VIEN =====");
            System.out.println("1. Them sinh vien moi");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien");
            System.out.println("4. Cap nhat thong tin sinh vien");
            System.out.println("5. Xoa sinh vien");
            System.out.println("6. Them diem hoc phan cho sinh vien");
            System.out.println("7. Hien thi bang diem sinh vien");
            System.out.println("8. Tinh diem trung binh va xep loai");
            System.out.println("9. Quan ly Khoa");
            System.out.println("10. Quan ly Hoc Phan");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = Integer.parseInt(sc.nextLine());
            
            switch (choice) {
                case 1:
                    themSinhVienMoi(qlsv, sc);
                    break;
                case 2:
                    qlsv.HienThi();
                    break;
                case 3:
                    System.out.print("Nhap ma sinh vien can tim: ");
                    String maTim = sc.nextLine();
                    qlsv.TimKiem(maTim);
                    break;
                case 4:
                    System.out.print("Nhap ma sinh vien can cap nhat: ");
                    String maCapNhat = sc.nextLine();
                    qlsv.CapNhat(maCapNhat);
                    break;
                case 5:
                    System.out.print("Nhap ma sinh vien can xoa: ");
                    String maXoa = sc.nextLine();
                    qlsv.Xoa(maXoa);
                    break;
                case 6:
                    themDiemHocPhan(qlsv, sc);
                    break;
                case 7:
                    hienThiBangDiem(qlsv, sc);
                    break;
                case 8:
                    tinhDiemVaXepLoai(qlsv, sc);
                    break;
                case 9:
                    quanLyKhoa(sc);
                    break;
                case 10:
                    quanLyHocPhan(sc);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);
    }
    
    private static void themSinhVienMoi(QuanLySinhVien qlsv, Scanner sc) {
        System.out.println("\n===== THEM SINH VIEN MOI =====");
        System.out.println("Chon loai sinh vien:");
        System.out.println("1. Sinh vien Chinh Quy");
        System.out.println("2. Sinh vien Lien Thong");
        System.out.println("3. Sinh vien Quoc Te");
        System.out.print("Nhap lua chon: ");
        int loai = Integer.parseInt(sc.nextLine());
        
        SinhVien sv;
        switch (loai) {
            case 1:
                sv = new SinhVienChinhQuy();
                break;
            case 2:
                sv = new SinhVienLienThong();
                break;
            case 3:
                sv = new SinhVienQuocTe();
                break;
            default:
                System.out.println("Lua chon khong hop le!");
                return;
        }
        
        sv.Nhap();
        qlsv.ThemMoi(sv);
        System.out.println("Them sinh vien thanh cong!");
    }
    
    private static void themDiemHocPhan(QuanLySinhVien qlsv, Scanner sc) {
        System.out.print("\nNhap ma sinh vien: ");
        String maSv = sc.nextLine();
        
        boolean found = false;
        for (SinhVien sv : qlsv.getDsSinhVien()) {
            if (sv.getMaSv().equals(maSv)) {
                found = true;
                
                DiemHocPhan diemHP = new DiemHocPhan();
                System.out.println("\n===== NHAP THONG TIN DIEM HOC PHAN =====");
                diemHP.Nhap(maSv);
                
                sv.themDiemHocPhan(diemHP);
                
                System.out.println("\nDa them diem hoc phan thanh cong!");
                break;
            }
        }
        
        if (!found) {
            System.out.println("Khong tim thay sinh vien voi ma: " + maSv);
        }
    }
    
    private static void hienThiBangDiem(QuanLySinhVien qlsv, Scanner sc) {
        System.out.print("\nNhap ma sinh vien: ");
        String maSv = sc.nextLine();
        
        for (SinhVien sv : qlsv.getDsSinhVien()) {
            if (sv.getMaSv().equals(maSv)) {
                sv.hienThiDiem();
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien!");
    }
    
    private static void tinhDiemVaXepLoai(QuanLySinhVien qlsv, Scanner sc) {
        System.out.print("\nNhap ma sinh vien: ");
        String maSv = sc.nextLine();
        
        for (SinhVien sv : qlsv.getDsSinhVien()) {
            if (sv.getMaSv().equals(maSv)) {
                double dtb = sv.TinhDiemTrungBinh();
                System.out.println("\n===== KET QUA HOC TAP =====");
                System.out.println("Ma SV: " + sv.getMaSv());
                System.out.println("Ho ten: " + sv.getHoTen());
                System.out.println("Tong so hoc phan: " + sv.getDsDiem().size());
                System.out.println("Diem trung binh: " + String.format("%.2f", dtb));
                System.out.println("Xep loai: " + sv.Xeploai());
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien!");
    }
    
    private static void quanLyKhoa(Scanner sc) {
        System.out.println("\n===== QUAN LY KHOA =====");
        System.out.println("1. Them khoa");
        System.out.println("2. Hien thi danh sach khoa");
        System.out.print("Nhap lua chon: ");
        int chon = Integer.parseInt(sc.nextLine());
        
        if (chon == 1) {
            Khoa khoa = new Khoa();
            khoa.Nhap();
            dsKhoa.add(khoa);
            System.out.println("Da them khoa: " + khoa);
        } else {
            hienThiDanhSachKhoa();
        }
    }
    
    private static void hienThiDanhSachKhoa() {
        if (dsKhoa.isEmpty()) {
            System.out.println("Danh sach khoa trong!");
            return;
        }
        System.out.println("\n===== DANH SACH KHOA =====");
        System.out.println("Tong so: " + dsKhoa.size());
        for (Khoa khoa : dsKhoa) {
            System.out.println(khoa);
        }
    }
    
    private static void quanLyHocPhan(Scanner sc) {
        System.out.println("\n===== QUAN LY HOC PHAN =====");
        System.out.println("1. Them hoc phan");
        System.out.println("2. Hien thi danh sach hoc phan");
        System.out.print("Nhap lua chon: ");
        int chon = Integer.parseInt(sc.nextLine());
        
        if (chon == 1) {
            HocPhan hp = new HocPhan();
            dsHocPhan.add(hp);
            System.out.println("Da them hoc phan: " + hp);
        } else {
            hienThiDanhSachHocPhan();
        }
    }
    
    private static void hienThiDanhSachHocPhan() {
        if (dsHocPhan.isEmpty()) {
            System.out.println("Danh sach hoc phan trong!");
            return;
        }
        System.out.println("\n===== DANH SACH HOC PHAN =====");
        System.out.println("Tong so: " + dsHocPhan.size());
        for (HocPhan hp : dsHocPhan) {
            System.out.println(hp);
        }
    }
}