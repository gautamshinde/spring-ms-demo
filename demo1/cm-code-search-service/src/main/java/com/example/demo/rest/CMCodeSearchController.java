package com.example.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CodeCatelog;
import com.example.demo.repository.CmCodeRepository;

@RefreshScope
@RestController
@RequestMapping("/cmcode")
public class CMCodeSearchController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CMCodeSearchController.class);
	
	@Autowired
	private CmCodeRepository repository;
	
	@Value("${message:Hello default}")
    private String message;
	
	@GetMapping("/all")
	List<CodeCatelog> findAll(){
		List<CodeCatelog> list = new ArrayList<>(1);
		list.add(new CodeCatelog("Complete CM Code list", repository.findAll()));
		LOGGER.info("Complete cm code list", list);
		return list;
	}
	
	@GetMapping("/test")
	String testConfigServerConnectivity(){
		return message;
	}
}
