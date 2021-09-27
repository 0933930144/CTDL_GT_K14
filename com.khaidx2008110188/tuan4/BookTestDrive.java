package tuan4;

public class BookTestDrive {
	public static void main(String[] args) {
		Book[] danhsachbook = new Book[3];
		
		Book book0 = new Book("Kim Dong", "2002", "Truyen chu", 10, 1000, 2500);
		Book book1 = new Book("Tran Dang Khoa", "1987", "Tho", 50, 2000, 2500);
		Book book2 = new Book("To Hoai", "2000", "Truyen Tranh", 60, 2000, 4000);
		
		danhsachbook[0] = book0;
		danhsachbook[1] = book1;
		danhsachbook[2] = book2;
		
		danhsachbook[3].inThongTin();
	}
}





