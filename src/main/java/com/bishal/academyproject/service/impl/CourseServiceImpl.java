/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bishal.academyproject.service.impl;

import com.bishal.academyproject.dao.CourseDAO;
import com.bishal.academyproject.entity.Course;
import com.bishal.academyproject.service.CourseService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bishal
 */
@Service(value = "CourseService")
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDAO courseDAO;
    @Override
    public List<Course> getAll() throws SQLException {
        return courseDAO.getAll();
    }

    @Override
    public int insert(Course c) throws SQLException {
        return courseDAO.insert(c);
    }

    @Override
    public int update(Course c) throws SQLException {
        return courseDAO.update(c);
    }

    @Override
    public int delete(int id) throws SQLException {
        return courseDAO.delete(id);
    }

    @Override
    public Course getById(int id) throws SQLException {
        return courseDAO.getById(id);
    }
    
}
