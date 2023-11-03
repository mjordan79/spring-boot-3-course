package it.digitalnucleus.springhibernatedemo.dao;

import it.digitalnucleus.springhibernatedemo.entity.Student;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer id);
}
