/*
 * This file is generated by jOOQ.
*/
package com.vzard.mycms.database.tables.pojos;


import com.vzard.mycms.database.tables.interfaces.ICourse;

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
public class Course implements ICourse {

    private static final long serialVersionUID = -2115548172;

    private Integer   id;
    private String    number;
    private String    name;
    private String    credit;
    private String    period;
    private String techerNum;
    private String    teacher;
    private String    time;
    private String    classroom;
    private Long      maxChoosed;
    private Long      hasChoosed;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Course() {}

    public Course(Course value) {
        this.id = value.id;
        this.number = value.number;
        this.name = value.name;
        this.credit = value.credit;
        this.period = value.period;
        this.techerNum = value.techerNum;
        this.teacher = value.teacher;
        this.time = value.time;
        this.classroom = value.classroom;
        this.maxChoosed = value.maxChoosed;
        this.hasChoosed = value.hasChoosed;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
    }

    public Course(
            Integer id,
            String number,
            String name,
            String credit,
            String period,
            String techerNum,
            String teacher,
            String time,
            String classroom,
            Long maxChoosed,
            Long hasChoosed,
            Timestamp createdAt,
            Timestamp updatedAt
    ) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.credit = credit;
        this.period = period;
        this.techerNum = techerNum;
        this.teacher = teacher;
        this.time = time;
        this.classroom = classroom;
        this.maxChoosed = maxChoosed;
        this.hasChoosed = hasChoosed;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public Course setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public String getNumber() {
        return this.number;
    }

    @Override
    public Course setNumber(String number) {
        this.number = number;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Course setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getCredit() {
        return this.credit;
    }

    @Override
    public Course setCredit(String credit) {
        this.credit = credit;
        return this;
    }

    @Override
    public String getPeriod() {
        return this.period;
    }

    @Override
    public Course setPeriod(String period) {
        this.period = period;
        return this;
    }

    @Override
    public String getTecherNum() {
        return this.techerNum;
    }

    @Override
    public Course setTecherNum(String techerNum) {
        this.techerNum = techerNum;
        return this;
    }

    @Override
    public String getTeacher() {
        return this.teacher;
    }

    @Override
    public Course setTeacher(String teacher) {
        this.teacher = teacher;
        return this;
    }

    @Override
    public String getTime() {
        return this.time;
    }

    @Override
    public Course setTime(String time) {
        this.time = time;
        return this;
    }

    @Override
    public String getClassroom() {
        return this.classroom;
    }

    @Override
    public Course setClassroom(String classroom) {
        this.classroom = classroom;
        return this;
    }

    @Override
    public Long getMaxChoosed() {
        return this.maxChoosed;
    }

    @Override
    public Course setMaxChoosed(Long maxChoosed) {
        this.maxChoosed = maxChoosed;
        return this;
    }

    @Override
    public Long getHasChoosed() {
        return this.hasChoosed;
    }

    @Override
    public Course setHasChoosed(Long hasChoosed) {
        this.hasChoosed = hasChoosed;
        return this;
    }

    @Override
    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public Course setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public Course setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Course (");

        sb.append(id);
        sb.append(", ").append(number);
        sb.append(", ").append(name);
        sb.append(", ").append(credit);
        sb.append(", ").append(period);
        sb.append(", ").append(techerNum);
        sb.append(", ").append(teacher);
        sb.append(", ").append(time);
        sb.append(", ").append(classroom);
        sb.append(", ").append(maxChoosed);
        sb.append(", ").append(hasChoosed);
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
}
