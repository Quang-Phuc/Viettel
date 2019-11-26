package com.viettel.service;

import com.viettel.model.PackDatas;

import java.util.List;

public interface PackDataService {
    List<PackDatas> findAllPackDatas();
    PackDatas save(PackDatas packDatas);

    PackDatas update(PackDatas packDatas);

    public void deleteById(int Id);

    public PackDatas findPackDataById(int Id);

    PackDatas findPackDatasByTitle(String title);

}
