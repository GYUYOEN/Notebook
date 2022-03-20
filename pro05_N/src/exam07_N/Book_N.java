package exam07_N;

public class Book_N {
	public String name;			// 책이름
	public String writer;		// 작가
	public int rentDays;		// 대여기간
	public int codeNumber;		// 코드번호
	public int rentPrice;		// 대여금액
	public String publisher;	// 출판사
	public String category;		// 분류
	public String libraryName;	// 책보유도서관
	
	public Book_N() {}
	
	public Book_N(String name) {
		this.name = name;
	}
	
	public Book_N(String name, int codeNumber) {
		this(name);
		this.codeNumber = codeNumber;
	}
	
	public Book_N(String name, int codeNumber, String writer) {
		this(name, codeNumber);
		this.writer = writer;
	}
	
	public Book_N(String name, int codeNumber, String writer, int rentDays) {
		this(name, codeNumber, writer);
		this.rentDays = rentDays;
	}
	
	public Book_N(String name, int codeNumber, String writer, int rentDays, int rentPrice) {
		this(name, codeNumber, writer, rentDays);
		this.rentPrice = rentPrice;
	}
	
	public void method1() {
		System.out.println("매서드 실행 됨");
	}
	
	public static void method2() {
		System.out.println("매서드 실행 됨");
	}
}
