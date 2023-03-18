package AgendaVisible;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Interfaz extends JFrame {

	String[] dni= new String[10];
	String[] nombre= new String[10];
	String[] apellido= new String[10];
	String[]direccion= new String[10];
	String telefono[]= new String[10];
	String fechaNac[]= new String[10];
	
	private JPanel contentPane;
	private JTextField txtDni;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtTel;
	private JTextField txtNac;
	private JTextField txtIndice;

	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("AGENDA ELECTRONICA");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(137, 11, 345, 38);
		contentPane.add(lblTitulo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 51, 592, 10);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("DNI:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(20, 72, 53, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNombre.setBounds(20, 107, 79, 21);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("APELLIDO:");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblApellido.setBounds(20, 142, 90, 21);
		contentPane.add(lblApellido);
		
		JLabel lblDireccuin = new JLabel("DIRECCION:");
		lblDireccuin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDireccuin.setBounds(275, 72, 149, 21);
		contentPane.add(lblDireccuin);
		
		JLabel lblTelefono = new JLabel("TELEFONO:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTelefono.setBounds(275, 107, 101, 21);
		contentPane.add(lblTelefono);
		
		JLabel lblFechaNa = new JLabel("FECHA NA:");
		lblFechaNa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFechaNa.setBounds(275, 142, 101, 21);
		contentPane.add(lblFechaNa);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 188, 592, 10);
		contentPane.add(separator_1);
		
		JButton btnAtras = new JButton("<<<");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String indice= txtIndice.getText();
				int indiceInt= Integer.parseInt(indice);
				if( indiceInt >0 && indiceInt<=9) {
				indiceInt= indiceInt -1;
				indice= String.valueOf(indiceInt);
				txtIndice.setText(indice);
				}else {
					txtIndice.setText(indice);
				}
				txtDni.setText(dni[indiceInt]);
				txtNombre.setText(nombre[indiceInt]);
				txtApellido.setText(apellido[indiceInt]);
				txtDireccion.setText(direccion[indiceInt]);
				txtTel.setText(telefono[indiceInt]);
				txtNac.setText(fechaNac[indiceInt]);
			}
		});
		btnAtras.setBounds(107, 209, 79, 38);
		contentPane.add(btnAtras);
		
		JButton btnAdelante = new JButton(">>>");
		btnAdelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String indice= txtIndice.getText();
				int indiceInt= Integer.parseInt(indice);
				if( indiceInt <=8 && indiceInt>=0) {
				indiceInt= indiceInt +1;
				indice= String.valueOf(indiceInt);
				txtIndice.setText(indice);
				}else {
					txtIndice.setText(indice);
				}
				txtDni.setText(dni[indiceInt]);
				txtNombre.setText(nombre[indiceInt]);
				txtApellido.setText(apellido[indiceInt]);
				txtDireccion.setText(direccion[indiceInt]);
				txtTel.setText(telefono[indiceInt]);
				txtNac.setText(fechaNac[indiceInt]);
			}
		});
		btnAdelante.setBounds(378, 209, 79, 38);
		contentPane.add(btnAdelante);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String indice= txtIndice.getText();
				int indiceInt= Integer.parseInt(indice);
				
				dni[indiceInt]= txtDni.getText();
				nombre[indiceInt]= txtNombre.getText();
				apellido[indiceInt]= txtApellido.getText();
				direccion[indiceInt]= txtDireccion.getText();
				telefono[indiceInt]= txtTel.getText();
				fechaNac[indiceInt]= txtNac.getText();
				
			}
		});
		btnGuardar.setBounds(241, 209, 90, 38);
		contentPane.add(btnGuardar);
		
		JLabel lblInDice = new JLabel("INDICE:");
		lblInDice.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblInDice.setBounds(183, 268, 90, 21);
		contentPane.add(lblInDice);
		
		txtDni = new JTextField();
		txtDni.setBounds(110, 72, 155, 20);
		contentPane.add(txtDni);
		txtDni.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(110, 107, 155, 20);
		contentPane.add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(110, 145, 155, 20);
		contentPane.add(txtApellido);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(378, 72, 155, 20);
		contentPane.add(txtDireccion);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(378, 110, 155, 20);
		contentPane.add(txtTel);
		
		txtNac = new JTextField();
		txtNac.setColumns(10);
		txtNac.setBounds(378, 145, 155, 20);
		contentPane.add(txtNac);
		
		txtIndice = new JTextField();
		txtIndice.setHorizontalAlignment(SwingConstants.CENTER);
		txtIndice.setText("0");
		txtIndice.setEditable(false);
		txtIndice.setColumns(10);
		txtIndice.setBounds(252, 271, 53, 20);
		contentPane.add(txtIndice);
	}
}
