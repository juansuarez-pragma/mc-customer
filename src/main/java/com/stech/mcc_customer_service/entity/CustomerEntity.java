package com.stech.mcc_customer_service.entity;

import com.stech.mcc_customer_service.dto.CustomerDTO;
import com.stech.mcc_customer_service.util.IMapper;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_customer")
@Data
@NoArgsConstructor
public class CustomerEntity implements IMapper<CustomerDTO> {

    private static final long serialVersionID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false, length = 60)
    private String id;
    @Column(name = "cu", nullable = false, length = 20, unique = true)
    private String cu;
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    @Column(name = "address", nullable = false, length = 150)
    private String address;
    @Column(name = "email", nullable = false, length = 100)
    private String email;
    @Column(name = "mobile", nullable = false, length = 9)
    private String mobile;


    @Override
    public CustomerDTO getDto() {
        return CustomerDTO.builder()
                .id(id)
                .cu(cu)
                .name(name)
                .address(address)
                .email(email)
                .mobile(mobile)
                .build();
    }

    @Override
    public void setData(CustomerDTO customerDTO) {
        this.id = customerDTO.getId();
        this.cu = customerDTO.getCu();
        this.name = customerDTO.getName();
        this.address = customerDTO.getAddress();
        this.email = customerDTO.getEmail();
        this.mobile = customerDTO.getMobile();
    }
}
