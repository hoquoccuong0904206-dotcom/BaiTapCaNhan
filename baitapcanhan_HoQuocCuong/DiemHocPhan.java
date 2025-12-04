package baitapcanhan_HoQuocCuong;
import java.util.Scanner;

public class DiemHocPhan {
    private String maSv;
    private String maHocPhan;
    private String tenHocPhan;
    private double diemThuongXuyen;
    private double diemGiuaKy;
    private double diemCuoiKy;
    private int soTinChi;

    public DiemHocPhan() {}

    public DiemHocPhan(String maSv, String maHocPhan, String tenHocPhan,
                       double diemThuongXuyen, double diemGiuaKy,
                       double diemCuoiKy, int soTinChi) {
        this.maSv = maSv;
        this.maHocPhan = maHocPhan;
        this.tenHocPhan = tenHocPhan;
        this.diemThuongXuyen = diemThuongXuyen;
        this.diemGiuaKy = diemGiuaKy;
        this.diemCuoiKy = diemCuoiKy;
        this.soTinChi = soTinChi;
    }

    public void Nhap(String maSv) {
        Scanner sc = new Scanner(System.in);
        this.maSv = maSv;

        System.out.print("Nhap ma hoc phan: ");
        maHocPhan = sc.nextLine();

        System.out.print("Nhap ten hoc phan: ");
        tenHocPhan = sc.nextLine();

        System.out.print("Nhap so tin chi: ");
        soTinChi = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap diem thuong xuyen (0-10, he so 1): ");
        diemThuongXuyen = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap diem giua ky (0-10, he so 2): ");
        diemGiuaKy = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap diem cuoi ky (0-10, he so 3): ");
        diemCuoiKy = Double.parseDouble(sc.nextLine());
    }

    public double TinhDiemTB() {
        return (diemThuongXuyen * 1 + diemGiuaKy * 2 + diemCuoiKy * 3) / 6;
    }

    @Override
    public String toString() {
        return "MaHP: " + maHocPhan +
                ", TenHP: " + tenHocPhan +
                ", SoTC: " + soTinChi +
                ", DiemTX: " + String.format("%.1f", diemThuongXuyen) + " (x1)" +
                ", DiemGK: " + String.format("%.1f", diemGiuaKy) + " (x2)" +
                ", DiemCK: " + String.format("%.1f", diemCuoiKy) + " (x3)" +
                ", DiemTB: " + String.format("%.2f", TinhDiemTB());
    }
}
