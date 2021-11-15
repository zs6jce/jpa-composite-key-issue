package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class DemoDataLoader implements CommandLineRunner {

	private final BankAccountRepo bankAccountRepo;
	private final BankAccountTypeRepo bankAccountTypeRepo;
	private final BankNameRepo bankNameRepo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("==== Demo Data Loader - STARTING ====");		

		var bankAcountType = bankAccountTypeRepo.getById("CHQ");
		var bankName = bankNameRepo.getById("BAC");
		
		var newAcc = BankAccount.builder()
				.bankAccountType(bankAcountType)
				.bankName(bankName)
				.bankAccountNumber("DaTst123")
				.clientName("Tony Stark")
				.build();
		
		@SuppressWarnings("unused")
		var savAcc = bankAccountRepo.save(newAcc);
		
		System.out.println("==== Demo Data Loader - END ====");
	}

}
