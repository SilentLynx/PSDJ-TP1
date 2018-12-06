package UniversalCalculatorView;

import UniversalCalculatorModel.Slot;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AgendaView{
        
    // Variables declaration - do not modify                     
    private javax.swing.JButton apagarReuniaoButton;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelAb;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mainTable;
    private javax.swing.JButton novaReuniaoButton;
    private javax.swing.JButton regressarButton;
    private javax.swing.JButton verContactosButton;
    JFrame myFrameMain;
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton acceptButton;
    private javax.swing.JButton cancelButton;
    private org.jdesktop.swingx.JXDatePicker date;
    private javax.swing.JTextField initTimeTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField localTF;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField numberOfSlotsTF;
    private javax.swing.JTextField slotSizeMinTF;
    JFrame myFrame;
    
    private View view;
    // End of variables declaration
    
    /**
     * Creates new form AgendaFrame
     */
    public AgendaView() {
        this.myFrameMain = new JFrame("Agenda");
        this.myFrame = new JFrame("Nova Reunião");
        initComponentsMain();
        initComponents();
    }

    public void setView(View view)
    {
        this.view = view;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponentsMain() {
        
        jLabelA = new javax.swing.JLabel();
        jLabelAb = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        verContactosButton = new javax.swing.JButton();
        regressarButton = new javax.swing.JButton();
        apagarReuniaoButton = new javax.swing.JButton();
        novaReuniaoButton = new javax.swing.JButton();

        this.myFrameMain.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelA.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabelA.setText("Universal Calculator");

        jLabelAb.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        jLabelAb.setText("Agenda");

        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Local", "Dia", "Início", "Fim"
            }
        ));
        jScrollPane1.setViewportView(mainTable);

        verContactosButton.setText("Contactos");
        verContactosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verContactosButtonActionPerformed(evt);
            }
        });

        regressarButton.setText("Regressar");
        regressarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regressarButtonActionPerformed(evt);
            }
        });

        apagarReuniaoButton.setText("Apagar Reunião");
        apagarReuniaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    apagarReuniaoButtonActionPerformed(evt);
                } catch (ParseException ex) {
                    Logger.getLogger(AgendaView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        novaReuniaoButton.setText("Nova Reunião");
        novaReuniaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaReuniaoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.myFrameMain.getContentPane());
        this.myFrameMain.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelA)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabelAb))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(verContactosButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(regressarButton))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(novaReuniaoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(apagarReuniaoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(novaReuniaoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apagarReuniaoButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verContactosButton)
                    .addComponent(regressarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        this.myFrameMain.pack();
        this.myFrameMain.setLocationRelativeTo(null);
    }// </editor-fold>                        

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        localTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        acceptButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        date = new org.jdesktop.swingx.JXDatePicker();
        jLabel11 = new javax.swing.JLabel();
        initTimeTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        slotSizeMinTF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        numberOfSlotsTF = new javax.swing.JTextField();

        this.myFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        jLabel2.setText("Reunião");

        jLabel1.setText("Nome");

        jLabel3.setText("Local");

        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });

        localTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localTFActionPerformed(evt);
            }
        });

        jLabel4.setText("Data");

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

        jLabel11.setText("Início");

        jLabel12.setText("(Exemplo: 12:00:00)");

        jLabel13.setText("Slot Size");

        jLabel14.setText("Number of Slots");

        jLabel15.setText("(Minutos)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.myFrame.getContentPane());
        this.myFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(acceptButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(localTF)
                                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(initTimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14))
                                        .addGap(7, 7, 7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(numberOfSlotsTF)
                                            .addComponent(slotSizeMinTF))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel15))))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(localTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(initTimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(slotSizeMinTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(numberOfSlotsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        this.myFrame.pack();
        this.myFrame.setLocationRelativeTo(null);
    }// </editor-fold>                    
    
    private void verContactosButtonActionPerformed(java.awt.event.ActionEvent evt)
    {                                                   
        view.openContactView();
        this.myFrameMain.setVisible(false);
    }                                                  

    private void regressarButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                
        myFrameMain.setVisible(false);
        view.exitToController();
        view.openLoginPage();
    }                                               

    private void apagarReuniaoButtonActionPerformed(java.awt.event.ActionEvent evt) throws ParseException 
    {                                                           
        if(this.mainTable.getSelectedRow() == -1)
        {           
            JOptionPane.showMessageDialog(null, "Selecione uma reunião");
        }
        else
        {
            LocalDate datAux = (LocalDate) this.mainTable.getModel().getValueAt(mainTable.getSelectedRow(), 2);
            LocalTime inicio = (LocalTime) this.mainTable.getModel().getValueAt(mainTable.getSelectedRow(), 3);
            LocalTime fim = (LocalTime) this.mainTable.getModel().getValueAt(mainTable.getSelectedRow(), 4);
            String nome = (String) this.mainTable.getModel().getValueAt(mainTable.getSelectedRow(), 0);
            
            if(JOptionPane.showConfirmDialog(null, "Deseja proceder?") == 0)
            {
                this.view.apagaReuniaoToController(datAux,nome, inicio,fim);
                this.reloadTable();
            }
        }
    }                                                   

    private void novaReuniaoButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                  
        this.myFrame.setVisible(true);
    }
    
    public void addNovaReuniao(Date o, String nome, String local, String hora, String tamSlot, String numSlots)
    {
        LocalTime t = LocalTime.parse(hora);
        int minutos = Integer.parseInt(tamSlot);
        int num = Integer.parseInt(numSlots);

        view.addReuniaoToController(o,nome ,local, t, minutos, num);
    }
    
    public void preencheTabela(List<Slot> lista)
    {
        DefaultTableModel mod = (DefaultTableModel) this.mainTable.getModel();
        mod.setRowCount(0);
        
        lista.stream().forEach((s) -> {
            mod.addRow(new Object[]{s.getNomeSlot(), s.getLocal(), s.getData(),s.getInicio(), s.getFim()});
        });
    }
    
    public void reloadTable()
    {
        this.view.reloadTableReunioes();
    }
    
    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {                                       
    }                                      

    private void localTFActionPerformed(java.awt.event.ActionEvent evt) {                                        
    }                                       

    private void datePickerActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                          

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                             
        this.myFrame.setVisible(false);
    }                                            

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                             
        Date o = this.date.getDate();
        String nome = this.nameTF.getText();
        String local = this.localTF.getText();
        String hora = this.initTimeTF.getText();
        String tamSlot = this.slotSizeMinTF.getText();
        String numSlots = this.numberOfSlotsTF.getText();

        addNovaReuniao(o,nome,local,hora,tamSlot,numSlots);
        reloadTable();
        this.myFrame.setVisible(false);
    }                                                     
}
