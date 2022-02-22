package com.nttdata.account.entity;

import com.nttdata.account.model.Holder;
import com.nttdata.account.model.Signatory;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
@Document
public class Account {
    @Id
    private String id;
    private String accountNumber;
    private Double maintenanceFee;
    private int movementLimit;
    private Double balance;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    List<Holder> holders;//titulares
    List<Signatory> signatories;// firmantes

    private String customerId;
    private String productId;
}
