/*
 * This file is generated by jOOQ.
*/
package com.vzard.mycms.database.tables.records;


import com.vzard.mycms.database.tables.TeacherCourse;
import com.vzard.mycms.database.tables.interfaces.ITeacherCourse;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TeacherCourseRecord extends UpdatableRecordImpl<TeacherCourseRecord> implements Record5<Long, String, String, Timestamp, Timestamp>, ITeacherCourse {

    private static final long serialVersionUID = 932353707;

    /**
     * Setter for <code>my-cms.teacher_course.id</code>. id
     */
    @Override
    public TeacherCourseRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.teacher_course.id</code>. id
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>my-cms.teacher_course.teacher_num</code>. 教师工号
     */
    @Override
    public TeacherCourseRecord setTeacherNum(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.teacher_course.teacher_num</code>. 教师工号
     */
    @Override
    public String getTeacherNum() {
        return (String) get(1);
    }

    /**
     * Setter for <code>my-cms.teacher_course.course_num</code>. 课程号
     */
    @Override
    public TeacherCourseRecord setCourseNum(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.teacher_course.course_num</code>. 课程号
     */
    @Override
    public String getCourseNum() {
        return (String) get(2);
    }

    /**
     * Setter for <code>my-cms.teacher_course.created_at</code>. 创建时间
     */
    @Override
    public TeacherCourseRecord setCreatedAt(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.teacher_course.created_at</code>. 创建时间
     */
    @Override
    public Timestamp getCreatedAt() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>my-cms.teacher_course.updated_at</code>. 更新时间
     */
    @Override
    public TeacherCourseRecord setUpdatedAt(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.teacher_course.updated_at</code>. 更新时间
     */
    @Override
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TeacherCourse.TEACHER_COURSE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TeacherCourse.TEACHER_COURSE.TEACHER_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TeacherCourse.TEACHER_COURSE.COURSE_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TeacherCourse.TEACHER_COURSE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TeacherCourse.TEACHER_COURSE.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTeacherNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCourseNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherCourseRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherCourseRecord value2(String value) {
        setTeacherNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherCourseRecord value3(String value) {
        setCourseNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherCourseRecord value4(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherCourseRecord value5(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeacherCourseRecord values(Long value1, String value2, String value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ITeacherCourse from) {
        setId(from.getId());
        setTeacherNum(from.getTeacherNum());
        setCourseNum(from.getCourseNum());
        setCreatedAt(from.getCreatedAt());
        setUpdatedAt(from.getUpdatedAt());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITeacherCourse> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TeacherCourseRecord
     */
    public TeacherCourseRecord() {
        super(TeacherCourse.TEACHER_COURSE);
    }

    /**
     * Create a detached, initialised TeacherCourseRecord
     */
    public TeacherCourseRecord(Long id, String teacherNum, String courseNum, Timestamp createdAt, Timestamp updatedAt) {
        super(TeacherCourse.TEACHER_COURSE);

        set(0, id);
        set(1, teacherNum);
        set(2, courseNum);
        set(3, createdAt);
        set(4, updatedAt);
    }
}
