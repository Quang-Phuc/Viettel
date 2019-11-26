package com.viettel.service.impl;

import com.viettel.model.PackDatas;
import com.viettel.repository.PackDataRepository;
import com.viettel.service.PackDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PackDataServiceImpl implements PackDataService {
    @Autowired
    private PackDataRepository packDataRepository;
    @Override
    public List<PackDatas> findAllPackDatas() {
        return packDataRepository.findAll();
    }

    @Override
    public PackDatas save(PackDatas packDatas) {
        return packDataRepository.save(packDatas);
    }

    @Override
    public PackDatas update(PackDatas packDatas) {
        return packDataRepository.save(packDatas);
    }

    @Override
    public void deleteById(int Id) {
        packDataRepository.deleteById(Id);
    }

    @Override
    public PackDatas findPackDataById(int Id) {
        return packDataRepository.findAllById(Id);
    }

    @Override
    public PackDatas findPackDatasByTitle(String title) {
        return packDataRepository.findAllByTitle(title);
    }
}
