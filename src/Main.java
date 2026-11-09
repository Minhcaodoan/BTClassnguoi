void main() {
    Scanner sc = new Scanner(System.in);

    // Nhập số lượng nhân viên
    System.out.print("Nhap so luong nhan vien: ");
    int n = Integer.parseInt(sc.nextLine());

    // Khởi tạo danh sách nhân viên
    ArrayList<NhanVien> ds = new ArrayList<>();

    // Nhập danh sách
    for (int i = 0; i < n; i++) {
        System.out.println("\nNhap nhan vien thu " + (i + 1));

        NhanVien nv = new NhanVien();
        nv.nhap(sc);

        ds.add(nv);
    }

    // Tìm nhân viên có số năm công tác nhiều nhất
    if (ds.size() > 0) {
        NhanVien max = ds.get(0);

        for (int i = 1; i < ds.size(); i++) {
            if (ds.get(i).getSnct() > max.getSnct()) {
                max = ds.get(i);
            }
        }

        System.out.println("\nNHAN VIEN CO SO NAM CONG TAC NHIEU NHAT:");
        max.xuat();
    }

    // Sắp xếp lương từ cao xuống thấp
    ds.sort(
            Comparator.comparingDouble(NhanVien::tinhTienLuong)
                    .reversed()
    );

    // Xuất danh sách sau khi sắp xếp
    System.out.println("\nDANH SACH NHAN VIEN THEO LUONG GIAM DAN:");

    for (NhanVien nv : ds) {
        nv.xuat();
    }

    sc.close();
}
