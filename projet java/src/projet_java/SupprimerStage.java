package projet_java;
import javax.swing.*;

import com.mysql.jdbc.PreparedStatement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
public class SupprimerStage extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
		
		JPanel c;
		JLabel l1,l2,l3 , l4,l5,l6,l7,l8,img7;
		JButton b1,b2,b3;
		JTextField  tf2, tf3, tf4 ,tf5 ,tf6 ,tf8 ;
		String stagee1[]= {"stagein itiation ","stage perfectionnement", "stage de fin d'etude"};
		JComboBox stagee, formation;
		String[] formation1 = {"formation1"};
		
		public SupprimerStage(String s)
		{super(s);
		this.setLocation(300, 50);
		this.setSize(710, 630);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		 c=(JPanel)this.getContentPane();
		 img7 = new JLabel();
		 img7.setIcon(new ImageIcon("glare_shine_background_spot_69090_1366x768.jpg"));
		 img7.setBounds(0, 0, 700, 700);
		
		
		
		
		l1=new JLabel(" supprimer stagiere");	
		l1.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,40));
	    l1.setForeground(new Color(225,102,178));
		l1.setBounds(210, 35, 400, 30);
		
		l2 = new JLabel ("Nom : ");
		tf2 = new JTextField();
		l2.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
		l2.setForeground(new Color(0,0,51));
		l2.setBounds(70, 150,100,20);
		tf2.setBounds(130, 150,100,20);
		
		
		l3 = new JLabel ("Pr�nom : ");
		tf3 = new JTextField();
		l3.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
		l3.setForeground(new Color(0,0,51));
		l3.setBounds(40, 200,100,20);
		tf3.setBounds(130, 200,100,20);
		
		
		l4 = new JLabel ("CIN : ");
		tf4 = new JTextField();
		l4.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
		l4.setForeground(new Color(0,0,51));
		l4.setBounds(70, 250,100,20);
		tf4.setBounds(130, 250,100,20);
		
		
		
		l5= new JLabel ("email: ");
		tf5 = new JTextField();
		l5.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,18));
		l5.setForeground(new Color(0,0,51));
		l5.setBounds(65, 300,150,20);
		tf5.setBounds(130, 300,100,20);
		
		
		
		l6 = new JLabel ("Age  : ");
		tf6 = new JTextField();
		l6.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,18));
		l6.setForeground(new Color(0,0,51));
		l6.setBounds(70, 350,150,22);
		tf6.setBounds(130, 350,100,20);
		
		
	    l7 = new JLabel ("type de stage : ");
	    l7.setBounds(400, 200, 100, 20);
	    l7.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,18));
		l7.setForeground(new Color(0,0,51));
		stagee = new JComboBox(stagee1);
		stagee.setBounds(490, 195, 200, 30);
		stagee.addActionListener(this);
		l8 = new JLabel ("Niveau  : ");
	    l8.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,18));
		l8.setForeground(new Color(0,0,51));
		l8.setBounds(400, 250, 100, 25);
		c.add(l8);
		 formation= new JComboBox();
		for (String i : formation1)
		{
			formation.addItem(i);
		}
		formation.setBounds(490, 250, 170, 25);
		c.add(formation);
		
		b1=new JButton ("Supprimer");
		b1.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
	    b1.setBackground(new Color(102,0,51));
	    b1.setForeground(Color.WHITE);
	    b1.setBounds(450,500,150,40);

		b2=new JButton ("Annuler");
		b2.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
	    b2.setBackground(new Color(102,0,51));
	    b2.setForeground(Color.WHITE);
	    b2.setBounds(270,500,150,40);
	    
		b3=new JButton ("Retour");
		b3.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
	    b3.setBackground(new Color(102,0,51));
	    b3.setForeground(Color.WHITE);
	    b3.setBounds(80,500,150,40);
	    
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);
	    

		
		c.add(l1);
		c.add(l2);
		c.add(tf2);
		c.add(l3);
		c.add(tf3);
		c.add(l4);
		c.add(tf4);
		c.add(l5);
		c.add(l7);
		c.add(stagee);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		
		c.add(tf5);
		c.add(l6);
		c.add(tf6);
		
		c.add(img7);
		
		
		
		
		this.setVisible(true);
		
		}
		
	
		
		public void actionPerformed(ActionEvent e) {
			
			
			  if (e.getSource()==stagee)
			 {
			  	if (stagee.getSelectedIndex()==0)
				{
					formation.removeAllItems();
					String[] formation1 = {" html/css","algorithme","c"};
					for (String i : formation1)
					{
						formation.addItem(i);
					}
				}
				if(stagee.getSelectedIndex()==1)
				{				
					formation.removeAllItems();
					String[] formation1 = {"java","php","jquery"};
					for (String i : formation1)
					{
						formation.addItem(i);
					}
				}
				if(stagee.getSelectedIndex()==2)
				{
					
					formation.removeAllItems();
					
					String[]formation1 = {"androwide","Synfony 3","c#"};
					
					for (String i : formation1)
					{
						formation.addItem(i);
					}
				}	
				
			 }
				if (e.getSource()==b3)
				{GestionStage interface1=new GestionStage();
				GestionStage.main(null);
				
				}
				if(e.getSource()==b2)
				{
					tf2.setText("");
					tf3.setText("");
					tf4.setText("");
					tf5.setText("");
					tf6.setText("");
					stagee.setSelectedIndex(0);
					formation.setSelectedItem(0);
					
				}
			
		
//			********************
				if (e.getSource() == b1) {
					ConnectionBD c = new ConnectionBD();
					String suppstagiere = "DELETE FROM stagiere WHERE cin=?" ;
					try {
						PreparedStatement statement = (PreparedStatement) c.con.prepareStatement(suppstagiere);
						
						statement.setInt(1, Integer.parseInt( tf4.getText()));
						statement.executeUpdate();
						JOptionPane.showConfirmDialog(null,"Supprimer","Supprimer", JOptionPane.OK_OPTION);

					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						System.out.println("sql exception!!");
						e1.printStackTrace();
					}

				}
//				*****************
			

			 }
		
public static void main(String [] args ){
		SupprimerStage st=new SupprimerStage("supprimer");
		
	}


}
