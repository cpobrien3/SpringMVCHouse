package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.House;
import dmacc.repository.HouseRepository;

/**
 * @author Christian O'Brien - cpobrien3
 * CIS175 - Fall 2021
 * Nov 1, 2021
 */

@Controller
public class WebController {
	@Autowired
	HouseRepository repo;
	
	
	@GetMapping({ "/", "viewAll" })
	public String viewAllHouses(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewHouse(model);
		}
		
		model.addAttribute("houses", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputHouse")
	public String addNewHouse(Model model) {
		House h = new House();
		model.addAttribute("newHouse", h);
		return "input";
	}
	
	
	
	@GetMapping("/edit/{id}")
	public String showUpdateHouse(@PathVariable("id") long id, Model model) {
		House h = repo.findById(id).orElse(null);
		model.addAttribute("newHouse", h);
		return "input";
	}
	
	@PostMapping("/update/{id}")
		public String reviseHouse(House h, Model model) {
		repo.save(h);
		return viewAllHouses(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		House c = repo.findById(id).orElse(null);
		repo.delete(c);
		return viewAllHouses(model);
	}
}
