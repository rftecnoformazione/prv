package it.rf.autolavaggio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.rf.autolavaggio.model.Utente;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {


	
	
	@GetMapping(path="/index")
	public String mostraindexjsp() {
		
		System.out.print("oook");
		return "index";
	}
	
	
	@PostMapping(path="/login")
public String login(@RequestParam String username ,@RequestParam String password) {
		
		
		System.out.println("inseriti" + username + password);
		
		return "homepage";
	}
		
	
	//@PostMapping(path="/login2")
//public String login(@ModelAttribute Utente u ) {
		
		//System.out.print("inseriti" +   u.getUsername() + "" + "" + u.getPassword());
		//String var=u.getUsername();
		
		//return "homepage";
	//}
	
	//@PostMapping(path="/login2")
	//public String login(@ModelAttribute Utente u,Model model ) { // utilizziamo un implementazione di @ModelAttribut quando la inseriamo come parametro ci mette dentro un istanza quindi contiene u oggetto
		//come il model , quando facciamo il return , viene passato nella jsp
			
			//model.addAttribute("oggettodapassare",u);// a sinistra c'è l'identificativo e a destra 
			
			//return "homepage";
		//}
	
	
	//RequestMethod è una classe , quando scrivo .POST 
	@RequestMapping(path = "/login2", method = {RequestMethod.POST, RequestMethod.GET})
	public String login(@ModelAttribute Utente u, Model model, HttpSession session) {
		model.addAttribute("oggettodapassare", u);//passaggio a livello di richiesta
		session.setAttribute("oggettodapassare", u); // pasaggio a livello di sessione
		return "homepage";
	}
	
		
	
}
