/*
 * This file is generated by jOOQ.
*/
package com.vzard.educms.database.tables;


import com.vzard.educms.database.EduCms;
import com.vzard.educms.database.Keys;
import com.vzard.educms.database.tables.records.StudentRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Student extends TableImpl<StudentRecord> {

    private static final long serialVersionUID = 2035137366;

    /**
     * The reference instance of <code>edu-cms.student</code>
     */
    public static final Student STUDENT = new Student();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StudentRecord> getRecordType() {
        return StudentRecord.class;
    }

    /**
     * The column <code>edu-cms.student.number</code>. 学号
     */
    public final TableField<StudentRecord, String> NUMBER = createField("number", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "学号");

    /**
     * The column <code>edu-cms.student.name</code>. 姓名
     */
    public final TableField<StudentRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "姓名");

    /**
     * The column <code>edu-cms.student.password</code>. 登录密码
     */
    public final TableField<StudentRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "登录密码");

    /**
     * The column <code>edu-cms.student.gender</code>. 性别
     */
    public final TableField<StudentRecord, String> GENDER = createField("gender", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "性别");

    /**
     * The column <code>edu-cms.student.brithday</code>. 生日
     */
    public final TableField<StudentRecord, String> BRITHDAY = createField("brithday", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "生日");

    /**
     * The column <code>edu-cms.student.address</code>. 地址
     */
    public final TableField<StudentRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "地址");

    /**
     * The column <code>edu-cms.student.phone_number</code>. 电话号码
     */
    public final TableField<StudentRecord, String> PHONE_NUMBER = createField("phone_number", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "电话号码");

    /**
     * Create a <code>edu-cms.student</code> table reference
     */
    public Student() {
        this("student", null);
    }

    /**
     * Create an aliased <code>edu-cms.student</code> table reference
     */
    public Student(String alias) {
        this(alias, STUDENT);
    }

    private Student(String alias, Table<StudentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Student(String alias, Table<StudentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return EduCms.EDU_CMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StudentRecord> getPrimaryKey() {
        return Keys.KEY_STUDENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StudentRecord>> getKeys() {
        return Arrays.<UniqueKey<StudentRecord>>asList(Keys.KEY_STUDENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Student as(String alias) {
        return new Student(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(String name) {
        return new Student(name, null);
    }
}
