package alistirmalar;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class HesapMakinesi extends JFrame {

       private static final long serialVersionUID = 1L;
       private JPanel konteynir, ekran, tuslar;
       private JTextField sayiAlani;
       private JLabel islem;
       private String operator;
       private int sayi, sonuc;

       public static void main(String[] args) {
               EventQueue.invokeLater(new Runnable() {
                       public void run() {
                               try {
                                       HesapMakinesi frame = new HesapMakinesi();
                                       frame.setVisible(true);
                               } catch (Exception e) {
                                       e.printStackTrace();
                               }
                       }
               });
       }

       public int hesap() {
               switch(operator) {
               case "+":
                       sonuc=(int) ((double) sayi+Integer.parseInt(sayiAlani.getText()));
                       break;
               case "-":
                       sonuc=(int) ((double)sayi-Integer.parseInt(sayiAlani.getText()));
                       break;
               case "*":
                       sonuc=(int) ((double)sayi*Integer.parseInt(sayiAlani.getText()));
                       break;
               case "/":
                       sonuc=(int) ((double)sayi/Integer.parseInt(sayiAlani.getText()));
                       break;
               }
               return sonuc;
       }

       public HesapMakinesi() {
               //PENCERE AYARLARI
               //başlık
               setTitle("Hesap Makinesi");
               //kapatma tuşuna basınca tamamen kapansın
               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               //ekranın sol üst köşesinden 100px sağda, 100px aşağıda bulunsun ve genişliği 300px, yüksekliği 350px olsun
               setBounds(100, 100, 300, 350);
               //yeniden boyutlanamasın
               setResizable(false);

               //konteynır oluştur
               konteynir = new JPanel();
               //kenarlık (üst,sol,alt,sağ)
               konteynir.setBorder(new EmptyBorder(5, 5, 5, 5));
               //absolute layout, düzen yok
               konteynir.setLayout(null);

               //pencerenin içeriği bu  konteynır olsun
               setContentPane(konteynir);

               //sayıların gözükeceği ekran için panel
               ekran = new JPanel();
               //konumunu ayarla
               ekran.setBounds(10, 10, 266, 55);
               //düzen olmasın
               ekran.setLayout(null);
               //ekran panelini konteynıra ekle
               konteynir.add(ekran);

               //sayı alanı
               sayiAlani = new JTextField();
               //yazı hizalanmasını sağa ayarla
               sayiAlani.setHorizontalAlignment(SwingConstants.RIGHT);
               //sayı alanındaki yazıların font ayarları
               sayiAlani.setFont(new Font("Tahoma", Font.PLAIN, 18));
               //konumu
               sayiAlani.setBounds(0, 20, 266, 35);
               //bu sayı alanını ekrana ekle
               ekran.add(sayiAlani);

               islem = new JLabel("");
               islem.setHorizontalAlignment(SwingConstants.RIGHT);
               islem.setBounds(158, 0, 108, 21);
               ekran.add(islem);

               //tuşlar için panel
               tuslar = new JPanel();
               //konteynırdaki konumu
               tuslar.setBounds(10, 75, 266, 228);
               //ızgara düzeni olsun (satır, sütun, sütun boşluğu, satır boşluğu)
               tuslar.setLayout(new GridLayout(4, 4, 15, 35));
               //tuşlar panelini konteynıra ekle
               konteynir.add(tuslar);

               //TUŞLARI EKLEME
               JButton Tus7 = new JButton("7");
               Tus7.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               sayiAlani.setText(sayiAlani.getText()+Tus7.getText());
                       }
               });
               Tus7.setForeground(new Color(255, 255, 255));
               Tus7.setBackground(new Color(0, 0, 255));
               tuslar.add(Tus7);

               JButton Tus8 = new JButton("8");
               Tus8.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               sayiAlani.setText(sayiAlani.getText()+Tus8.getText());
                       }
               });
               Tus8.setForeground(new Color(255, 255, 255));
               Tus8.setBackground(new Color(0, 0, 255));
               tuslar.add(Tus8);

               JButton Tus9 = new JButton("9");
               Tus9.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               sayiAlani.setText(sayiAlani.getText()+Tus9.getText());
                       }
               });
               Tus9.setForeground(new Color(255, 255, 255));
               Tus9.setBackground(new Color(0, 0, 255));
               tuslar.add(Tus9);

               JButton Arti = new JButton("+");
               Arti.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               sayi=Integer.parseInt(sayiAlani.getText());
                               islem.setText(sayiAlani.getText()+e.getActionCommand());
                               operator="+";
                               sayiAlani.setText("");
                       }
               });
               Arti.setBackground(new Color(128, 255, 255));
               tuslar.add(Arti);

               JButton Tus4 = new JButton("4");
               Tus4.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               sayiAlani.setText(sayiAlani.getText()+Tus4.getText());
                       }
               });
               Tus4.setForeground(new Color(255, 255, 255));
               Tus4.setBackground(new Color(0, 0, 255));
               tuslar.add(Tus4);

               JButton Tus5 = new JButton("5");
               Tus5.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               sayiAlani.setText(sayiAlani.getText()+Tus5.getText());
                       }
               });
               Tus5.setForeground(new Color(255, 255, 255));
               Tus5.setBackground(new Color(0, 0, 255));
               tuslar.add(Tus5);

               JButton Tus6 = new JButton("6");
               Tus6.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               sayiAlani.setText(sayiAlani.getText()+Tus6.getText());
                       }
               });
               Tus6.setForeground(new Color(255, 255, 255));
               Tus6.setBackground(new Color(0, 0, 255));
               tuslar.add(Tus6);

               JButton Eksi = new JButton("-");
               Eksi.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               sayi=Integer.parseInt(sayiAlani.getText());
                               islem.setText(sayiAlani.getText()+e.getActionCommand());
                               operator="-";
                               sayiAlani.setText("");
                       }
               });
               Eksi.setBackground(new Color(128, 255, 255));
               tuslar.add(Eksi);

               JButton Tus1 = new JButton("1");
               Tus1.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               sayiAlani.setText(sayiAlani.getText()+Tus1.getText());
                       }
               });
               Tus1.setForeground(new Color(255, 255, 255));
               Tus1.setBackground(new Color(0, 0, 255));
               tuslar.add(Tus1);

               JButton Tus2 = new JButton("2");
               Tus2.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               sayiAlani.setText(sayiAlani.getText()+Tus2.getText());
                       }
               });
               Tus2.setForeground(new Color(255, 255, 255));
               Tus2.setBackground(new Color(0, 0, 255));
               tuslar.add(Tus2);

               JButton Tus3 = new JButton("3");
               Tus3.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               sayiAlani.setText(sayiAlani.getText()+Tus3.getText());
                       }
               });
               Tus3.setForeground(new Color(255, 255, 255));
               Tus3.setBackground(new Color(0, 0, 255));
               tuslar.add(Tus3);

               JButton Carpi = new JButton("*");
               Carpi.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               sayi=Integer.parseInt(sayiAlani.getText());
                               islem.setText(sayiAlani.getText()+e.getActionCommand());
                               operator="*";
                               sayiAlani.setText("");
                       }
               });
               Carpi.setBackground(new Color(128, 255, 255));
               tuslar.add(Carpi);

               JButton Sifirla = new JButton("C");
               Sifirla.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               sayiAlani.setText("");
                       }
               });
               Sifirla.setForeground(new Color(255, 0, 0));
               tuslar.add(Sifirla);

               JButton Tus0 = new JButton("0");
               Tus0.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               sayiAlani.setText(sayiAlani.getText()+Tus0.getText());
                       }
               });
               Tus0.setForeground(new Color(255, 255, 255));
               Tus0.setBackground(new Color(0, 0, 255));
               tuslar.add(Tus0);

               JButton Esittir = new JButton("=");
               Esittir.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               sayiAlani.setText(String.valueOf(hesap()));
                               islem.setText("");
                       }
               });
               Esittir.setForeground(new Color(0, 220, 0));
               Esittir.setBackground(new Color(255, 194, 0));
               tuslar.add(Esittir);

               JButton Bolu = new JButton("/");
               Bolu.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               sayi=Integer.parseInt(sayiAlani.getText());
                               islem.setText(sayiAlani.getText()+e.getActionCommand());
                               operator="/";
                               sayiAlani.setText("");
                       }
               });
               Bolu.setBackground(new Color(128, 255, 255));
               tuslar.add(Bolu);
       }
}
