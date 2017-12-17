/*
 * This file is generated by jOOQ.
*/
package com.vzard.mycms.database.tables.interfaces;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IStudentCourse extends Serializable {

    /**
     * Setter for <code>my-cms.student_course.id</code>. id
     */
    public IStudentCourse setId(Long value);

    /**
     * Getter for <code>my-cms.student_course.id</code>. id
     */
    public Long getId();

    /**
     * Setter for <code>my-cms.student_course.student_num</code>. 学号
     */
    public IStudentCourse setStudentNum(String value);

    /**
     * Getter for <code>my-cms.student_course.student_num</code>. 学号
     */
    public String getStudentNum();

    /**
     * Setter for <code>my-cms.student_course.course_num</code>. 课程号
     */
    public IStudentCourse setCourseNum(String value);

    /**
     * Getter for <code>my-cms.student_course.course_num</code>. 课程号
     */
    public String getCourseNum();

    /**
     * Setter for <code>my-cms.student_course.created_at</code>. 创建时间
     */
    public IStudentCourse setCreatedAt(Timestamp value);

    /**
     * Getter for <code>my-cms.student_course.created_at</code>. 创建时间
     */
    public Timestamp getCreatedAt();

    /**
     * Setter for <code>my-cms.student_course.updated_at</code>. 更新时间
     */
    public IStudentCourse setUpdatedAt(Timestamp value);

    /**
     * Getter for <code>my-cms.student_course.updated_at</code>. 更新时间
     */
    public Timestamp getUpdatedAt();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IStudentCourse
     */
    public void from(com.vzard.mycms.database.tables.interfaces.IStudentCourse from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IStudentCourse
     */
    public <E extends com.vzard.mycms.database.tables.interfaces.IStudentCourse> E into(E into);
}
