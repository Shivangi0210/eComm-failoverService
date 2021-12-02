package com.ecomm.providerfailover.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomm.providerfailover.entity.FailOverRecords;

@Repository
public interface FailOverRecordRepository extends JpaRepository<FailOverRecords,String> {

}
