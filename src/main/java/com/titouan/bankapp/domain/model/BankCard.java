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
public class BankCard {

    private Long id;
    private String cardNumber;
    private LocalDate expirationDate;
    private String type; // CREDIT, DEBIT
    private String provider; // VISA, MASTERCARD
    private String pinHash;
    private boolean isLocked;
    private Account account;
}
