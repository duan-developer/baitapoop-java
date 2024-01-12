package coban; 
import java.util.Scanner;

class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    // Phương thức thiết lập chiều dài
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    // Phương thức lấy chiều dài
    public double getChieuDai() {
        return chieuDai;
    }

    // Phương thức thiết lập chiều rộng
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    // Phương thức lấy chiều rộng
    public double getChieuRong() {
        return chieuRong;
    }

    // Phương thức tính diện tích
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    // Phương thức tính chu vi
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    // Phương thức hiển thị thông tin
    public String toString() {
        return "Chiều dài: " + chieuDai +
               "\nChiều rộng: " + chieuRong +
               "\nDiện tích: " + tinhDienTich() +
               "\nChu vi: " + tinhChuVi();
    }
}

public class baitap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng từ bàn phím
        System.out.print("Nhập chiều dài: ");
        double chieuDai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double chieuRong = scanner.nextDouble();

        // Tạo đối tượng HinhChuNhat
        HinhChuNhat hinhChuNhat = new HinhChuNhat();

        // Thiết lập chiều dài và chiều rộng cho đối tượng
        hinhChuNhat.setChieuDai(chieuDai);
        hinhChuNhat.setChieuRong(chieuRong);

        // Hiển thị thông tin
        System.out.println(hinhChuNhat.toString());

        // Đóng scanner
        scanner.close();
    }
}
