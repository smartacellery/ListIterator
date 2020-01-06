
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

public class TaskMaster extends javax.swing.JFrame {
ArrayList<Task> list;
ListIterator<Task> li;
int curtask;
int tottask;
Task t;
   

    public TaskMaster() {
        initComponents();
        list= new ArrayList();
        li= list.listIterator();
        curtask =1;
        tottask =3;
        
        //initialize with 3 tasks all inserted BEFORE the iterator
        li.add(new Task("Homework", "Math, pages 12-19"));
        li.add(new Task("Groceries", "Bread, Milk ,Eggs"));
        li.add(new Task("Chores", "Laundry, Clean Driveway"));
        
        //rewind back to first task
        while(li.hasPrevious())
        t=li.previous();
        
        //update display to show first task
        lbltotaltasks.setText("" + tottask);
        lblcurrenttask.setText(""+ curtask);
        nametxtfield.setText(t.getName());
        descriptiontxt.setText(t.getDescription());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namelbl = new javax.swing.JLabel();
        nametxtfield = new javax.swing.JTextField();
        descriptionlbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptiontxt = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        tottasklbl = new javax.swing.JLabel();
        lbltotaltasks = new javax.swing.JLabel();
        lblcurrenttask = new javax.swing.JLabel();
        curtasklbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnfirst = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuShowall = new javax.swing.JMenuItem();
        mnuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnureplace = new javax.swing.JMenuItem();
        mnuremove = new javax.swing.JMenuItem();
        mnurestore = new javax.swing.JMenuItem();
        mnuclear = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuInsertBefore = new javax.swing.JMenuItem();
        mnuInsertAfter = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namelbl.setText("Name:");

        nametxtfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        descriptionlbl.setText("Description:");

        descriptiontxt.setColumns(20);
        descriptiontxt.setRows(5);
        descriptiontxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(descriptiontxt);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tottasklbl.setText("Total Tasks");

        lbltotaltasks.setText("0");

        lblcurrenttask.setText("0");

        curtasklbl.setText("Current Task");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(curtasklbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblcurrenttask, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(tottasklbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotaltasks, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tottasklbl)
                    .addComponent(lbltotaltasks)
                    .addComponent(lblcurrenttask)
                    .addComponent(curtasklbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnfirst.setText("|<");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        btnnext.setText(">");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnprev.setText("<");
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnprev, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnlast, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfirst)
                    .addComponent(btnprev)
                    .addComponent(btnnext)
                    .addComponent(btnlast))
                .addContainerGap())
        );

        jMenu1.setText("Program");

        mnuShowall.setText("Show All Tasks");
        mnuShowall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuShowallActionPerformed(evt);
            }
        });
        jMenu1.add(mnuShowall);

        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnureplace.setText("Replace  This as Current Task");
        mnureplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnureplaceActionPerformed(evt);
            }
        });
        jMenu2.add(mnureplace);

        mnuremove.setText("Remove Current Task");
        mnuremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuremoveActionPerformed(evt);
            }
        });
        jMenu2.add(mnuremove);

        mnurestore.setText("Restore Current Task to Screen");
        mnurestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnurestoreActionPerformed(evt);
            }
        });
        jMenu2.add(mnurestore);

        mnuclear.setText("Clear Screen");
        mnuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuclear);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Insert");

        mnuInsertBefore.setText("Before Current Task");
        mnuInsertBefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInsertBeforeActionPerformed(evt);
            }
        });
        jMenu3.add(mnuInsertBefore);

        mnuInsertAfter.setText("After Current Task");
        mnuInsertAfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInsertAfterActionPerformed(evt);
            }
        });
        jMenu3.add(mnuInsertAfter);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(descriptionlbl)
                            .addComponent(namelbl))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nametxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelbl)
                    .addComponent(nametxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionlbl)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnureplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnureplaceActionPerformed
       if (tottask==0) 
       {JOptionPane.showMessageDialog(this, "Error - The list is empty");
       return;}
        String n=nametxtfield.getText();
       String d=descriptiontxt.getText();
       Task t = new Task(n,d);
       if(t.validate()==false){
           JOptionPane.showMessageDialog(this, "Error- Must enter all information");
           return;
       }
       li.next();
       li.previous();
       li.set(t);
       
    }//GEN-LAST:event_mnureplaceActionPerformed

    private void mnuShowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuShowallActionPerformed
     String result="";
     for (int x=0; x<list.size();x++){
        t=list.get(x);
        result+="TASK " + (x+1)+":\n"+ t.toString() + "\n";
     }
     JOptionPane.showMessageDialog(this,result);
    }//GEN-LAST:event_mnuShowallActionPerformed

    private void mnuremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuremoveActionPerformed
    if (tottask==0) 
        { JOptionPane.showMessageDialog(this,"The list is empty - there is nothing to remove");
            return;
        }
    li.next();
    li.remove();
   // curtask-=1;
    tottask-=1;
    if(tottask==0){
        curtask=0;
        lbltotaltasks.setText("" + tottask);
        lblcurrenttask.setText(""+ curtask);
        nametxtfield.setText("");
        descriptiontxt.setText("");
        return;}
    if (tottask==1){
        curtask=1;
        if (li.hasNext()==true){
           t= li.next();
            li.previous();
            lbltotaltasks.setText("" + tottask);
            lblcurrenttask.setText(""+ curtask);
            nametxtfield.setText(t.getName());
            descriptiontxt.setText(t.getDescription());    
            }
        else{
           t= li.previous();
            //li.next();
            lbltotaltasks.setText("" + tottask);
            lblcurrenttask.setText(""+ curtask);
            nametxtfield.setText(t.getName());
            descriptiontxt.setText(t.getDescription());  
            }
        return;
        }
    //if tottask>=1
    if (curtask==1){
        t=li.next();
        lbltotaltasks.setText("" + tottask);
        lblcurrenttask.setText(""+ curtask);
        nametxtfield.setText(t.getName());
        descriptiontxt.setText(t.getDescription());  
        li.previous();
    }
    else{curtask--;
        t=li.previous();
         lbltotaltasks.setText("" + tottask);
         lblcurrenttask.setText(""+ curtask);
         nametxtfield.setText(t.getName());
         descriptiontxt.setText(t.getDescription()); 
        }
    }//GEN-LAST:event_mnuremoveActionPerformed

    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        nametxtfield.setText("");
         descriptiontxt.setText(""); 
    }//GEN-LAST:event_mnuclearActionPerformed

    private void mnuInsertBeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInsertBeforeActionPerformed
        String n=nametxtfield.getText();
       String d=descriptiontxt.getText();
       Task t = new Task(n,d);
       if(t.validate()==false){
           JOptionPane.showMessageDialog(this, "Error- Must enter all information");
           return;
       }
       if (tottask>0) //li.next();
       li.add(t);
       li.previous();
       //curtask++;
       tottask++;
       lbltotaltasks.setText(""+tottask);
       lblcurrenttask.setText(""+curtask);
       JOptionPane.showMessageDialog(this, "Task Added");        // TODO add your handling code here:
    }//GEN-LAST:event_mnuInsertBeforeActionPerformed

    private void mnuInsertAfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInsertAfterActionPerformed
       String n=nametxtfield.getText();
       String d=descriptiontxt.getText();
       Task t = new Task(n,d);
       if(t.validate()==false){
           JOptionPane.showMessageDialog(this, "Error- Must enter all information");
           return;
       }
       if (tottask>0) li.next();
       li.add(t);
       li.previous();
       curtask++;
       tottask++;
       lbltotaltasks.setText(""+tottask);
       lblcurrenttask.setText(""+curtask);
       JOptionPane.showMessageDialog(this, "Task Added");
       
    }//GEN-LAST:event_mnuInsertAfterActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        if(curtask==tottask)return;
        while(li.hasNext())
            li.next();
        t=li.previous();
        curtask=tottask;
        lblcurrenttask.setText(""+curtask);
        nametxtfield.setText(t.getName());
        descriptiontxt.setText(t.getDescription());
    }//GEN-LAST:event_btnlastActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        if(curtask==1)return;
        while(li.hasPrevious())
            //li.previous();
        t=li.previous();
        curtask=1;
        lblcurrenttask.setText(""+curtask);
        nametxtfield.setText(t.getName());
        descriptiontxt.setText(t.getDescription());
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        if(curtask==1)return;
       // while(li.hasPrevious())
            //li.previous();
        t=li.previous();
        curtask--;
        lblcurrenttask.setText(""+curtask);
        nametxtfield.setText(t.getName());
        descriptiontxt.setText(t.getDescription());
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        if(curtask==tottask)return;
        //while(li.hasNext())
            li.next();
           // li.next();
        t=li.next();
                li.previous();
        curtask++;
        lblcurrenttask.setText(""+curtask);
        nametxtfield.setText(t.getName());
        descriptiontxt.setText(t.getDescription());
    }//GEN-LAST:event_btnnextActionPerformed

    private void mnurestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnurestoreActionPerformed
        t=li.next();
        li.previous();
        nametxtfield.setText(t.getName());
        descriptiontxt.setText(t.getDescription());
    }//GEN-LAST:event_mnurestoreActionPerformed

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JLabel curtasklbl;
    private javax.swing.JLabel descriptionlbl;
    private javax.swing.JTextArea descriptiontxt;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcurrenttask;
    private javax.swing.JLabel lbltotaltasks;
    private javax.swing.JMenuItem mnuInsertAfter;
    private javax.swing.JMenuItem mnuInsertBefore;
    private javax.swing.JMenuItem mnuShowall;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnuremove;
    private javax.swing.JMenuItem mnureplace;
    private javax.swing.JMenuItem mnurestore;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField nametxtfield;
    private javax.swing.JLabel tottasklbl;
    // End of variables declaration//GEN-END:variables
}
