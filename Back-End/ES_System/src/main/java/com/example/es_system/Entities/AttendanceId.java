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
    private Integer idStudents;

    @Column(name = "IdSubject", nullable = false, length = 10)
    private String idSubject;

    public Integer getIdStudents() {
        return idStudents;
    }

    public void setIdStudents(Integer idStudents) {
        this.idStudents = idStudents;
    }

    public String getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AttendanceId entity = (AttendanceId) o;
        return Objects.equals(this.idStudents, entity.idStudents) &&
                Objects.equals(this.idSubject, entity.idSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStudents, idSubject);
    }

}