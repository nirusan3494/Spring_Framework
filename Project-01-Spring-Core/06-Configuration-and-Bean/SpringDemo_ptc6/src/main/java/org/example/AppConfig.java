package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

        @Bean
        public CPU cpu(){
            System.out.println("CPU Bean Created");
            return new CPU();
        }

        @Bean
        public Motherboard motherboard(){
            System.out.println("Motherboard Bean Created");
            return new Motherboard(cpu());
        }
        @Bean
        public Computer computer(){
            System.out.println("Computer Bean Created");
            return new Computer(motherboard());
        }
}
