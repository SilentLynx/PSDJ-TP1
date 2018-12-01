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
import javax.swing.table.DefaultTableModel;

public class AgendaView{
        
    // Variables declaration - do not modify                     
    private javax.swing.JButton apagarReuniaoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mainTable;
    private javax.swing.JButton novaReuniaoButton;
    private javax.swing.JButton regressarButton;
    private javax.swing.JButton verContactosButton;
    JFrame myFrame;
    private View view;
    // End of variables declaration
    
    /**
     * Creates new form AgendaFrame
     */
    public AgendaView() {
        this.myFrame = new JFrame("AgendaView");
        initComponents();
    }

    public void setView(View view)
    {
        this.view = view;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        verContactosButton = new javax.swing.JButton();
        regressarButton = new javax.swing.JButton();
        apagarReuniaoButton = new javax.swing.JButton();
        novaReuniaoButton = new javax.swing.JButton();

        this.myFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel1.setText("Universal Calculator");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        jLabel2.setText("Agenda");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.myFrame.getContentPane());
        this.myFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2))
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
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
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

        this.myFrame.pack();
        this.myFrame.setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void verContactosButtonActionPerformed(java.awt.event.ActionEvent evt)
    {                                                   
        view.openContactView();
        this.myFrame.setVisible(false);
    }                                                  

    private void regressarButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                
        this.myFrame.setVisible(false);
    }                                               

    private void apagarReuniaoButtonActionPerformed(java.awt.event.ActionEvent evt) throws ParseException 
    {                                                    
        LocalDate datAux = (LocalDate) this.mainTable.getModel().getValueAt(mainTable.getSelectedRow(), 2);
        LocalTime inicio = (LocalTime) this.mainTable.getModel().getValueAt(mainTable.getSelectedRow(), 3);
        LocalTime fim = (LocalTime) this.mainTable.getModel().getValueAt(mainTable.getSelectedRow(), 4);
        String nome = (String) this.mainTable.getModel().getValueAt(mainTable.getSelectedRow(), 0);

        this.view.apagaReuniaoToController(datAux,nome, inicio,fim);
        this.reloadTable();
    }                                                   

    private void novaReuniaoButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                  
        view.openReuniaoEdit();
    }
    
    public void addNovaReuniao(Date o, String nome, String local, String hora, String tamSlot, String numSlots)
    {
        LocalTime t = LocalTime.parse(hora);
        int minutos = Integer.parseInt(tamSlot);
        int num = Integer.parseInt(numSlots);
        System.out.println(nome);
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
}
