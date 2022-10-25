package projet_java;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.*;

import javax.swing.*;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class FormationPer extends JFrame {
	private static final long serialVersionUID = 1L;
	JPanel p,p1,p2,p3,p4;
	JLabel cin ,esp1,esp,init,per,pfe,img,img1,img2,img3,img4,img5,img6;
	Icon image,image1,image2,image3;
	JButton ret,val;
	String s2;
	JTextField s3;
	
	
	
	FormationPer(String s)
	{super(s);
	this.setLocation(300, 50);
	this.setSize(710, 630);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setLayout(null);
	p=(JPanel)this.getContentPane();
	JButton t1=new JButton("apprendre");
	JButton t2=new JButton("apprendre");
	JButton t3=new JButton("apprendre");
	 img3 = new JLabel();
	 img3.setIcon(new ImageIcon("une-jeune-�tudiante.jpg"));
	 img3.setBounds(0, 0, 700, 700);
	
	
	img=new JLabel();
	image = new ImageIcon( "icons8-�tudiant-femme-50.png" );
    img.setIcon( image );
    img.setBounds(320, 120, 100, 100);
    esp=new JLabel(" formation concernant satge");
    esp.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,40));
    esp.setForeground(new Color(225,102,102));
    esp.setBounds(90, 50, 800, 50);
    esp1=new JLabel("de perfectionnement");
    esp1.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,40));
    esp1.setForeground(new Color(225,102,102));
    esp1.setBounds(160, 90, 800, 50);
   
    p.add(esp1);
    p.add(esp);
    p.add(img);
  
    
  //cin
    cin=new JLabel("CIN :");
    cin.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
    cin.setForeground(new Color(120,102,102));
    cin.setBounds(200,200,100,100);
    img6=new JLabel();
	image = new ImageIcon( "icons8-contact-d'affaires-50.png" );
    img6.setIcon( image1 );
    img6.setBounds(150, 200, 100, 100);
    p.add(img6);
    p.add(cin);
    s3=new JTextField(2);
    s3.setMaximumSize(new Dimension(Integer.MAX_VALUE, t1.getPreferredSize().height));
    s3.setMaximumSize(new Dimension(Integer.MAX_VALUE, t1.getPreferredSize().width));
    s3.setBounds(250, 232, 300, 40);
    p.add(s3);

 
    init=new JLabel("formation en java:");
    init.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
    init.setForeground(new Color(225,102,102));
    init.setBounds(200,235,225,100);
    img1=new JLabel();
	image1 = new ImageIcon( "icons8-cartes-bancaires-50.png" );
    img1.setIcon( image1 );
    img1.setBounds(150, 235, 100, 100);
    p.add(img1);
    p.add(init);
    
    t1.setMaximumSize(new Dimension(Integer.MAX_VALUE, t1.getPreferredSize().height));
    t1.setMaximumSize(new Dimension(Integer.MAX_VALUE, t1.getPreferredSize().width));
    t1.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,13));
    t1.setBackground(new Color(189, 51, 164));
    t1.setBounds(400, 265, 100, 40);
    t1.addActionListener(new ActionListener(){
 	   public void  actionPerformed(ActionEvent arg0){
 	    	try{
 				
 				Connect("INSERT INTO stage(cin,type_stage,nom_formation) VALUES ('"+s3.getText()+"','stage de perfectionnement','formation en java')");	
 				
 				
 					}catch (Exception ex){
 						
 					}
 				
 	    }
     });
    
    p.add(t1);
 
    per=new JLabel("formation en php:");
    per.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
    per.setForeground(new Color(225,102,102));
    per.setBounds(205,300,225,100);

    img2=new JLabel();
	image2 = new ImageIcon( "icons8-cartes-bancaires-50.png" );
    img2.setIcon( image2);
    img2.setBounds(150, 300, 100, 100);
    p.add(img2);
    p.add(per);
    p.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
   
    t2.setMaximumSize(new Dimension(Integer.MAX_VALUE, t2.getPreferredSize().height));
    t2.setMaximumSize(new Dimension(Integer.MAX_VALUE, t2.getPreferredSize().width));
    t2.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,13));
    t2.setBackground(new Color(189, 51, 164));
    t2.setBounds(400, 330, 100, 40);
    t2.addActionListener(new ActionListener(){
  	   public void  actionPerformed(ActionEvent arg0){
  	    	try{
  				
  				Connect("INSERT INTO stage(cin,type_stage,nom_formation) VALUES ('"+s3.getText()+"','stage de perfectionnement','formation en php')");	
  				
  				
  					}catch (Exception ex){
  						
  					}
  				
  	    }
      });
    p.add(t2);
    
    
    

    
    
    pfe=new JLabel("formation en jquery:");
    pfe.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
    pfe.setForeground(new Color(225,102,102));
    pfe.setBounds(205,350,225,100);

    img4=new JLabel();
	image3 = new ImageIcon( "icons8-cartes-bancaires-50.png" );
    img4.setIcon( image2);
    img4.setBounds(150, 350, 100, 100);
    p.add(img4);
    p.add(pfe);
 
   
    t3.setMaximumSize(new Dimension(Integer.MAX_VALUE, t3.getPreferredSize().height));
    t3.setMaximumSize(new Dimension(Integer.MAX_VALUE, t3.getPreferredSize().width));
    t3.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,13));
    t3.setBounds(400, 390, 100, 40);
    t3.setBackground(new Color(189, 51, 164));
    t1.addActionListener(new ActionListener(){
  	   public void  actionPerformed(ActionEvent arg0){
  	    	try{
  				
  				Connect("INSERT INTO stage(cin,type_stage,nom_formation) VALUES ('"+s3.getText()+"','stage de perfectionnement','formation en jquery')");	
  				
  				
  					}catch (Exception ex){
  						
  					}
  				
  	    }
      });
    p.add(t3);
    
    
    
    
    
    
    ret=new JButton("RETOUR",new ImageIcon("icons8-retour-50.png"));
    ret.setBackground(new Color(51,0,25));
    ret.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,15));
    ret.setForeground(new Color(225,102,102));
    ret.setBounds(100, 500, 150, 50);
    ret.addActionListener(new ActionListener(){
    	public void  actionPerformed(ActionEvent arg0){
        	Stage s=new Stage("stage");
        	Stage.main(null);
    			
        }
    });
    val=new JButton("d�connection",new ImageIcon("icons8-pouce-en-l'air-50 - Copie - Copie - Copie.png"));
    val.setBackground(new Color(51,0,25));
    val.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,13));
    val.setForeground(new Color(225,102,102));
    val.setBounds(500, 500, 150, 50);
    val.addActionListener(new ActionListener(){
    	public void  actionPerformed(ActionEvent arg0){
        	Aceuille s=new Aceuille("stage");
        	Aceuille.main(null);
    			
        }
    });
    p.add(ret);
    p.add(val);
    p.add(img3);
   
    
    this.setVisible(true);
   
	}
   
    public void Connect(String req){
		 Connection cn1;
		Statement stm;
	
		try{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver reussi");
		
			 cn1= DriverManager.getConnection("jdbc:mysql://localhost/stage","root","");
		
			System.out.println("connexion reussite");
			Statement stat=cn1.createStatement();
			stat.execute(req);
			JOptionPane.showMessageDialog(null,"la formation est selectionn� avec suce�");
	}catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}
	}
			
	
	
	
	public static void main (String []args){
		FormationPer fen=new FormationPer("satge de perfectionnement");
		fen.setVisible(true);
		fen.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	

	
	
	
	
	

}



