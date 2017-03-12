package ua.beloff.data.dao;

import ua.beloff.data.Student;

public interface StudentsDao {
	void addStudent(Student student);
	Student getStudentById(int id);
}

