
import java.util.Scanner;

public class QuanLiThuVien{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        ThuVien thuVienGoc = new ThuVien("TV01", "SachSach");
        Sach sach1 = new Sach("S01", "KH", "TG1", "khoa hoc", 2022, false);
        Sach sach2 = new Sach("S02", "LS", "TG2", "lich su", 20219, false);
        System.out.println("=== QUAN LI THU VIEN ===");
        System.out.println("1. tao thu vien moi");
        System.out.println("2. them sach");
        System.out.println("3. xoa sach");
        System.out.println("4. tim kiem sach");
        System.out.println("5. hien thi sach");
        System.out.println("0. Thoat");
        System.out.print("Nhap lua chon: ");

        choice = scanner.nextInt();

        while(choice <= -1 || choice >=6){
            System.out.println("lua chon k hop le");
            choice = scanner.nextInt();
        }

        switch(choice){
            case 1:
                System.out.println("nhap id thu vien");
                scanner.nextLine();
                String idThuVien = scanner.nextLine();
                System.out.println("nhap ten thu vien");
                String tenThuVien = scanner.nextLine();

                ThuVien thuVien = new ThuVien(idThuVien, tenThuVien);
                System.out.println(thuVien);
                break;
            case 2:
                System.out.println("nhap id sach");
                scanner.nextLine();
                String idSach = scanner.nextLine();
                System.out.println("nhap tieu de sach");
                String tieuDe = scanner.nextLine();
                System.out.println("nhap tac gia sach");
                String tacGia = scanner.nextLine();
                System.out.println("nhap the loai sach");
                String theLoai = scanner.nextLine();
                System.out.println("nhap nam xuat ban sach");
                int namXuatBan = scanner.nextInt();
                boolean tinhTrang = true;

                Sach sachMoi = new Sach(idSach, tieuDe, tacGia, theLoai, namXuatBan, tinhTrang);
                thuVienGoc.themSach(sachMoi);
                break;
            case 3: 
                System.out.println("nhap id sach can xoa");
                scanner.nextLine();
                String idSachCanXoa = scanner.nextLine();
                thuVienGoc.xoaSach(idSachCanXoa);
                break;
            case 4:
                System.out.println("1. tim kiem sach theo ten sach");
                System.out.println("2. tim kiem sach theo tac gia");
                int choiceTimKiem = scanner.nextInt();
                if(choiceTimKiem == 1){
                    System.out.println("nhap ten sach can tim kiem");
                    scanner.nextLine();
                    String tenSachCanTimKiem = scanner.nextLine();
                    thuVienGoc.timKiemSachBangTenSach(tenSachCanTimKiem);
                }
                else if(choiceTimKiem == 2){
                    System.out.println("nhap ten tac gia can tim kiem");
                    scanner.nextLine();
                    String tacGiaCanTimKiem = scanner.nextLine();
                    thuVienGoc.timKiemSachBangTacGia(tacGiaCanTimKiem);
                }
                else{
                    System.out.println("lua chon k hop le");
                }
                break;
            case 5:
                thuVienGoc.hienThiDanhSach();
                break;
            case 0:
                System.out.println("tam biet");
                break;
            default:
                System.out.println("lua chon k hop le");
        }
    }
}