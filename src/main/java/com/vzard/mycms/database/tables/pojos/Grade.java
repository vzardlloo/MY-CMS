/*
 * This file is generated by jOOQ.
*/
package com.vzard.mycms.database.tables.pojos;


import com.vzard.mycms.database.tables.interfaces.IGrade;

import javax.annotation.Generated;
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
public class Grade implements IGrade {

    private static final long serialVersionUID = -2141532506;

    private Long      id;
    private String    studentNum;
    private String    courseNum;
    private String    courseName;
    private String    pacificGrade;
    private String    paperGrade;
    private String    overallGrade;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Grade() {}

    public Grade(Grade value) {
        this.id = value.id;
        this.studentNum = value.studentNum;
        this.courseNum = value.courseNum;
        this.courseName = value.courseName;
        this.pacificGrade = value.pacificGrade;
        this.paperGrade = value.paperGrade;
        this.overallGrade = value.overallGrade;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
    }

    public Grade(
            Long id,
            String studentNum,
            String courseNum,
            String courseName,
            String pacificGrade,
            String paperGrade,
            String overallGrade,
            Timestamp createdAt,
            Timestamp updatedAt
    ) {
        this.id = id;
        this.studentNum = studentNum;
        this.courseNum = courseNum;
        this.courseName = courseName;
        this.pacificGrade = pacificGrade;
        this.paperGrade = paperGrade;
        this.overallGrade = overallGrade;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public Grade setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public String getStudentNum() {
        return this.studentNum;
    }

    @Override
    public Grade setStudentNum(String studentNum) {
        this.studentNum = studentNum;
        return this;
    }

    @Override
    public String getCourseNum() {
        return this.courseNum;
    }

    @Override
    public Grade setCourseNum(String courseNum) {
        this.courseNum = courseNum;
        return this;
    }

    @Override
    public String getCourseName() {
        return this.courseName;
    }

    @Override
    public Grade setCourseName(String courseName) {
        this.courseName = courseName;
        return this;
    }

    @Override
    public String getPacificGrade() {
        return this.pacificGrade;
    }

    @Override
    public Grade setPacificGrade(String pacificGrade) {
        this.pacificGrade = pacificGrade;
        return this;
    }

    @Override
    public String getPaperGrade() {
        return this.paperGrade;
    }

    @Override
    public Grade setPaperGrade(String paperGrade) {
        this.paperGrade = paperGrade;
        return this;
    }

    @Override
    public String getOverallGrade() {
        return this.overallGrade;
    }

    @Override
    public Grade setOverallGrade(String overallGrade) {
        this.overallGrade = overallGrade;
        return this;
    }

    @Override
    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public Grade setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public Grade setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Grade (");

        sb.append(id);
        sb.append(", ").append(studentNum);
        sb.append(", ").append(courseNum);
        sb.append(", ").append(courseName);
        sb.append(", ").append(pacificGrade);
        sb.append(", ").append(paperGrade);
        sb.append(", ").append(overallGrade);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IGrade from) {
        setId(from.getId());
        setStudentNum(from.getStudentNum());
        setCourseNum(from.getCourseNum());
        setCourseName(from.getCourseName());
        setPacificGrade(from.getPacificGrade());
        setPaperGrade(from.getPaperGrade());
        setOverallGrade(from.getOverallGrade());
        setCreatedAt(from.getCreatedAt());
        setUpdatedAt(from.getUpdatedAt());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IGrade> E into(E into) {
        into.from(this);
        return into;
    }
}
