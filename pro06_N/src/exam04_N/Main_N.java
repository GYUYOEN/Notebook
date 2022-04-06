package exam04_N;

public class Main_N {

	public static void main(String[] args) {
		Page_N p = new Page_N(100);
		
//		for(int i = 0; i < 10; i++) {
//			p.nextPage();
//			System.out.println(p.getPageNumber());
//		}

		for(int i = 0; i < 101; i++) {
			p.nextPage(5);
			System.out.println(p.getPageNumber() + " 번째 페이지");
		}
		
//		for(int i = 0; i < 30; i++) {
//			p.prevPage(3);
//			System.out.println(p.getPageNumber() + " 번째 페이지");
//		}
		}
}
