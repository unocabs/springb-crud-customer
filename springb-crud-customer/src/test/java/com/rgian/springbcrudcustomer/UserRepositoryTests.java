package com.rgian.springbcrudcustomer;

import com.rgian.springbcrudcustomer.entity.UserEntity;
import com.rgian.springbcrudcustomer.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
@AllArgsConstructor
@Data
public class UserRepositoryTests {
    private final UserRepository userRepository;

    @Test
    public void testAddNew() {
        UserEntity userEntity = new UserEntity();

        userEntity.setEmail("giancabrera@gmail.com");
        userEntity.setPassword("0000");
        userEntity.setFirstName("Gian");
        userEntity.setLastName("Cabrera");

        UserEntity savedUser = userRepository.save(userEntity);
        Assertions.assertThat(savedUser).isNotNull();
        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);
    }
}
