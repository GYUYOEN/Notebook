package exam06_N;

import java.util.Arrays;

public class GradeList_N {
	/*
	 * Grade 객체를 배열로 만들어서 다루기 위한 객체
	 * 이 객체를 통해 데이터를 추가, 수정, 삭제, 조회
	 * 할 수 있게 한다.
	 */
	
	private Grade_N[] gArr = new Grade_N[0];
	
	public  GradeList() {}
	
	public GradeList_N(int size) {
		this.gArr = new Grade_N[size];
	}
	
	public GradeList_N(String ... subjects) {
		// new GradeList_C("과목1", "과목2", ...)
		this.gArr = new Grade_N[subjects.length];
		for(int i = 0; i < subjects.length; i++) {
			this.gArr[i] = new Grade_N(subjects[i]);
		}
	}
	
	public GradeList_N(Grade_N[] grade) {
		// 얕은 복사를 이용할 때
		// this.gArr = grade;
		
		// 깊은 복사를 이용할 때
		// 기본배열이 아니고 객체배열이기 때문에 클론(.clone) 사용x
		this.gArr = new Grade_N[grade.length];
		for(int i = 0; i< grade.length; i++) {
			this.gArr[i] = new Grade_N(grade[i].getName(), grade[i].getScore());
		}
	}
	
	public int length() {
		return this.gArr.length;
	}
	
	// 추가
	public void add(String name) {
		this.gArr = Arrays.copyOf(this.gArr, length() + 1);
		this.gArr[length() - 1] = new Grade_N(name);
	}
	
	public void add(String name, double score) {
		this.gArr = Arrays.copyOf(this.gArr, length() + 1);
		this.gArr[length() - 1] = new Grade_N(name, score);
	}
	
	// 외부에서 만들어진 grade 객체를 이 리스트 안에 추가
	public void add(Grade_N grade) {
		this.gArr = Arrays.copyOf(this.gArr, length() + 1);
		this.gArr[length() - 1] = grade;
	}
	
	// 수정
	//	  1. 수정 할 자료를 찾는다.
	//    2. 찾은 자료에 대해 수정을 한다.
	
	// {["과학", 77], ["국어", 77], ["영어", 77], ["수학", 77]} [] :  Grade_C 객체, 배열 x, 단일객체
	// 수학 과목을 수학1로 변경하라
	public void update(String search, String change) {
		int idx = findIndex(search);
		this.gArr[idx].setName(change);
	}
	
	// 수학 과목의 점수를 87로 변경하라
	public void update(String search, double change) {
		int idx = findIndex(search);
		this.gArr[idx].setScore(change);
	}
	
	// 수학 과목을 수학1로 변경하고 점수도 87로 변경하라
	public void update(String search, String changeName, double changeScore) {
		int idx = findIndex(search);
		this.gArr[idx].setName(changeName);
		this.gArr[idx].setScore(changeScore);
	}
	
	// 수학 과목을 ["수학", 87]로 변경
	public void update(String search, Grade_N change) {
		int idx = findIndex(search);
		this.gArr[idx] = change;
	}
	
	public void update(int index, String change) {
		this.gArr[index].setName(change);
	}
	
	public void update(int index, double change) {
		this.gArr[index].setScore(change);
	}
	
	public void update(int index, String changeName, double changeScore) {
		this.gArr[index].setName(changeName);
		this.gArr[index].setScore(changeScore);
	}
	
	public void update(int index, Grade_N change) {
		this.gArr[index] = change;
	}
	
	public void remove(String name) {
		
	}
	
	// 조회
	public Grade_N get(int index) {
		return this.gArr[index];
	}
	
	// 객체를 한글로 나오게 하기 위한 메소드
	public String getName(int index) {
		return this.gArr[index].getName();
	}
	
	public double getScore(int index) {
		return this.gArr[index].getScore();
	}
	
	public double getScore(String name) {
		return gArr[findIndex(name)].getScore();
	}
	
	public double getAvg() {
		return getTotal() / length();
	}
	
	public double getTotal() {
		double tot = 0;
		for(int i = 0; i < length(); i++) {
			tot += gArr[i].getScore();
		}
		return tot;
	}
	
	public String[] getUnder() {
		// 과락의 기준은 100점 만점을 기준으로 40점 미만인 것.
		return getUnder(40);
	}
	
	public String[] getUnder(double score) {
		// 과락의 기준을 외부 값으로 받아서 찾아내는 함수
		String[] result = new String[0];
		for(int i = 0; i < length(); i++) {
			if(gArr[i].getScore() < score) {
				result = Arrays.copyOf(result, result.length + 1);
				result[result.length - 1] = gArr[i].getName();
			}
		}
		return result;
	}
	
	public String getTop() {
		// 최고 득정을 받은 과목을 찾아내는 함수
		Grade_N top = gArr[0];
		for(int i = 1; i < length(); i++) {
			if(top.getScore() < gArr[i].getScore()) {
				top = gArr[i];
			}
		}
		return top.getName();
	}
	
	public String[] getTop(int count) {
		// 최고 득점을 받은 과목을 count 만큼 찾아내는 함수
//		Grade_N[] tArr = gArr.clone();
//		for(int i = 0; i < tArr.length - 1; i++) {
//			for(int j = i + 1; j < tArr.length; j++) {
//				if(tArr[i].getScore() < tArr[j].getScore()) {
//					Grade_N temp = tArr[i];
//					tArr[i] = tArr[j];
//					tArr[j] = temp;
//				}
//			}
//		}
		Grade_N[] tArr = _sort(true);
		
		String[] result = new String[0];
		for(int i = 0; i < count; i++) {
			result = Arrays.copyOf(result, result.length + 1);
			result[result.length - 1] = tArr[i].getName();
		}
		return result;
	}
	
	public String getBottom() {
		// 최저 득정을 받은 과목을 찾아내는 함수
		Grade_N bottom = gArr[0];
		for(int i = 1; i < length(); i++) {
			if(bottom.getScore() > gArr[i].getScore()) {
				bottom = gArr[i];
			}
		}
		return bottom.getName();
	}
	
	public String[] getBottom(int count) {
		// 최저 득점을 받은 과목을 count 만큼 찾아내는 함수
//		Grade_N[] tArr = gArr.clone();
//		for(int i = 0; i < tArr.length - 1; i++) {
//			for(int j = i + 1; j < tArr.length; j++) {
//				if(tArr[i].getScore() > tArr[j].getScore()) {
//					Grade_N temp = tArr[i];
//					tArr[i] = tArr[j];
//					tArr[j] = temp;
//				}
//			}
//		}
		
		Grade_N[] tArr = _sort(false);
		
		String[] result = new String[0];
		for(int i = 0; i < count; i++) {
			result = Arrays.copyOf(result, result.length + 1);
			result[result.length - 1] = tArr[i].getName();
		}
		return result;
	}
	
	public int findIndex(String name) {
		int idx = -1;
		for(int i = 0; i < length(); i++) {
			Grade_N data = get(i);
			if(name.equals(data.getName())) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	
	private Grade_N[] _sort(boolean descending) {
		Grade_N[] tArr = gArr.clone();
		
		if(descending) {
			for(int i = 0; i < tArr.length - 1; i++) {
				for(int j = i + 1; j < tArr.length; j++) {
					if(tArr[i].getScore() < tArr[j].getScore()) {
						Grade_N temp = tArr[i];
						tArr[i] = tArr[j];
						tArr[j] = temp;
					}
				}
			}
		} else {
			for(int i = 0; i < tArr.length - 1; i++) {
				for(int j = i + 1; j < tArr.length; j++) {
					if(tArr[i].getScore() > tArr[i].getScore()) {
						Grade_N temp = tArr[i];
						tArr[i] = tArr[j];
						tArr[j] = temp;
					}
				}
			}
		}
		return tArr;
	}
}
