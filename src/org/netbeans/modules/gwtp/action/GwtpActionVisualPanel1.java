/*
 * 02/01/2014
 */
package org.netbeans.modules.gwtp.action;

import javax.swing.JPanel;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import org.netbeans.modules.gwtp.util.SrcClass;
import org.netbeans.modules.gwtp.util.SrcPackage;

public final class GwtpActionVisualPanel1 extends JPanel {

    /**
     * Creates new form GwtpActionVisualPanel1
     */
    public GwtpActionVisualPanel1(List<SrcPackage> packages, 
            List<SrcClass> handlerModules, SrcPackage selPackage) {
        initComponents();
        
        comboBoxHandlerPackage.setModel(new DefaultComboBoxModel<SrcPackage>(
                packages.toArray(new SrcPackage[]{})));
        
        if (selPackage != null && packages.contains(selPackage))
            comboBoxHandlerPackage.setSelectedItem(selPackage);
        
        comboBoxHandlerModule.setModel(new DefaultComboBoxModel<SrcClass>(
                handlerModules.toArray(new SrcClass[]{})));
    }

    @Override
    public String getName() {
        return "Step #1";
    }

    public SrcPackage getSelActionHandler() {
        return (SrcPackage)comboBoxHandlerPackage.getSelectedItem();
    }
    
    public SrcClass getSelHandlerModule() {
        return (SrcClass)(comboBoxHandlerModule.getSelectedItem());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboBoxHandlerPackage = new javax.swing.JComboBox<org.netbeans.modules.gwtp.util.SrcPackage>();
        jLabel2 = new javax.swing.JLabel();
        comboBoxHandlerModule = new javax.swing.JComboBox<SrcClass>();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(GwtpActionVisualPanel1.class, "GwtpActionVisualPanel1.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(GwtpActionVisualPanel1.class, "GwtpActionVisualPanel1.jLabel2.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxHandlerPackage, 0, 350, Short.MAX_VALUE)
                    .addComponent(comboBoxHandlerModule, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxHandlerPackage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxHandlerModule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(216, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<SrcClass> comboBoxHandlerModule;
    private javax.swing.JComboBox<org.netbeans.modules.gwtp.util.SrcPackage> comboBoxHandlerPackage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
