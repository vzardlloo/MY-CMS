/*
 * This file is generated by jOOQ.
*/
package com.vzard.mycms.database.tables.records;


import com.vzard.mycms.database.tables.Course;
import com.vzard.mycms.database.tables.interfaces.ICourse;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;

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
public class CourseRecord extends UpdatableRecordImpl<CourseRecord> implements Record13<Integer, String, String, String, String, String, String, String, String, Long, Long, Timestamp, Timestamp>, ICourse {

    private static final long serialVersionUID = -1156156024;

    /**
     * Setter for <code>my-cms.course.id</code>.
     */
    @Override
    public CourseRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.course.id</code>.
     */
    @Override
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>my-cms.course.number</code>. 课程号
     */
    @Override
    public CourseRecord setNumber(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.course.number</code>. 课程号
     */
    @Override
    public String getNumber() {
        return (String) get(1);
    }

    /**
     * Setter for <code>my-cms.course.name</code>. 课程名称
     */
    @Override
    public CourseRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.course.name</code>. 课程名称
     */
    @Override
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>my-cms.course.credit</code>. 学分
     */
    @Override
    public CourseRecord setCredit(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.course.credit</code>. 学分
     */
    @Override
    public String getCredit() {
        return (String) get(3);
    }

    /**
     * Setter for <code>my-cms.course.period</code>. 学时
     */
    @Override
    public CourseRecord setPeriod(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.course.period</code>. 学时
     */
    @Override
    public String getPeriod() {
        return (String) get(4);
    }

    /**
     * Setter for <code>my-cms.course.techer_num</code>. 教师工号
     */
    @Override
    public CourseRecord setTecherNum(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.course.techer_num</code>. 教师工号
     */
    @Override
    public String getTecherNum() {
        return (String) get(5);
    }

    /**
     * Setter for <code>my-cms.course.teacher</code>. 任课教师
     */
    @Override
    public CourseRecord setTeacher(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.course.teacher</code>. 任课教师
     */
    @Override
    public String getTeacher() {
        return (String) get(6);
    }

    /**
     * Setter for <code>my-cms.course.time</code>. 上课时间
     */
    @Override
    public CourseRecord setTime(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.course.time</code>. 上课时间
     */
    @Override
    public String getTime() {
        return (String) get(7);
    }

    /**
     * Setter for <code>my-cms.course.classroom</code>. 上课教室
     */
    @Override
    public CourseRecord setClassroom(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.course.classroom</code>. 上课教室
     */
    @Override
    public String getClassroom() {
        return (String) get(8);
    }

    /**
     * Setter for <code>my-cms.course.max_choosed</code>. 最大容量
     */
    @Override
    public CourseRecord setMaxChoosed(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.course.max_choosed</code>. 最大容量
     */
    @Override
    public Long getMaxChoosed() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>my-cms.course.has_choosed</code>. 已选人数
     */
    @Override
    public CourseRecord setHasChoosed(Long value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.course.has_choosed</code>. 已选人数
     */
    @Override
    public Long getHasChoosed() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>my-cms.course.created_at</code>. 创建时间
     */
    @Override
    public CourseRecord setCreatedAt(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.course.created_at</code>. 创建时间
     */
    @Override
    public Timestamp getCreatedAt() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>my-cms.course.updated_at</code>. 更新时间
     */
    @Override
    public CourseRecord setUpdatedAt(Timestamp value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.course.updated_at</code>. 更新时间
     */
    @Override
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, String, String, String, String, String, String, Long, Long, Timestamp, Timestamp> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, String, String, String, String, String, String, Long, Long, Timestamp, Timestamp> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Course.COURSE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Course.COURSE.NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Course.COURSE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Course.COURSE.CREDIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Course.COURSE.PERIOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Course.COURSE.TECHER_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Course.COURSE.TEACHER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Course.COURSE.TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Course.COURSE.CLASSROOM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return Course.COURSE.MAX_CHOOSED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return Course.COURSE.HAS_CHOOSED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return Course.COURSE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return Course.COURSE.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCredit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTecherNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTeacher();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getClassroom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getMaxChoosed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getHasChoosed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord value2(String value) {
        setNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord value4(String value) {
        setCredit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord value5(String value) {
        setPeriod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord value6(String value) {
        setTecherNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord value7(String value) {
        setTeacher(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord value8(String value) {
        setTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord value9(String value) {
        setClassroom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord value10(Long value) {
        setMaxChoosed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord value11(Long value) {
        setHasChoosed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord value12(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord value13(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, Long value10, Long value11, Timestamp value12, Timestamp value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ICourse from) {
        setId(from.getId());
        setNumber(from.getNumber());
        setName(from.getName());
        setCredit(from.getCredit());
        setPeriod(from.getPeriod());
        setTecherNum(from.getTecherNum());
        setTeacher(from.getTeacher());
        setTime(from.getTime());
        setClassroom(from.getClassroom());
        setMaxChoosed(from.getMaxChoosed());
        setHasChoosed(from.getHasChoosed());
        setCreatedAt(from.getCreatedAt());
        setUpdatedAt(from.getUpdatedAt());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ICourse> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CourseRecord
     */
    public CourseRecord() {
        super(Course.COURSE);
    }

    /**
     * Create a detached, initialised CourseRecord
     */
    public CourseRecord(Integer id, String number, String name, String credit, String period, String techerNum, String teacher, String time, String classroom, Long maxChoosed, Long hasChoosed, Timestamp createdAt, Timestamp updatedAt) {
        super(Course.COURSE);

        set(0, id);
        set(1, number);
        set(2, name);
        set(3, credit);
        set(4, period);
        set(5, techerNum);
        set(6, teacher);
        set(7, time);
        set(8, classroom);
        set(9, maxChoosed);
        set(10, hasChoosed);
        set(11, createdAt);
        set(12, updatedAt);
    }
}
