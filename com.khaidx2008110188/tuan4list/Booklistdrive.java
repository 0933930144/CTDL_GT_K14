package tuan4list;

import java.util.ArrayList;

import java.util.List;

public class Booklistdrive {
	public static void main(String[] args) {
		Book[] danhsachBook = new Book[3];
		Book Book0 = new Book(1500, 2000, 2002, 15, "To Hoai", "Truyen Tranh");
		Book Book1 = new Book(3000, 4500, 1987, 30, "Tran Dang Khoa", "Tho");
		Book Book2 = new Book(68000, 128000, 2002, 80, "Bui Xuan Huan", "Chien luoc marketing");
	
		
		List<Book> bookList = new ArrayList<>();
		System.out.println("Thu tu :" + bookList.size());
			Book book = new Book(1500, 2000, 2002, 15, "To Hoai", "Truyen Tranh");
			bookList.add(book);
		System.out.println("Thu tu :" + bookList.size());
			book = new Book(3000, 4500, 1987, 30, "Tran Dang Khoa", "Tho");
			bookList.add(book);
		System.out.println("Thu tu :" + bookList.size());
			book = new Book(68000, 128000, 2002, 80, "Bui Xuan Huan", "Chien luoc marketing");
			bookList.add(book);			
		
			for (int i = 0; i < bookList.size(); i++) {
				Book book = new bookList.get(i);	
				book.showInfo();
	}
	
}
}