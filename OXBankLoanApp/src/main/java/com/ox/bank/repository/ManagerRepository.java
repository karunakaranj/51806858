package com.ox.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ox.bank.entity.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long>{

}
