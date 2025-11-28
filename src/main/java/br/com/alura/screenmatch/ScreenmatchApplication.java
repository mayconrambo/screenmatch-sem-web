package br.com.alura.screenmatch;

import br.com.alura.screenmatch.principal.Principal;
import org.jspecify.annotations.NullMarked;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
    }

    @Override
    @NullMarked
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        principal.exibirMenu();
    }
}
