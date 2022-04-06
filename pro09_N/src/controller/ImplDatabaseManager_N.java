package controller;

import model.vo.Grade_N;
import model.vo.Student_N;

public interface ImplDatabaseManager_N {
	public Grade_N[] search(String name);
	public boolean add(String name);
	public Student_N modify(String name, String subject, int score);
	public boolean remove(String name);
}
