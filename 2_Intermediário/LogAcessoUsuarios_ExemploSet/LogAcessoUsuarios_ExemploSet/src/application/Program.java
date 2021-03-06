package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogAcess;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			Set<LogAcess> set = new HashSet<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields =  line.split(" ");
				String userName = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				set.add(new LogAcess(userName, moment));
				
				line = br.readLine();
			}
			System.out.println("Numbers of Users: " + set.size());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
