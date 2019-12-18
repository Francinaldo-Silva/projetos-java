import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTree;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro {

	private JFrame frame;
	private JTextField jTxtnome;
	private JTextField jTxtcpf;
	private JTextField jTxtemail;
	private JTextField jTxtrg;
	private JTextField jTxtorg;
	private JTextField jTxtcep;
	private JTextField jTxtendereco;
	private JTextField jTxtbairro;
	private JTextField textField_8;
	private JTextField jtxttel_fixo;
	private JTextField jTxtcelular;
	private JTextField jTxtestado;
	private JTextField jTxtcidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro();
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
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome completo :");
		lblNewLabel.setBounds(10, 0, 101, 35);
		frame.getContentPane().add(lblNewLabel);
		
		jTxtnome = new JTextField();
		jTxtnome.setBounds(110, 7, 314, 20);
		frame.getContentPane().add(jTxtnome);
		jTxtnome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF : ");
		lblNewLabel_1.setBounds(10, 71, 29, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		jTxtcpf = new JTextField();
		jTxtcpf.setBounds(110, 68, 125, 20);
		frame.getContentPane().add(jTxtcpf);
		jTxtcpf.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(10, 38, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		jTxtemail = new JTextField();
		jTxtemail.setBounds(110, 37, 314, 20);
		frame.getContentPane().add(jTxtemail);
		jTxtemail.setColumns(10);
		
		JLabel lblRg = new JLabel("RG :");
		lblRg.setBounds(10, 104, 46, 14);
		frame.getContentPane().add(lblRg);
		
		jTxtrg = new JTextField();
		jTxtrg.setBounds(110, 99, 125, 20);
		frame.getContentPane().add(jTxtrg);
		jTxtrg.setColumns(10);
		
		JLabel lblOrgExp = new JLabel("Org. Exp :");
		lblOrgExp.setBounds(264, 104, 55, 14);
		frame.getContentPane().add(lblOrgExp);
		
		jTxtorg = new JTextField();
		jTxtorg.setBounds(329, 101, 86, 20);
		frame.getContentPane().add(jTxtorg);
		jTxtorg.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o :");
		lblEndereo.setBounds(10, 174, 101, 14);
		frame.getContentPane().add(lblEndereo);
		
		jTxtcep = new JTextField();
		jTxtcep.setBounds(110, 130, 125, 20);
		frame.getContentPane().add(jTxtcep);
		jTxtcep.setColumns(10);
		
		JLabel lblCep = new JLabel("Cep :");
		lblCep.setBounds(10, 133, 46, 14);
		frame.getContentPane().add(lblCep);
		
		jTxtendereco = new JTextField();
		jTxtendereco.setBounds(110, 171, 305, 20);
		frame.getContentPane().add(jTxtendereco);
		jTxtendereco.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 209, 46, 14);
		frame.getContentPane().add(lblBairro);
		
		jTxtbairro = new JTextField();
		jTxtbairro.setBounds(110, 206, 209, 20);
		frame.getContentPane().add(jTxtbairro);
		jTxtbairro.setColumns(10);
		
		JLabel lblN = new JLabel("N\u00BA :");
		lblN.setBounds(10, 247, 46, 14);
		frame.getContentPane().add(lblN);
		
		textField_8 = new JTextField();
		textField_8.setBounds(110, 244, 86, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone fixo :");
		lblTelefone.setBounds(10, 362, 101, 14);
		frame.getContentPane().add(lblTelefone);
		
		jtxttel_fixo = new JTextField();
		jtxttel_fixo.setBounds(110, 359, 125, 20);
		frame.getContentPane().add(jtxttel_fixo);
		jtxttel_fixo.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular :");
		lblCelular.setBounds(10, 400, 46, 14);
		frame.getContentPane().add(lblCelular);
		
		jTxtcelular = new JTextField();
		jTxtcelular.setBounds(110, 397, 125, 20);
		frame.getContentPane().add(jTxtcelular);
		jTxtcelular.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado :");
		lblEstado.setBounds(10, 285, 46, 14);
		frame.getContentPane().add(lblEstado);
		
		JList list = new JList();
		list.setBounds(220, 284, -109, 15);
		frame.getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setValueIsAdjusting(true);
		list_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		list_1.setBackground(Color.BLACK);
		list_1.setBounds(178, 325, -52, -40);
		frame.getContentPane().add(list_1);
		
		jTxtestado = new JTextField();
		jTxtestado.setBounds(110, 282, 86, 20);
		frame.getContentPane().add(jTxtestado);
		jTxtestado.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade :");
		lblCidade.setBounds(10, 325, 46, 14);
		frame.getContentPane().add(lblCidade);
		
		jTxtcidade = new JTextField();
		jTxtcidade.setBounds(110, 325, 86, 20);
		frame.getContentPane().add(jTxtcidade);
		jTxtcidade.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente();
				cliente.setNome(jTxtnome.getText());
				cliente.setEmail(jTxtemail.getText());
				cliente.setCpf( Integer.parseInt( jTxtcpf.getText()));
				cliente.setRg(Integer.parseInt(jTxtrg.getText()));
				cliente.setOrg_exp(jTxtorg.getText());
				cliente.setCep(Integer.parseInt(jTxtcep.getText()));
				cliente.setEndereco(jTxtendereco.getText());
			    cliente.setEstado(jTxtestado.getText());
				cliente.setCidade(jTxtcidade.getText());
				cliente.setTelfixo(Integer.parseInt(jtxttel_fixo.getText()));
				cliente.setCelular(Integer.parseInt(jTxtcelular.getText()));
				JOptionPane.showMessageDialog(null, cliente.salvar());
				
				
				
			}
		});
		btnNewButton.setBounds(179, 429, 117, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
