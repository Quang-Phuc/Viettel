package com.viettel.model;

import org.springframework.data.annotation.Id;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PackDatas {
    @Id
    private int id;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    private String title;
    private String description;
    private String detail;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "packDataId")
    private Packs packs;

}
