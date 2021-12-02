package com.ecomm.providerfailover.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecomm.providerfailover.dao.FailOverRecordRepository;
import com.ecomm.providerfailover.entity.FailOverRecords;
import com.ecomm.providerfailover.model.InputOrder;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

import javax.annotation.Resource;

@Slf4j
@RestController
public class Controller {
	
	@Autowired
	FailOverRecordRepository repository;

    @PostMapping(value="/provider-failover/create")
    public void callFailoverCreateOrder(InputOrder request){
       log.info("Im a failover service, create order failure");
        
       FailOverRecords record = new FailOverRecords();
       
       record.setOrderId(request.getEmailId());
       record.setErrorMessage("Error in create order");
       record.setFailureTime(LocalDate.now());
       record.setOrderStatus("Failed Record");
       record.setProcessedFlag("N");
       repository.save(record);
    }
    
    @GetMapping(value="/provider-failover/view/{orderId}")
    public void callFailoverVieweOrder(@PathVariable String orderId){
       log.info("Im a failover service, view order failure");
        
       FailOverRecords record = new FailOverRecords();
       
       record.setOrderId(orderId);
       record.setErrorMessage("Error in view record");
       record.setFailureTime(LocalDate.now());
       record.setOrderStatus("Failed Record");
       record.setProcessedFlag("N");
       repository.save(record);
    }
    
    @PutMapping(value="/provider-failover/update/{orderId}")
    public void callFailoverUpdateOrder(@PathVariable String orderId, @RequestBody InputOrder request){
       log.info("Im a failover service, update order failure");
        
       FailOverRecords record = new FailOverRecords();
       
       record.setOrderId(orderId);
       record.setErrorMessage("Error in update record");
       record.setFailureTime(LocalDate.now());
       record.setOrderStatus("Failed Record");
       record.setProcessedFlag("N");
       repository.save(record);
    }
    
    @DeleteMapping(value="/provider-failover/cancel/{orderId}")
    public void callFailoverDeleteeOrder(@PathVariable String orderId){
       log.info("Im a failover service, delete order failure");
        
       FailOverRecords record = new FailOverRecords();
       
       record.setOrderId(orderId);
       record.setErrorMessage("Error in delete record");
       record.setFailureTime(LocalDate.now());
       record.setOrderStatus("Failed Record");
       record.setProcessedFlag("N");
       repository.save(record);
    }
}
