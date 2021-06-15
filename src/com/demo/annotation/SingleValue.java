package com.demo.annotation;

@SingleValueAnnotation(user = "Optimus")
public class SingleValue {
	@SingleValueAnnotation(user = "Sonu")
	public String singleValueAnnotation() {
		return null;
	}

}
