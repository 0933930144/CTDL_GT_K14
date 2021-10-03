package tuan4list;

public class Book {
	int gia;
	int giaBan;
	int namXuatBan;
	int soLuong;
	String nhaXuatBan;
	String loai;
	
	public Book() {}
	public Book(int g, int gb, int namXB, int sl ) {
		gia = g;
		giaBan = gb;
		namXuatBan = namXB;
		soLuong = sl;
}
	public Book(int g, int gb, int namXB, int sl, String nhaXB, String l) {
		gia = g;
		giaBan = gb;
		namXuatBan = namXB;
		soLuong = sl;
		nhaXuatBan = nhaXB;
		loai = l;
		
		
}
	@Override
	public String toString() {
		return "Book [gia=" + gia + ", giaBan=" + giaBan + ", namXuatBan=" + namXuatBan + ", soLuong=" + soLuong
				+ ", nhaXuatBan=" + nhaXuatBan + ", loai=" + loai + "]";
	}
	public void showInfo() {
		System.out.println(toString());
	}
}
