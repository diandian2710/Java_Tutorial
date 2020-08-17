package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
    BigDecimal principle;
    BigDecimal interest;
    public SimpleInterestCalculator(String principle, String interest){
        this.principle = new BigDecimal(principle);
        this.interest = new BigDecimal(interest).divide(new BigDecimal("100"));

    }

    public BigDecimal calculateTotalValue(int noOfYears){
        //Total Value = principle + principle * interest * noOfYears;
        BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
       BigDecimal totalValue = principle.add(
                principle.multiply(interest)
                        .multiply(noOfYearsBigDecimal));
        return totalValue;
    }


}

