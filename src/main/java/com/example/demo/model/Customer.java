package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("product_name")
    private String productName;

    private Integer amount;

    @JsonProperty("customer_name")
    private String customerName;

    private Integer status;

    @JsonProperty("transaction_date")
    private Date transactionDate;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("created_on")
    private Date createdOn;
}
