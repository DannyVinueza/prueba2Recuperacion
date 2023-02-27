import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;
import java.time.LocalDate;

public class aplicacionR {
    PreparedStatement ps;
    private JPanel ventana;
    private JComboBox dia;
    private JComboBox mes;
    private JComboBox anio;
    private JButton crear;
    private JTextField in;

    private static int diaIng;
    private static int mesInt;
    private static String mesIng;
    private static int anioIng;


    public aplicacionR() {

        Connection con;
            try{
                con = getConection();
                String query = "SELECT * FROM dias";
                Statement s = con.createStatement();
                ResultSet rs =s.executeQuery(query);
                while(rs.next()){
                    dia.addItem(rs.getInt(2));
                }
            }catch (HeadlessException | SQLException e){
                System.out.println(e);
            }

        try{
            con = getConection();
            String query = "SELECT * FROM mes";
            Statement s = con.createStatement();
            ResultSet rs =s.executeQuery(query);
            while(rs.next()){
                mes.addItem(rs.getString(2));
            }
        }catch (HeadlessException | SQLException e){
            System.out.println(e);
        }

        try{
            con = getConection();
            String query = "SELECT * FROM anio";
            Statement s = con.createStatement();
            ResultSet rs =s.executeQuery(query);
            while(rs.next()){
                anio.addItem(rs.getString(2));
            }
        }catch (HeadlessException | SQLException e){
            System.out.println(e);
        }
        crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object diass = dia.getSelectedItem().toString();
                System.out.println(diaIng);
                Object mesIng = mes.getSelectedItem();
                System.out.println(mesIng);
                Object anioss = anio.getSelectedItem().toString();
                System.out.println(anioIng);
                String mesFinal = Integer.toString(mesInt);
                System.out.println(mesInt);
                String fecha = anioss + "-" + mesFinal + "-" + diass ;
                in.setText(fecha);
                Connection con;
                try{
                    con = getConection();
                    ps = con.prepareStatement("INSERT INTO fecha (fecha) VALUES (?)");
                    ps.setString(1, dia.getSelectedItem() + "/" + mes.getSelectedItem() + "/" + anio.getSelectedItem());
                    System.out.println(ps);

                    int cont = ps.executeUpdate();
                    if(cont > 0){
                        JOptionPane.showMessageDialog(null, "Fecha guaradada correctamente");
                    }else{
                        JOptionPane.showMessageDialog(null, "Error no se pudo guardar la fecha");
                    }
                    con.close();
                }catch (SQLException s){
                    System.out.println("Error " + s.getMessage());
                }
            }
        });
        mes.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Object sele = mes.getSelectedItem();
                Connection con;
                /*if (sele.equals("Febrero")){
                    try{
                        mesInt = 2;
                        dia.removeAllItems();
                        con = getConection();
                        String query = "SELECT * FROM dias LIMIT 28";
                        Statement s = con.createStatement();
                        ResultSet rs =s.executeQuery(query);
                        while(rs.next()){
                            dia.addItem(rs.getInt(2));
                        }
                    }catch (HeadlessException | SQLException s){
                        System.out.println(s);
                    }
                }*/

                Object select = mes.getSelectedItem();
                if (select.equals("Enero")){
                    mesInt = 1;
                } else if (select.equals("Marzo")) {
                    mesInt = 3;
                }else if (select.equals("Abril")) {
                    mesInt = 4;
                }else if (select.equals("Mayo")) {
                    mesInt = 5;
                }else if (select.equals("Junio")) {
                    mesInt = 6;
                }else if (select.equals("Julio")) {
                    mesInt = 7;
                }else if (select.equals("Agosto")) {
                    mesInt = 8;
                }else if (select.equals("Septiembre")) {
                    mesInt = 9;
                }else if (select.equals("Octubre")) {
                    mesInt = 10;
                }else if (select.equals("Noviembre")) {
                    mesInt = 11;
                }else if (select.equals("Diciembre")) {
                    mesInt = 12;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Recuperacion");
        frame.setContentPane(new aplicacionR().ventana);
        frame.setSize(1700,1000);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static Connection getConection(){
        Connection con = null;
        String nombreBD = "recuperacion";
        String url = "jdbc:mysql://localhost:3306/" + nombreBD;
        String user = "root";
        String password = "1234";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
            System.out.println("Conexion Exitosa");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
            System.out.println("Eroor en la conexion..");
        }
        return con;
    }

}
