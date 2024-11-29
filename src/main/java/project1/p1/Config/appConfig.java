
package project1.p1.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import project1.p1.Controller.itemController;
import project1.p1.Repository.itemRepository;
import project1.p1.Repository.itemRepository2;
import project1.p1.Repository.repository;
import project1.p1.Service.itemService;
import project1.p1.Service.itemService2;
import project1.p1.Service.service;

@Configuration
public class appConfig {

    @Bean
    public service service() {
        return new itemService2(repository());
    }
    @Bean
    public repository repository() {
        return new itemRepository2();
    }
    @Bean
    public itemController itemController() {
        return new itemController(service());
    }
    @Bean
    public itemService itemService() {
        return new itemService(repository());
    }

    @Bean
    public itemService2 itemService2() {
        return new itemService2(repository());
    }

}