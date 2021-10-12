package com.shivangi.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.shivangi.service.studentService;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Scanner s = new Scanner(System.in);
		int ch;		
		System.out.println("---------------------------------------");
		System.out.println("Exception Handling using AspectJ in Spring");
		System.out.println("---------------------------------------");
		studentService StudentService = context.getBean("StudentService", studentService.class);		
		do {
			System.out.println("1)Add Student");
			System.out.println("2)Update Student Information");
			System.out.println("3)Delete Student");
			System.out.println("4)Update Student Contact");
			System.out.println("5) Exit");
			System.out.print("\n Enter your choice:");
			ch = s.nextInt();
			switch(ch) 
			{
			case 1: System.out.println("Checking Exception in addition of student");
			try
			{
				StudentService.addStudent();
			}
			catch(Exception exe)
			{
				System.out.println("exception message  = "+exe.getMessage());
			}
			break;			
			case 2: System.out.println("Checking Exception in updation of student's Information");
				try
				{
					StudentService.updateStudent();
				}
				catch(Exception exe)
				{
					System.out.println("exception message  = "+exe.getMessage());
				}
				break;				
			case 3: System.out.println("Checking Exception in deletion of student's Information");
					try
					{
						StudentService.deleteStudent();
					}
					catch(Exception exe)
					{
						System.out.println("exception message  = "+exe.getMessage());
					}
					break;
			case 4: System.out.println("Checking Exception in updation of student's Contact");
				try
				{
					StudentService.updateContact();
				}
				catch(Exception exe)
				{
					System.out.println("exception message  = "+exe.getMessage());
				}
				break;					
			case 5: System.exit(0);
		 }
		}while(true);
    }
}


