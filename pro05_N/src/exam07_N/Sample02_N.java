package exam07_N;

public class Sample02_N {

	public static void main(String[] args) {
		Book_N book1 = new Book_N();
		Book_N book2 = new Book_N("Java Programming");
		Book_N book3 = new Book_N("Programming", 123456789);
		Book_N book4 = new Book_N("Java", 123456799, "미상");
		Book_N book5 = new Book_N("Class Book", 123456777, "홍길동", 5);
		
		book1.method2();
		Book_N.method2();
		// book_N.method1(); // -> 오류

	}

}
