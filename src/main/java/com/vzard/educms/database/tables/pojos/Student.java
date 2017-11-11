/*
 * This file is generated by jOOQ.
*/
package com.vzard.educms.database.tables.pojos;


import com.vzard.educms.database.tables.interfaces.IStudent;

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
public class Student implements IStudent {

    private static final long serialVersionUID = 1013602539;

    private String number;
    private String name;
    private String password;
    private String gender;
    private String brithday;
    private String address;
    private String phoneNumber;

    public Student() {}

    public Student(Student value) {
        this.number = value.number;
        this.name = value.name;
        this.password = value.password;
        this.gender = value.gender;
        this.brithday = value.brithday;
        this.address = value.address;
        this.phoneNumber = value.phoneNumber;
    }

    public Student(
        String number,
        String name,
        String password,
        String gender,
        String brithday,
        String address,
        String phoneNumber
    ) {
        this.number = number;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.brithday = brithday;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getNumber() {
        return this.number;
    }

    @Override
    public Student setNumber(String number) {
        this.number = number;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Student setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public Student setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public Student setGender(String gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public String getBrithday() {
        return this.brithday;
    }

    @Override
    public Student setBrithday(String brithday) {
        this.brithday = brithday;
        return this;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public Student setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public Student setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Student (");

        sb.append(number);
        sb.append(", ").append(name);
        sb.append(", ").append(password);
        sb.append(", ").append(gender);
        sb.append(", ").append(brithday);
        sb.append(", ").append(address);
        sb.append(", ").append(phoneNumber);

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
}