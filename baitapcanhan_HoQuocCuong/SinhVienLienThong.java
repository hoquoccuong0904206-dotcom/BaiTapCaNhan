package baitapcanhan_HoQuocCuong;

import java.util.Scanner;

public class SinhVienLienThong extends SinhVien {
    private String caoDangLienThong;
    private int soTinChiConThieu;
    
    public SinhVienLienThong() {
        super();
    }
    
    public SinhVienLienThong(String maSv, String hoTen, int namSinh, String khoa,
                           String caoDangLienThong, int soTinChiConThieu) {
        super(maSv, hoTen, namSinh, khoa);
        this.caoDangLienThong = caoDangLienThong;
        this.soTinChiConThieu = soTinChiConThieu;
    }
    
    @Override
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cao dang lien thong: ");
        caoDangLienThong = sc.nextLine();
        System.out.print("Nhap so tin chi con thieu: ");
        soTinChiConThieu = Integer.parseInt(sc.nextLine());
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Loai: LienThong, CaoDang: " + caoDangLienThong + 
               ", TinChiConThieu: " + soTinChiConThieu;
    }
    
    @Override
    public double TinhDiemTrungBinh() {
        return diemTrungBinh;
    }
    
    @Override
    public String Xeploai() {
        if (diemTrungBinh >= 8.0) return "Gioi";
        else if (diemTrungBinh >= 6.5) return "Kha";
        else if (diemTrungBinh >= 5.0) return "Trung Binh";
        else if (diemTrungBinh >= 3.5) return "Yeu";
        else return "Kem";
    }
    
    public String getCaoDangLienThong() {
        return caoDangLienThong;
    }
    
    public void setCaoDangLienThong(String caoDangLienThong) {
        this.caoDangLienThong = caoDangLienThong;
    }
    
    public int getSoTinChiConThieu() {
        return soTinChiConThieu;
    }
    
    public void setSoTinChiConThieu(int soTinChiConThieu) {
        this.soTinChiConThieu = soTinChiConThieu;
    }
}