
public class Student
	{

			private String name;
			private int studentNum;
			public Student(int sn, String n)
			{
				studentNum = sn;
				name = n;
				
				
			}

			public int getStudentNum()
				{
					return studentNum;
				}

			public void setStudentNum(int studentNum)
				{
					this.studentNum = studentNum;
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
