package com.viagem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.viagem.model.Destino;
import com.viagem.model.Passagem;
import com.viagem.repository.ClienteRepository;
import com.viagem.repository.DestinoRepository;
import com.viagem.repository.PassagemRepository;

@Controller
@RequestMapping("/passagem")
public class PassagemController {
	
	@Autowired
	private PassagemRepository passagemRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private DestinoRepository destinoRepository;
	
	@GetMapping
	public ModelAndView listar() {
		
		ModelAndView mv = new ModelAndView ("passagem/listar");
		List<Passagem> listaPassagem = passagemRepository.findAll();
		mv.addObject("passagem", listaPassagem);
		return mv;
	}
	
	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		
		ModelAndView mv = new ModelAndView("passagem/cadastro");
		mv.addObject("passagem", new Passagem());
		return mv;
		
	}
	
	@PostMapping("/cadastrar")
    public ModelAndView cadastrar(Passagem passagem) {
        
        ModelAndView mv = new ModelAndView("redirect:/passagem");
    
        passagemRepository.save(passagem);

        return mv;
    }
	
	}

