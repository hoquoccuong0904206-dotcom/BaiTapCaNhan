package baitapcanhan_HoQuocCuong;
import java.util.Scanner;

public class HocPhan {
    private String maHocPhan;
    private String tenHocPhan;
    private int soTinChi;

    public HocPhan() {}

    public HocPhan(String maHocPhan, String tenHocPhan, int soTinChi) {
        this.maHocPhan = maHocPhan;
        this.tenHocPhan = tenHocPhan;
        this.soTinChi = soTinChi;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hoc phan: ");
        maHocPhan = sc.nextLine();
        System.out.print("Nhap ten hoc phan: ");
        tenHocPhan = sc.nextLine();
        System.out.print("Nhap so tin chi: ");
        soTinChi = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "MaHP: " + maHocPhan + ", TenHP: " + tenHocPhan + ", SoTC: " + soTinChi;
    }
}
