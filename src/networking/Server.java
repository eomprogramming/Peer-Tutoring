package networking;

import java.util.ArrayList;

import controlClasses.*;

public class Server {
	
	public static ArrayList<Tutor> tutorList;
	public static ArrayList<Student> studentList; 
	public static ArrayList<Lesson> lessonList;
	public static ArrayList<Request> requestList;

	
	public static void main(String args[])
	{
		
	}

	private static void runServer()
	{
		
	}
	private static void waitForConnection()
	{
		
	}
	private static void processConnection()
	{
		
	}
	private static void sendData(Object o)
	{
		
	}
	private static void closeConnection()
	{
		
	}
	
	/**
	 * adds s to list if it is not already there
	 * @param Student s
	 */
	public static void updateStudent(Student s)
	{
		
	}
	public static void removeStudent(Student s)
	{
		
	}
	public static void updateTutor(Tutor t)
	{
		
	}
	public static void removeTutor(Tutor t)
	{
		
	}
	public static void updateLesson(Lesson l)
	{
		
	}
	public static void removeLesson(Lesson l)
	{
		
	}
	public static void updateRequest(Request l)
	{
		
	}
	public static void removeRequest(Request l)
	{
		
	}

	public static boolean authenticateStudent(String studentNumber, String password)
	{
		
	}
	public static boolean authenticateTutor(String studentNumber, String password)
	{
		
	}

	public static boolean doesStudentAccountExist(String studentNumber)
	{
		
	}
	public static boolean doesTutorAccountExist(String studentNumber)
	{
		
	}

	public static ArrayList<Tutor> searchForTutors(Student s)
	{
		
	}

}
