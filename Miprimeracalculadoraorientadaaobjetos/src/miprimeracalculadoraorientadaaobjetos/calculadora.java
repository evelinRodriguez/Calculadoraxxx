
package miprimeracalculadoraorientadaaobjetos;


public class calculadora extends javax.swing.JFrame {

   
    public calculadora() {
        initComponents();
    }
    String numero1="";
    String numero2="";
    int contador=0;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Suma = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Multiplicacion = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        Bcosecante = new javax.swing.JButton();
        Bseno1 = new javax.swing.JButton();
        Bcotangente = new javax.swing.JButton();
        Bsecante = new javax.swing.JButton();
        Btangente = new javax.swing.JButton();
        Bcoseno = new javax.swing.JButton();
        Bigual = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        n1 = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        n9 = new javax.swing.JButton();
        n0 = new javax.swing.JButton();
        etiqueta3 = new javax.swing.JLabel();
        etiqueta2 = new javax.swing.JLabel();
        etiqueta1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Suma.setText("+");
        Suma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SumaMouseClicked(evt);
            }
        });
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });
        getContentPane().add(Suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 83, 59, 52));

        Resta.setText("-");
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });
        getContentPane().add(Resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 58, 51));

        Multiplicacion.setText("x");
        Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacionActionPerformed(evt);
            }
        });
        getContentPane().add(Multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 59, 46));

        Division.setText("/");
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });
        getContentPane().add(Division, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 59, 51));

        Bcosecante.setText("cosecante");
        Bcosecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcosecanteActionPerformed(evt);
            }
        });
        getContentPane().add(Bcosecante, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 103, 51));

        Bseno1.setText("seno");
        Bseno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bseno1ActionPerformed(evt);
            }
        });
        getContentPane().add(Bseno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 83, 103, 52));

        Bcotangente.setText("cotangente");
        Bcotangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcotangenteActionPerformed(evt);
            }
        });
        getContentPane().add(Bcotangente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 103, 51));

        Bsecante.setText("secante");
        Bsecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsecanteActionPerformed(evt);
            }
        });
        getContentPane().add(Bsecante, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 103, 51));

        Btangente.setText("tangente");
        Btangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtangenteActionPerformed(evt);
            }
        });
        getContentPane().add(Btangente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 103, 51));

        Bcoseno.setText("coseno");
        Bcoseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcosenoActionPerformed(evt);
            }
        });
        getContentPane().add(Bcoseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 83, 103, 52));

        Bigual.setText("=");
        Bigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BigualActionPerformed(evt);
            }
        });
        getContentPane().add(Bigual, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 190, 46));

        n2.setText("2");
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });
        getContentPane().add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 86, 59, 46));

        n4.setText("4");
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });
        getContentPane().add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 59, 46));

        n5.setText("5");
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });
        getContentPane().add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 59, 46));

        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });
        getContentPane().add(punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 59, 46));

        n6.setText("6");
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });
        getContentPane().add(n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 59, 46));

        n1.setText("1");
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });
        getContentPane().add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 86, 59, 46));

        n7.setText("7");
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });
        getContentPane().add(n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 59, 46));

        n3.setText("3");
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });
        getContentPane().add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 86, 59, 46));

        n8.setText("8");
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });
        getContentPane().add(n8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 59, 46));

        borrar.setText("c");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        getContentPane().add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 59, 46));

        n9.setText("9");
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });
        getContentPane().add(n9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 59, 46));

        n0.setText("0");
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });
        getContentPane().add(n0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 59, 46));
        getContentPane().add(etiqueta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 246, 156, 41));
        getContentPane().add(etiqueta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 177, 156, 41));
        getContentPane().add(etiqueta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 103, 156, 41));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 255)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 180, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    
    
    
    
    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
     if(etiqueta3.getText().equals("")||contador!=0){
            operaciones();
            etiqueta2.setText("+");
             }
        
    }//GEN-LAST:event_SumaActionPerformed

    private void SumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SumaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SumaMouseClicked

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        numero1+="1";
        etiqueta3.setText(numero1);
    }//GEN-LAST:event_n1ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
         numero1+="2";
        etiqueta3.setText(numero1);
    }//GEN-LAST:event_n2ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
         numero1+="3";
        etiqueta3.setText(numero1);
    }//GEN-LAST:event_n3ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
         numero1+="4";
        etiqueta3.setText(numero1);
    }//GEN-LAST:event_n4ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
         numero1+="5";
        etiqueta3.setText(numero1);
    }//GEN-LAST:event_n5ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
         numero1+="6";
        etiqueta3.setText(numero1);
    }//GEN-LAST:event_n6ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
        numero1+="7";
        etiqueta3.setText(numero1);
    }//GEN-LAST:event_n7ActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
         numero1+="8";
        etiqueta3.setText(numero1);
    }//GEN-LAST:event_n8ActionPerformed

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed
         numero1+="9";
        etiqueta3.setText(numero1);
    }//GEN-LAST:event_n9ActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
         numero1+=".";
        etiqueta3.setText(numero1);
    }//GEN-LAST:event_puntoActionPerformed

    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ActionPerformed
         numero1+="0";
        etiqueta3.setText(numero1);
    }//GEN-LAST:event_n0ActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
         numero1="";
         numero2="";
         etiqueta1.setText("");
         etiqueta2.setText("");
         etiqueta3.setText("");
         contador=0;
    }//GEN-LAST:event_borrarActionPerformed

    private void Bseno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bseno1ActionPerformed
        if(etiqueta3.getText().equals("")||contador!=0){
            operaciones();
            etiqueta2.setText("seno");
             }
    }//GEN-LAST:event_Bseno1ActionPerformed

    private void BtangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtangenteActionPerformed
        if(etiqueta3.getText().equals("")||contador!=0){
            operaciones();
            etiqueta2.setText("tan");
             }
    }//GEN-LAST:event_BtangenteActionPerformed

    private void BcosecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcosecanteActionPerformed
        if(etiqueta3.getText().equals("")||contador!=0){
            operaciones();
            etiqueta2.setText("cosec");
             }
    }//GEN-LAST:event_BcosecanteActionPerformed

    private void BcosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcosenoActionPerformed
        if(etiqueta3.getText().equals("")||contador!=0){
            operaciones();
            etiqueta2.setText("cos");
             }
    }//GEN-LAST:event_BcosenoActionPerformed

    private void BsecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsecanteActionPerformed
        if(etiqueta3.getText().equals("")||contador!=0){
            operaciones();
            etiqueta2.setText("sec");
             }
    }//GEN-LAST:event_BsecanteActionPerformed

    private void BcotangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcotangenteActionPerformed
        if(etiqueta3.getText().equals("")||contador!=0){
            operaciones();
            etiqueta2.setText("tan");
             }
    }//GEN-LAST:event_BcotangenteActionPerformed

    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionActionPerformed
        if(etiqueta3.getText().equals("")||contador!=0){
            operaciones();
            etiqueta2.setText("/");
        }
    }//GEN-LAST:event_DivisionActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
       if(etiqueta3.getText().equals("")||contador!=0){
            operaciones();
            etiqueta2.setText("-");
             }
    }//GEN-LAST:event_RestaActionPerformed

    private void MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicacionActionPerformed
         if(etiqueta3.getText().equals("")||contador!=0){
            operaciones();
            etiqueta2.setText("x");
             }
    }//GEN-LAST:event_MultiplicacionActionPerformed

    private void BigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BigualActionPerformed
        if(etiqueta3.getText().equals("")||contador!=0){
            operaciones();
            etiqueta2.setText("");
             }
    }//GEN-LAST:event_BigualActionPerformed

    void operaciones(){
        double n1,n2;
        if(!etiqueta3.getText().equals("")){
         if(contador==0){
             numero2=numero1;
             etiqueta2.setText(numero2);
                     
         } 
         if(numero2.equals("")){
             numero2="0";
         }
         n1= Double.valueOf(numero2);
          n2= Double.valueOf(numero1);
          if(etiqueta2.getText().equals("+")){
            numero2=String.valueOf(n1+n2);
          }
           if(etiqueta2.getText().equals("-")){
            numero2=String.valueOf(n1-n2);
          }
            if(etiqueta2.getText().equals("x")){
            numero2=String.valueOf(n1*n2);
          }
             if(etiqueta2.getText().equals("+")){
            numero2=String.valueOf(n1/n2);
          }
          
             etiqueta3.setText("");
             numero1="";
             contador ++;
             etiqueta1.setText(numero2);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        calculadora miAritmetica;
        miAritmetica=new calculadora();        
            }
       
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcosecante;
    private javax.swing.JButton Bcoseno;
    private javax.swing.JButton Bcotangente;
    private javax.swing.JButton Bigual;
    private javax.swing.JButton Bsecante;
    private javax.swing.JButton Bseno1;
    private javax.swing.JButton Btangente;
    private javax.swing.JButton Division;
    private javax.swing.JButton Multiplicacion;
    private javax.swing.JButton Resta;
    private javax.swing.JButton Suma;
    private javax.swing.JButton borrar;
    private javax.swing.JLabel etiqueta1;
    private javax.swing.JLabel etiqueta2;
    private javax.swing.JLabel etiqueta3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton n0;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JButton punto;
    // End of variables declaration//GEN-END:variables
}
