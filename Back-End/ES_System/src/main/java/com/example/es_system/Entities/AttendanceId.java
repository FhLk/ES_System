package com.example.es_system.Entities;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AttendanceId implements Serializable {
    private static final long serialVersionUID = 9107650833124826122L;
    @Column(name = "IdStudents", nullable = false)
    private Integer student;

    @Column(name = "IdSubject", nullable = false, length = 10)
    private String subject;

    public Integer getIdStudents() {
        return student;
    }

    public void setIdStudents(Integer student) {
        this.student = student;
    }

    public String getIdSubject() {
        return subject;
    }

    public void setIdSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AttendanceId entity = (AttendanceId) o;
        return Objects.equals(this.student, entity.student) &&
                Objects.equals(this.subject, entity.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, subject);
    }

}