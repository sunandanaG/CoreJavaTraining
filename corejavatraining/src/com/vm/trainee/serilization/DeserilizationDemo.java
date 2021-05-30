package com.vm.trainee.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationDemo 
{
   public static void main(String[] args) throws IOException, Exception
   {
    FileInputStream fis=new FileInputStream("abc.ser");
    ObjectInputStream ois=new ObjectInputStream(fis);
    Employee e=(Employee)ois.readObject();
    
    System.out.println(e.id+" "+e.name);
    
}
}
