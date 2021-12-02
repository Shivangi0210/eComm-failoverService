package com.ecomm.providerfailover.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FailOverRecords {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String recordId;
	
	private String orderId;
	private String orderStatus;
	private String errorMessage;
	private String processedFlag;
	private LocalDate failureTime;
	

}
