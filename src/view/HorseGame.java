/*
 * HorseGame.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author  __USER__
 */
public class HorseGame extends javax.swing.JFrame {

	/** Creates new form HorseGame */
	public HorseGame() {
		initComponents();
		this.setLocationRelativeTo(null);
		Image image = Toolkit.getDefaultToolkit().getImage("img1/7.png");
		setIconImage(image);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel4 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jProgressBar1 = new javax.swing.JProgressBar();
		jProgressBar2 = new javax.swing.JProgressBar();
		jProgressBar3 = new javax.swing.JProgressBar();
		jProgressBar4 = new javax.swing.JProgressBar();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel4.setText("QQ\u98de\u8f66");

		jLabel1.setText("\u82f1\u96c4\u8054\u76df");

		jLabel2.setText("\u7edd\u5730\u6c42\u751f");

		jLabel3.setText("\u7f6a\u6076\u90fd\u5e02");

		jButton1.setText("\u5f00\u59cb");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jButton1.addAncestorListener(new javax.swing.event.AncestorListener() {
			public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
			}

			public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
				jButton1AncestorAdded(evt);
			}

			public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 400, Short.MAX_VALUE)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(28, 28, 28)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel4)
														.addComponent(jLabel1)
														.addComponent(jLabel2)
														.addComponent(jLabel3))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jProgressBar1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																282,
																Short.MAX_VALUE)
														.addComponent(
																jProgressBar2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																282,
																Short.MAX_VALUE)
														.addComponent(
																jProgressBar3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																282,
																Short.MAX_VALUE)
														.addComponent(
																jProgressBar4,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																282,
																Short.MAX_VALUE))
										.addGap(24, 24, 24)).addGroup(
								layout.createSequentialGroup().addGap(20, 20,
										20).addComponent(jButton1)
										.addContainerGap(317, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 300, Short.MAX_VALUE)
						.addGroup(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jButton1)
										.addGap(35, 35, 35)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel1)
														.addComponent(
																jProgressBar1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jProgressBar2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jProgressBar3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel3))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jProgressBar4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel4))
										.addContainerGap(113, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1AncestorAdded(javax.swing.event.AncestorEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		Horse h1 = new Horse(this.jProgressBar1, this.jLabel1.getText());
		Horse h2 = new Horse(this.jProgressBar2, this.jLabel2.getText());
		Horse h3 = new Horse(this.jProgressBar3, this.jLabel3.getText());
		Horse h4 = new Horse(this.jProgressBar4, this.jLabel4.getText());
		h1.start();
		h2.start();
		h3.start();
		h4.start();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new HorseGame().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JProgressBar jProgressBar1;
	private javax.swing.JProgressBar jProgressBar2;
	private javax.swing.JProgressBar jProgressBar3;
	private javax.swing.JProgressBar jProgressBar4;
	// End of variables declaration//GEN-END:variables

}