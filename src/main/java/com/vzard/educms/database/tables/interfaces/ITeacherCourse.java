/*
 * This file is generated by jOOQ.
*/
package com.vzard.educms.database.tables.interfaces;


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
public interface ITeacherCourse extends Serializable {

    /**
     * Setter for <code>edu-cms.teacher_course.id</code>.
     */
    public ITeacherCourse setId(Long value);

    /**
     * Getter for <code>edu-cms.teacher_course.id</code>.
     */
    public Long getId();

    /**
     * Setter for <code>edu-cms.teacher_course.teacher_number</code>.
     */
    public ITeacherCourse setTeacherNumber(String value);

    /**
     * Getter for <code>edu-cms.teacher_course.teacher_number</code>.
     */
    public String getTeacherNumber();

    /**
     * Setter for <code>edu-cms.teacher_course.course_number</code>.
     */
    public ITeacherCourse setCourseNumber(String value);

    /**
     * Getter for <code>edu-cms.teacher_course.course_number</code>.
     */
    public String getCourseNumber();

    /**
     * Setter for <code>edu-cms.teacher_course.created_at</code>.
     */
    public ITeacherCourse setCreatedAt(Timestamp value);

    /**
     * Getter for <code>edu-cms.teacher_course.created_at</code>.
     */
    public Timestamp getCreatedAt();

    /**
     * Setter for <code>edu-cms.teacher_course.updated_at</code>.
     */
    public ITeacherCourse setUpdatedAt(Timestamp value);

    /**
     * Getter for <code>edu-cms.teacher_course.updated_at</code>.
     */
    public Timestamp getUpdatedAt();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ITeacherCourse
     */
    public void from(com.vzard.educms.database.tables.interfaces.ITeacherCourse from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ITeacherCourse
     */
    public <E extends com.vzard.educms.database.tables.interfaces.ITeacherCourse> E into(E into);
}
