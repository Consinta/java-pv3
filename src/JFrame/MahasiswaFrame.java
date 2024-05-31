package JFrame;
import Config.Koneksi;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MahasiswaFrame extends javax.swing.JFrame {
    
    private Connection conn;
    
    public MahasiswaFrame() {
        initComponents();
        conn = Koneksi.getConnection();
        getAllData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataMahasiswa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textNIM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        buttonDelete = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        buttonCreate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDataMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nama", "NIM"
            }
        ));
        tblDataMahasiswa.setRowHeight(30);
        tblDataMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDataMahasiswa);

        jLabel1.setText("Nama");

        jLabel2.setText("NIM");

        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        buttonCreate.setText("Create");
        buttonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(textNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(212, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateActionPerformed
        String nama = textName.getText();
        String nim = textNIM.getText();
        
        if (nama.isEmpty() || nim.isEmpty()){
            JOptionPane.showMessageDialog(this, "Data masih kosong");
            return;
        }
        
        try {
            String query = "INSERT INTO mahasiswa (nama, nim) VALUES (?,?)";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, nama);
            st.setString(2, nim);
            
            int rowInserted = st.executeUpdate();
            
            if (rowInserted > 0){
                JOptionPane.showMessageDialog(this, "Sukses tambah ke database");
                resetForm();
                getAllData();
            }
            st.close();
        } catch (Exception e) {
            Logger.getLogger(MahasiswaFrame.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_buttonCreateActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        int isRowSelected = tblDataMahasiswa.getSelectedRow();
        
        if (isRowSelected == -1) {
            JOptionPane.showMessageDialog(this, "Klik item yg ingin di ubah");
            return;
        }
        
        String id = tblDataMahasiswa.getValueAt(isRowSelected, 0).toString();
        String nama = textName.getText();
        String nim = textNIM.getText();
        
        if (nama.isEmpty() || nim.isEmpty()){
            JOptionPane.showMessageDialog(this, "Data masih kosong");
            return;
        }

        try {
            String query = "UPDATE mahasiswa SET nama=?, nim=? WHERE id=?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, nama);
            st.setString(2, nim);
            st.setString(3, id);
            
            int rowUpdated = st.executeUpdate();
            
            if (rowUpdated > 0){
                JOptionPane.showMessageDialog(this, "Item yang di pilih telah di update");
                resetForm();
                getAllData();
            }
            st.close();
        } catch (Exception e) {
            Logger.getLogger(MahasiswaFrame.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void tblDataMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMahasiswaMouseClicked
        int isRowSelected = tblDataMahasiswa.getSelectedRow();
        
        if(isRowSelected != -1){
            String nama = tblDataMahasiswa.getValueAt(isRowSelected, 1).toString();
            String nim = tblDataMahasiswa.getValueAt(isRowSelected, 2).toString();
            
            textName.setText(nama);
            textNIM.setText(nim);
        }
    }//GEN-LAST:event_tblDataMahasiswaMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        resetForm();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        int isRowSelected = tblDataMahasiswa.getSelectedRow();
        
        if (isRowSelected == -1) {
            JOptionPane.showMessageDialog(this, "Klik item yg ingin dihapus");
            return;
        }
        
        int decision = JOptionPane.showConfirmDialog(this, "Peringatan, apa anda yakin ingin menghapus item?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
        if (decision == JOptionPane.YES_OPTION) {
            String id = tblDataMahasiswa.getValueAt(isRowSelected, 0).toString();
            
            try {
            String query = "DELETE FROM mahasiswa WHERE id=?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, id);
            
            int rowDeleted = st.executeUpdate();
            
            if (rowDeleted > 0){
                JOptionPane.showMessageDialog(this, "Item sukses dihapus");
                resetForm();
                getAllData();
            }
            st.close();
            } catch (Exception e) {
                Logger.getLogger(MahasiswaFrame.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MahasiswaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton buttonCreate;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDataMahasiswa;
    private javax.swing.JTextField textNIM;
    private javax.swing.JTextField textName;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        textName.setText("");
        textNIM.setText("");
    }
    
    private void getAllData() {
        DefaultTableModel model = (DefaultTableModel) tblDataMahasiswa.getModel();
        model.setRowCount(0);
        
        try {
            String query = "SELECT * FROM mahasiswa";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                String nim = rs.getString("nim");
                
                Object[] dataMahasiswa = {id,nama,nim};
                
                model.addRow(dataMahasiswa);
            }
            
            rs.close();
            st.close();
        } catch (Exception e) {
            Logger.getLogger(MahasiswaFrame.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    
}
