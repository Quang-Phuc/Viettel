package com.viettel.service;

import com.viettel.model.Packs;

import java.util.List;

public interface PackService {
    List<Packs> findAllPack();
    Packs save(Packs packs);

    Packs update(Packs packs);

    public void deleteById(int Id);

    public Packs findPackById(int Id);

    Packs findPackByTitle(String title);
}
