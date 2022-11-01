package com.viagem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.viagem.model.Destino;
import com.viagem.repository.DestinoRepository;

@Controller
@RequestMapping("/destino")
public class DestinoController {
	
	@Autowired
	private DestinoRepository destinoRepository;
	
	@GetMapping
	public ModelAndView listar() {
		
		ModelAndView mv = new ModelAndView ("destino/listar");
		List<Destino> listaDestino = destinoRepository.findAll();
		mv.addObject("destino", listaDestino);
		return mv;
		
	}
	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		
		ModelAndView mv = new ModelAndView("destino/cadastro");
		mv.addObject("destino", new Destino());
		return mv;
		
	}
	@PostMapping("/cadastrar")
    public ModelAndView cadastrar(Destino destino) {
        
        ModelAndView mv = new ModelAndView("redirect:/destino");
    
        destinoRepository.save(destino);

        return mv;
    }
	
	@GetMapping("/{id}")
	public ModelAndView detalhar(@PathVariable Long id) {
		
		ModelAndView mv = new ModelAndView("destino/detalhar");
		Destino destino = destinoRepository.getOne(id);
		mv.addObject("destino", destino);
		
		return mv;
	}
	
	@GetMapping("/{id}/excluir")
	public ModelAndView excluir(@PathVariable Long id) {
		
		ModelAndView mv = new ModelAndView("redirect:/destino");
		destinoRepository.deleteById(id);
		return mv;
	}
	
	@GetMapping("/{id}/editar")
    public ModelAndView editar(@PathVariable Long id){
        ModelAndView mv = new ModelAndView("destino/edicao");

        Destino destino = destinoRepository.getOne(id);
        mv.addObject("destino", destino);
        return mv;
    }
	
	@PostMapping("/{id}/editar")
    public ModelAndView editar(Destino destino) {
		
		ModelAndView mv = new ModelAndView("redirect:/destino");
		destinoRepository.save(destino);
		return mv;
    }

}
