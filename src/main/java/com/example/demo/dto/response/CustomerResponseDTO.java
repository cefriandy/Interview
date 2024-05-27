package com.example.demo.dto.response;

import com.example.demo.model.Customer;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerResponseDTO {

    private List<Customer> data;
    private List<StatusDto> status;
}
