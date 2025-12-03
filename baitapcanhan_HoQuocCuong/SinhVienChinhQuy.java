package baitapcanhan_HoQuocCuong;

import java.util.Scanner;

public class SinhVienChinhQuy extends SinhVien {
    private double diemDauVao;
    private String khoi;
    
    public SinhVienChinhQuy() {
        super();
    }
    
    public SinhVienChinhQuy(String maSv, String hoTen, int namSinh, String khoa, 
                           double diemDauVao, String khoi) {
        super(maSv, hoTen, namSinh, khoa);
        this.diemDauVao = diemDauVao;
        this.khoi = khoi;
    }
    
    @Override
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem dau vao: ");
        diemDauVao = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap khoi: ");
        khoi = sc.nextLine();
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Loai: ChinhQuy, DiemDauVao: " + diemDauVao + ", Khoi: " + khoi;
    }
    
    @Override
    public double TinhDiemTrungBinh() {
        return diemTrungBinh;
    }
    
    @Override
    public String Xeploai() {
        if (diemTrungBinh >= 8.5) return "Gioi";
        else if (diemTrungBinh >= 7.0) return "Kha";
        else if (diemTrungBinh >= 5.5) return "Trung Binh";
        else if (diemTrungBinh >= 4.0) return "Yeu";
        else return "Kem";
    }
    
    public double getDiemDauVao() {
        return diemDauVao;
    }
    
    public void setDiemDauVao(double diemDauVao) {
        this.diemDauVao = diemDauVao;
    }
    
    public String getKhoi() {
        return khoi;
    }
    
    public void setKhoi(String khoi) {
        this.khoi = khoi;
    }
}
