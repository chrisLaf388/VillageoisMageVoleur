package com.example.demo.service;

import java.util.List;

import com.example.demo.entite.Mage;


public interface MageServiceItf {
	Mage findMageById(Long id);
	Mage createMage(Mage Mage);
	
	Mage updateMageByid(Long id, Mage Mage);
	Mage deleteMageById(Long id);
}
