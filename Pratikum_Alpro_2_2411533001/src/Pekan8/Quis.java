package Pekan8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quis {

	private JFrame frame;
	private JTextField FieldNama;
	private JTextField FieldUmur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quis window = new Quis();
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
	public Quis() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Title = new JLabel("Aplikasi Razia Motor Online");
		Title.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Title.setBounds(110, 40, 259, 31);
		frame.getContentPane().add(Title);
		
		JLabel LabelNama = new JLabel("Nama");
		LabelNama.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		LabelNama.setBounds(33, 108, 84, 23);
		frame.getContentPane().add(LabelNama);
		
		JLabel LabelUmur = new JLabel("Umur");
		LabelUmur.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		LabelUmur.setBounds(33, 142, 72, 24);
		frame.getContentPane().add(LabelUmur);
		
		JLabel LabelSim = new JLabel("SIM C");
		LabelSim.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		LabelSim.setBounds(33, 176, 72, 24);
		frame.getContentPane().add(LabelSim);
		
		JLabel LabelHasil = new JLabel("");
		LabelHasil.setFont(new Font("Tahoma", Font.PLAIN, 16));
		LabelHasil.setBounds(33, 336, 425, 48);
		frame.getContentPane().add(LabelHasil);
		
		FieldNama = new JTextField();
		FieldNama.setFont(new Font("Tahoma", Font.PLAIN, 16));
		FieldNama.setBounds(175, 105, 278, 31);
		frame.getContentPane().add(FieldNama);
		FieldNama.setColumns(10);
		
		FieldUmur = new JTextField();
		FieldUmur.setFont(new Font("Tahoma", Font.PLAIN, 16));
		FieldUmur.setColumns(10);
		FieldUmur.setBounds(175, 142, 101, 27);
		frame.getContentPane().add(FieldUmur);
		
		String[] pilih = {"Iya","Tidak"};
		JComboBox<String> BoxSim = new JComboBox<>(pilih);
		BoxSim.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BoxSim.setBounds(175, 180, 84, 31);
		frame.getContentPane().add(BoxSim);
		
		
		JButton btnProses = new JButton("Proses");
		btnProses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nama = FieldNama.getText();
				int Umur = Integer.parseInt(FieldUmur.getText());
				String inputumur = FieldUmur.getText();
				String Pilihan = (String) BoxSim.getSelectedItem();
				
				if (Nama.isEmpty() || inputumur.isEmpty()) {
					JOptionPane.showMessageDialog(frame, "Harap Masukan Nama dan Umur Anda!");
				}else {
					if((Umur>=17) && (Pilihan == pilih[0])) {
						LabelHasil.setText("Anda Sudah Dewasa dan Boleh Bawa Motor");
						
					}else if((Umur>=17) && (Pilihan == pilih[1])) {
						LabelHasil.setText("Anda Sudah Dewasa Tetapi Tidak Boleh Bawa Motor");
						
					}else if((Umur<17) && (Pilihan == pilih[0])) {
						LabelHasil.setText("Anda Sudah Punya Sim Tetapi Belum Cukup Umur");
						
					}else if((Umur<17) && (Pilihan == pilih[1])) {
						LabelHasil.setText("Anda Belum Cukup Umur bawa motor");
						
					}
				}
				
			}
		});
		btnProses.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnProses.setBounds(82, 281, 109, 31);
		frame.getContentPane().add(btnProses);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FieldNama.setText(null);
				FieldUmur.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReset.setBounds(301, 281, 109, 31);
		frame.getContentPane().add(btnReset);
		
	}
}