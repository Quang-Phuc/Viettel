package com.viettel.service.impl;

import com.viettel.model.Packs;
import com.viettel.repository.PackRepository;
import com.viettel.service.PackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PackServiceImpl implements PackService {
    @Autowired
    private PackRepository packRepository;
    @Override
    public List<Packs> findAllPack() {
        return packRepository.findAll();
    }

    @Override
    public Packs save(Packs packs) {
        return packRepository.save(packs);
    }

    @Override
    public Packs update(Packs packs) {
        return packRepository.save(packs);
    }

    @Override
    public void deleteById(int Id) {
        packRepository.deleteById(Id);
    }

    @Override
    public Packs findPackById(int Id) {
        return packRepository.findAllById(Id);
    }

    @Override
    public Packs findPackByTitle(String title) {
        return packRepository.findAllByTitle(title);
    }
}
