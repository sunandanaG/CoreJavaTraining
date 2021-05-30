package com.vm.trainee.java.IOstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.sound.sampled.spi.AudioFileReader;

public class FilereaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("suna.txt");
		FileReader fr=new FileReader(f);
//		System.out.println((char)fr.read());//type casting using character
		
		int readChar=fr.read();
		while(readChar!=-1)
		{
			System.out.println((char)(readChar));
			readChar=fr.read();
		}
	}

}
