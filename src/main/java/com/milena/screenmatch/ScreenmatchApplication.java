package com.milena.screenmatch;

import com.milena.screenmatch.principal.Principal;
import com.milena.screenmatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ScreenmatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(com.milena.screenmatch.ScreenmatchApplication.class, args);
	}


}