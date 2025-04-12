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
public class Transaction {

    private Long id;
    private BigDecimal amount;
    private LocalDateTime date;
    private String type; // DEPOSIT, WITHDRAWAL, TRANSFER
    private String description;
    private Account sourceAccount;
    private Account destinationAccount;

    public Transaction(Long id, Account destinationAccount, Account sourceAccount, String description, String type, LocalDateTime date, BigDecimal amount) {
        this.id = id;
        this.destinationAccount = destinationAccount;
        this.sourceAccount = sourceAccount;
        this.description = description;
        this.type = type;
        this.date = date;
        this.amount = amount;// null for DEPOSIT/WITHDRAWAL
    }



}
