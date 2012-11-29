package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;

import controlClasses.*;

public class Server {
	
	public static ArrayList<Tutor> tutorList;
	public static ArrayList<Student> studentList; 
	public static ArrayList<Lesson> lessonList;
	public static ArrayList<Request> requestList;
	
	private static Map<String, Student> studentMap;
	private static Map<String, Student> tutorMap;
	
	private static SSLServerSocket serverSock;
	
	private static boolean listen = false;
	
	/**
	 * Spawns a ConnectionHandler for every new network connection
	 * 
	 */
	private static class ConnectionSpawner implements Runnable{
		
		@Override
		public void run() {
			listen = true;
			while(listen) {
				SSLSocket sock;
				try {
					sock = (SSLSocket) serverSock.accept();
					new Thread(new ConnectionHandler(sock)).start();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
	
	/**
	 * Connection Handler handles a network connection to the server
	 * 
	 */
	private static class ConnectionHandler implements Runnable{
		SSLSocket socket;
		ObjectOutputStream toClient;
		ObjectInputStream fromClient;
		
		public ConnectionHandler(SSLSocket s) {
			socket = s;
			try {
				toClient = new ObjectOutputStream(socket.getOutputStream());
				fromClient = new ObjectInputStream(socket.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			try {
				while (!socket.isClosed()) {
					int intent = fromClient.readInt();
					if (intent == NetConstants.AUTH_STUDENT) {
						String num = fromClient.readUTF();
						String pass = fromClient.readUTF();
						toClient.writeBoolean(authenticateStudent(num, pass));
					}
					else if (intent == NetConstants.AUTH_TUTOR) {
						String num = fromClient.readUTF();
						String pass = fromClient.readUTF();
						toClient.writeBoolean(authenticateTutor(num, pass));
					}
					else if (intent == NetConstants.CHECK_STUDENT_EXISTS) {
						toClient.writeBoolean(doesStudentAccountExist(fromClient.readUTF()));
					} 
					else if (intent == NetConstants.CHECK_TUTOR_EXISTS) {
						toClient.writeBoolean(doesTutorAccountExist(fromClient.readUTF()));
					} 
					else if (intent == NetConstants.UPDATE_STUDENT) {
						updateStudent((Student) fromClient.readObject());
					} 
					else if (intent == NetConstants.DISCONNECT) {
						toClient.close();
						fromClient.close();
						socket.close();
					}
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String args[])
	{
		runServer();
		System.out.println("Server initiated and running.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean running = true;
		while(running) {
			try {
				String console = br.readLine();
				if (console.equalsIgnoreCase("help")) {
					System.out.println("----Commands----");
					System.out.println("help : Displays this message");
					System.out.println("stop : Stops the server and terminates");
				}
				else if (console.equalsIgnoreCase("stop")) {
					System.out.println("Server stopping....");
					stopServer();
					running = false;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Program will terminate when all clients have disconnected.");
	}
	
	private static void stopServer() {
		listen = false;
		try {
			serverSock.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void runServer()
	{
		SSLServerSocketFactory sssf = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
		try {
			serverSock = (SSLServerSocket) sssf.createServerSocket(NetConstants.SERVERPORT);
		} catch (IOException e) {
			e.printStackTrace();
		}
		serverSock.setEnabledCipherSuites(serverSock.getSupportedCipherSuites());
		Thread connectionSpawner = new Thread(new ConnectionSpawner());
		connectionSpawner.start();
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
		return studentMap.get(studentNumber).verifyPassword(password);
	}
	public static boolean authenticateTutor(String studentNumber, String password)
	{
		return tutorMap.get(studentNumber).verifyPassword(password);
	}

	public static boolean doesStudentAccountExist(String studentNumber)
	{
		return studentMap.containsKey(studentNumber);
	}
	
	public static boolean doesTutorAccountExist(String studentNumber)
	{
		return tutorMap.containsKey(studentNumber);
	}

	public static ArrayList<Tutor> searchForTutors(Student s)
	{
		return null;
	}

}
