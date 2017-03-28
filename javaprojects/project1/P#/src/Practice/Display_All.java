package Practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Display_All extends JFrame
{
	public Display_All(){
		Vector columnNames = new Vector();
		Vector data = new Vector();
		ImageIcon restaurantPicture = new ImageIcon("images/restaurant.jpg");
		JButton restaurantImageButton = new JButton(restaurantPicture);
		restaurantImageButton.setBackground(Color.black);
		add(restaurantImageButton, BorderLayout.NORTH);
		

	}
    public Display_All(Object town)
    {
        Vector columnNames = new Vector();
        Vector data = new Vector();

        try
        {
            //  Connect to an Access Database


            String driver = "com.mysql.jdbc.Driver";
            String url ="jdbc:mysql://localhost:3306/ire";
            String userid = "root";
            String password = "password";

            Class.forName( driver );
            Connection connection = DriverManager.getConnection( url, userid, password );

            //  Read data from a table

            String sql = "(SELECT Activities_Name,       Activities_Email,Activities_Address_1,   Town, Activities_Phone ,Activities_Mobile, Activities_Web_Address, Activities_Owner FROM activities WHERE Town ='"+town+"')"
                    + "UNION ALL ( SELECT Attraction_Name, Attraction_Email, Attraction_Address_1, Town, Attraction_Phone, Attraction_Mobile, Attraction_Web_Address, Attraction_Owner FROM attractions WHERE Town = '"+town+"')"
                    + "UNION ALL ( SELECT BB_Name, BB_Email, BB_Address_1 ,Town, BB_Phone, BB_Mobile, BB_Web_Address, BB_Owner FROM bb WHERE Town = '"+town+"')"
                    + "UNION ALL ( SELECT Hotel_Name ,Hotel_Email ,Hotel_Address_1, Town, Hotel_Phone, Hotel_Mobile, Hotel_Web_Address, Hotel_Owner FROM hotels WHERE Town = '"+town+"')"
                    + "UNION ALL ( SELECT Pub_Name, Pub_Email ,Pub_Address_1, Town, Pub_Phone ,Pub_Mobile, Pub_Web_Address, Pub_Owner FROM pubs WHERE Town = '"+town+"')"
                    + "UNION ALL ( SELECT Restaurant_Name, Restaurant_Email, Restaurant_Address_1, Town, Restaurant_Phone, Restaurant_Mobile, Restaurant_Web_Address, Restaurant_Owner FROM restaurant WHERE Town = '"+town+"')"
                    + "UNION ALL ( SELECT Self_Catering_Name, Self_Catering_Email, Self_Catering_Address_1, Town, Self_Catering_Phone, Self_Catering_Mobile, Self_Catering_Web_Address, Self_Catering_Owner FROM self_catering WHERE Town = '"+town+"')";


            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( sql );
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            //  Get column names


            columnNames.addElement( "Business Name" );
            columnNames.addElement( "Email" );
            columnNames.addElement( "Address 1" );
            columnNames.addElement( "Town" );
            columnNames.addElement( "Phone" );
            columnNames.addElement( "Mobile" );
            columnNames.addElement( "Web Address" );
            columnNames.addElement( "Owner" );


            //  Get row data

            while (rs.next())
            {
                Vector row = new Vector(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.addElement( rs.getObject(i) );
                }

                data.addElement( row );
            }

            rs.close();
            stmt.close();
            connection.close();
        }
        catch(Exception e)
        {
            System.out.println( e );
        }

        //  Create table with database data

        JTable table = new JTable(data, columnNames )
        {
            public Class getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);

                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };

        JScrollPane scrollPane = new JScrollPane( table );
        getContentPane().add( scrollPane );

    //        JPanel buttonPanel = new JPanel();
    //        getContentPane().add( buttonPanel, BorderLayout.SOUTH );
    }

    public static void main(String[] args)
    {
        Display_All frame = new Display_All();
        frame.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        frame.setSize(new Dimension(400, 300));
        frame.setVisible(true);
    }

     public void run() {
        new Display_All("town").setVisible(true);
     }
    }