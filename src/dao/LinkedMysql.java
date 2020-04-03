package dao;

import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileView;
import javax.swing.plaf.FileChooserUI;
import javax.xml.stream.events.Comment;


public class LinkedMysql {
 ///文件选择器
	static JFrame jf = new JFrame("windows");
	JButton jb = new JButton("open");
	JPanel jp = new JPanel(new GridLayout(3,1));
	public static void main(String[] args){
		new LinkedMysql().openWindon();
	   }
	
	public void openWindon() {
		jf.setBounds(200, 200, 300, 250);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jb.addActionListener(new Listener());
		jp.add(jb);
		jf.add(jp);
	}
	public static void Create(Component parent) {
		JFileChooser fc = new JFileChooser(new File("."));
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		fc.setMultiSelectionEnabled(false);
		fc.addChoosableFileFilter(new FileNameExtensionFilter("图片(jpg)","jpg"));
	    fc.setSelectedFile(new File("pc1"));
	    //接受是否选择了
	    int get = fc.showOpenDialog(parent);
	    if(get==JFileChooser.APPROVE_OPTION){
	    	File file = fc.getSelectedFile();
	    	///是否为jpg结尾；
	    	if(file.getName().endsWith(".jpg"))
	    			System.out.println(file.getPath());
	    	}
	}
	
	class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("laod");
		LinkedMysql.Create(LinkedMysql.jf);
		}
	}
}


			
		
