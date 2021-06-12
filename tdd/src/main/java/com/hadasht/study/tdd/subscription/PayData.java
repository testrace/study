package com.hadasht.study.tdd.subscription;

import lombok.*;

import java.time.LocalDate;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
public class PayData {

	private LocalDate firstBillingDate;
	private LocalDate billingDate;
	private int payAmount;

}
