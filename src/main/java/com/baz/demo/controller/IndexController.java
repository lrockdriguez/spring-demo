package com.baz.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baz.demo.model.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index","/","home"})
	public String index(ModelMap model) {
	//public String index(Map<String ,Object> map ) {
		
		model.addAttribute("titulo","Hola super Luisillo");
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Guicho");
		usuario.setApellido("Rockdriguez");
		usuario.setEmail("luisfina@");
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo","Perfil del usuario: ".concat(usuario.getNombre()));
		
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		
		//List<Usuario> usuarios = Arrays.asList( new Usuario("luiguini","rodriguiño","martinillo"),
			//	new Usuario("paosilla","barrerilla","espinolilla"), new Usuario("damiasini","rodriguiño","barerilla"));
		
		model.addAttribute("titulo","Listado de usuarios ");
		//model.addAttribute("usuarios",usuarios);
		return "listar";
		
		
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> PoblarUsuarios(){
		
		List<Usuario> usuarios = Arrays.asList( new Usuario("luiguini","rodriguiño","martinillo"),
				new Usuario("paosilla","barrerilla","espinolilla"), new Usuario("damiasini","rodriguiño","barerilla"));
		
		return usuarios;
	}

}
