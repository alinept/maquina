package fachada;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class Janela {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Janela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JButton btnNewButton = new JButton("New button");
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, 99, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, 93, SpringLayout.WEST, frame.getContentPane());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 35, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 10, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 174, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, -171, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2, 15, SpringLayout.EAST, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2, -243, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 472, SpringLayout.SOUTH, btnNewButton_2);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -536, SpringLayout.NORTH, btnNewButton_2);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_2, 0, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2, 0, SpringLayout.NORTH, btnNewButton);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_3, 0, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_3, 16, SpringLayout.EAST, btnNewButton_2);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_3, 0, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_3, -144, SpringLayout.EAST, frame.getContentPane());
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_4, 35, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_4, 18, SpringLayout.EAST, btnNewButton_3);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_4, 0, SpringLayout.SOUTH, btnNewButton);
		frame.getContentPane().add(btnNewButton_4);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 8, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textField, 93, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 8, SpringLayout.SOUTH, btnNewButton_2);
		springLayout.putConstraint(SpringLayout.WEST, textField_1, 15, SpringLayout.EAST, textField);
		springLayout.putConstraint(SpringLayout.EAST, textField_1, 98, SpringLayout.EAST, textField);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_2, 8, SpringLayout.SOUTH, btnNewButton_3);
		springLayout.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, btnNewButton_3);
		springLayout.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, btnNewButton_3);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_3, 8, SpringLayout.SOUTH, btnNewButton_4);
		springLayout.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, btnNewButton_4);
		springLayout.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, btnNewButton_4);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, comboBox, 167, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, comboBox, 0, SpringLayout.WEST, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, comboBox, 0, SpringLayout.EAST, btnNewButton);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("  Moedas");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 14, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, comboBox);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, btnNewButton);
		frame.getContentPane().add(lblNewLabel);
		
		textField_4 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_4, 40, SpringLayout.SOUTH, textField_1);
		springLayout.putConstraint(SpringLayout.WEST, textField_4, 15, SpringLayout.EAST, comboBox);
		springLayout.putConstraint(SpringLayout.EAST, textField_4, 49, SpringLayout.EAST, comboBox);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		springLayout.putConstraint(SpringLayout.NORTH, lblQuantidade, 0, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblQuantidade, 15, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, lblQuantidade, 0, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, lblQuantidade, 71, SpringLayout.EAST, lblNewLabel);
		frame.getContentPane().add(lblQuantidade);
		
		textField_5 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_5, 0, SpringLayout.NORTH, comboBox);
		springLayout.putConstraint(SpringLayout.WEST, textField_5, 0, SpringLayout.WEST, btnNewButton_3);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Troco");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 43, SpringLayout.EAST, lblQuantidade);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 0, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, btnNewButton_3);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_5 = new JButton("Comprar");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_5, -1, SpringLayout.NORTH, comboBox);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_5, 172, SpringLayout.EAST, textField_4);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_5, -37, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton_5);
		
		textField_6 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_6, 22, SpringLayout.SOUTH, comboBox);
		springLayout.putConstraint(SpringLayout.WEST, textField_6, 0, SpringLayout.WEST, btnNewButton);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_6, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textField_6, 386, SpringLayout.WEST, btnNewButton);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
	}
}
