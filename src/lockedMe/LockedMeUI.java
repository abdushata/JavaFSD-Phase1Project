package lockedMe;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LockedMeUI {

	
	public static void mainmenu() {
		System.out.println("LockedMe Main Menu\n");
		System.out.println("Please Select one of the below options");
		System.out.println("1. List Files");
		System.out.println("2. File Options");
		System.out.println("3. Quit LockedMe App");
	}
	public static void submenu() {
		System.out.println("\nPlease Select one of the below options");
		System.out.println("1. Add a File");
		System.out.println("2. Delete a File");
		System.out.println("3. Git a File");
		System.out.println("4. Main Menu");
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome at Lockers Pvt. Ltd. Company");
		System.out.println("LockedMe App\n");
		System.out.println("Developer Name: Abdulrahman Shatta");
		System.out.println("Developer Mail: abdulrahman.shatta@vodafone.com\n");
		mainmenu();
		Scanner in = new Scanner(System.in);
//		FileHandeling f = new FileHandeling();
		String Filename;
		while (true) {
			int choice=in.nextInt();
			switch (choice){
			case 1:  					//1. List Files
				File file = new File("dir");
				File[] F = file.listFiles();
				FileHandeling.ASCsort(F);
				break;
			case 2:						//2. File Options
				submenu();
				int option=in.nextInt();
				switch (option) {
				case 1:					//1. Add a File
					System.out.println("Enter file name to create:");
					Filename = in.next();
					FileHandeling.addfile(Filename);
					mainmenu();
					break;
					
				case 2:					//2. Delete a File
					System.out.println("Enter file name to delete:");
					Filename = in.next();
					FileHandeling.deletefile(Filename);
					mainmenu();
					break;
					
				case 3:					//3. Git a File
					System.out.println("Enter file name to delete:");
					Filename = in.next();
					FileHandeling.getfile(Filename);
					System.out.println();
					mainmenu();
					break;
					
				case 4:					//4. Main Menu
					mainmenu();
					break;
				}
				break;
				
			case 3:						//3. Quit LockedMe App
				System.out.println("Quitting LockedMe App");
				System.exit(choice);
				break;
				
			
			}
			
		}
		

	}

}
