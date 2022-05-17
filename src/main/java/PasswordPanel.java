import javax.swing.table.DefaultTableModel;
import java.io.*;

public class PasswordPanel extends javax.swing.JFrame {

    public PasswordPanel() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Pavadinimas = new javax.swing.JTextField();
        Slapt = new javax.swing.JTextField();
        APP = new javax.swing.JTextField();
        Komentaras = new javax.swing.JTextField();
        Gen = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        LookName = new javax.swing.JTextField();
        Keist = new javax.swing.JButton();
        Del = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Pavadinimas", "Slaptažodis", "URL/Aplikacija", "Komentaras"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        LogOut.setText("Atsijungit");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

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

        ADD.setText("Įsaugoti");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        jLabel5.setText("Paiška pagal pavadinimą");

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

        Del.setText("Pašalinti pasirinktą slaptažodį");
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Pavadinimas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(51, 51, 51))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(LookName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(Slapt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(44, 44, 44)
                                                        .addComponent(APP, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(43, 43, 43)
                                                        .addComponent(Komentaras, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(63, 63, 63)
                                                        .addComponent(ADD))
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(Keist)
                                                .addGap(45, 45, 45)
                                                .addComponent(Del)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LogOut)))
                                .addGap(47, 47, 47))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(101, 101, 101)
                                                .addComponent(jLabel1)
                                                .addGap(99, 99, 99)
                                                .addComponent(jLabel2)
                                                .addGap(86, 86, 86)
                                                .addComponent(jLabel3)
                                                .addGap(91, 91, 91)
                                                .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(224, 224, 224)
                                                .addComponent(Gen)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Pavadinimas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Slapt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(APP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Komentaras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ADD))
                                .addGap(18, 18, 18)
                                .addComponent(Gen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LogOut)
                                        .addComponent(LookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Keist)
                                        .addComponent(Del))
                                .addGap(35, 35, 35))
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
        ToCsv.ToTxtPersonal(ll.getVardas(),Pavadinimas.getText(), Slapt.getText(), APP.getText(), Komentaras.getText() );
        Atnaujinti();
    }

    private void GenActionPerformed(java.awt.event.ActionEvent evt) {

       String pas = PasswordGenerator.getPassword(8);
       Slapt.setText(pas);
    }

    private void DelActionPerformed(java.awt.event.ActionEvent evt) {
        Login ll = new Login();
        Atnaujinti();
    }

    private void KeistActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
    }

    private void Atnaujinti()
    {
        Login ll = new Login();
        DefaultTableModel tb2Model = (DefaultTableModel)this.jTable1.getModel();
        tb2Model.setRowCount(0);
        try {
            BufferedReader br = new BufferedReader(new FileReader(ll.getVardas() + ".txt"));
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

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


    private javax.swing.JButton ADD;
    private javax.swing.JTextField APP;
    private javax.swing.JButton Del;
    private javax.swing.JButton Gen;
    private javax.swing.JButton Keist;
    private javax.swing.JTextField Komentaras;
    private javax.swing.JButton LogOut;
    private javax.swing.JTextField LookName;
    private javax.swing.JTextField Pavadinimas;
    private javax.swing.JTextField Slapt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;

}
