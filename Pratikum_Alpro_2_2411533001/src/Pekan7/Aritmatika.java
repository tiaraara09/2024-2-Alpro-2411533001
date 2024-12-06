package Pekan7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Aritmatika {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aritmatika window = new Aritmatika();
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
	public Aritmatika() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(176, 106, 66, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(176, 174, 66, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(176, 32, 66, 30);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(176, 73, 66, 22);
		comboBox.addItem("+");
		comboBox.addItem("-");
		comboBox.addItem("*");
		comboBox.addItem("/");
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("New button");
		double angka1= Double.parseDouble(textField_2.getText());
		double angka2= Double.parseDouble(textField.getText());
		String operator= (String) comboBox.getSelectedItem();
		
		double hasil=0;
		switch (operator) {
        case "+":
            hasil = angka1 + angka2;
            break;
        case "-":
            hasil = angka1 - angka2;
            break;
        case "*":
            hasil = angka1 * angka2;
            break;
        case "/":
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                textField_1.setText("Error");
                return; // Jika pembagi 0, tampilkan "Error"
            }
            break;
        default:
            break;
    }

    // Tampilkan hasil di textField_1
    textField_1.setText(String.valueOf(hasil));
} catch (NumberFormatException ex) {
    // Jika input bukan angka, tampilkan error
    textField_1.setText("Invalid");
}
}
});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(163, 229, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("    =");
		lblNewLabel.setBounds(186, 136, 56, 30);
		frame.getContentPane().add(lblNewLabel);
	}
}
