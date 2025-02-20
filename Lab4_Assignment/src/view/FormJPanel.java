/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.User;

/**
 *
 * @author arkpatel
 */
public class FormJPanel extends javax.swing.JPanel {
    
    JPanel bottomPanel;
    ImageIcon picture;

    /**
     * Creates new form FormJPanel
     */
    public FormJPanel() {
        initComponents();
    }
    
    public FormJPanel(JPanel bottomPanel) {
        initComponents();
        this.bottomPanel = bottomPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerHereLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        hobbiesLabel = new javax.swing.JLabel();
        hobbyScrollPane = new javax.swing.JScrollPane();
        hobbiesTextArea = new javax.swing.JTextArea();
        submitButton = new javax.swing.JButton();
        photoLabel = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(204, 204, 255));

        registerHereLabel.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        registerHereLabel.setText("Register Here");

        firstNameLabel.setText("First Name :");

        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        lastNameLabel.setText("Last Name :");

        ageLabel.setText("Age :");

        genderLabel.setText("Gender :");

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        genderComboBox.setSelectedIndex(-1);

        emailLabel.setText("E-mail :");

        hobbiesLabel.setText("Hobbies :");

        hobbiesTextArea.setColumns(20);
        hobbiesTextArea.setRows(5);
        hobbyScrollPane.setViewportView(hobbiesTextArea);

        submitButton.setBackground(new java.awt.Color(204, 204, 204));
        submitButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        photoLabel.setText("Photo :");

        uploadButton.setBackground(new java.awt.Color(204, 204, 204));
        uploadButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        dobLabel.setText("Date Of Birth :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(registerHereLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ageLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(firstNameLabel)
                                .addComponent(lastNameLabel))
                            .addComponent(genderLabel)
                            .addComponent(emailLabel)
                            .addComponent(hobbiesLabel)
                            .addComponent(photoLabel)
                            .addComponent(dobLabel))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hobbyScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uploadButton)
                                .addGap(18, 18, 18)
                                .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(submitButton))
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(registerHereLabel)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hobbiesLabel)
                    .addComponent(hobbyScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dobLabel)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(photoLabel)
                        .addComponent(uploadButton))
                    .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(submitButton)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        try{
            User user = new User();

            //fname = this.firstNameTextField.getText();
            // lname = this.lastNameTextField.getText();
            // gender = this.genderComboBox.getSelectedItem().toString();
            //age = Integer.parseInt(this.ageTextField.getText());
            // phone = this.phoneNumberTextField.getText();
            // email = this.emailTextField.getText();
            // hobbies = this.hobbiesTextArea.getText();

            user.setFname(this.firstNameTextField.getText());
            user.setLname(this.lastNameTextField.getText());
            user.setGender(this.genderComboBox.getSelectedItem().toString());
            user.setAge(Integer.parseInt(this.ageTextField.getText()));
            user.setEmail(this.emailTextField.getText());
            user.setHobbies(this.hobbiesTextArea.getText());
            user.setPicture(this.picture);
     
            

            System.out.println(user.getFname());
            System.out.println(user.getLname());
            System.out.println(user.getGender());
            System.out.println(user.getAge());
            System.out.println(user.getEmail());
            System.out.println(user.getHobbies());
            System.out.println(user);

            if (user.getFname().isBlank() || user.getLname().isBlank() || user.getEmail().isBlank() || user.getHobbies().isBlank()){
                JOptionPane.showMessageDialog(this, "Please enter all the fields!!","OOPS!!", HEIGHT); 
            } 
            else{
                JOptionPane.showMessageDialog(this,user ,"Success!", HEIGHT,this.picture);
                ViewJPanel viewJPanelObject = new ViewJPanel(user);
                this.bottomPanel.add(viewJPanelObject);
                CardLayout layout = (CardLayout) this.bottomPanel.getLayout();
                layout.next(bottomPanel);
            }

        }catch (NullPointerException ne){
            JOptionPane.showMessageDialog(this, "Please select your gender.", "OOPS!!", HEIGHT);
        }catch (NumberFormatException ee){
            JOptionPane.showMessageDialog(this, "Please Enter valid AGE!!!", "OOPS!!", HEIGHT);
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Sorryyy!! Something went wrong!", "OOPS!!", HEIGHT);

        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                Image edited_image = img.getScaledInstance(60, 80,Image.SCALE_SMOOTH);
                if (edited_image != null) {
                     this.picture = new ImageIcon(edited_image);
                    imgLabel.setIcon(picture);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,"Upload Image Correctly!!!","OOPS!",HEIGHT);

            }

    }//GEN-LAST:event_uploadButtonActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel hobbiesLabel;
    private javax.swing.JTextArea hobbiesTextArea;
    private javax.swing.JScrollPane hobbyScrollPane;
    private javax.swing.JLabel imgLabel;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel registerHereLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
