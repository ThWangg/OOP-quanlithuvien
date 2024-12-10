import java.util.ArrayList;
import java.util.List;

public class ThuVien implements QuanLiSach{
    private String id;
    private String tenThuVien;
    private List<Sach> danhSach;

    public ThuVien(String id, String tenThuVien){
        this.id = id;
        this.tenThuVien = tenThuVien;
        this.danhSach = new ArrayList<>();
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getTenThuVien(){
        return tenThuVien;
    }

    public void setTenThuVien(String tenThuVien){
        this.tenThuVien = tenThuVien;
    }

    public List<Sach> getDanhSach(){
        return danhSach;
    }

    public void setDanhSach(List<Sach> danhSach){
        this.danhSach = danhSach;
    }

    public void themSach(Sach sachMoi){
        danhSach.add(sachMoi);
        System.out.println("da them sach");
    }

    public void xoaSach(String id){
        for(int i = 0; i < danhSach.size(); i++){
            if(danhSach.get(i).getId() == id){
                danhSach.remove(i);
                System.out.println("da xoa");
                break;
            }
        }
    }

    public void timKiemSachBangTenSach(String tenSach){
        boolean daTimthay = false;
        for(int i = 0; i < danhSach.size(); i ++){
            if(danhSach.get(i).getTieuDe().equals(tenSach)){
                System.out.println(danhSach.get(i));
                daTimthay = true;
            }
            if(!daTimthay){
                System.out.println("khong tim thay theo ten sach");
            }
        }
    }

    public void timKiemSachBangTacGia(String tenTacGia){
        boolean daTimthay = false;
        for(int i = 0; i < danhSach.size(); i ++){
            if(danhSach.get(i).getTacGia().equals(tenTacGia)){
                System.out.println(danhSach.get(i));
                daTimthay = true;
            }
            if(!daTimthay){
                System.out.println("khong tim thay theo tac gia");
            }
        }
    }

    public void hienThiDanhSach(){
        for(int i = 0; i < danhSach.size(); i++){
            System.out.println(danhSach);
        }
    }

    public String toString(){
        return "ThuVien(id = " + id + ", tên thư viện = " + tenThuVien + ", tổng số sách = " + danhSach.size() + ")";
    }
}