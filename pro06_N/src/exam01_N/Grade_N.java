package exam01_N;

public class Grade_N {
	// Grade_N 객체를 생성시 마다 인스턴스가 만들어지는데 
	// 만들어진 여러개 인스턴스 모두에 아래와 같은 멤버변수들이 다 같이 만들어짐(중복)
	// -> 메모리 효율 떨어짐 : static 사용. 참조 형태.
	private String name;
	private double score;
	private char rank;
	private final static char[] RANK = new char[] {
			'F', 'F', 'F', 'F', 'E', 'E', 'D', 'C', 'B', 'A', 'A'
	}; // 계속 사용할 거고 계속 사용할 거기 때문에 지역변수 -> 멤버변수
	
	public Grade_N(String name) { // 매개변수가 있는 생성자들은 대부분 맴버변수의 초기값을 설정하기 위해 쓰임
		this.name = name; // 우선순위 가까운 변수 인식. 그래서 this 사용
	}
	
	public Grade_N(String name, double score) {
		this(name); // 반드시 꼭은 아니지만 재사용성 높이고 코드량 줄이기 위해 
		this.setScore(score); // setScore와 흐름동일 -> 중복 -> 재사용, 코드길이 줄어듬.
		// this.score = score;
		// this._setRank();
	}
	
	public String getName() { // 문자열을 반환하겠다고 선언
		return name;
	}
	
	public double getScore() {
		return score;
	}
	
	public char getRank() {
		return rank;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setScore(double score) {
		if(score <= 100 && score >= 0) { // 이럴경우 this를 안쓰게 되면 문제가됨.
			this.score = score;
		} else {
			this.score = 0;
		}
		this._setRank();
	}
	
	private void _setRank() { // 매개변수 setScore에 의해서 이미 설정되어 있르므로 안써도됨
		/*
		 * 점수가 설정되면 여기에 등급을 분류하기 위한 코드를 작성
		 * A: 100 이하 ~ 90 이상, B: 90 미만 ~ 80 이상, C: 80 미만 ~ 70이상
		 * D: 70 미만 60 이상, E: 60 미만 ~ 40 이상, F: 40 미만
		 */
		this.rank = Grade_N.RANK[(int)(this.score / 10)]; 
		// static을 사용하고 있기 때문에 Grade_N. 붙여주는 거 권장
		
		/*
		switch((int)(this.score / 10)) {
			case 10:	case 9: // 몫
				this.rank = 'A';	break;
			case 8:
				this.rank = 'B';	break;
			case 7:
				this.rank = 'C';	break;
			case 6:
				this.rank = 'D';	break;
			case 5:		case 4:
				this.rank = 'E';	break;
			case 3:		case 2:		case 1:		case 0:
				this.rank = 'F';	break;
		}
		 */
		
		/*
		if(this.score <= 100 && this.score >= 90) { // this 안써도 되지만 매개변수가 멤버에 설정되면 되도록이면 써주기
			this.rank = 'A';
		} else if(this.score < 90 && this.score >= 80) {
			this.rank = 'B';
		} else if(this.score < 80 && this.score >= 70) {
			this.rank = 'C';
		} else if(this.score < 70 && this.score >= 60) {
			this.rank = 'D';
		} else if(this.score < 60 && this.score >= 40) {
			this.rank = 'E';
		} else if(this.score < 40) {
			this.rank = 'F';
		}
		 */
	}

}
