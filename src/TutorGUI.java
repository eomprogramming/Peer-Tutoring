import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TutorGUI extends JApplet implements ActionListener
{
	JPanel main, signup;
	JButton studentSelect, tutorSelect, enter;
	JLabel title;
	JTextField inputName;
	JRadioButton [] lunch, afternoon;
	JComboBox grade;
	
	boolean isTutor;
	public void init()
	{
		setSize(500, 300);
		setLayout(null);
		
		main = new JPanel();
		main.setSize(getSize());
		main.setLayout(null);
		main.setVisible(true);
		add(main);
		
		signup = new JPanel();
		signup.setSize(getSize());
		signup.setLayout(null);
		signup.setVisible(false);
		add(signup);
		
		
		
		studentSelect = new JButton("Register as a Tutor");
		studentSelect.setBounds(20, 200, 180, 50);
		studentSelect.addActionListener(this);
		main.add(studentSelect);
		
		tutorSelect = new JButton("Register as a Student");
		tutorSelect.setBounds(300, 200, 180, 50);
		tutorSelect.addActionListener(this);
		main.add(tutorSelect);
		
		title = new JLabel("Tutoring!");
		title.setBounds(50, 20, 400, 80);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setFont(new Font("Georgia", Font.BOLD, 25));
		main.add(title);
		
		inputName = new JTextField("Name (First and Last)");
		inputName.setBounds(40, 30, 200, 30);
		signup.add(inputName);
		
		JLabel schedule = new JLabel("When are you available?");
		schedule.setBounds(40, 60, 150, 40);
		signup.add(schedule);
		
		JLabel days = new JLabel ("M T W TH SA SU");
		days.setBounds(45, 85, 150, 40);
		signup.add(days);
		
		JTextArea times = new JTextArea ("Lunch" +
				"\n \nAfter School");
		times.setBounds(150, 122, 100, 50);
		times.setBackground (new Color(0,0,0,0));
		signup.add(times);
		
		grade = new JComboBox();
		grade.setBounds(40, 180, 100, 20);
		grade.addItem("Grade");
		grade.addItem("9");
		grade.addItem("10");
		grade.addItem("11");
		grade.addItem("12");
		signup.add(grade);
		
		lunch = new JRadioButton [5];
		afternoon = new JRadioButton [5];
		
		
		
		for(int i=0; i<5;i++)
		{
			lunch[i]= new JRadioButton();
			lunch[i].addActionListener(this);
			lunch[i].setBounds(40+20*i, 120, 20, 20);
			signup.add(lunch[i]);
			afternoon[i]= new JRadioButton();
			afternoon[i].addActionListener(this);
			afternoon[i].setBounds(40+20*i, 150, 20, 20);
			signup.add(afternoon[i]);
		}
		
	
	}
	public void actionPerformed (ActionEvent e)
	{
		if(e.getSource()==studentSelect)
		{
			isTutor=false;
			switchFrames(false);
		}
		else
		{
			isTutor=true;
			switchFrames(false);
		}
		
		
	}
	private void switchFrames(boolean toMain)
	{
		if(toMain)
		{
			signup.setVisible(false);
			main.setVisible(true);
		}
		else
		{
			signup.setVisible(true);
			main.setVisible(false);
		}
	}
}
