package com.titouan.bankapp.domain.model;


import jakarta.transaction.Transaction;
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
public class Account {

    private Long id;
    private String accountNumber;
    private BigDecimal balance;
    private String currency;
    private LocalDateTime createdAt;
    private String status; // ACTIVE, SUSPENDED, CLOSED
    private User user;


}
