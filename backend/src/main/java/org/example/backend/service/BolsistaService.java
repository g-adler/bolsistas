package org.example.backend.service;

import org.example.backend.model.BolsistaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BolsistaService extends JpaRepository<BolsistaEntity, String> {

}
