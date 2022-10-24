package com.site.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.site.model.Compra;
import com.site.repositorio.CompraRepositorio;




@Controller
public class CompraController {
	
	@Autowired
	public CompraRepositorio compraRepositorio;
	
	@GetMapping("/compras")
	public ModelAndView compra() {
		
		List<Compra> compras = this.compraRepositorio.findAll();
		
		ModelAndView mv = new ModelAndView("compras/index");
		mv.addObject("compras", compras);
		return mv;
	}
	
	@GetMapping("/compras/new")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("compras/new");
		mv.addObject("compras", new Compra());
		return mv;
	}
	@PostMapping("/compras")
	public ModelAndView criar(Compra compra) {
		
		this.compraRepositorio.save(compra);
		return new ModelAndView("redirect:/compras");
		
	}

}
