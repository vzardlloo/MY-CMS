/*
 * This file is generated by jOOQ.
*/
package com.vzard.educms.database.tables.records;


import com.vzard.educms.database.tables.Student;
import com.vzard.educms.database.tables.interfaces.IStudent;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


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
public class StudentRecord extends TableRecordImpl<StudentRecord> implements Record7<String, String, String, String, String, String, String>, IStudent {

    private static final long serialVersionUID = -1016186679;

    /**
     * Setter for <code>edu-cms.student.number</code>. 学号
     */
    @Override
    public StudentRecord setNumber(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>edu-cms.student.number</code>. 学号
     */
    @Override
    public String getNumber() {
        return (String) get(0);
    }

    /**
     * Setter for <code>edu-cms.student.name</code>. 姓名
     */
    @Override
    public StudentRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>edu-cms.student.name</code>. 姓名
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>edu-cms.student.password</code>. 登录密码
     */
    @Override
    public StudentRecord setPassword(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>edu-cms.student.password</code>. 登录密码
     */
    @Override
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>edu-cms.student.gender</code>. 性别
     */
    @Override
    public StudentRecord setGender(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>edu-cms.student.gender</code>. 性别
     */
    @Override
    public String getGender() {
        return (String) get(3);
    }

    /**
     * Setter for <code>edu-cms.student.brithday</code>. 生日
     */
    @Override
    public StudentRecord setBrithday(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>edu-cms.student.brithday</code>. 生日
     */
    @Override
    public String getBrithday() {
        return (String) get(4);
    }

    /**
     * Setter for <code>edu-cms.student.address</code>. 地址
     */
    @Override
    public StudentRecord setAddress(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>edu-cms.student.address</code>. 地址
     */
    @Override
    public String getAddress() {
        return (String) get(5);
    }

    /**
     * Setter for <code>edu-cms.student.phone_number</code>. 电话号码
     */
    @Override
    public StudentRecord setPhoneNumber(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>edu-cms.student.phone_number</code>. 电话号码
     */
    @Override
    public String getPhoneNumber() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
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
    public Field<String> field5() {
        return Student.STUDENT.BRITHDAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Student.STUDENT.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Student.STUDENT.PHONE_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
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
    public String value5() {
        return getBrithday();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPhoneNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value1(String value) {
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
    public StudentRecord value5(String value) {
        setBrithday(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value6(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value7(String value) {
        setPhoneNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
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
        setBrithday(from.getBrithday());
        setAddress(from.getAddress());
        setPhoneNumber(from.getPhoneNumber());
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
    public StudentRecord(String number, String name, String password, String gender, String brithday, String address, String phoneNumber) {
        super(Student.STUDENT);

        set(0, number);
        set(1, name);
        set(2, password);
        set(3, gender);
        set(4, brithday);
        set(5, address);
        set(6, phoneNumber);
    }
}