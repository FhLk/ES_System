package com.example.es_system.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @Column(name = "IdSubject", nullable = false, length = 10)
    private String id;

    @Column(name = "NameSubject", length = 50)
    private String nameSubject;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "Subject")
    List<Attendance> test;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

}