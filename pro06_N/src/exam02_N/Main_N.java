package exam02_N;

import java.util.Arrays;

public class Main_N {
	
	public static void main(String[] args) {
		ReportGrade_N report = new ReportGrade_N("김규연");
		
		// 나의 성적 전달
		double[] grades = new double[] {78.5, 79.3, 87.2, 93.8, 93.4};
		String[] subjects = new String[] {"국어", "영어", "수학", "사회", "체육"};
		report.setGrades(grades);
		report.setSubjects(subjects);
		
		report.setGrades("수학", 92.5);
		
		System.out.println(report.getGrade("사회"));
		
		System.out.println(Arrays.toString(report.getGrades()));
		
		report.addSubject("과학", 86.9);
		System.out.println(report.getGrade("과학"));
	}
}
