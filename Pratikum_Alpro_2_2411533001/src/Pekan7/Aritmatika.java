package Pekan7;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Aritmatika {

    private JFrame frame;
    private JTextField A;
    private JTextField B;

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

        // TextField untuk input A
        A = new JTextField();
        A.setBounds(179, 18, 80, 23);
        frame.getContentPane().add(A);
        A.setColumns(10);

        // ComboBox untuk memilih operasi
        JComboBox<String> kbtk = new JComboBox<>();
        kbtk.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        kbtk.addItem("Penjumlahan");
        kbtk.addItem("Pengurangan");
        kbtk.addItem("Perkalian");
        kbtk.addItem("Pembagian");
        kbtk.addItem("Sisa Bagi");
        kbtk.setBounds(163, 60, 112, 30);
        frame.getContentPane().add(kbtk);

        // TextField untuk input B
        B = new JTextField();
        B.setBounds(179, 111, 80, 23);
        frame.getContentPane().add(B);
        B.setColumns(10);

        // Label untuk menampilkan hasil
        JLabel lblNewLabel = new JLabel(" ");
        lblNewLabel.setBounds(179, 192, 200, 14);
        frame.getContentPane().add(lblNewLabel);

        // Button untuk proses
        JButton btnNewButton = new JButton("Proses");
        btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Mengambil input
                    int inputA = Integer.parseInt(A.getText());
                    int inputB = Integer.parseInt(B.getText());
                    String operasi = (String) kbtk.getSelectedItem();

                    int hasil = 0;

                    // Melakukan operasi berdasarkan pilihan
                    switch (operasi) {
                        case "Penjumlahan":
                            hasil = inputA + inputB;
                            break;
                        case "Pengurangan":
                            hasil = inputA - inputB;
                            break;
                        case "Pembagian":
                            if (inputB != 0) {
                                hasil = inputA / inputB;
                            } else {
                                lblNewLabel.setText("Tidak bisa membagi dengan nol!");
                                return;
                            }
                            break;
                        case "Perkalian":
                            hasil = inputA * inputB;
                            break;
                        case "Sisa Bagi":
                            if (inputB != 0) {
                                hasil = inputA % inputB;
                            } else {
                                lblNewLabel.setText(" Tidak bisa membagi dengan nol!");
                                return;
                            }
                            break;
                        default:
                            lblNewLabel.setText(" Operasi tidak dikenal!");
                            return;
                    }
                    
                    // Menampilkan hasil
                    lblNewLabel.setText(" " + hasil);
                } catch (NumberFormatException ex) {
                    lblNewLabel.setText("Input tidak valid!");
                }
            }
        });
        btnNewButton.setBounds(176, 145, 86, 36);
        frame.getContentPane().add(btnNewButton);
    }
}