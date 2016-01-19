/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bishal.academyproject.constant;

/**
 *
 * @author Bishal
 */
public class SQLConstant {
    public final static String COURSE_GETALL="SELECT * FROM " + TableConstant.COURSE_TABLE;
    public final static String COURSE_GETById="SELECT * FROM " + TableConstant.COURSE_TABLE + " WHERE id=?";
    public final static String COURSE_INSERT ="INSERT INTO " + TableConstant.COURSE_TABLE 
                                             + "(name,description,duration,duration_type,fees,status) VALUES(?,?,?,?,?,?)";
    public final static String COURSE_UPDATE ="UPDATE " + TableConstant.COURSE_TABLE 
                                             + " SET name=?,description=?,duration=?,duration_type=?,fees=?,status=?,modified_date=? WHERE id=?";
    public final static String COURSE_DELETE="DELETE FROM " + TableConstant.COURSE_TABLE + " WHERE id=?";
     
    
}
