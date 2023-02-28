import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaLogin extends JFrame {
    private JButton btnLogin;
    private JTextField txtUsuario;
    private JPasswordField pwdSenha;
    private JLabel lblUsuario;
    private JLabel lblSenha;
    private JPanel pnlTelaLogin;

    String usuario;
    String senha;

    public telaLogin() {

        iniciarComponentes();
        criarListeners();
        //validarLogin();
    }

    public void iniciarComponentes() {
        setTitle("Tela de login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlTelaLogin);
        setVisible(true);
    }

    public void criarListeners() {
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarLogin();
            }
        });
    }
    private void validarLogin(){

        String usuario = txtUsuario.getText();
        String senha = new String(pwdSenha.getPassword());

        if (usuario.equals("admin") && senha.equals("admin")) {

            formularioCadastroUsuario cadUsuario = new formularioCadastroUsuario();

            cadUsuario.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos");
        }

    }

    public static void main(String[] args) {
        telaLogin iniciar = new telaLogin();
    }
}