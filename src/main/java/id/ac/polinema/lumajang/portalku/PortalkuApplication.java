package id.ac.polinema.lumajang.portalku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "id.ac.polinema.lumajang.portalku.halo")
public class PortalkuApplication {
    public static void main(String[] args) {
        SpringApplication.run(PortalkuApplication.class, args);
    }
}