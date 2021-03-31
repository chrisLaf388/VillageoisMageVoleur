package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.MageDaoItf;
import com.example.demo.dao.UserDaoItf;
import com.example.demo.dao.UserRoleDaoItf;
import com.example.demo.dao.VillageoisDaoItf;
import com.example.demo.dao.VoleurDaoItf;
import com.example.demo.entite.Mage;
import com.example.demo.entite.User;
import com.example.demo.entite.UserRole;
import com.example.demo.entite.Villageois;
import com.example.demo.entite.Voleur;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		VillageoisDaoItf villageoisDao = ctx.getBean(VillageoisDaoItf.class);
		MageDaoItf mageDao = ctx.getBean(MageDaoItf.class);
		VoleurDaoItf voleurDao = ctx.getBean(VoleurDaoItf.class);
		
		Villageois villageois1 = new Voleur(1L, "Kevin", 20, 5);
		Mage mage1 = new Mage(2L, "lola", 5, 3);
		Voleur voleur2 = new Voleur(4L, "Edward", 3, 10);
		
		villageoisDao.save(villageois1);
		mageDao.save(mage1);
		voleurDao.save(voleur2);
		
		UserDaoItf userDao = ctx.getBean(UserDaoItf.class);
		userDao.save(new User("uadmin", "padmin"));
		userDao.save(new User("uuser", "puser"));
		
		UserRoleDaoItf userRoleDao = ctx.getBean(UserRoleDaoItf.class);
		userRoleDao.save(new UserRole("uadmin","ADMIN"));
		userRoleDao.save(new UserRole("uadmin","USER"));
		userRoleDao.save(new UserRole("uuser","USER"));
		
		
		
	}

}
