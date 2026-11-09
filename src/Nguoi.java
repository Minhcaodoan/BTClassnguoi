import java.util.Scanner;

public class Nguoi {
    protected String hoten;
    protected int tuoi;

    // Phương thức nhập
    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoten = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine());
    }

    // Phương thức xuất
    public void xuat() {
        System.out.println("Ho ten: " + hoten);
        System.out.println("Tuoi: " + tuoi);
    }
}
