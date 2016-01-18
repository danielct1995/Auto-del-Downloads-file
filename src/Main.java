/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto_del;

import java.io.File;
import java.io.IOException;
import java.time.Clock;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author PcCom1
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public Main() {
        this.creaDir();
        this.listFiles();
        if(this.files==null||this.files.length==0||this.files.length<this.umbral){
            System.exit(0);
        }
    //    this.img= new ImageIcon(getClass().getResource("/resources/papelera.png"));
        initComponents();
        String system = new String(System.getProperty("os.name"));
        String cls=new String(system.substring(0,system.indexOf(' ')));
        system=null;
        if(!cls.equalsIgnoreCase("Windows")){
            this.jButton3.setVisible(false);
        }  
        this.setTitle("Recolector de basura - Carpeta de Descargas");
        this.jLabel2.setText("Hola, hay "
                + this.files.length
                +" elementos"
                + " en la carpeta:");
        this.jLabel3.setText(this.direct.getPath());
        this.jLabel4.setText("¿Querría borrar los archivos?");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
     private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel(this.img);
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        selcarpetas = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Este es un testeo de la ventana");
        jLabel2.setToolTipText("");

        jButton1.setText("Borrar elementos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        selcarpetas.setText("Borrar también carpetas ");
        selcarpetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selcarpetasActionPerformed(evt);
            }
        });

        jButton3.setText("Mostrar carpeta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                    .addComponent(selcarpetas, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selcarpetas)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3)))
        );

        pack();
    }// </editor-fold>                       

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        System.gc();
        System.exit(0);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
       int ctr = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere borrar?\n"
               + "La acción no se pude deshacer");
        if (ctr == 0) {
            if (this.delCarpetas) {
                this.deleteALL();
            } else {
                this.deleteFilesOnly();
            }
        }
        System.exit(0);
    }                                        

    private void selcarpetasActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        this.delCarpetas=!this.delCarpetas;
    }                                           

     private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        Runtime aplicacion = Runtime.getRuntime(); 
        String addr=new String("C:\\Windows\\explorer.exe");
        addr=addr.concat(" ");
        addr =addr.concat(this.direct.getPath());
        try{aplicacion.exec(addr); }
        catch(Exception e){System.out.println(e);}
    }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    private void deleteALL() {

        for (int i = 0; i < this.files.length; i++) {
            
            if(this.files[i].isDirectory()){
                this.deleteAux(this.files[i]);
                this.files[i].delete();
                this.files[i].deleteOnExit();
            }
            else{
            this.files[i].delete();
            this.files[i].deleteOnExit();
            }
        }
    }
    private void deleteFilesOnly() {

        for (int i = 0; i < this.files.length; i++) {
            if (this.files[i].isFile()) {
                this.files[i].delete();
                this.files[i].deleteOnExit();
            }
            
            
        }
    }
    
    private void deleteAux(File f){
        File aux[]= f.listFiles();
        for (int i = 0; i < aux.length; i++) {
            if (aux[i].isFile()) {
                aux[i].delete();
                 aux[i].deleteOnExit();
            }
            else{
                if(aux[i].isDirectory()){
                    this.deleteAux(aux[i]);
                    aux[i].delete();
                    aux[i].deleteOnExit();
                }
            }
            
        }
    
    }
    
    
    private  void creaDir(){
    Properties p = new Properties();
        try {
            p.load(getClass().getResourceAsStream("/resources/config.properties"));
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
      String dir=new String(p.getProperty("config.dir"));
       this.direct= new File(dir);
    
      if(p.getProperty("config.umbral")==null){
          this.umbral=0;
      }
      else{
       this.umbral=Integer.valueOf(p.getProperty("config.umbral"));
      }
      }
    private void listFiles(){
        if(direct.isDirectory()){
            files=this.direct.listFiles();
            
        }
    }
    
    private boolean delCarpetas =false;
  //  private final ImageIcon img ;
    private File direct;
    private File files[];
    private int umbral;
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JCheckBox selcarpetas;
    // End of variables declaration                   
    //Variables propias
   
}
