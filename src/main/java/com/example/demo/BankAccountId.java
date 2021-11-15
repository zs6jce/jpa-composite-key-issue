package com.example.demo;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class BankAccountId implements Serializable {

	private BankAccountType bankAccountType;
	private BankName bankName;
	private String bankAccountNumber;
	
//	private String bankAccountTypeId;
//	private String bankNameId;
//	private String bankAccountNumber;
	
	private static final long serialVersionUID = 1L;
}
