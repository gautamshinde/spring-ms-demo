package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.example.demo.model.Code;

@Component
public class CmCodeRepository {

	public List<Code> findAll(){
		List<Code> list = new ArrayList<>(5);
		list.add(new Code("A00.0", "Cholera due to Vibrio cholerae 01, biovar cholerae"));
		list.add(new Code("A00.1", "Cholera due to Vibrio cholerae 01, biovar eltor"));
		list.add(new Code("A00.9", "Cholera, unspecified"));
		list.add(new Code("15.0", "Tuberculosis of lung"));
		list.add(new Code("15.4", "Tuberculosis of intrathoracic lymph nodes"));		
		return list;
	} 
	
}
