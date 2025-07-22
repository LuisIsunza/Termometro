package com.termometro;

import com.termometro.util.Convertir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TermometroApplication {

	public static void main(String[] args) {
		SpringApplication.run(TermometroApplication.class, args);
	}

	@Autowired
	private Convertir convertir;

	@GetMapping ("/convertidor/farenheit/celsius/{farenheit}")
	public ResponseEntity<Double> convierteFarenheitCelsius(@PathVariable double farenheit) {
		Double valor = convertir.convierteFarenheitCelsius(farenheit);

		return new ResponseEntity<>(valor, HttpStatus.OK);
	}

	@GetMapping ("/convertidor/celsius/farenheit/{celsius}")
	public ResponseEntity<Double> convierteCelsiusFarenheit(@PathVariable double celsius) {
		double valor = convertir.convierteCelsiusFarenheit(celsius);

		return new ResponseEntity<>(valor, HttpStatus.OK);
	}
}
