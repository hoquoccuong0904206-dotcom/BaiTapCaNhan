package baitapcanhan_HoQuocCuong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class SinhVien implements IBangDiem {
    protected String maSv;
    protected String hoTen;
    protected int namSinh;
    protected String khoa;
    protected double diemTrungBinh;
    protected List<DiemHocPhan> dsDiem;
    
    public SinhVien() {
        dsDiem = new ArrayList<>();
    }
    
    public SinhVien(String maSv, String hoTen, int namSinh, String khoa) {
        this();
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.khoa = khoa;
    }
    
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSv = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap khoa: ");
        khoa = sc.nextLine();
    }
    
    @Override
    public double TinhDiemTrungBinh() {
        if (dsDiem.isEmpty()) {
            return 0;
        }
        
        double tongDiem = 0;
        
        for (DiemHocPhan diem : dsDiem) {
            tongDiem += diem.TinhDiemTB(); // Chỉ cộng điểm TB học phần
        }
        
        diemTrungBinh = tongDiem / dsDiem.size(); // Chia cho số học phần
        return diemTrungBinh;
    }
    
    public void themDiemHocPhan(DiemHocPhan diem) {
        dsDiem.add(diem);
        TinhDiemTrungBinh(); // Tự động tính lại điểm TB
    }
    
    public void hienThiDiem() {
        if (dsDiem.isEmpty()) {
            System.out.println("Chua co diem hoc phan nao!");
            return;
        }
        
        System.out.println("===== BANG DIEM SINH VIEN " + maSv + " =====");
        for (DiemHocPhan diem : dsDiem) {
            System.out.println(diem);
        }
        System.out.println("Tong so hoc phan: " + dsDiem.size());
        System.out.println("Diem trung binh chung: " + String.format("%.2f", diemTrungBinh));
    }
    
    @Override
    public String toString() {
        return "MaSV: " + maSv + ", HoTen: " + hoTen + ", NamSinh: " + namSinh + 
               ", Khoa: " + khoa + ", DTB: " + String.format("%.2f", diemTrungBinh) +
               ", SoHP: " + dsDiem.size();
    }
    
    public String getMaSv() {
        return maSv;
    }
    
    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }
    
    public String getHoTen() {
        return hoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
    public int getNamSinh() {
        return namSinh;
    }
    
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    public String getKhoa() {
        return khoa;
    }
    
    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
    
    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
    
    public List<DiemHocPhan> getDsDiem() {
        return dsDiem;
    }
}
