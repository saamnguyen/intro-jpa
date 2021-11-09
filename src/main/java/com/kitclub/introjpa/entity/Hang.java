package com.kitclub.introjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HANG")
public class Hang {
    @Id
    private Integer id;

    @Column(name = "NAME", nullable = false, length = 250)
    private String name;
}
