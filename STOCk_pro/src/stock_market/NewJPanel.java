
package stock_market;


  
import java.awt.* ;

public class NewJPanel
{
private Frame f ;
private Panel p ;
private Button bw, bc ;
private Button bfile, bhelp ;

public void ComplexLayoutExample() 
{
f = new Frame("GUI Example #3");
bw = new Button("West");
bc = new Button("Work space Region");
bfile = new Button ("File");
bhelp = new Button ("Help");
}

public void launchFrame()
{
//f.add(bw, BorderLayout.WEST);
f.add(bc, BorderLayout.CENTER);
p = new Panel();
p.add(bfile);
p.add(bhelp);
f.add(p, BorderLayout.NORTH);
f.pack();
p.setBackground(Color.YELLOW);
f.setVisible(true);
}

public static void main(String args[])
{
NewJPanel gui = new NewJPanel();
gui.launchFrame();
}

}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

