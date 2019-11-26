package com.viettel.repository;

import com.viettel.model.PackDatas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackDataRepository extends JpaRepository<PackDatas, Integer> {
    public PackDatas findAllById(int Id);
    public PackDatas findAllByTitle(String title);
}
