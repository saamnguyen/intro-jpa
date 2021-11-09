package com.kitclub.introjpa.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CA_PHE")
public class CaPhe {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id; //Doi tuong id

    @Column(name = "NAME", nullable = false, length = 300)
    private String name;

    //Tao khoa ngoai
    @ManyToOne
    @JoinColumn(name = "hangId")
    private Hang hang;
}
