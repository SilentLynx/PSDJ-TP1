package UniversalCalculatorView;

import UniversalCalculatorModel.Contacto;
import java.io.FileNotFoundException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ContactosView {

    // Variables declaration - do not modify                     
    private javax.swing.JButton apagarContactoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton novoContactoButton;
    private javax.swing.JButton regressarButton;
    private javax.swing.JButton reunioesButton;
    JFrame myFrame;
    private View view;
    
      // Variables declaration - do not modify                     
    private javax.swing.JButton acceptButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    JFrame myFrameEdit; 
    // End of variables declaration  
    
    /**
     * Creates new form ContactosFrame
     * @throws java.io.FileNotFoundException
     */
    public ContactosView() throws FileNotFoundException{
        this.myFrame = new JFrame("ContactosView");
        this.myFrameEdit = new JFrame("ContactoEdit");
        initComponentsView();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponentsView() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        reunioesButton = new javax.swing.JButton();
        novoContactoButton = new javax.swing.JButton();
        apagarContactoButton = new javax.swing.JButton();
        regressarButton = new javax.swing.JButton();

        this.myFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel1.setText("Universal Calculator");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        jLabel2.setText("Agenda");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Email"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        reunioesButton.setText("Reuniões");
        reunioesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reunioesButtonActionPerformed(evt);
            }
        });

        novoContactoButton.setText("Novo Contacto");
        novoContactoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoContactoButtonActionPerformed(evt);
            }
        });

        apagarContactoButton.setText("Apagar Contacto");
        apagarContactoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarContactoButtonActionPerformed(evt);
            }
        });

        regressarButton.setText("Regressar");
        regressarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regressarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.myFrame.getContentPane());
        this.myFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(reunioesButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(regressarButton))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(apagarContactoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(novoContactoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(novoContactoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apagarContactoButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reunioesButton)
                    .addComponent(regressarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        this.myFrame.pack();
        this.myFrame.setLocationRelativeTo(null);
    }// </editor-fold>                        

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        acceptButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        this.myFrameEdit.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        acceptButton.setText("Aceitar");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        jLabel4.setText("Telefone");

        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        jLabel6.setText("Contacto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.myFrameEdit.getContentPane());
        this.myFrameEdit.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(342, 342, 342))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(acceptButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cancelButton))
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(117, 117, 117))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        this.myFrameEdit.pack();
        this.myFrameEdit.setLocationRelativeTo(null);
    }// </editor-fold>                        
    
    private void reunioesButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                               
        view.openAgendaViewPage();
        this.myFrame.setVisible(false);
    }                                              

    private void regressarButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                
        this.myFrame.setVisible(false);
    }                                               

    private void novoContactoButtonActionPerformed(java.awt.event.ActionEvent evt)
    {                                                   
        this.myFrameEdit.setVisible(true);
    }                                                  

    private void apagarContactoButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
        String nome = (String) this.jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
        String telf = (String) this.jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1);
        String email = (String) this.jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2);
        
        this.view.deleteContactToController(nome, telf, email);
        this.reloadTable();
    }
    
    public void addContact(String nome,String telf,String email)
    {
        view.addContactToController(nome, telf, email);
    }

    void setView(View view) {
        this.view = view;
    }

    void preencheTabela(List<Contacto> lista) 
    {
        DefaultTableModel mod = (DefaultTableModel) this.jTable1.getModel();
        mod.setRowCount(0);

        lista.stream().forEach((c) -> {
            mod.addRow(new Object[]{c.getNome(), c.getNumTelm(), c.getEmail()});
        });
    }
    
    public void reloadTable()
    {
        view.reloadTableContacts();
    }
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                             
       String nome = this.jTextField1.getText();
       String telf = this.jTextField2.getText();
       String email = this.jTextField3.getText();
       addContact(nome, telf, email);
       this.myFrameEdit.setVisible(false);
       reloadTable();
    }                                            

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                             
        this.myFrameEdit.setVisible(false);
    }                                       
}
