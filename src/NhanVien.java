import java.util.Scanner;

public class NhanVien extends Nguoi{
    private int snct; // so nam cong tac
    private double hsl; //he so luong

    public int getSnct() {
        return snct;
    }

    @Override
    public void nhap(Scanner sc) {
        // Gọi phương thức nhập của lớp cha
        super.nhap(sc);

        System.out.print("Nhap so nam cong tac: ");
        snct = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap he so luong: ");
        hsl = Double.parseDouble(sc.nextLine());
    }

    public double tinhTienLuong() {
        double lcb = 1.5;
        double phucap = 0.2 * snct;

        return lcb * hsl + phucap;
    }

    @Override
    public void xuat() {
        super.xuat();

        System.out.println("So nam cong tac: " + snct);
        System.out.println("He so luong: " + hsl);
        System.out.println("Tien luong: " + tinhTienLuong()
                + " trieu dong");
        System.out.println("-------------------------");
    }
}
