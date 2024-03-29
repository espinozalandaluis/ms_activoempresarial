package com.bootcamp.java.activoempresarial.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransationResponseDTO {
    private String id;
    private String idProductClient;
    private TransactionTypeDTO transactionTypeDTO;
    private Double mont;
    private Date registrationDate;
}
