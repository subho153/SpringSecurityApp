package com.project.springsecurity.expection;


public class ResourceNotFoundExpection extends RuntimeException{

	public ResourceNotFoundExpection(String s) {
	     super(s);	
	}
	ResourceNotFoundExpection(){
		super("Resource Not Found");
	}
}
