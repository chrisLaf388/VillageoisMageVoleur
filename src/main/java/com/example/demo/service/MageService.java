package com.example.demo.service;

import javax.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.MageDaoItf;
import com.example.demo.entite.Mage;

@Service
public class MageService implements MageServiceItf {
	@Autowired
	private MageDaoItf MageDao;
	
	@Override
	public Mage findMageById(Long id) {
		return MageDao.findById(id).get();
	}
	@RolesAllowed("ROLE_ADMIN")
	@Override
	public Mage createMage(Mage Mage) {
		return MageDao.save(Mage);
	}
	
	@RolesAllowed("ROLE_ADMIN")
	@Override
	public Mage updateMageByid(Long id, Mage Etudiant) {
		Etudiant.setId(id);
		return MageDao.save(Etudiant);
	}
	@RolesAllowed("ROLE_ADMIN")
	@Override
	public Mage deleteMageById(Long id) {
		Mage Etudiant = findMageById(id); 
		MageDao.deleteById(id);
		return Etudiant;
	}
}
