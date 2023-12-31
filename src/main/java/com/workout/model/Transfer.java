package com.workout.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transfers")
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "debit_account_code", nullable = false)
    @Size(min = 1)
    private String debitAccountCode;

    @NotBlank
    @Column(name = "credit_account_code", nullable = false)
    @Size(min = 1)
    private String creditAccountCode;

    @Column(name = "transfer_amount", nullable = false)
    @Size(min = 1)
    private BigDecimal transferAmount;

    @Column(name = "creation_date", nullable = false)
    @CreatedDate
    private LocalDateTime creationDate;

}
