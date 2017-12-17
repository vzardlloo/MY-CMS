/*
 * This file is generated by jOOQ.
*/
package com.vzard.mycms.database.tables;


import com.vzard.mycms.database.Keys;
import com.vzard.mycms.database.MyCms;
import com.vzard.mycms.database.tables.records.GradeRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
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
public class Grade extends TableImpl<GradeRecord> {

    private static final long serialVersionUID = 1319297727;

    /**
     * The reference instance of <code>my-cms.grade</code>
     */
    public static final Grade GRADE = new Grade();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GradeRecord> getRecordType() {
        return GradeRecord.class;
    }

    /**
     * The column <code>my-cms.grade.id</code>. id
     */
    public final TableField<GradeRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "id");

    /**
     * The column <code>my-cms.grade.student_num</code>. 学号
     */
    public final TableField<GradeRecord, String> STUDENT_NUM = createField("student_num", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "学号");

    /**
     * The column <code>my-cms.grade.course_num</code>. 课程号
     */
    public final TableField<GradeRecord, String> COURSE_NUM = createField("course_num", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "课程号");

    /**
     * The column <code>my-cms.grade.pacific_grade</code>. 平时成绩
     */
    public final TableField<GradeRecord, String> PACIFIC_GRADE = createField("pacific_grade", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "平时成绩");

    /**
     * The column <code>my-cms.grade.paper_grade</code>. 卷面成绩
     */
    public final TableField<GradeRecord, String> PAPER_GRADE = createField("paper_grade", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "卷面成绩");

    /**
     * The column <code>my-cms.grade.overall_grade</code>. 总评成绩
     */
    public final TableField<GradeRecord, String> OVERALL_GRADE = createField("overall_grade", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "总评成绩");

    /**
     * The column <code>my-cms.grade.created_at</code>. 创建时间
     */
    public final TableField<GradeRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>my-cms.grade.updated_at</code>. 更新时间
     */
    public final TableField<GradeRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "更新时间");

    /**
     * Create a <code>my-cms.grade</code> table reference
     */
    public Grade() {
        this("grade", null);
    }

    /**
     * Create an aliased <code>my-cms.grade</code> table reference
     */
    public Grade(String alias) {
        this(alias, GRADE);
    }

    private Grade(String alias, Table<GradeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Grade(String alias, Table<GradeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MyCms.MY_CMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GradeRecord, Long> getIdentity() {
        return Keys.IDENTITY_GRADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GradeRecord> getPrimaryKey() {
        return Keys.KEY_GRADE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GradeRecord>> getKeys() {
        return Arrays.<UniqueKey<GradeRecord>>asList(Keys.KEY_GRADE_PRIMARY, Keys.KEY_GRADE_STUDENT_COURSE_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Grade as(String alias) {
        return new Grade(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Grade rename(String name) {
        return new Grade(name, null);
    }
}
