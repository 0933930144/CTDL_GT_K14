package tuan4;

public class Book {
    double gia;
    String nhaXuatBan;
    int namXuatBan;
    double giaBan;
    int soLuong;
    String loai;
    Book(){
        
}

    Book(String NXB, int nam, int SL, String l, double g, double GB){
        nhaXuatBan = NXB;
        namXuatBan = nam;
        soLuong = SL;
        loai = l;
        gia = g;
        giaBan = GB;
    }
    void inThongTin() {
    	System.out.println("Nha xuat ban"+ nhaXuatBan+""+"Nam Xuat Ban"+ namXuatBan+""+"Loai"+ loai+""+"So luong"+ soLuong+""+"Gia"+ gia+""+"Gia Ban"+giaBan);
    }
}
