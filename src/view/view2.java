/*
 * view2.java
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
public class view2 extends javax.swing.JFrame {

	/** Creates new form view2 */
	public view2() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setTitle("Ԫ��");
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

		jButton3 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();

		jButton3.setBackground(new java.awt.Color(204, 204, 204));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("\u5546\u5bb6\u767b\u5f55");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new java.awt.Color(204, 204, 204));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("\u7ba1\u7406\u5458\u767b\u5f55");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton1.setBackground(new java.awt.Color(204, 204, 204));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("\u7528\u6237\u767b\u5f55");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(0, 0, 0));

		jButton4.setBackground(new java.awt.Color(204, 204, 204));
		jButton4.setForeground(new java.awt.Color(255, 255, 255));
		jButton4.setText("\u5546\u5bb6\u767b\u5f55");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setBackground(new java.awt.Color(204, 204, 204));
		jButton5.setForeground(new java.awt.Color(255, 255, 255));
		jButton5.setText("\u7ba1\u7406\u5458\u767b\u5f55");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setBackground(new java.awt.Color(204, 204, 204));
		jButton6.setForeground(new java.awt.Color(255, 255, 255));
		jButton6.setText("\u7528\u6237\u767b\u5f55");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addGap(144, 144, 144)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton6,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																107,
																Short.MAX_VALUE)
														.addComponent(
																jButton4,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																107,
																Short.MAX_VALUE)
														.addComponent(
																jButton5,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addGap(149, 149, 149)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addGap(59, 59, 59)
						.addComponent(jButton6).addGap(27, 27, 27)
						.addComponent(jButton4).addGap(27, 27, 27)
						.addComponent(jButton5).addContainerGap(78,
								Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		new login().setVisible(true);
		this.dispose();
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		new gLogin().setVisible(true);
		this.dispose();
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		new MerchantLogin().setVisible(true);
		this.dispose();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new gLogin().setVisible(true);
		this.dispose();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		new MerchantLogin().setVisible(true);
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new login().setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new view2().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables

}