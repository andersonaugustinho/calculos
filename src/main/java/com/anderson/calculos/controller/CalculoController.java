package com.anderson.calculos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculo")
public class CalculoController {

	@GetMapping("/converterPolegadaCentrimetro/{polegada}")
	public ResponseEntity<Double> converterPolegadaCentrimetro(@PathVariable Double polegada) {
		return ResponseEntity.ok(polegada * 2.54);
	}
	
	@GetMapping("/converterCentrimetroPolegada/{centimetro}")
	public ResponseEntity<Double> converterCentrimetroPolegada(@PathVariable Double centimetro) {
		return ResponseEntity.ok(centimetro / 2.54);
	}
	
}
