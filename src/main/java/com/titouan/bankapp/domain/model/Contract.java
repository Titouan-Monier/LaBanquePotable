package com.titouan.bankapp.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data // génère getter/setter + toString + equals/hashCode
@NoArgsConstructor // constructeur vide
@AllArgsConstructor // constructeur avec tous les champs
public class Contract {
    private Long id;
    private String type; // LOAN, SAVINGS, INSURANCE
    private LocalDate startDate;
    private LocalDate endDate;
    private String status; // PENDING, ACTIVE, CLOSED
    private String terms;
    private BigDecimal interestRate;
    private BigDecimal monthlyPayment;
    private User user;
    private Account account;
}
