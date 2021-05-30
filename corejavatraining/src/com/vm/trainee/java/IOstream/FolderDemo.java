package com.vm.trainee.java.IOstream;

import java.io.File;

public class FolderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f = new File("Movie");
		
		System.out.println(f.exists());
		f.mkdir();
	    System.out.println(f.exists());
	}

}
