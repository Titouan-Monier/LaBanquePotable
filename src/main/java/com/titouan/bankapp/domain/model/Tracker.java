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
public class Tracker {
    private Long id;
    private User user;
    private String pageVisited;
    private LocalDateTime timestamp;
    private String sessionId;
    private String ipAddress;
    private String userAgent;

}
