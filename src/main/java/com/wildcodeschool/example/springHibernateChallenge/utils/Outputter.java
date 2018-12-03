package com.wildcodeschool.example.springHibernateChallenge.utils;


	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.CommandLineRunner;
	import org.springframework.stereotype.Component;

	import com.wildcodeschool.example.springHibernateChallenge.entities.User;
	import com.wildcodeschool.example.springHibernateChallenge.repositories.UserDao;


	@Component
	public class Outputter implements CommandLineRunner {

	    private Logger LOG = LoggerFactory.getLogger("JNHDFE");

	    @Autowired
	    private UserDao userDao;

	    @Override
	    public void run(String... args) throws Exception {

	        // Checke combien d'objets se trouvent dans la BDD        
	        LOG.info("******************");
	        LOG.info("Objects in DB : " + userDao.count());

	        // Crée un nouvel utilisateur et l'enregistre dans la BDD
	        User user1 = new User("truc", "muche", 34);
	    
	        LOG.info(user1 + " existe!");
	        userDao.save(user1);
	        LOG.info(user1 + " seule");
	        
	        User user2 = new User("machin", "chouette", 89);
	        LOG.info("******************");
	        LOG.info(user2 + " existe");
	        userDao.save(user2);
	        LOG.info(user2 + " avec son ami "+ user1);
	       

	        
	    }    
	}


