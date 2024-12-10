public class Sach{
    private String id;
    private String tieuDe;
    private String tacGia;
    private String theLoai;
    private int namXuatBan;
    private boolean tinhTrang = false;

    public Sach(String id, String tieuDe, String tacGia, String theLoai, int namXuatBan, boolean tinhTrang){
        this.id = id;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.namXuatBan = namXuatBan;
        this.tinhTrang = tinhTrang;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getTieuDe(){
        return tieuDe;
    }

    public void setTieuDe(String tieuDe){
        this.tieuDe = tieuDe;
    }

    public String getTacGia(){
        return tacGia;
    }

    public void setTacGia(String tacGia){
        this.tacGia = tacGia;
    }

    public String getTheLoai(){
        return theLoai;
    }

    public void setTheLoai(String theLoai){
        this.theLoai = theLoai;
    }

    public int getNamXuatBan(){
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan){
        this.namXuatBan = namXuatBan;
    }

    public boolean getTinhTrang(){
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang){
        this.tinhTrang = tinhTrang;
    }

    public String toString(){
        return "Sách(id = " + id + ", tiêu đề = " + tieuDe + ", tác giả = " + tacGia + ", thể loại = " + theLoai + ", năm xuất bản = " + namXuatBan + ", tình trạng = " + tinhTrang + ")";
    }
}