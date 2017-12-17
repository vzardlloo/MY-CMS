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
public interface IStudent extends Serializable {

    /**
     * Setter for <code>my-cms.student.id</code>.
     */
    public IStudent setId(Integer value);

    /**
     * Getter for <code>my-cms.student.id</code>.
     */
    public Integer getId();

    /**
     * Setter for <code>my-cms.student.number</code>. 学号
     */
    public IStudent setNumber(String value);

    /**
     * Getter for <code>my-cms.student.number</code>. 学号
     */
    public String getNumber();

    /**
     * Setter for <code>my-cms.student.name</code>. 姓名
     */
    public IStudent setName(String value);

    /**
     * Getter for <code>my-cms.student.name</code>. 姓名
     */
    public String getName();

    /**
     * Setter for <code>my-cms.student.password</code>. 密码
     */
    public IStudent setPassword(String value);

    /**
     * Getter for <code>my-cms.student.password</code>. 密码
     */
    public String getPassword();

    /**
     * Setter for <code>my-cms.student.gender</code>. 性别
     */
    public IStudent setGender(String value);

    /**
     * Getter for <code>my-cms.student.gender</code>. 性别
     */
    public String getGender();

    /**
     * Setter for <code>my-cms.student.birthday</code>. 生日
     */
    public IStudent setBirthday(Timestamp value);

    /**
     * Getter for <code>my-cms.student.birthday</code>. 生日
     */
    public Timestamp getBirthday();

    /**
     * Setter for <code>my-cms.student.clbum</code>. 所在班级
     */
    public IStudent setClbum(String value);

    /**
     * Getter for <code>my-cms.student.clbum</code>. 所在班级
     */
    public String getClbum();

    /**
     * Setter for <code>my-cms.student.academy</code>. 所在学院
     */
    public IStudent setAcademy(String value);

    /**
     * Getter for <code>my-cms.student.academy</code>. 所在学院
     */
    public String getAcademy();

    /**
     * Setter for <code>my-cms.student.created_at</code>. 创建时间
     */
    public IStudent setCreatedAt(Timestamp value);

    /**
     * Getter for <code>my-cms.student.created_at</code>. 创建时间
     */
    public Timestamp getCreatedAt();

    /**
     * Setter for <code>my-cms.student.updated_at</code>. 更新时间
     */
    public IStudent setUpdatedAt(Timestamp value);

    /**
     * Getter for <code>my-cms.student.updated_at</code>. 更新时间
     */
    public Timestamp getUpdatedAt();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IStudent
     */
    public void from(com.vzard.mycms.database.tables.interfaces.IStudent from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IStudent
     */
    public <E extends com.vzard.mycms.database.tables.interfaces.IStudent> E into(E into);
}
