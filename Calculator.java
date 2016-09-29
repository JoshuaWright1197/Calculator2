package Calcukator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.UIManager;

public class Calculator extends JFrame
{
	
	private JTextField text;
	private JTextField toptext;
	private JPanel toppanel;
	private JPanel Bottompanel;
	private GridLayout gridlayout;
	
	private JButton pi;
	private JButton back;
	
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	private JButton add;
	private JButton zero;
	private JButton claer;
	private JButton equal;
	private JButton dot;
	private JButton subtract;
	private JButton divide;
	private JButton multiply;
	private JButton backspace;
	private JButton cleare;
	private JButton more;
	private String f;
	private String tempf;
	
	private ArrayList<Double> numarray;
	private boolean[] switcharray;
	
	Calculator()
	{
		this.setTitle(String.format("                                       Calculator"));
		this.setSize(370,530);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		toppanel = new JPanel();
		Bottompanel = new JPanel();
		text = new JTextField();
		toptext = new JTextField();
		numarray = new <Double>ArrayList();
		f = new String("");
		tempf = new String("");
		switcharray = new boolean[4];
		gridlayout = new GridLayout(5,4);
		
		one = new JButton("1");
		one.addActionListener(new NumActionListener());
		two = new JButton("2");
		two.addActionListener(new NumActionListener());
		three = new JButton("3");
		three.addActionListener(new NumActionListener());
		four = new JButton("4");
		four.addActionListener(new NumActionListener());
		five = new JButton("5");
		five.addActionListener(new NumActionListener());
		six = new JButton("6");
		six.addActionListener(new NumActionListener());
		seven = new JButton("7");
		seven.addActionListener(new NumActionListener());
		eight = new JButton("8");
		eight.addActionListener(new NumActionListener());
		nine = new JButton("9");
		nine.addActionListener(new NumActionListener());
		zero = new JButton("0");
		zero.addActionListener(new NumActionListener());
		dot = new JButton(".");
		dot.addActionListener(new NumActionListener());
		
		multiply = new JButton("X");
		multiply.addActionListener(new otherbtactionlistener());
		add = new JButton("+");
		add.addActionListener(new otherbtactionlistener());
		subtract = new JButton("-");
		subtract.addActionListener(new otherbtactionlistener());
		equal = new JButton("=");
		equal.addActionListener(new otherbtactionlistener());
		divide = new JButton("/");
		divide.addActionListener(new otherbtactionlistener());
		backspace = new JButton("<-");
		backspace.addActionListener(new otherbtactionlistener());
		cleare = new JButton("CE");
		cleare.addActionListener(new otherbtactionlistener());
		claer = new JButton("C");
		claer.addActionListener(new otherbtactionlistener());
		more = new JButton("MORE");
		more.addActionListener(new otherbtactionlistener());
		pi = new JButton("Pi");
		pi.addActionListener(new NumActionListener());
		back = new JButton("BACK");
		back.addActionListener(new otherbtactionlistener());
		
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 34);
		Font font2 = new Font(Font.SANS_SERIF, Font.BOLD, 22);
		Font font3 = new Font(Font.SANS_SERIF, Font.PLAIN, 24);
		
		text.setPreferredSize(new Dimension(363,60));
		toptext.setPreferredSize(new Dimension(363,60));
		
		text.setFont(font);
		toptext.setFont(font2);
		
		this.add(text);
		this.add(toptext);
		this.add(Bottompanel);
		
		text.setText("0");
		
		//text.setEditable(false);
		toptext.setEditable(false);
		
		text.setBorder(null);
		toptext.setBorder(null);
		
		
		SpringLayout layout = new SpringLayout();
		
		this.setLayout(layout);
		this.getContentPane().setBackground(Color.WHITE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		Bottompanel.setPreferredSize(new Dimension(365,350));
		Bottompanel.setLayout(gridlayout);
		
		//text.setBackground(Color.WHITE);
		text.setForeground(Color.black);
		toptext.setBackground(Color.WHITE);
		toptext.setForeground(Color.DARK_GRAY);
		one.setBackground(Color.LIGHT_GRAY);
		two.setBackground(Color.LIGHT_GRAY);
		three.setBackground(Color.LIGHT_GRAY);
		four.setBackground(Color.LIGHT_GRAY);
		five.setBackground(Color.LIGHT_GRAY);
		six.setBackground(Color.LIGHT_GRAY);
		seven.setBackground(Color.LIGHT_GRAY);
		eight.setBackground(Color.LIGHT_GRAY);
		nine.setBackground(Color.LIGHT_GRAY);
		zero.setBackground(Color.LIGHT_GRAY);
		zero.setBackground(Color.LIGHT_GRAY);
		dot.setBackground(Color.LIGHT_GRAY);
		claer.setBackground(Color.LIGHT_GRAY);
		cleare.setBackground(Color.LIGHT_GRAY);
		divide.setForeground(Color.red);
		divide.setBackground(Color.LIGHT_GRAY);
		multiply.setForeground(Color.red);
		multiply.setBackground(Color.LIGHT_GRAY);
		add.setBackground(Color.LIGHT_GRAY);
		add.setForeground(Color.red);
		subtract.setBackground(Color.LIGHT_GRAY);
		subtract.setForeground(Color.red);
		more.setBackground(Color.LIGHT_GRAY);
		equal.setBackground(Color.LIGHT_GRAY);
		equal.setForeground(Color.RED);
		backspace.setBackground(Color.LIGHT_GRAY);
		pi.setBackground(Color.LIGHT_GRAY);
		back.setBackground(Color.LIGHT_GRAY);
		Bottompanel.setBackground(Color.LIGHT_GRAY);
		
		one.setFont(font2);
		two.setFont(font2);
		three.setFont(font2);
		four.setFont(font2);
		five.setFont(font2);
		six.setFont(font2);
		seven.setFont(font2);
		eight.setFont(font2);
		nine.setFont(font2);
		zero.setFont(font2);
		dot.setFont(font2);
		equal.setFont(font3);
		divide.setFont(font3);
		subtract.setFont(font3);
		add.setFont(font3);
		multiply.setFont(font3);
		claer.setFont(font3);
		cleare.setFont(font3);
		backspace.setFont(font3);
		pi.setFont(font2);
		
		
		claer.setBorder(null);
		cleare.setBorder(null);
		backspace.setBorder(null);
		add.setBorder(null);
		pi.setBorder(null);
		claer.setBorder(null);
		one.setBorder(null);
		two.setBorder(null);
		three.setBorder(null);
		four.setBorder(null);
		five.setBorder(null);
		six.setBorder(null);
		seven.setBorder(null);
		eight.setBorder(null);
		nine.setBorder(null);
		zero.setBorder(null);
		dot.setBorder(null);
		equal.setBorder(null);
		multiply.setBorder(null);
		subtract.setBorder(null);
		more.setBorder(null);
		divide.setBorder(null);
		back.setBorder(null);
		
		
		additems();
		
		layout.putConstraint(SpringLayout.WEST, toptext, 0, SpringLayout.WEST, this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, toptext, 0, SpringLayout.NORTH, this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, text, 0, SpringLayout.WEST, this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, text, 60, SpringLayout.NORTH, this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, Bottompanel, 0, SpringLayout.WEST, this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, Bottompanel, 151, SpringLayout.NORTH, this.getContentPane());

		
		this.setVisible(true);
	}
	
	private void additems()
	{
		Bottompanel.add(claer);
		Bottompanel.add(cleare);
		Bottompanel.add(backspace);
		Bottompanel.add(add);
		Bottompanel.add(one);
		Bottompanel.add(two);
		Bottompanel.add(three);	
		Bottompanel.add(subtract);
		Bottompanel.add(four);
		Bottompanel.add(five);
		Bottompanel.add(six);	
		Bottompanel.add(multiply);
		Bottompanel.add(seven);
		Bottompanel.add(eight);
		Bottompanel.add(nine);	
		Bottompanel.add(divide);
		Bottompanel.add(more);
		Bottompanel.add(zero);
		Bottompanel.add(dot);
		Bottompanel.add(equal);
	}
	
	private class NumActionListener implements ActionListener
	{ 
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == pi)
			{
				f+= "3.14";
				tempf+="3.14";	
			}
			else
			{
				JButton b = new JButton();
				b = (JButton) e.getSource();
				tempf += b.getText();
				f += b.getText();
			}
			text.setText(f);
			toptext.setText(tempf);
		}	
	}
	
	public class otherbtactionlistener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == multiply)
			{
				numarray.add(Double.parseDouble(text.getText()));
				text.setText("");
				f = "";
				tempf += " x ";
				toptext.setText(tempf);
				switcharray[0] = true;
			}	
			else if(e.getSource() == subtract)
			{
				numarray.add(Double.parseDouble(text.getText()));
				text.setText("");
				f = "";
				tempf += " - ";
				toptext.setText(tempf);
				switcharray[1] = true;
			}	
			else if(e.getSource()== divide)
			{
				numarray.add(Double.parseDouble(text.getText()));
				text.setText("");
				f = "";
				tempf += " / ";
				toptext.setText(tempf);
				switcharray[2] = true;
			}	
			else if(e.getSource() == add)
			{
				numarray.add(Double.parseDouble(text.getText()));
				text.setText("");
				f = "";
				tempf += " + ";
				toptext.setText(tempf);
				switcharray[3] = true;
			}	
			else if(e.getSource() == equal)
			{
				numarray.add(Double.parseDouble(text.getText()));
				double result = numarray.get(0).doubleValue();
				
				if(switcharray[0] == true)
				{
					for(int i = 1; i < numarray.size() ; i++)
						result *= numarray.get(i).doubleValue();	
					switcharray[0] = false;
				}	
				else if(switcharray[1] == true)
				{
					for(int i = 1; i < numarray.size() ; i++)
						result -= numarray.get(i).doubleValue();
					switcharray[1] = false;
				}	
				else if(switcharray[2] == true)
				{
					for(int i = 1; i < numarray.size() ; i++)
						result /= numarray.get(i).doubleValue();
					switcharray[2] = false;
				}	
				else if(switcharray[3] == true)
				{
					for(int i = 1; i < numarray.size() ; i++)
						result += numarray.get(i).doubleValue();
					switcharray[3] = false;
				}	
				numarray.clear();
				f = "";
				tempf += " = ";
				text.setText(""+result);
				toptext.setText(tempf);
				tempf = result+"";
			}
			else if(e.getSource() == claer)
			{
				numarray.clear();
				tempf = "";
				f = "";
				text.setText("0");
				toptext.setText("");
			}
			else if(e.getSource() == cleare)
			{
				text.setText("0");
				tempf = tempf.substring(0,tempf.length() -f.length());
				toptext.setText(tempf);
				f = "";
			}
			else if(e.getSource() == backspace)
			{
				if(!f.equals(""))
				{
				text.setText(text.getText().substring(0, text.getText().length()-1));
				f = text.getText();
				tempf = tempf.substring(0,tempf.length()-1);
				toptext.setText(tempf);
				}
			}
			else if(e.getSource() == more)
			{
				Bottompanel.removeAll();
				Bottompanel.add(pi);
				Bottompanel.add(back);
				Bottompanel.revalidate();
				Bottompanel.repaint();
			}
			else if(e.getSource() == back)
			{
				Bottompanel.removeAll();
				additems();
				Bottompanel.revalidate();
				Bottompanel.repaint();
			}
		}
		
		
	}
	
	public static void main(String[]argsv)
	{
		Calculator cal  = new Calculator();
	}

	
	
	
	
	
	
}

