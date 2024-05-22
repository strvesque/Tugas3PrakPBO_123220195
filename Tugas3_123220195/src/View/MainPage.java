/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import View.Dosen.ViewDataDsn;
import View.Mahasiswa.ViewDataMhs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class MainPage extends JFrame implements ActionListener {
    JLabel header = new JLabel("Halo, Selamat Datang!");
    JLabel label1 = new JLabel("Silahkan Pilih Data");
    JLabel label2 = new JLabel("Informasi Data Mahasiswa");
    JLabel label3 = new JLabel("Informasi Data Dosen");
    
            
    JButton tombolMhs = new JButton("Mahasiswa");
    JButton tombolDsn = new JButton("Dosen");
    JButton tombolKeluar = new JButton("Keluar");
    
    public MainPage(){
        setTitle("Main Page");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(552, 300);
        
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header);
        add(label1);
        add(label2);
        add(label3);
        add(tombolMhs);
        add(tombolDsn);
        add(tombolKeluar);
        
        header.setBounds(20, 8, 440, 24);
        label1.setBounds(20, 30, 440, 24);
        label2.setBounds(78, 80, 240, 40);
        tombolMhs.setBounds(30, 120, 240, 40);
        label3.setBounds(340, 80, 240, 40);
        tombolDsn.setBounds(280, 120, 240, 40);
        tombolKeluar.setBounds(30, 180, 490, 35);
        
        tombolMhs.addActionListener(this);
        tombolDsn.addActionListener(this);
        tombolKeluar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==tombolMhs){
                dispose();
                new ViewDataMhs();
            } else if(e.getSource()==tombolDsn){
                dispose();
                new ViewDataDsn();
            } else if(e.getSource()==tombolKeluar){
                System.exit(0);
            }
        } catch(Exception error){
            JOptionPane.showMessageDialog(null,"Database belum terhubung, \n tolong nyalakan XAMPP");
            System.exit(0);
        }
    }
}

