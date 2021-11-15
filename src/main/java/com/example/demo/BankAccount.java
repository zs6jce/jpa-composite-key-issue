package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "CLIENTS_BANK_ACOUNTS")
@IdClass(BankAccountId.class)
public class BankAccount {

//	@EmbeddedId
//	private BankAccountId bankAccountId;

//	@MapsId("bankAccountTypeId")
	@Id
	@ManyToOne
	@JoinColumn(name = "CLIENT_ACCOUNT_TYPE_ID",
		referencedColumnName = "ACCOUNT_TYPE_ID",
		nullable = false, updatable = false)
	private BankAccountType bankAccountType;
	
//	@MapsId("bankNameId")
	@Id
	@ManyToOne
	@JoinColumn(name = "CLIENT_BANK_NAME_ID",
		referencedColumnName = "BANK_NAME_ID",
		nullable = false, updatable = false)
	private BankName bankName;
	
	@Id
	private String bankAccountNumber;
	
	private String clientName;

}
