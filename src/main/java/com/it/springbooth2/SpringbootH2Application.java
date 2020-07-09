package com.it.springbooth2;

import com.it.springbooth2.entity.User;
import com.it.springbooth2.repository.UserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootH2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootH2Application.class, args);
    }

    @Bean
    InitializingBean saveData(UserRepository repo){
        return ()->{
            repo.save(new User((long)1, "xiaoming1", "123456"));
            repo.save(new User((long)2, "xiaoming2", "123456"));
            repo.save(new User((long)3, "xiaoming3", "123456"));
            repo.save(new User((long)4, "xiaoming4", "123456"));
        };
    }

}
