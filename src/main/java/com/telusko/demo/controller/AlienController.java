package com.telusko.demo.controller;


	import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.demo.dao.AlienRepo;
import com.telusko.demo.model.Alien;

	@Controller
	public class AlienController {
		
		@Autowired
		AlienRepo repo;
		@RequestMapping("/")
		public String home1()
		{
			return "home1.jsp";
		}
		
		@RequestMapping("/addAlien")
		public String addAlien(Alien alien)
		{
			repo.save(alien);
			return "home1.jsp";
		}
		
		
		@RequestMapping("/aliens")
		@ResponseBody
		public List<Alien> getAliens()
		{
		return repo.findAll();
			
		}
		
		
		
		
		@RequestMapping("/alien/{id}")
		@ResponseBody
		public Optional<Alien> getAlien(@PathVariable("id") int id)
		{
		return repo.findById(id);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		//@RequestMapping("/getAlien")
		//public ModelAndView getAlien(@RequestParam int id)
		//{
			//ModelAndView mv=new ModelAndView("show.jsp");
	//Alien alien= repo.findById(id).orElse(new Alien());
	//System.out.println(repo.findByDescription("java"));
	//mv.addObject(alien);
		//	return mv;
			
		//}
	}



