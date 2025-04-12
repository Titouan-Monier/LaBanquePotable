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
public class SecurityAlert {
    private Long id;
    private String type; // UNUSUAL_LOCATION, HIGH_VALUE_TX, etc.
    private String message;
    private LocalDateTime timestamp;
    private User user;

}
