package FinalFrontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class AdminDashboard {
	
	//associations 

	private JFrame frame;
	public JFrame getFrame() {
		return frame;
	}

	private JPanel panel_right;
	private CardLayout layout = new CardLayout(0, 0);
	private JButton btnCourse;
	private JButton btnTeacher;
	private JButton btnStudent;
	private JButton btnResult;
	private JTable TeacherTable;
	private JTable stdTable;

	/**
	 * Launch the application.
	 */
private void activeBtn(int R,int G,int B,String a) {

	btnCourse.setBackground(SystemColor.activeCaption);
	btnTeacher.setBackground(SystemColor.activeCaption);
	btnStudent.setBackground(SystemColor.activeCaption);
	btnResult.setBackground(SystemColor.activeCaption);
		if(a.equals("DbBtn")) {
			btnCourse.setBackground(new Color(R,G,B));
		}else if(a.equals("TeacherBtn")) {
			btnTeacher.setBackground(new Color(R,G,B));
		}else if(a.equals("StdBtn")) {
			btnStudent.setBackground(new Color(R,G,B));
		}else if(a.contentEquals("ResultBtn")) {
			btnResult.setBackground(new Color(R,G,B));
		}
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard window = new AdminDashboard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminDashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Admin");
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(0, 0, 784, 561);
		frame.setBounds(550, 200, 800, 600);
		JSplitPane SplitPane = new JSplitPane();
		SplitPane.setDividerSize(0);
		frame.setContentPane(SplitPane);
		
		JPanel panel_left = new JPanel();
		panel_left.setBackground(SystemColor.activeCaption);
		SplitPane.setLeftComponent(panel_left);
		
		btnCourse = new JButton("Courses");
		btnCourse.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		ImageIcon courseImg = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/course.png")).getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		btnCourse.setIcon(courseImg);
		btnCourse.setBackground(new Color(255, 235, 205));
		btnCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(panel_right,"name_29674605431600");
				activeBtn(255, 235, 205,"DbBtn");
			}
		});
		btnCourse.setFont(new Font("Arial", Font.ITALIC, 17));
		
		btnTeacher = new JButton("Instructors");
		btnTeacher.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		btnTeacher.setBackground(SystemColor.activeCaption);
		ImageIcon teacherImg = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/teacherImg.png")).getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		btnTeacher.setIcon(teacherImg);
		btnTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(panel_right,"name_29678438199200");
				activeBtn(255, 235, 205,"TeacherBtn");
				
			}
		});
		btnTeacher.setFont(new Font("Arial", Font.ITALIC, 17));
		
		btnStudent = new JButton("Student");
		btnStudent.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		ImageIcon StdImg = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/studentImg.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		btnStudent.setIcon(StdImg);
		btnStudent.setBackground(SystemColor.activeCaption);
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(panel_right,"name_29680139631500");
				activeBtn(255, 235, 205,"StdBtn");
			}
		});
		btnStudent.setFont(new Font("Arial", Font.ITALIC, 17));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		ImageIcon LogOutImg = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/logout.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		btnLogout.setIcon(LogOutImg);
		btnLogout.setBackground(SystemColor.activeCaption);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login window = new Login();
			window.getFrame().setVisible(true);
			frame.dispose();
//				ConfirmLogout dialog = new ConfirmLogout();
//				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//				dialog.setVisible(true);
//				dialog.setFrame(frame);
			}
		});
		btnLogout.setFont(new Font("Arial", Font.ITALIC, 17));
		
		JLabel lblAdminPhoto = new JLabel("");
		ImageIcon adminImg = new ImageIcon(new ImageIcon(AdminDashboard.class.getResource("/images/systemIcon.png")).getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
		lblAdminPhoto.setIcon(adminImg);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		
		btnResult = new JButton("Publish Result");
		ImageIcon ResultImg = new ImageIcon(new ImageIcon(AdminDashboard.class.getResource("/images/result.png")).getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
		btnResult.setIcon(ResultImg);
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(panel_right,"name_173602901088000");
				activeBtn(255, 235, 205,"ResultBtn");
			}
		});
		btnResult.setFont(new Font("Arial", Font.ITALIC, 17));
		btnResult.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		btnResult.setBackground(SystemColor.activeCaption);
		GroupLayout gl_panel_left = new GroupLayout(panel_left);
		gl_panel_left.setHorizontalGroup(
			gl_panel_left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_left.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_panel_left.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblAdminPhoto)
						.addComponent(lblNewLabel))
					.addGap(40))
				.addComponent(btnLogout, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
				.addComponent(btnCourse, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
				.addComponent(btnTeacher, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
				.addComponent(btnStudent, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
				.addComponent(btnResult, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
		);
		gl_panel_left.setVerticalGroup(
			gl_panel_left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_left.createSequentialGroup()
					.addGap(16)
					.addComponent(lblAdminPhoto, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel)
					.addGap(38)
					.addComponent(btnCourse, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnTeacher)
					.addGap(18)
					.addComponent(btnStudent, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(btnResult, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(108)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		panel_left.setLayout(gl_panel_left);
		
		panel_right = new JPanel();
		SplitPane.setRightComponent(panel_right);
		panel_right.setLayout(layout);
		
		JPanel CoursePanel = new JPanel();
		CoursePanel.setBackground(Color.GRAY);
		panel_right.add(CoursePanel, "name_29674605431600");
		GroupLayout gl_CoursePanel = new GroupLayout(CoursePanel);
		gl_CoursePanel.setHorizontalGroup(
			gl_CoursePanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 623, Short.MAX_VALUE)
		);
		gl_CoursePanel.setVerticalGroup(
			gl_CoursePanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 559, Short.MAX_VALUE)
		);
		CoursePanel.setLayout(gl_CoursePanel);
		
		JPanel TeacherPanel = new JPanel();
		TeacherPanel.setBackground(Color.GRAY);
		panel_right.add(TeacherPanel, "name_29678438199200");
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_TeacherPanel = new GroupLayout(TeacherPanel);
		gl_TeacherPanel.setHorizontalGroup(
			gl_TeacherPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_TeacherPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 593, GroupLayout.PREFERRED_SIZE))
		);
		gl_TeacherPanel.setVerticalGroup(
			gl_TeacherPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_TeacherPanel.createSequentialGroup()
					.addGap(61)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 383, GroupLayout.PREFERRED_SIZE))
		);
		
		TeacherTable = new JTable();
		TeacherTable.setDefaultEditor(Object.class, null);
		TeacherTable.setFont(new Font("Arial", Font.ITALIC, 15));
		TeacherTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"Luffy", "Monkey D.", "9856522012", "Egghead,New World"},
				{"Tony tony", "Chopper", "9855562310", "Egghead,New World"},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"First Name", "Last Name", "PhoneNumber", "Address"
			}
		));
		TeacherTable.getColumnModel().getColumn(2).setPreferredWidth(95);
		TeacherTable.getColumnModel().getColumn(3).setPreferredWidth(124);
		scrollPane.setViewportView(TeacherTable);
		TeacherPanel.setLayout(gl_TeacherPanel);
		
		JPanel StdPanel = new JPanel();
		StdPanel.setBackground(Color.GRAY);
		panel_right.add(StdPanel, "name_29680139631500");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GroupLayout gl_StdPanel = new GroupLayout(StdPanel);
		gl_StdPanel.setHorizontalGroup(
			gl_StdPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_StdPanel.createSequentialGroup()
					.addContainerGap(31, Short.MAX_VALUE)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 569, GroupLayout.PREFERRED_SIZE)
					.addGap(23))
		);
		gl_StdPanel.setVerticalGroup(
			gl_StdPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_StdPanel.createSequentialGroup()
					.addGap(38)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(69, Short.MAX_VALUE))
		);
		
		stdTable = new JTable();
		stdTable.setDefaultEditor(Object.class, null);
		stdTable.setFont(new Font("Arial", Font.ITALIC, 15));
		stdTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"Nami", null, "female", "Egghead,new World", null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"First Name", "Last Name", "Sex", "Address", "Level"
			}
		));
		stdTable.getColumnModel().getColumn(3).setPreferredWidth(110);
		scrollPane_2.setViewportView(stdTable);
		StdPanel.setLayout(gl_StdPanel);
		
		JPanel ResultPanel = new JPanel();
		panel_right.add(ResultPanel, "name_173602901088000");
		SplitPane.setDividerLocation(160);
	}
	
	
}
