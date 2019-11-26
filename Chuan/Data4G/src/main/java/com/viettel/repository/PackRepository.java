package com.viettel.repository;

import com.viettel.model.Packs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackRepository extends JpaRepository<Packs, Integer> {
    Packs findAllById(int Id);
    Packs findAllByTitle(String title);
}
