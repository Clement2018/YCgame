/*
 * glysyyx.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import model.allgame;

/**
 *
 * @author  __USER__
 */
public class glysyyx extends javax.swing.JFrame {

	/** Creates new form glysyyx */
	public glysyyx() {
		initComponents();
		this.setLocationRelativeTo(null);
		Image image = Toolkit.getDefaultToolkit().getImage("img1/7.png");
		setIconImage(image);
		try {
			loadTable();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void loadTable() throws IOException, ClassNotFoundException,
			UnknownHostException {
		allgame a = new allgame();
		ArrayList<allgame> allgames = a.allgameviewData();
		Object title[] = { "名字", "说明", "价格", "风格" };
		Object detail[][] = new Object[allgames.size()][4];
		for (int i = 0; i < allgames.size(); i++) {
			detail[i][0] = allgames.get(i).getname();
			detail[i][1] = allgames.get(i).gettext();
			detail[i][2] = allgames.get(i).getprice();
			detail[i][3] = allgames.get(i).getstyle();

		}

		this.jTable1.setModel(new DefaultTableModel(detail, title));

	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jSlider1 = new javax.swing.JSlider();
		jButton20 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jButton17 = new javax.swing.JButton();
		jButton18 = new javax.swing.JButton();
		jButton19 = new javax.swing.JButton();
		jButton21 = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton13 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jButton16 = new javax.swing.JButton();

		jButton20.setBackground(new java.awt.Color(204, 204, 204));
		jButton20.setForeground(new java.awt.Color(255, 255, 255));
		jButton20.setText("\u7ba1\u7406\u5e7f\u544a");
		jButton20.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton20ActionPerformed(evt);
			}
		});

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton9.setBackground(new java.awt.Color(204, 204, 204));
		jButton9.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jButton9.setForeground(new java.awt.Color(255, 255, 255));
		jButton9.setText("<");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		jButton10.setBackground(new java.awt.Color(204, 204, 204));
		jButton10.setForeground(new java.awt.Color(255, 255, 255));
		jButton10.setText("\u6211\u7684\u4e3b\u9875");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jButton11.setBackground(new java.awt.Color(204, 204, 204));
		jButton11.setForeground(new java.awt.Color(255, 255, 255));
		jButton11.setText("\u5546\u5e97");
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});

		jButton12.setBackground(new java.awt.Color(204, 204, 204));
		jButton12.setForeground(new java.awt.Color(255, 255, 255));
		jButton12.setText("\u7ba1\u7406\u7528\u6237");
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton12ActionPerformed(evt);
			}
		});

		jButton17.setBackground(new java.awt.Color(204, 204, 204));
		jButton17.setForeground(new java.awt.Color(255, 255, 255));
		jButton17.setText("\u7ba1\u7406\u5546\u5bb6");
		jButton17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton17ActionPerformed(evt);
			}
		});

		jButton18.setBackground(new java.awt.Color(204, 204, 204));
		jButton18.setForeground(new java.awt.Color(255, 255, 255));
		jButton18.setText("\u7ba1\u7406\u6e38\u620f");
		jButton18.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton18ActionPerformed(evt);
			}
		});

		jButton19.setBackground(new java.awt.Color(204, 204, 204));
		jButton19.setForeground(new java.awt.Color(255, 255, 255));
		jButton19.setText("\u516c\u544a/\u5e7f\u544a");
		jButton19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton19ActionPerformed(evt);
			}
		});

		jButton21.setBackground(new java.awt.Color(204, 204, 204));
		jButton21.setForeground(new java.awt.Color(255, 255, 255));
		jButton21.setText("\u6ce8\u9500");
		jButton21.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton21ActionPerformed(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jTable1.setRowHeight(50);
		jScrollPane2.setViewportView(jTable1);

		jButton13.setBackground(new java.awt.Color(204, 204, 204));
		jButton13.setForeground(new java.awt.Color(255, 255, 255));
		jButton13.setText("\u7cbe\u9009");
		jButton13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton13ActionPerformed(evt);
			}
		});

		jButton14.setBackground(new java.awt.Color(204, 204, 204));
		jButton14.setForeground(new java.awt.Color(255, 255, 255));
		jButton14.setText("\u6392\u884c\u699c");
		jButton14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton14ActionPerformed(evt);
			}
		});

		jButton15.setBackground(new java.awt.Color(204, 204, 204));
		jButton15.setForeground(new java.awt.Color(255, 255, 255));
		jButton15.setText("\u6240\u6709\u6e38\u620f");
		jButton15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton15ActionPerformed(evt);
			}
		});

		jTextField1.setForeground(new java.awt.Color(204, 204, 204));
		jTextField1.setText("\u641c\u7d22\u6e38\u620f");

		jButton16.setBackground(new java.awt.Color(204, 204, 204));
		jButton16.setForeground(new java.awt.Color(255, 255, 255));
		jButton16.setText("ok");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton9)
																		.addGap(
																				28,
																				28,
																				28)
																		.addComponent(
																				jButton10)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton11)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton12)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton17)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton18)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton19))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton13,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				73,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton14)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton15)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton21,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																76,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				145,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton16)
																		.addContainerGap(
																				40,
																				Short.MAX_VALUE))))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGap(14, 14,
										14).addComponent(jScrollPane2,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										875, Short.MAX_VALUE).addContainerGap()));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton9)
														.addComponent(jButton10)
														.addComponent(jButton11)
														.addComponent(jButton12)
														.addComponent(jButton17)
														.addComponent(jButton18)
														.addComponent(jButton19)
														.addComponent(jButton21))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton14)
														.addComponent(jButton15)
														.addComponent(jButton13)
														.addComponent(jButton16)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												264,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(69, 69, 69)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
		//new AdministratorInterface().setVisible(true);
		this.dispose();
	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
		new glymianview().setVisible(true);
		this.dispose();
	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		new glyzy2().setVisible(true);
		this.dispose();
	}

	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
		new glyphb().setVisible(true);
		this.dispose();
	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
		new glymianview().setVisible(true);
		this.dispose();
	}

	private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {
		new view2().setVisible(true);
		this.dispose();
	}

	private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {
		new AdministratorInterface2().setVisible(true);
		this.dispose();
	}

	private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
		new AdminitratorInterface5().setVisible(true);
		this.dispose();
	}

	private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
		new AdministratorInterface4().setVisible(true);
		this.dispose();
	}

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
		new AdministratorInterface3().setVisible(true);
		this.dispose();
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new glysyyx().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton18;
	private javax.swing.JButton jButton19;
	private javax.swing.JButton jButton20;
	private javax.swing.JButton jButton21;
	private javax.swing.JButton jButton9;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JSlider jSlider1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}