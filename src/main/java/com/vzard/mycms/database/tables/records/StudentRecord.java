/*
 * This file is generated by jOOQ.
*/
package com.vzard.mycms.database.tables.records;


import com.vzard.mycms.database.tables.Student;
import com.vzard.mycms.database.tables.interfaces.IStudent;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class StudentRecord extends UpdatableRecordImpl<StudentRecord> implements Record9<Long, String, String, String, Timestamp, String, String, Timestamp, Timestamp>, IStudent {

    private static final long serialVersionUID = -854959875;

    /**
     * Setter for <code>my-cms.student.number</code>. 学号
     */
    @Override
    public StudentRecord setNumber(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.student.number</code>. 学号
     */
    @Override
    public Long getNumber() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>my-cms.student.name</code>. 姓名
     */
    @Override
    public StudentRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.student.name</code>. 姓名
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>my-cms.student.password</code>. 密码
     */
    @Override
    public StudentRecord setPassword(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.student.password</code>. 密码
     */
    @Override
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>my-cms.student.gender</code>. 性别
     */
    @Override
    public StudentRecord setGender(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.student.gender</code>. 性别
     */
    @Override
    public String getGender() {
        return (String) get(3);
    }

    /**
     * Setter for <code>my-cms.student.birthday</code>. 生日
     */
    @Override
    public StudentRecord setBirthday(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.student.birthday</code>. 生日
     */
    @Override
    public Timestamp getBirthday() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>my-cms.student.clbum</code>. 所在班级
     */
    @Override
    public StudentRecord setClbum(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.student.clbum</code>. 所在班级
     */
    @Override
    public String getClbum() {
        return (String) get(5);
    }

    /**
     * Setter for <code>my-cms.student.academy</code>. 所在学院
     */
    @Override
    public StudentRecord setAcademy(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.student.academy</code>. 所在学院
     */
    @Override
    public String getAcademy() {
        return (String) get(6);
    }

    /**
     * Setter for <code>my-cms.student.created_at</code>. 创建时间
     */
    @Override
    public StudentRecord setCreatedAt(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.student.created_at</code>. 创建时间
     */
    @Override
    public Timestamp getCreatedAt() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>my-cms.student.updated_at</code>. 更新时间
     */
    @Override
    public StudentRecord setUpdatedAt(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>my-cms.student.updated_at</code>. 更新时间
     */
    @Override
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, String, String, Timestamp, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, String, String, Timestamp, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Student.STUDENT.NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Student.STUDENT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Student.STUDENT.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Student.STUDENT.GENDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Student.STUDENT.BIRTHDAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Student.STUDENT.CLBUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Student.STUDENT.ACADEMY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Student.STUDENT.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return Student.STUDENT.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getGender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getBirthday();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getClbum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAcademy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value1(Long value) {
        setNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value3(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value4(String value) {
        setGender(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value5(Timestamp value) {
        setBirthday(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value6(String value) {
        setClbum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value7(String value) {
        setAcademy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value8(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value9(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord values(Long value1, String value2, String value3, String value4, Timestamp value5, String value6, String value7, Timestamp value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IStudent from) {
        setNumber(from.getNumber());
        setName(from.getName());
        setPassword(from.getPassword());
        setGender(from.getGender());
        setBirthday(from.getBirthday());
        setClbum(from.getClbum());
        setAcademy(from.getAcademy());
        setCreatedAt(from.getCreatedAt());
        setUpdatedAt(from.getUpdatedAt());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IStudent> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentRecord
     */
    public StudentRecord() {
        super(Student.STUDENT);
    }

    /**
     * Create a detached, initialised StudentRecord
     */
    public StudentRecord(Long number, String name, String password, String gender, Timestamp birthday, String clbum, String academy, Timestamp createdAt, Timestamp updatedAt) {
        super(Student.STUDENT);

        set(0, number);
        set(1, name);
        set(2, password);
        set(3, gender);
        set(4, birthday);
        set(5, clbum);
        set(6, academy);
        set(7, createdAt);
        set(8, updatedAt);
    }
}