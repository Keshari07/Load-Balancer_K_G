package entities;

import LoadBalancerTacticManager.LoadBalancer;
import LoadBalancerTacticManager.TacticManager;
import common.Utilities;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.util.Arrays;
/**
 * Entity containing the GUI of the Load Balancer and Tactic Manager. This entity is also responsible for initializing the composing entities, Load Balancer and Tactic Manager.
 * @author Filipe Pires (85122) and João Alegria (85048)
 */
public class LoadBalancerTacticManager extends javax.swing.JFrame implements UiController{
    
    private LoadBalancer lb;
    private TacticManager tm;
    
    private int nReq;
    private int nProc;
    private int occupation;
    
    /**
     * Creates new form LoadBalancerTacticManager
     */
    public LoadBalancerTacticManager(){
        this.setTitle("LB/M");
        initComponents();
        this.hostLB.setText("localhost");
        this.portLB.setText("6000");
        this.hostTM.setText("localhost");
        this.portTM.setText("6001");
        
        this.nReq = 0; this.nProc = 0; this.occupation = 0;
        this.nRequests.setText(""+nReq);
        this.nProcessed.setText(""+nProc);
        this.nOccupation.setText(""+occupation);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        upServers = new javax.swing.JList<>();
        stop = new javax.swing.JButton();
        newServer = new javax.swing.JButton();
        newClient = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        clients = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        processingRequests = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        processedRequests = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        hostTM = new javax.swing.JTextField();
        portTM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hostLB = new javax.swing.JTextField();
        portLB = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        status = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nRequests = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nProcessed = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nOccupation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(704, 340));

        jScrollPane1.setViewportView(upServers);

        stop.setText("Stop");
        stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopMouseClicked(evt);
            }
        });

        newServer.setText("Add New Server");
        newServer.setEnabled(false);
        newServer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newServerMouseClicked(evt);
            }
        });

        newClient.setText("Add New Client");
        newClient.setEnabled(false);
        newClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newClientMouseClicked(evt);
            }
        });

        jScrollPane4.setViewportView(clients);

        jScrollPane5.setViewportView(processingRequests);

        jScrollPane6.setViewportView(processedRequests);

        jLabel1.setText("Tactic Manager:");

        jLabel2.setText("Load Balancer:");

        confirm.setText("Confirm");
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmMouseClicked(evt);
            }
        });

        status.setEditable(false);
        status.setBackground(java.awt.Color.red);
        status.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        status.setText("Status");
        status.setFocusable(false);

        jLabel3.setText("Requests Successfully Processed:");

        jLabel4.setText("Processing:");

        jLabel5.setText("Connected Servers:");

        jLabel6.setText("Clients:");

        jLabel7.setText("# Requests:");

        nRequests.setText("0");

        jLabel8.setText("# Processed:");

        nProcessed.setText("0");

        jLabel9.setText("Total Occupation:");

        nOccupation.setText("00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(status)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hostTM, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(portTM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hostLB, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(portLB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confirm))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newClient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(newServer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(stop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nRequests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nProcessed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nOccupation)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(120, 120, 120))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(127, 127, 127))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(185, 185, 185))
                                    .addComponent(jScrollPane4))))
                        .addGap(6, 6, 6))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm)
                    .addComponent(jLabel1)
                    .addComponent(hostTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(hostLB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portLB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(nRequests))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(nProcessed))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(nOccupation)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newServer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stop))
                    .addComponent(jScrollPane4))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newServerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newServerMouseClicked
        int serverID = tm.getNewServerID();
        String userDir = System.getProperty("user.dir");
        String jars = userDir + "/dist/lib/*:";
        String[] commands = new String[1];
        commands[0] = "java -cp " + jars + userDir + "/build/classes entities.Server "  + (6100+serverID+1) + " " + this.hostTM.getText() + " " + Integer.valueOf(this.portTM.getText()); // launch Servers
        try {
            Utilities.runProcess(commands);
        } catch (Exception ex) {
            System.err.println("Error: unable to assign process to an entity.");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_newServerMouseClicked

    private void newClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newClientMouseClicked
        int clientID = tm.getNewClientID();
        String userDir = System.getProperty("user.dir");
        String jars = userDir + "/dist/lib/*:";
        String[] commands = new String[1];
        commands[0] = "java -cp " + jars + userDir + "/build/classes entities.Client " + (6200+clientID+1) + " " + this.hostLB.getText() + " " + Integer.valueOf(this.portLB.getText()); // launch Clients
        try {
            Utilities.runProcess(commands);
        } catch (Exception ex) {
            System.err.println("Error: unable to assign process to an entity.");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_newClientMouseClicked

    private void stopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopMouseClicked
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_stopMouseClicked

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
        this.tm=new TacticManager(Integer.valueOf(this.portTM.getText()), this.hostLB.getText(), Integer.valueOf(this.portLB.getText()), this);
        this.lb=new LoadBalancer(Integer.valueOf(this.portLB.getText()), this.hostTM.getText(), Integer.valueOf(this.portTM.getText()));
        
        this.confirm.setEnabled(false);
        this.hostTM.setEnabled(false);
        this.portTM.setEnabled(false);
        this.hostLB.setEnabled(false);
        this.portLB.setEnabled(false);
        this.newServer.setEnabled(true);
        this.newClient.setEnabled(true);
        status.setBackground(Color.green);
    }//GEN-LAST:event_confirmMouseClicked

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
            java.util.logging.Logger.getLogger(LoadBalancerTacticManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadBalancerTacticManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadBalancerTacticManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadBalancerTacticManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadBalancerTacticManager().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> clients;
    private javax.swing.JButton confirm;
    private javax.swing.JTextField hostLB;
    private javax.swing.JTextField hostTM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel nOccupation;
    private javax.swing.JLabel nProcessed;
    private javax.swing.JLabel nRequests;
    private javax.swing.JButton newClient;
    private javax.swing.JButton newServer;
    private javax.swing.JTextField portLB;
    private javax.swing.JTextField portTM;
    private javax.swing.JList<String> processedRequests;
    private javax.swing.JList<String> processingRequests;
    private javax.swing.JTextField status;
    private javax.swing.JButton stop;
    private javax.swing.JList<String> upServers;
    // End of variables declaration//GEN-END:variables

    /**
     * Updates the server list of the GUI.
     * @param servers String[] containing the server list information
     */
    @Override
    public void defineUpServers(String[] servers) {
        this.upServers.setListData(servers);
        this.occupation = 0;
        for(String s: servers) {
            String[] details = s.split("\\|");
            this.occupation += Integer.valueOf(details[0].split("Occupation: ")[1].trim());
        }
        this.nOccupation.setText(""+occupation);
    }

    /**
     * Updates the client list of the GUI.
     * @param clients String[] containing the client list information
     */
    @Override
    public void defineClients(String[] clients) {
        this.clients.setListData(clients);
    }

    /**
     * Updates the processing messages list of the GUI.
     * @param messages String[] containing the processing messages list information
     */
    @Override
    public void addProcessingMessage(String[] messages) {
        this.processingRequests.setListData(messages);
        this.nReq++;
        this.nRequests.setText(""+nReq);
    }

    /**
     * Updates the processed messages list of the GUI.
     * @param messages String[] containing the processed messages list information
     */
    @Override
    public void addProcessedMessage(String[] messages) {
        this.processedRequests.setListData(messages);
        this.nProc++;
        this.nProcessed.setText(""+nProc);
        this.nReq--;
        this.nRequests.setText(""+nReq);
    }
}