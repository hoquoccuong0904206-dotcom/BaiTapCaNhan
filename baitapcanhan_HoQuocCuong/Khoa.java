package baitapcanhan_HoQuocCuong;

import java.util.Scanner;

public class Khoa {
    private String maKhoa;
    private String tenKhoa;
    
    public Khoa() {}
    
    public Khoa(String maKhoa, String tenKhoa) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
    }
    
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma khoa: ");
        maKhoa = sc.nextLine();
        System.out.print("Nhap ten khoa: ");
        tenKhoa = sc.nextLine();
    }
    
    @Override
    public String toString() {
        return "MaKhoa: " + maKhoa + ", TenKhoa: " + tenKhoa;
    }
    
    public String getMaKhoa() {
        return maKhoa;
    }
    
    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }
    
    public String getTenKhoa() {
        return tenKhoa;
    }
    
    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }
}
