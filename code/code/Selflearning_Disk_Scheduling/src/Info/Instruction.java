package Info;

public class Instruction extends javax.swing.JFrame {

    public Instruction() {
        initComponents();
        setLocationRelativeTo(null);
        jTextArea1.setCaretPosition(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Instructions");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jScrollPane1.setFocusCycleRoot(true);
        jScrollPane1.setHorizontalScrollBar(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("#Operation modes\n----------------\n-Fixed mode\n It works by setting the initial jobs data for the program\n to work on.\n :File > Add my data\n\n-Random mode\n The program sets the initial data itself randomly.\n\n-------------------------------------------------------------\n#Controls \n----------\n- (num of jobs) \n set the number of wanted jobs (processes) for the simulation\n and it can vary from 2 to 8 jobs.\n\n- (Algorithm)\n Choose the wanted algorithm for the simulation.\n 1) FCFS      -> First Come First Serve\n 2) SJF       -> Shortest Job First\n 3) STRF      -> Shortest Time Remaining First\n 4) RR        -> Round Robin \n 5) priority1 -> Priority Not Preemptive\n 6) priority2 -> Priority Preemptive\n\n- (sim speed)\n control the speed of the automatic simulation, \n 2 is the fastest, and 8 is the slowest.\n\n- (Quantum) \n select the desired quantum time for the Round \n Robin algorithm.\n\n- (simulate button)\n .start the automatic simulation by the speed selected\n  at “sim speed” combo box.\n .resume the simulation after pausing.\n\n- (stop button) \n pause the automatic simulation.\n\n- (next step button)\n used for running the simulation manually step by step after\n every click.\n\n- (restart button) \n restart the simulation from the beginning with the same \n data and the same number of jobs (reset all the data\n to the start point).\n\n- (start another simulation button)\n restart the simulation with new random data.\n \n- (finish button)\n reach the end of the simulation immediately.\n-------------------------------------------------------------\n#Job pool\n----------\n the table shows all the data of all the jobs in the \n simulation.\n \n -#        : job number.\n -arrive   : job arrival time.\n -burst    : job burst time.\n -priority : job priority.\n -start    : job start execution time.\n -wait     : all job wait time (so far).\n -remain   : all job remain time (so far).\n -finish   : job finish execution time.\n -turn     : job turnaround time (so far).\n -%        : the finished percent of the job.\n-------------------------------------------------------------\n#Ready Queue panel\n------------------\n show the jobs in the ready queue in specific time.\n note : if the ready queue is empty and the cpu is idle\n the new job won't appear in the ready queue and will be\n executed on the cpu immediately.\n-------------------------------------------------------------\n#CPU panel\n-----------\n Show the status of the cpu in a specific time.\n \n - current job\n show the number of the current job executed by the cpu.\n \n - current time\n show the current unit time interval for executing a job.\n \n - utilization\n show the utilization of the cpu (so far).\n ( the percent of working time of the cpu to the idle time)\n-------------------------------------------------------------\n#Average\n--------\n - wait\n show the average wait time of all the jobs (so far).\n \n - turnaround \n show the average turnaround time of all the jobs (so far).\n-------------------------------------------------------------\n#Gantt chart\n-------------\n visualization of the gantt chart of all the executed jobs\n in the simulation so far.\n-------------------------------------------------------------");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Instruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instruction().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   
}
