/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view;

import app.component.ICalendar;
import app.controller.AplikasiController;
import app.entity.Aplikasi;
import app.model.AplikasiModel;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import swingx.filter.FilterArchieveType;
import swingx.filter.FilterImageType;

/**
 *
 * @author Casper
 */
public class PanelAplikasiInput extends javax.swing.JPanel {

    /**
     * Creates new form PanelAppInput
     */
    private JFileChooser fileChooserGambar;
    private JFileChooser fileChooserSource;

    public PanelAplikasiInput(AplikasiController controller, AplikasiModel model) {
        initComponents();
        this.controller = controller;
        this.model = model;

        fileChooserGambar = new JFileChooser();
        fileChooserGambar.setFileFilter(new FilterImageType());
        fileChooserGambar.setAcceptAllFileFilterUsed(false);

        fileChooserSource = new JFileChooser("./");
        fileChooserSource.setFileFilter(new FilterArchieveType());
        fileChooserSource.setAcceptAllFileFilterUsed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        textPembuat = new javax.swing.JTextField();
        textSumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDeskripsi = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        textTanggal = new app.component.ICalendar();
        jLabel6 = new javax.swing.JLabel();
        textLokasi = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        try {
            iScreen8 = new app.component.IScreen();
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
        try {
            iScreen10 = new app.component.IScreen();
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
        try {
            iScreen1 = new app.component.IScreen();
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
        try {
            iScreen2 = new app.component.IScreen();
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
        try {
            iScreen9 = new app.component.IScreen();
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
        try {
            iScreen7 = new app.component.IScreen();
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
        jButton2 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "App", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("Nama :");

        jLabel2.setText("Pembuat :");

        jLabel3.setText("Sumber :");

        jLabel4.setText("Deskripsi :");

        textDeskripsi.setColumns(20);
        textDeskripsi.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        textDeskripsi.setLineWrap(true);
        textDeskripsi.setRows(5);
        textDeskripsi.setWrapStyleWord(true);
        jScrollPane1.setViewportView(textDeskripsi);

        jLabel5.setText("Tanggal :");

        textTanggal.setBackground(new java.awt.Color(255, 255, 255));
        textTanggal.setToolTipText("");

        jLabel6.setText("Source Code :");

        textLokasi.setEditable(false);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resources/search.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNama)
                            .addComponent(textPembuat)
                            .addComponent(textSumber)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textLokasi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textPembuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textSumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Aplikasi", jPanel1);

        jButton1.setText("Tambah Gambar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Screenshot Aplikasi", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel2.add(iScreen8);
        jPanel2.add(iScreen10);
        jPanel2.add(iScreen1);
        jPanel2.add(iScreen2);
        jPanel2.add(iScreen9);
        jPanel2.add(iScreen7);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Screenshot Aplikasi", jPanel3);

        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (simpan) {
            controller.insert(this);
        } else {
            controller.update(this);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(fileChooserGambar.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (fileChooserSource.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            textLokasi.setText(fileChooserSource.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.component.IScreen iScreen1;
    private app.component.IScreen iScreen10;
    private app.component.IScreen iScreen2;
    private app.component.IScreen iScreen7;
    private app.component.IScreen iScreen8;
    private app.component.IScreen iScreen9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea textDeskripsi;
    private javax.swing.JTextField textLokasi;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textPembuat;
    private javax.swing.JTextField textSumber;
    private app.component.ICalendar textTanggal;
    // End of variables declaration//GEN-END:variables
    private boolean simpan;
    private String id;
    private AplikasiController controller;
    private AplikasiModel model;

    public void setSimpan(boolean simpan) {
        this.simpan = simpan;

        if (simpan) {
            try {
                id = model.getAutoKode();
            } catch (Exception ex) {
            }
            textTanggal.setDate(new java.util.Date());
        }
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APP - " + id,
                javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 12))); // NOI18N

    }

    public String getId() {
        return id;
    }

    public void set(Aplikasi e) {
        id = e.getId();
        textNama.setText(e.getNama());
        textPembuat.setText(e.getPembuat());
        textSumber.setText(e.getSumber());
        textDeskripsi.setText(e.getDeskripsi());
        textTanggal.setDate(e.getTanggal());
        textLokasi.setText(e.getLokasi());
    }

    public JTextArea getTextDeskripsi() {
        return textDeskripsi;
    }

    public JTextField getTextNama() {
        return textNama;
    }

    public JTextField getTextPembuat() {
        return textPembuat;
    }

    public JTextField getTextSumber() {
        return textSumber;
    }

    public JTextField getTextLokasi() {
        return textLokasi;
    }

    public ICalendar getTextTanggal() {
        return textTanggal;
    }

}