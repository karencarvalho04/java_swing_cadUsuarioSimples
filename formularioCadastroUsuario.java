import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class formularioCadastroUsuario extends JFrame {
    private JPanel pnlFormularioCadUsuario;
    private JTextField txtCadNome;
    private JTextField txtCadSobrenome;
    private JPasswordField pdwSenha;
    private JTextField txtCadFuncao;
    private JButton btnCadUsuario;
    private JLabel lblCadNome;
    private JLabel lblCadSobrenome;
    private JLabel lblCadSetor;
    private JLabel lblCadFuncao;
    private JLabel lblCadNovoUsuario;
    private JLabel lblCadSenha;
    private JTextField txtCadSetor;
    private JTextField txtCadUsuario;
public formularioCadastroUsuario() {
        criarListeners();
        iniciarComponentes();
        }

        public void iniciarComponentes(){
            setTitle("Cadastro de Usuários");
            setSize(300, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setContentPane(pnlFormularioCadUsuario);
            setVisible(true);

    }

    public void validarUsuario() throws SQLException {
        String nomeUsuario = txtCadNome.getText();
        String sobrenomeUsuario = txtCadSobrenome.getText();
        String setorUsuario = txtCadSetor.getText();
        String funcaoUsuario = txtCadFuncao.getText();
        String loginUsuario = txtCadUsuario.getText();
        String senha = new String(pdwSenha.getPassword());

            JOptionPane.showMessageDialog(btnCadUsuario, "O seguinte usuário foi cadastrado com sucesso: \n"
                    + "Nome: " + nomeUsuario + "\n"
                    + "Sobrenome: " + sobrenomeUsuario + "\n"
                    + "Setor: " + setorUsuario + "\n"
                    + "Função: "+ funcaoUsuario);

    }

    public void criarListeners(){
        btnCadUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    validarUsuario();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
}


}
