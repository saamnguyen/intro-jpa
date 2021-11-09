package com.kitclub.introjpa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "HANG")
public class Hang {
    @Id
    private Integer id;

    @Column(name = "NAME", nullable = false, length = 250)
    private String name;
}
