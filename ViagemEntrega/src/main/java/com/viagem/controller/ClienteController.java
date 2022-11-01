package com.viagem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.viagem.model.Cliente;
import com.viagem.repository.ClienteRepository;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	public ClienteRepository clienteRepository;
	
	@GetMapping
	public ModelAndView listar() {
		
		ModelAndView mv = new ModelAndView("cliente/listar");
		List<Cliente> listaClientes = clienteRepository.findAll();
		mv.addObject("cliente", listaClientes);
		return mv;
	}
	
	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		
		ModelAndView mv = new ModelAndView("cliente/cadastro");
		mv.addObject("cliente", new Cliente());
		return mv;
	}
	
	@PostMapping("/cadastrar")
    public ModelAndView cadastrar(Cliente cliente) {
        
        ModelAndView mv = new ModelAndView("redirect:/cliente");
    
        clienteRepository.save(cliente);

        return mv;
    }
	
	@GetMapping("/{id}")
	public ModelAndView detalhar(@PathVariable Long id) {
		
		ModelAndView mv = new ModelAndView("cliente/detalhar");
		Cliente cliente = clienteRepository.getOne(id);
		mv.addObject("cliente", cliente);
		
		return mv;
	}
	
	@GetMapping("/{id}/excluir")
	public ModelAndView excluir(@PathVariable Long id) {
		
		ModelAndView mv = new ModelAndView("redirect:/cliente");
		clienteRepository.deleteById(id);
		return mv;
	}
	
	@GetMapping("/{id}/editar")
    public ModelAndView editar(@PathVariable Long id){
        ModelAndView mv = new ModelAndView("cliente/edicao");

        Cliente cliente = clienteRepository.getOne(id);
        mv.addObject("cliente", cliente);

        return mv;
    }
	
	@PostMapping("/{id}/editar")
    public ModelAndView editar(Cliente cliente) {
		
		ModelAndView mv = new ModelAndView("redirect:/cliente");
		clienteRepository.save(cliente);
		return mv;
    }

}
