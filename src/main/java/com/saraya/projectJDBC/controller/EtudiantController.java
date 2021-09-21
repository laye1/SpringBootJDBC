package com.saraya.projectJDBC.controller;

import java.sql.SQLException;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.saraya.projectJDBC.model.Etudiant;
import com.saraya.projectJDBC.service.EtudiantService;

 

@Controller
public class EtudiantController {
	
	@Autowired
	EtudiantService etudService;
	Etudiant etud;
	
	
	
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String showEtud(ModelMap model) {
		
		model.addAttribute("etudiant", etudService.listEtudiant() );
		return "listEtud";
		
	}
	
	@RequestMapping(value="/formEtud", method=RequestMethod.GET)
	public String formEtud(ModelMap model) {
		
		
		return "addEtudiant";
		
	}
	

	@RequestMapping(value="/addEtud", method=RequestMethod.POST)
	public String createEtud(ModelMap model,@RequestParam String nom,@RequestParam String prenom,
			@RequestParam int age,@RequestParam String niveau) throws SQLException {
		
		  Etudiant etud = new Etudiant(nom,prenom,age,niveau);
		  etudService.addEtudiants(etud);    
		
		  return "redirect:/list";
		
	}
	
	
	@RequestMapping(value="/updateEtud", method=RequestMethod.GET)
	public String etudUpdate(ModelMap model,@RequestParam int id) {
		
		model.addAttribute("etud",etudService.findById(id));
		return "updateEtud";
		
	}
	
	@RequestMapping(value="/updateEtud", method=RequestMethod.POST)
	public String updateEtud(ModelMap model,@ModelAttribute("Etudiant") Etudiant etud ,@RequestParam int id,@RequestParam String nom,@RequestParam String prenom,
			@RequestParam int age,@RequestParam String niveau) throws SQLException {
		
		   //etud = new Etudiant(nom,prenom,age,niveau);
		  etudService.updateEtudiant(etud,id); 
		  
		
		  return "redirect:/list";
		
	}
	
	@RequestMapping(value="/deleteEtud", method=RequestMethod.GET)
	public String deleteEtud(ModelMap model, @RequestParam int id) {
		
		etudService.deleteEtud(id);
		
		return "redirect:/list";
		
	}
	
	
	

}
