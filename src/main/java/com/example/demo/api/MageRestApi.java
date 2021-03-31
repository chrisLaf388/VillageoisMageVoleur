package com.example.demo.api;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entite.Mage;
import com.example.demo.service.MageService;


@RestController
@RequestMapping("/mage")
public class MageRestApi {

	@Autowired
	private MageService EtudiantService;
	 
	@GetMapping("/{id}")
	public Mage getMageById(@PathVariable("id")Long id) {
		System.out.println("EtudiantRestApi - getEtudiantById id=" + id);
		return EtudiantService.findMageById(id);
	}
	
	@PostMapping("")
	public Mage createVisiteur(@RequestBody Mage Mage) {
		System.out.println("EtudiantRestApi - create Etudiant=" + Mage);
        return EtudiantService.createMage(Mage);
	}
	@PutMapping("/{id}")
	public Mage updateMage(@PathVariable("id") Long id, @RequestBody Mage Mage) {
		return EtudiantService.updateMageByid(id, Mage);
	}
	@DeleteMapping("/{id}")
	public Mage deleteMage(@PathVariable("id") Long id) {
		System.out.println("EtudiantRestApi - deleteEtudiant");
		return EtudiantService.deleteMageById(id);
	}
}
