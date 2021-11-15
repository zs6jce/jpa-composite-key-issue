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
@Table(name = "BANK_NAMES")
public class BankName {

	@Id
	@Column(name = "BANK_NAME_ID")
	private String id;

	@Column(name = "BANK_NAME_LABEL")
	private String label;

	@OneToMany(mappedBy = "bankName")
	private List<BankAccount> listBankAccounts;
}
