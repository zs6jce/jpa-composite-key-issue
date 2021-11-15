package com.example.demo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "BANK_ACCOUNT_TYPES")
public class BankAccountType {

	@Id
	@Column(name = "ACCOUNT_TYPE_ID")
	private String id;

	@Column(name = "ACCOUNT_TYPE_LABEL")
	private String label;

	@OneToMany(mappedBy = "bankAccountType")
	private List<BankAccount> listBankAccounts;
}
