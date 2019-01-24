import java.util.ArrayList;

public class Student
	{

			private String name;
			private ArrayList<String> oldGroups;
			public Student(String n, ArrayList<String> o)
			{
				name = n;
				oldGroups = o;
				
			}

			public String getName()
				{
					return name;
				}

			public void setName(String name)
				{
					this.name = name;
				}
	}
