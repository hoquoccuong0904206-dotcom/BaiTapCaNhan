package baitapcanhan_HoQuocCuong;
import java.util.Scanner;

public class SinhVienQuocTe extends SinhVien {
    private String quocTich;
    private String chungChiNgoaiNgu;
    private double diemChuyenNghanh;

    public SinhVienQuocTe() { super(); }

    public SinhVienQuocTe(String maSv, String hoTen, int namSinh, String khoa,
                         String quocTich, String chungChiNgoaiNgu, double diemChuyenNghanh) {
        super(maSv, hoTen, namSinh, khoa);
        this.quocTich = quocTich;
        this.chungChiNgoaiNgu = chungChiNgoaiNgu;
        this.diemChuyenNghanh = diemChuyenNghanh;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap quoc tich: ");
        quocTich = sc.nextLine();
        System.out.print("Nhap chung chi ngoai ngu: ");
        chungChiNgoaiNgu = sc.nextLine();
        System.out.print("Nhap diem chuyen nghanh: ");
        diemChuyenNghanh = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + ", Loai: QuocTe, QuocTich: " + quocTich +
                ", ChungChi: " + chungChiNgoaiNgu +
                ", DiemChuyenNghanh: " + String.format("%.1f", diemChuyenNghanh);
    }

    @Override
    public double TinhDiemTrungBinh() {
        double diemTBHocPhan = super.TinhDiemTrungBinh();
        if (diemTBHocPhan == 0) return 0;
        diemTrungBinh = (diemTBHocPhan + diemChuyenNghanh) / 2;
        return diemTrungBinh;
    }

    @Override
    public String Xeploai() {
        double dtb = TinhDiemTrungBinh();
        if (dtb >= 8.5) return "Excellent";
        else if (dtb >= 7.0) return "Good";
        else if (dtb >= 5.5) return "Average";
        else if (dtb >= 4.0) return "Below Average";
        else return "Fail";
    }

    public String getQuocTich() { return quocTich; }
    public void setQuocTich(String quocTich) { this.quocTich = quocTich; }
    public String getChungChiNgoaiNgu() { return chungChiNgoaiNgu; }
    public void setChungChiNgoaiNgu(String chungChiNgoaiNgu) { this.chungChiNgoaiNgu = chungChiNgoaiNgu; }
    public double getDiemChuyenNghanh() { return diemChuyenNghanh; }
    public void setDiemChuyenNghanh(double diemChuyenNghanh) { this.diemChuyenNghanh = diemChuyenNghanh; }
}
