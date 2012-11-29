package networking;

import controlClasses.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import javax.net.ssl.*;

public class Client {
	private static ObjectOutputStream oos;
	private static ObjectInputStream ois;
	private static SSLSocket socket;
	
	public static void runClient()
	{
		SSLSocketFactory ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();
		try {
			socket = (SSLSocket) ssf.createSocket();
			socket.setEnabledCipherSuites(socket.getSupportedCipherSuites());
			connectToServer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static void connectToServer()
	{
		try {
			socket.connect(new InetSocketAddress(NetConstants.HOSTNAME, NetConstants.SERVERPORT), 10000);
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void sendMessage(String s) {
		try {
			oos.writeUTF(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void sendIntent(int i) {
		try {
			oos.writeInt(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void sendData(Object o)
	{
		try {
			oos.writeObject(o);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void closeConnection()
	{
		try {
			sendIntent(NetConstants.DISCONNECT);
			oos.close();
			ois.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * adds s to list if it is not already there
	 * @param Student s
	 */
	public static void updateStudent(Student s)
	{
		sendIntent(NetConstants.UPDATE_STUDENT);
		sendData(s);
	} 
	public static void removeStudent(Student s)
	{
		sendIntent(NetConstants.REMOVE_STUDENT);
		sendData(s);
	}
	public static void updateTutor(Tutor t)
	{
		sendIntent(NetConstants.UPDATE_TUTOR);
		sendData(t);
	}
	public static void removeTutor(Tutor t)
	{
		sendIntent(NetConstants.REMOVE_TUTOR);
		sendData(t);
	}
	public static void updateLesson(Lesson l)
	{
		sendIntent(NetConstants.UPDATE_LESSON);
		sendData(l);
	}
	public static void removeLesson(Lesson l)
	{
		sendIntent(NetConstants.REMOVE_LESSON);
		sendData(l);
	}
	public static void updateRequest(Request l)
	{
		sendIntent(NetConstants.UPDATE_REQUEST);
		sendData(l);
	}
	public static void removeRequest(Request l)
	{
		sendIntent(NetConstants.REMOVE_REQUEST);
		sendData(l);
	}

	public static boolean authenticateStudent(String studentNumber, String password)
	{
		sendIntent(NetConstants.AUTH_STUDENT);
		sendMessage(studentNumber);
		sendMessage(password);
		try {
			return ois.readBoolean();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	public static boolean authenticateTutor(String studentNumber, String password)
	{
		sendIntent(NetConstants.AUTH_TUTOR);
		sendMessage(studentNumber);
		sendMessage(password);
		try {
			return ois.readBoolean();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean doesStudentAccountExist(String studentNumber)
	{
		sendIntent(NetConstants.CHECK_STUDENT_EXISTS);
		sendMessage(studentNumber);
		try {
			return ois.readBoolean();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	public static boolean doesTutorAccountExist(String studentNumber)
	{
		sendIntent(NetConstants.CHECK_TUTOR_EXISTS);
		sendMessage(studentNumber);
		try {
			return ois.readBoolean();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static ArrayList<Tutor> searchForTutors(Student s)
	{
		return null;
	}

}
