package ua.beloff.data.dao;

import ua.beloff.data.Teacher;

public interface TeachersDao {
void addTeacher(Teacher teacher);
Teacher getTeacherById(int id);
void saveTacher(Teacher teacher);
}

