/*
 * This file is generated by jOOQ.
*/
package com.vzard.mycms.database.tables.interfaces;


import javax.annotation.Generated;
import java.io.Serializable;
import java.sql.Timestamp;


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
public interface IGrade extends Serializable {

    /**
     * Setter for <code>my-cms.grade.id</code>. id
     */
    public IGrade setId(Long value);

    /**
     * Getter for <code>my-cms.grade.id</code>. id
     */
    public Long getId();

    /**
     * Setter for <code>my-cms.grade.student_num</code>. 学号
     */
    public IGrade setStudentNum(String value);

    /**
     * Getter for <code>my-cms.grade.student_num</code>. 学号
     */
    public String getStudentNum();

    /**
     * Setter for <code>my-cms.grade.course_num</code>. 课程号
     */
    public IGrade setCourseNum(String value);

    /**
     * Getter for <code>my-cms.grade.course_num</code>. 课程号
     */
    public String getCourseNum();

    /**
     * Setter for <code>my-cms.grade.course_name</code>. 课程名
     */
    public IGrade setCourseName(String value);

    /**
     * Getter for <code>my-cms.grade.course_name</code>. 课程名
     */
    public String getCourseName();

    /**
     * Setter for <code>my-cms.grade.pacific_grade</code>. 平时成绩
     */
    public IGrade setPacificGrade(String value);

    /**
     * Getter for <code>my-cms.grade.pacific_grade</code>. 平时成绩
     */
    public String getPacificGrade();

    /**
     * Setter for <code>my-cms.grade.paper_grade</code>. 卷面成绩
     */
    public IGrade setPaperGrade(String value);

    /**
     * Getter for <code>my-cms.grade.paper_grade</code>. 卷面成绩
     */
    public String getPaperGrade();

    /**
     * Setter for <code>my-cms.grade.overall_grade</code>. 总评成绩
     */
    public IGrade setOverallGrade(String value);

    /**
     * Getter for <code>my-cms.grade.overall_grade</code>. 总评成绩
     */
    public String getOverallGrade();

    /**
     * Setter for <code>my-cms.grade.created_at</code>. 创建时间
     */
    public IGrade setCreatedAt(Timestamp value);

    /**
     * Getter for <code>my-cms.grade.created_at</code>. 创建时间
     */
    public Timestamp getCreatedAt();

    /**
     * Setter for <code>my-cms.grade.updated_at</code>. 更新时间
     */
    public IGrade setUpdatedAt(Timestamp value);

    /**
     * Getter for <code>my-cms.grade.updated_at</code>. 更新时间
     */
    public Timestamp getUpdatedAt();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IGrade
     */
    public void from(com.vzard.mycms.database.tables.interfaces.IGrade from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IGrade
     */
    public <E extends com.vzard.mycms.database.tables.interfaces.IGrade> E into(E into);
}
