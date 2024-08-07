package br.com.on.fiap.hackaton.soat.repository;

import br.com.on.fiap.hackaton.soat.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long> { }
