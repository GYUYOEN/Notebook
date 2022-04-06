package exam05_N;

import java.util.Arrays;

public class PersonList_N {
	// 2차 배열과 비슷
	// Person_C를 활용할 객체배열 생성
	private Person_N[] pArr = new Person_N[0];
	
	public PersonList_N(Person_N[] data) {
		this.pArr = data;
	}
	
	public Person_N get(int index) {
		return this.pArr[index];
	}
	
	public int length() {
		return this.pArr.length;
	}
	
	public void add(String name) {
		this.pArr = Arrays.copyOf(this.pArr, length() + 1);
		this.pArr[length() - 1] = new Person_N(name);
	}
	
	public void update(String find, String change) {
		/*
		 * 중복 -> 별도의 메서드로 분류
		int idx = -1;
		for(int i = 0; i < length(); i++) {
			Person_N data = get(i);
			if(find.equals(data.getName())) {
				idx = i;
				break;
			}
		}
		 */
		int idx = findIndex(find);
		this.pArr[idx].setName(change);
		
	}
	
	public void update(int index, String name) {
		this.pArr[index].setName(name);
	}
	
	public void remove(String name) {
		/*
		int idx = -1;
		for(int i = 0; i < length(); i++) {
			Person_N data = get(i);
			if(name.equals(data.getName())) {
				idx = i;
				break;
			}
		}
		 */
		
		int idx = findIndex(name);
		
		int index = 0;
		Person_N[] temp = new Person_N[length()] - 1;
		for(int i = 0; i < length(); i++) {
			if( idx != i) {
				temp[index++] = this.pArr[i];
			}
		}
		this.pArr = temp;
	}
	
	public void remove(int index) {
		int idx = 0;
		Person_N[] temp = new Person_N[length() - 1];
		for(int i = 0; i < length(); i++) {
			if(index != i) {
				temp[idx++] = this.pArr[i];
			}
		}
		this.pArr = temp;
	}
	// 중복 -> 별도의 메서드로 분리
	public int findIndex(String name) {
		int idx = -1;
		for(int i = 0; i < length(); i++) {
			Person_N data = get(i);
			if(name.equals(data.getName())) {
				idx = i;
				break;
			}
		}
		return idx;
	}
}
