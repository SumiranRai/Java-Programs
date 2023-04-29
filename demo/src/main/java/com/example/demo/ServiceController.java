package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.mycompany.app.Sorter;

@RestController
public class ServiceController{

	@PostMapping("/Word_Processor")
	public double[] service(@RequestBody double arr[],String str){
	Word_Processor obj = new Word_Processor();
	String output = obj.generate(str, options)
		return (output);
	}
}
