package com.deploy.praktikum2.repository;

import com.deploy.praktikum2.model.entity.KtpEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KtpRepository extends JpaRepository<KtpEntity, Integer> {


    boolean existsByNomorKtp(String nomorKtp);


    Optional<KtpEntity> findByNomorKtp(String nomorKtp);
}
