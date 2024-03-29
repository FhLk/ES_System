package com.example.es_system.Entities;

import javax.persistence.*;

@Entity
@Table(name = "attendance")
public class Attendance {
    @EmbeddedId
    private AttendanceId id;

    @MapsId("student")
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "IdStudents", nullable = false)
    private Student Students;

    @MapsId("subject")
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "IdSubject", nullable = false)
    private Subject Subject;

    @Column(name = "OnTime")
    private Integer onTime;

    @Column(name = "Late")
    private Integer late;

    @Column(name = "`Leave`")
    private Integer leave;

    @Column(name = "Absent")
    private Integer absent;

    @Column(name = "Note", length = 500)
    private String note;

    public AttendanceId getId() {
        return id;
    }

    public void setId(AttendanceId id) {
        this.id = id;
    }

    public Student getIdStudents() {
        return Students;
    }

    public void setIdStudents(Student idStudents) {
        this.Students = idStudents;
    }

    public Subject getIdSubject() {
        return Subject;
    }

    public void setIdSubject(Subject idSubject) {
        this.Subject = idSubject;
    }

    public Integer getOnTime() {
        return onTime;
    }

    public void setOnTime(Integer onTime) {
        this.onTime = onTime;
    }

    public Integer getLate() {
        return late;
    }

    public void setLate(Integer late) {
        this.late = late;
    }

    public Integer getLeave() {
        return leave;
    }

    public void setLeave(Integer leave) {
        this.leave = leave;
    }

    public Integer getAbsent() {
        return absent;
    }

    public void setAbsent(Integer absent) {
        this.absent = absent;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}