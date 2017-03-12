package ua.beloff.data.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.beloff.data.dao.TeachersDao;
import ua.beloff.data.Teacher;

@Repository
public class HibernateTeacherDao implements TeachersDao{
@Autowired
private SessionFactory sessionFactory;

private Session currentSession(){
return sessionFactory.getCurrentSession();
}
public void addTeacher(Teacher teacher) {
currentSession().save(teacher);
}
public Teacher getTeacherById(int id) {
return (Teacher) currentSession().get(Teacher.class, id);
}
public void saveTacher(Teacher teacher) {
currentSession().update(teacher);
}

}
