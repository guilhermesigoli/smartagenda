package br.com.smartagenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class ApplicationStart {
    public static void main(String[] args){
        SpringApplication.run(ApplicationStart.class, args);
    }
}
