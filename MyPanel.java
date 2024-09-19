import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {
    private JButton loginButton;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JLabel titleLabel;
    private JLabel emailLabel;
    private JLabel passwordLabel;
    private JLabel forgotPasswordLabel;
    private JLabel signUpLabel;
    private JLabel imageLabel;

    public MyPanel(JFrame frame) {
        // Definir o layout do painel como null para posicionamento manual
        setLayout(null);


        // Carregar e redimensionar a imagem
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\User\\Desktop\\trabalhoodo\\foto.png");
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JLabel panelSemNome60 = new JLabel(scaledIcon);
        panelSemNome60.setBounds(400, 110, 120, 120);
        frame.add(panelSemNome60);



        // Configurar título
        titleLabel = new JLabel("Faça seu login.");
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 32));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(350, 40, 300, 50);
        add(titleLabel);

        // Configurar campo de email
        emailLabel = new JLabel("Email:");
        emailLabel.setForeground(Color.LIGHT_GRAY);
        emailLabel.setBounds(320, 240, 200, 20);
        add(emailLabel);

        emailField = new JTextField("generico1@gmail.com",20);
        emailField.setBounds(320, 270, 300, 40);
        emailField.setBackground(Color.BLACK);
        emailField.setForeground(Color.WHITE);
        emailField.setCaretColor(Color.WHITE);
        emailField.setBorder(BorderFactory.createLineBorder(new Color(128, 0, 128), 2));
        add(emailField);

        // Configurar campo de senha
        passwordLabel = new JLabel("Senha:");
        passwordLabel.setForeground(Color.LIGHT_GRAY);
        passwordLabel.setBounds(320, 320, 200, 20);
        add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(320, 350, 300, 40);
        passwordField.setBackground(Color.BLACK);
        passwordField.setForeground(Color.WHITE);
        passwordField.setCaretColor(Color.WHITE);
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(128, 0, 128)));
        add(passwordField);

        // Configurar link de "Esqueci minha senha"
        forgotPasswordLabel = new JLabel("Esqueci minha senha");
        forgotPasswordLabel.setForeground(new Color(128, 0, 128));
        forgotPasswordLabel.setBounds(320, 400, 200, 20);
        add(forgotPasswordLabel);

        // Configurar botão de login
        loginButton = new JButton("Entrar");
        loginButton.setBounds(320, 440, 300, 40);
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        loginButton.setFocusPainted(false);
        loginButton.setBackground(new Color(128, 0, 128));
        loginButton.setBorder(BorderFactory.createEmptyBorder());
        loginButton.setContentAreaFilled(false);
        loginButton.setOpaque(true);
        add(loginButton);

        // Configurar link de "Ainda não tenho uma conta"
        signUpLabel = new JLabel("Ainda não tenho uma conta");
        signUpLabel.setForeground(Color.LIGHT_GRAY);
        signUpLabel.setBounds(320, 500, 200, 20);
        add(signUpLabel);

        // Adicionar imagem na lateral direita
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\erika\\OneDrive\\Documentos\\ee7dd781-8230-4d1c-916e-dc1658c70a62.jpeg"); // Substitua com o caminho da sua imagem
        Image image = imageIcon.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);

        imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(400, 100, 250, 300);
        add(imageLabel);

        // Configurar o fundo
        setBackground(Color.BLACK);

        // Ação do botão de login
        loginButton.addActionListener(e -> {
            // Aqui, você pode adicionar a lógica de autenticação.
            // No exemplo, assume-se que o login foi bem-sucedido e abre o menu principal.
            frame.dispose(); // Fecha a janela de login
            SwingUtilities.invokeLater(() -> new MainMenu().setVisible(true)); // Abre o menu principal
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Configurar gradiente de fundo
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(
                0, 0, new Color(0, 1, 7),
                getWidth(), getHeight(), new Color(25, 47, 112)
        );
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MyPanel(frame));
        frame.setSize(900, 650);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}