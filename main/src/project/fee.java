/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class fee extends javax.swing.JFrame {

    /**
     * Creates new form fee
     */
    public fee() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Choose Class");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("SHOW");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setText(" Rs. 500/-");
        jTextField1.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Prospectus & Registration Fee ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setText("CHAMELI DEVI PUBLIC SCHOOL");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Phone : 0731-4212999,  Fax : 0731-4059204");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/logo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setText(" Rs. 3000/-");
        jTextField2.setEnabled(false);

        tab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Installments", "Due Date", "Fee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tab1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Tejpur Gadbadi, Kesar Bagh Road, Indore 452012 (M.P.)");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("2018-19");

        cb1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nursery", "KG I", "KG II", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th" }));
        cb1.setSelectedIndex(-1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Admission Fee (Non-Refundable)");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("One Time Payment (New Student)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Fee Structure");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("email : info@cpsindore.com");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Caution Money (Refundable)");

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField3.setText(" Rs. 3000/-");
        jTextField3.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jLabel14.setText("Mode of Payment :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Cash/Pay Order/Demand Draft/Swipe Machine :");

        jTextArea1.setBackground(new java.awt.Color(255, 255, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Parents may deposit the fee & charges by means of Swipe Machine through their debit/credit cards. Existing Parents can also deposit Fee by Cheque (AT Par).");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("RTGS/NEFT/Net Banking :");

        jTextArea2.setBackground(new java.awt.Color(255, 255, 102));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("Parents may deposit fee/charges by means of NEFT/RTGS/Net Banking as per their convenience. After depositing the amount in bank, parents are advised to send the scanned copy of receipt through e-mail at info@cpsindore.com or What's App on mobile no.+91 9301999208, so that correct receipt of amount received can be sent to the parent through either mail or What's App.");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea2);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Please note down the following bank details for this purpose:");

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1.", "IDBI Bank Ltd.", "16/C, Omni Palace, Ratlam Kothi Main, Indore (M.P.)", "IBKL0000001", "001104000353144"}
            },
            new String [] {
                "S.No.", "Name Of Bank", "Branch", "IFS Code", "Account No."
            }
        ));
        jTable2.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane6.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(400);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(900);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(1600);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(800);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(900);
        }

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Note :");

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(255, 255, 102));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setText("1. All above fee and charges are compulsorily applicable.\n2. Management reserves the right to increase Fee and Charges on the prevailing applicable Fee & Charges\n   from next session.\n3. Any tax levied by Local / State / central Government will be payable on actuals as per norms/rules.\n4. Management reserves the right to change the school timings as and when necessary.\n5. Rs. 25/- for Identity Card and Rs. 25/- for Student Diary are payable with 1st Installment.\n6. Prescribed Books and Uniforms (as displayed on school notice board) to be arranged by the parents\n   themselves from any where.\n7. School does not accept and allow any kind of Donation, Capitation Fees, Building fund and gift.\n8. It is mandatory to deposit all types of fees/charges etc, in school office only and collect the receipt for    the same\n");
        jTextArea3.setWrapStyleWord(true);
        jScrollPane5.setViewportView(jTextArea3);

        jTextField4.setBackground(new java.awt.Color(255, 255, 102));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField4.setText("Rs. 25/- for Identity Card and Rs. 25/- for Student Diary are payable with 1st Instalment. ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(517, 517, 517)
                                .addComponent(jLabel12)
                                .addGap(80, 80, 80)
                                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(592, 592, 592)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(83, 83, 83)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(257, 257, 257)
                                            .addComponent(jLabel3))
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(180, 180, 180)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel10))
                                                    .addGap(144, 144, 144)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(jLabel4)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(136, 136, 136)
                                            .addComponent(jLabel5))
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel18)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15)
                            .addComponent(jScrollPane3)
                            .addComponent(jLabel16)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(614, 614, 614)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(459, 459, 459)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(524, 603, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel6)
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1631, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1805, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model1 = (DefaultTableModel)tab1.getModel();
        //For Nursery
        if (cb1.getSelectedIndex()==0)
        {
            model1.setValueAt("1st", 0,0);
            model1.setValueAt("5th June", 0,1);
            model1.setValueAt("6200 /-", 0,2);
            model1.setValueAt("2nd", 1,0);
            model1.setValueAt("5th Sept.", 1,1);
            model1.setValueAt("6200 /-", 1,2);
            model1.setValueAt("3rd", 2,0);
            model1.setValueAt("5th Dec.", 2,1);
            model1.setValueAt("6200 /-", 2,2);
            model1.setValueAt("4th", 3,0);
            model1.setValueAt("5th Mar.", 3,1);
            model1.setValueAt("6200 /-", 3,2);

        }
        //For KG I
        else if (cb1.getSelectedIndex()==1)
        {
            model1.setValueAt("1st", 0,0);
            model1.setValueAt("5th June", 0,1);
            model1.setValueAt("6200 /-", 0,2);
            model1.setValueAt("2nd", 1,0);
            model1.setValueAt("5th Sept.", 1,1);
            model1.setValueAt("6200 /-", 1,2);
            model1.setValueAt("3rd", 2,0);
            model1.setValueAt("5th Dec.", 2,1);
            model1.setValueAt("6200 /-", 2,2);
            model1.setValueAt("4th", 3,0);
            model1.setValueAt("5th Mar.", 3,1);
            model1.setValueAt("6200 /-", 3,2);
        }
        //For KG II
        else if (cb1.getSelectedIndex()==2)
        {
            model1.setValueAt("1st", 0,0);
            model1.setValueAt("5th June", 0,1);
            model1.setValueAt("6200 /-", 0,2);
            model1.setValueAt("2nd", 1,0);
            model1.setValueAt("5th Sept.", 1,1);
            model1.setValueAt("6200 /-", 1,2);
            model1.setValueAt("3rd", 2,0);
            model1.setValueAt("5th Dec.", 2,1);
            model1.setValueAt("6200 /-", 2,2);
            model1.setValueAt("4th", 3,0);
            model1.setValueAt("5th March.", 3,1);
            model1.setValueAt("6200 /-", 3,2);
        }
        //For I
        else if (cb1.getSelectedIndex()==3)
        {
            model1.setValueAt("1st", 0,0);
            model1.setValueAt("5th June", 0,1);
            model1.setValueAt("8000 /-", 0,2);
            model1.setValueAt("2nd", 1,0);
            model1.setValueAt("5th Sept.", 1,1);
            model1.setValueAt("8000 /-", 1,2);
            model1.setValueAt("3rd", 2,0);
            model1.setValueAt("5th Dec.", 2,1);
            model1.setValueAt("8000 /-", 2,2);
            model1.setValueAt("4rd", 3,0);
            model1.setValueAt("5th Mar.", 3,1);
            model1.setValueAt("74000 /-", 3,2);
        }
        //For II
        else if (cb1.getSelectedIndex()==4)
        {
            model1.setValueAt("1st", 0,0);
            model1.setValueAt("5th June", 0,1);
            model1.setValueAt("8000 /-", 0,2);
            model1.setValueAt("2nd", 1,0);
            model1.setValueAt("5th Sept.", 1,1);
            model1.setValueAt("8000 /-", 1,2);
            model1.setValueAt("3rd", 2,0);
            model1.setValueAt("5th Dec.", 2,1);
            model1.setValueAt("8000 /-", 2,2);
            model1.setValueAt("4rd", 3,0);
            model1.setValueAt("5th Mar.", 3,1);
            model1.setValueAt("74000 /-", 3,2);
        }
        //For III
        else if (cb1.getSelectedIndex()==5)
        {
            model1.setValueAt("1st", 0,0);
            model1.setValueAt("5th June", 0,1);
            model1.setValueAt("8000 /-", 0,2);
            model1.setValueAt("2nd", 1,0);
            model1.setValueAt("5th Sept.", 1,1);
            model1.setValueAt("8000 /-", 1,2);
            model1.setValueAt("3rd", 2,0);
            model1.setValueAt("5th Dec.", 2,1);
            model1.setValueAt("8000 /-", 2,2);
            model1.setValueAt("4rd", 3,0);
            model1.setValueAt("5th Mar.", 3,1);
            model1.setValueAt("74000 /-", 3,2);
        }
        //For IV
        else if (cb1.getSelectedIndex()==6)
        {
            model1.setValueAt("1st", 0,0);
            model1.setValueAt("5th June", 0,1);
            model1.setValueAt("8000 /-", 0,2);
            model1.setValueAt("2nd", 1,0);
            model1.setValueAt("5th Sept.", 1,1);
            model1.setValueAt("8000 /-", 1,2);
            model1.setValueAt("3rd", 2,0);
            model1.setValueAt("5th Dec.", 2,1);
            model1.setValueAt("8000 /-", 2,2);
            model1.setValueAt("4rd", 3,0);
            model1.setValueAt("5th Mar.", 3,1);
            model1.setValueAt("74000 /-", 3,2);
        }
        //For V
        else if (cb1.getSelectedIndex()==7)
        {
            model1.setValueAt("1st", 0,0);
            model1.setValueAt("5th June", 0,1);
            model1.setValueAt("8000 /-", 0,2);
            model1.setValueAt("2nd", 1,0);
            model1.setValueAt("5th Sept.", 1,1);
            model1.setValueAt("8000 /-", 1,2);
            model1.setValueAt("3rd", 2,0);
            model1.setValueAt("5th Dec.", 2,1);
            model1.setValueAt("8000 /-", 2,2);
            model1.setValueAt("4rd", 3,0);
            model1.setValueAt("5th Mar.", 3,1);
            model1.setValueAt("74000 /-", 3,2);
        }
        //For VI
        else if (cb1.getSelectedIndex()==8)
        {
            model1.setValueAt("1st", 0,0);
            model1.setValueAt("5th June", 0,1);
            model1.setValueAt("9000 /-", 0,2);
            model1.setValueAt("2nd", 1,0);
            model1.setValueAt("5th Sept.", 1,1);
            model1.setValueAt("9000 /-", 1,2);
            model1.setValueAt("3rd", 2,0);
            model1.setValueAt("5th Dec.", 2,1);
            model1.setValueAt("9000 /-", 2,2);
            model1.setValueAt("4rd", 3,0);
            model1.setValueAt("5th Mar.", 3,1);
            model1.setValueAt("84000 /-", 3,2);
        }
        //For VII
        else if (cb1.getSelectedIndex()==9)
        {
            model1.setValueAt("1st", 0,0);
            model1.setValueAt("5th June", 0,1);
            model1.setValueAt("9000 /-", 0,2);
            model1.setValueAt("2nd", 1,0);
            model1.setValueAt("5th Sept.", 1,1);
            model1.setValueAt("9000 /-", 1,2);
            model1.setValueAt("3rd", 2,0);
            model1.setValueAt("5th Dec.", 2,1);
            model1.setValueAt("9000 /-", 2,2);
            model1.setValueAt("4rd", 3,0);
            model1.setValueAt("5th Mar.", 3,1);
            model1.setValueAt("84000 /-", 3,2);
        }
        //For VIII
        else if (cb1.getSelectedIndex()==10)
        {
            model1.setValueAt("1st", 0,0);
            model1.setValueAt("5th June", 0,1);
            model1.setValueAt("9000 /-", 0,2);
            model1.setValueAt("2nd", 1,0);
            model1.setValueAt("5th Sept.", 1,1);
            model1.setValueAt("9000 /-", 1,2);
            model1.setValueAt("3rd", 2,0);
            model1.setValueAt("5th Dec.", 2,1);
            model1.setValueAt("9000 /-", 2,2);
            model1.setValueAt("4rd", 3,0);
            model1.setValueAt("5th Mar.", 3,1);
            model1.setValueAt("84000 /-", 3,2);
        }
        //For XI
        else if (cb1.getSelectedIndex()==11)
        {
            model1.setValueAt("1st", 0,0);
            model1.setValueAt("5th June", 0,1);
            model1.setValueAt("10600 /-", 0,2);
            model1.setValueAt("2nd", 1,0);
            model1.setValueAt("5th Sept.", 1,1);
            model1.setValueAt("10600 /-", 1,2);
            model1.setValueAt("3rd", 2,0);
            model1.setValueAt("5th Dec.", 2,1);
            model1.setValueAt("10600 /-", 2,2);
            model1.setValueAt("4rd", 3,0);
            model1.setValueAt("5th Mar.", 3,1);
            model1.setValueAt("10050 /-", 3,2);
        }
        //For X
        else if (cb1.getSelectedIndex()==12)
        {
            model1.setValueAt("1st", 0,0);
            model1.setValueAt("5th June", 0,1);
            model1.setValueAt("10600 /-", 0,2);
            model1.setValueAt("2nd", 1,0);
            model1.setValueAt("5th Sept.", 1,1);
            model1.setValueAt("10600 /-", 1,2);
            model1.setValueAt("3rd", 2,0);
            model1.setValueAt("5th Dec.", 2,1);
            model1.setValueAt("10600 /-", 2,2);
            model1.setValueAt("4rd", 3,0);
            model1.setValueAt("5th Mar.", 3,1);
            model1.setValueAt("10050 /-", 3,2);
        }
        //For XI
        else if (cb1.getSelectedIndex()==13)
        {
            model1.setValueAt("1st", 0,0);
            model1.setValueAt("5th June", 0,1);
            model1.setValueAt("12500 /-", 0,2);
            model1.setValueAt("2nd", 1,0);
            model1.setValueAt("5th Sept.", 1,1);
            model1.setValueAt("12500 /-", 1,2);
            model1.setValueAt("3rd", 2,0);
            model1.setValueAt("5th Dec.", 2,1);
            model1.setValueAt("12500 /-", 2,2);
            model1.setValueAt("4rd", 3,0);
            model1.setValueAt("5th Mar.", 3,1);
            model1.setValueAt("11750 /-", 3,2);
        }
        //For XII
        else if (cb1.getSelectedIndex()==14)
        {
            model1.setValueAt("1st", 0,0);
            model1.setValueAt("5th June", 0,1);
            model1.setValueAt("12500 /-", 0,2);
            model1.setValueAt("2nd", 1,0);
            model1.setValueAt("5th Sept.", 1,1);
            model1.setValueAt("12500 /-", 1,2);
            model1.setValueAt("3rd", 2,0);
            model1.setValueAt("5th Dec.", 2,1);
            model1.setValueAt("12500 /-", 2,2);
            model1.setValueAt("4rd", 3,0);
            model1.setValueAt("5th Mar.", 3,1);
            model1.setValueAt("11750 /-", 3,2);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new module().setVisible(true) ; 
        dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tab1;
    // End of variables declaration//GEN-END:variables
}