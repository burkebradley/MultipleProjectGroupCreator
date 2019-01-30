import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class GenerateGroups
	{
		static ArrayList<Student>classroom = new ArrayList<Student>();
		static Scanner userInput1;
		static int groupNum;
		static int numOfStudents = 1;
		static int groupSize;
		static int leftover;
		static int bigGroupSize;
		static int numOfBigGroups;
		static int smallGroupSize;
		static int numOfSmallGroups;
		static int studentCounter =0;
		static int groupCounter =0;
	
		
		public static void makeNames() throws IOException
			{
				
				Scanner names = new Scanner(new File("studentnames.txt"));
				while (names.hasNext())
					{
						classroom.add(new Student(numOfStudents, names.nextLine()));
						numOfStudents++;
;					}
				
			}
		public static void numOfGroups() throws IOException
			{
				System.out.println("How many groups?");
				userInput1 = new Scanner(System.in);
				groupNum = userInput1.nextInt();
				makeGroups();

			}
		
		public static void makeGroups() throws IOException
			{
				groupSize = classroom.size()/groupNum;
				leftover = classroom.size()%groupNum;
				System.out.println("There will be " + leftover  + " groups with " + (groupSize+1) + " students and " + (groupNum-leftover) + " groups with "  + (groupSize) + " students.");
				System.out.println(" ");
			}
		
		public static void randomizeGroups() throws IOException
			{
				System.out.println("Group Project One");
				System.out.println(" ");
				
				for(int a = 0; a < numOfBigGroups; a++)
				{
					System.out.println("Group " + (groupCounter));
					
					for(int i = 0; i < bigGroupSize; i++)
					{
						System.out.println(classroom.get(studentCounter).getName());
						studentCounter++;

					}
					
					System.out.println(" ");
					groupCounter++;
						
					
				}
				
				
				for(int a = 0; a<numOfSmallGroups; a++)
				{
					System.out.println("Group " + (groupCounter));
					
					for(int i = 0; i<smallGroupSize; i++)
					{
						
						System.out.println(classroom.get(studentCounter).getName());
						studentCounter++;
						
					}
					
					System.out.println(" ");
					
					groupCounter++;
				}
				
			
			
			}
		
		
	}
