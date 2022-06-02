import org.springframework.security.crypto.bcrypt.BCrypt;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.*;
import java.util.Scanner;

public class PasswordPanel extends javax.swing.JFrame {

    public PasswordPanel() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Pavadinimas = new javax.swing.JTextField();
        Slapt = new javax.swing.JTextField();
        APP = new javax.swing.JTextField();
        Komentaras = new javax.swing.JTextField();
        Gen = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        LookName = new javax.swing.JTextField();
        Look = new javax.swing.JButton();
        Keist = new javax.swing.JButton();
        DEL = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Show = new javax.swing.JButton();
        Copy = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pavadinimas");

        jLabel2.setText("Slaptažodis");

        jLabel3.setText("URL/Aplikacija");

        jLabel4.setText("Komentaras");



        Gen.setText("Generuoti Slaptažodį");
        Gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenActionPerformed(evt);
            }
        });

        jLabel5.setText("paieška pagal pavadinimą");



        Look.setText("Ieškoti");
        Look.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LookActionPerformed(evt);
            }
        });

        Keist.setText("Keisti pasirinktą slaptažodį");
        Keist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    KeistActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        DEL.setText("Pašalinti pasirinktą slaptažodį");
        DEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    DELActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        LogOut.setText("Atsijungti");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        ADD.setText("Išsaugoti");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Pavadinimas", "Slaptažodis", "URL/Aplikacija", "Komentaras"
                }
        ));
        jScrollPane2.setViewportView(jTable2);

        Show.setText("Rodyti Slapyvardį");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });

        Copy.setText("Kopijuoti slapyvardį");
        Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });




        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(102, 102, 102)
                                                                .addComponent(jLabel1)
                                                                .addGap(114, 114, 114)
                                                                .addComponent(jLabel2)
                                                                .addGap(126, 126, 126)
                                                                .addComponent(jLabel3)
                                                                .addGap(114, 114, 114)
                                                                .addComponent(jLabel4))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(87, 87, 87)
                                                                .addComponent(Pavadinimas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(89, 89, 89)
                                                                .addComponent(Slapt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(97, 97, 97)
                                                                .addComponent(APP, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(85, 85, 85)
                                                                .addComponent(Komentaras, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(100, 100, 100)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(LookName)))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(123, 123, 123)
                                                                                .addComponent(Look)))
                                                                .addGap(57, 57, 57)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(Keist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(Show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(38, 38, 38)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(DEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(Copy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(239, 239, 239)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(Gen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ADD)
                                                        .addComponent(LogOut)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Pavadinimas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Slapt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(APP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Komentaras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ADD))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Gen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGap(17, 17, 17)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Keist)
                                        .addComponent(DEL))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Look)
                                                        .addComponent(Show)
                                                        .addComponent(Copy))
                                                .addGap(47, 47, 47))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(LogOut)
                                                .addGap(32, 32, 32))))
        );
        Login ll  = new Login();
        System.out.println(ll.getVardas());
        ToCsv.DecryptCsv(ll.getVardas());
        Atnaujinti();
        pack();
    }// </editor-fold>

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {
        Login ll  = new Login();
        ToCsv.EncryptCsv(ll.getVardas());
        new Login().setVisible(true);
        this.setVisible(false);
    }

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {
        Login ll  = new Login();
        ToCsv.ToTxtPersonal(ll.getVardas(),Pavadinimas.getText(), AES.encrypt(Slapt.getText()), APP.getText(), Komentaras.getText() );
        Atnaujinti();
    }

    private void GenActionPerformed(java.awt.event.ActionEvent evt) {

       String pas = PasswordGenerator.getPassword(8);
       Slapt.setText(pas);
    }

    private void DELActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        ToCsv.DeleteTxt(Login.getVardas(), LookName.getText());
        Atnaujinti();
    }
    private void LookActionPerformed(java.awt.event.ActionEvent evt) {
        if (LookName.getText().equals("")) Atnaujinti();
        else {
            int t = 0;
            String temp = "";
            Scanner input = null;
            try {
                input = new Scanner(new File(Login.getVardas() + ".txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            while (input.hasNext()) {
                String line = input.nextLine();

                if (line.contains(LookName.getText())) {
                    temp = line;
                    t = 1;
                    break;
                }
            }
            if (t == 1) {
                String s1 = temp;
                DefaultTableModel tb1Model = (DefaultTableModel) this.jTable2.getModel();
                tb1Model.setRowCount(0);
                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                String[] dataRow = s1.split(" ");
                model.addRow(dataRow);
            } else JOptionPane.showMessageDialog(null, "Slapyvardis tokiu pavadinimu nerastas");
        }
    }
    private void KeistActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        ToCsv.ChangeTxt(Login.getVardas(), AES.encrypt(Slapt.getText()), LookName.getText());
        Atnaujinti();
    }

    private void Atnaujinti()
    {
        Login ll = new Login();
        DefaultTableModel tb1Model = (DefaultTableModel)this.jTable2.getModel();
        tb1Model.setRowCount(0);
        try {
            BufferedReader br = new BufferedReader(new FileReader(ll.getVardas() + ".txt"));
            DefaultTableModel model = (DefaultTableModel)jTable2.getModel();

            Object[] tableLines = br.lines().toArray();
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(" ");
                model.addRow(dataRow);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {
        if (LookName.getText().equals("")) Atnaujinti();
        else {
            int t = 0;
            String temp = "";
            Scanner input = null;
            try {
                input = new Scanner(new File(Login.getVardas() + ".txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            while (input.hasNext()) {
                String line = input.nextLine();

                if (line.contains(LookName.getText())) {
                    temp = line;
                    t = 1;
                    break;
                }
            }
            if (t == 1) {
                String s1 = temp;
                DefaultTableModel tb1Model = (DefaultTableModel) this.jTable2.getModel();
                tb1Model.setRowCount(0);
                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                String[] dataRow = s1.split(" ");
                dataRow[1] = AES.decrypt(dataRow[1]);
                model.addRow(dataRow);
            }
        }
    }

    private void CopyActionPerformed(java.awt.event.ActionEvent evt) {

        if (LookName.getText().equals("")) Atnaujinti();
        else {
            int t = 0;
            String temp = "";
            Scanner input = null;
            try {
                input = new Scanner(new File(Login.getVardas() + ".txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            while (input.hasNext()) {
                String line = input.nextLine();

                if (line.contains(LookName.getText())) {
                    String[] sl = line.split(" ");
                    StringSelection selection = new StringSelection(AES.decrypt(sl[1]));
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboard.setContents(selection, selection);
                    break;
                }
            }
        }

    }


    private javax.swing.JButton ADD;
    private javax.swing.JTextField APP;
    private javax.swing.JButton Copy;
    private javax.swing.JButton DEL;
    private javax.swing.JButton Gen;
    private javax.swing.JButton Keist;
    private javax.swing.JTextField Komentaras;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton Look;
    private javax.swing.JTextField LookName;
    private javax.swing.JTextField Pavadinimas;
    private javax.swing.JButton Show;
    private javax.swing.JTextField Slapt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;

}
