package com.rgian.springbcrudcustomer.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    @Column(nullable = false, unique = true, length = 45)
    public String email;
    @Column(nullable = false, length = 15)
    public String password;
    @Column(nullable = false, length = 45, name = "first_name")
    public String firstName;
    @Column(nullable = false, length = 45, name = "last_name")
    public String lastName;
}
