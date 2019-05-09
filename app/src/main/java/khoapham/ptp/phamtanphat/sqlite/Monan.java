package khoapham.ptp.phamtanphat.sqlite;
public class Monan {
    private int id;
    private String ten;
    private String diachi;
    private int gia;

    public Monan(int id, String ten, String diachi, int gia) {
        this.id = id;
        this.ten = ten;
        this.diachi = diachi;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
