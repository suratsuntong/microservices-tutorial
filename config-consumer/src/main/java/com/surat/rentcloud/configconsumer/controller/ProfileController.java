package com.surat.rentcloud.configconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.surat.rentcloud.configconsumer.model.MemberProfileConfiguration;

@Controller
public class ProfileController {

	@Autowired
	MemberProfileConfiguration memberProfileConfiguration;
	
	@GetMapping("/profile")
	public String getConfig(Model model) {
		model.addAttribute("model", memberProfileConfiguration.getDefaultModel());
		model.addAttribute("min", memberProfileConfiguration.getMinRentPeriod());
		return "mprofile";
	}
 }
