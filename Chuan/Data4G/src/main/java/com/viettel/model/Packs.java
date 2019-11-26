package com.viettel.model;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class Packs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String detail;
    @OneToMany
    @JoinColumn(name = "packDataId")
    private List<PackDatas> travelContents = new ArrayList<>();
}
