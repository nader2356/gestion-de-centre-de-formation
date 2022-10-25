package projet_java;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.plaf.metal.MetalIconFactory;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Map;

public class Aceuille extends JFrame {
	
	private static final long serialVersionUID = 1L;
	JPanel p1,po1;
	
	JMenuBar mb;
	JToolBar tool;
	JLabel texte1,texte2,texte3,esp,ad,stg ,t1;
	//ImageIcon;
	JButton con,con1,con2,con3 ;
	JTabbedPane onglet;
	JList liste1,liste2;
	

	public Aceuille(String s)
	{super(s);
	
	 
	//pour que la page ouvrir sur plien ecran
	this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	
   this.setBackground(new Color(251, 196, 189));
	//Toolkit renvoie la taille de l’écran sous la forme d’unobjet Dimension.
    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension dimensionEcran = kit.getScreenSize();
    int largeur = dimensionEcran.width;
    int hauteur = dimensionEcran.height;
    setBounds((largeur-300)/2, (hauteur-200)/2, 300, 200);
    setIconImage(kit.getImage("LogoIset2 (1).png"));
   
    JPanel p =new JPanel();
	p.setLayout(new FlowLayout());
	p.setBackground(new Color(251, 196, 189));
	
	this.setJMenuBar(mb);
	this.setLayout(new BorderLayout());
	this.add(p, BorderLayout.NORTH);
	this.setLayout(new BorderLayout());
	getContentPane (). add(p) ;

	 esp=new JLabel("   bienvenue dans notre centre de stage");
	    esp.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,40));
	    esp.setForeground(new Color(225,102,102));
	    esp.setBounds(190, 50, 400, 50);
	   

	    t1=new JLabel("<html>STAGE DE FORMATION PROFESSIONNELLE INITIALE EN ALTERNANCE FORMATION CONTINUE. <br> "
	    		+ "DÉCOUVERTE EN COURS ÉTUDES OFFRE DE STATGE STAGE REMUNÉRÉ PÔLE EMPLOI.\n <br>"
	    		+ "<br>"
	    		+ "<br>"
	    		+ "Stage de Formation vous donne accès à votre stage de formation.<br>"
	    		+ "Avec Stage de Formation trouvez votre stage de formation adapté à vos aptitudes et vos objectifs quant à votre avenir professionnel <br>"
	    		+ "Un stage de formation est par définition une période apprentissage, de formation et de perfectionnement dans une entreprise ou des services privés<br> "
	    		+ " et publics. Le stage de formation est une autre forme de contrat emploi dans un cadre légal bien spécifique dont<br>"
	    		+ "et à la réussite de tous ses projets.<html>");
	    t1.setFont(t1.getFont().deriveFont(Font.BOLD));
	    Font font5 = new Font("Arial",Font.BOLD,26);
	    t1.setFont(font5);
	    t1.setForeground(new Color(3,34,76));
	    t1.setBounds(500, 500 , 400, 100);
	    
	    p.add(esp);
	    p.add(t1); 
	    con=new JButton("connection stagiere",new ImageIcon("icons8-pouce-en-l'air-50 - Copie - Copie - Copie.png"));
	    con.setBackground(new Color(51,0,25));
	    con.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,15));
	    con.setForeground(new Color(225,102,102));
	    con.setBounds(100, 700, 150, 50);
	    con.addActionListener(new ActionListener(){
		    public void  actionPerformed(ActionEvent arg0){
		    	{ Connection_St c=new Connection_St("con");	}
		    	Connection_St.main(null); }
	    });
					
	    con1=new JButton("connection admin",new ImageIcon("icons8-pouce-en-l'air-50 - Copie - Copie - Copie.png"));
	    con1.setBackground(new Color(51,0,25));
	    con1.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,13));
	    con1.setForeground(new Color(225,102,102));
	    con1.setBounds(500, 700, 150, 50);
	    con1.addActionListener(new ActionListener(){
		    public void  actionPerformed(ActionEvent arg0){
		    	{ ConnectionAd c=new ConnectionAd("con");	}
		    	ConnectionAd.main(null); }
	    });
					

    p.add(con1);
    p.add(con);
    con2=new JButton("inscription stagiere",new ImageIcon("icons8-pouce-en-l'air-50 - Copie - Copie - Copie.png"));
    con2.setBackground(new Color(51,0,25));
    con2.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,15));
    con2.setForeground(new Color(225,102,102));
    con2.setBounds(100, 700, 150, 50);
    con2.addActionListener(new ActionListener(){
	    public void  actionPerformed(ActionEvent arg0){
	    	{ Inscription c=new Inscription("connections");	}
	    	 Inscription.main(null); }
    });
				
 
p.add(con2);
    

	}
	public static void main (String []args){
		JFrame frame = new Aceuille ("aceuille");
		frame . setVisible ( true ); 
	}
}