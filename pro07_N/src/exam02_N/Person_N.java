package exam02_N;

import java.util.Objects;

public class Person_N {
	private String name;
	private char gender;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 이것을 정의 안하면 main에서 출력할 때 참조주소값으로 나옴
	// override가 되는 이유 : 모든 클래스는 object 클래스를 다 상속함, object는 최상위 클래스
	// 부모에만 이것을 정의해도 자식클래스를 출력할 때 제대로 출력되서 나옴
	@Override
	public String toString() {
//		return getName() + " | " + getAge() + " | " + getGender();
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	// 객체와 객체 간의 비교를 할 때
	// 동일객채인지를 참조값으로 비교하는 것이 아닌 객체의 멤버 변수 값으로 비교하고자 할 때 활용
	// ((Person_N)obj) : 외부로 부터 받은 Person_N 객체, 다운 캐스팅(형변환)
//	@Override
//	public boolean equals(Object obj) {
//		Person_N p = (Person_N)obj;
//		if(this.getName().equals( p.getName() )) {
//			if(this.getAge() == p.getAge()) {
//				if(this.getGender() == p.getGender()) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, gender, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person_N other = (Person_N) obj;
		return age == other.age && gender == other.gender && Objects.equals(name, other.name);
	}
	
	
}
