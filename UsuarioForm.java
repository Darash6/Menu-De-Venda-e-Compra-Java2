import javax.swing.*;
import java.awt.*;

public class UsuarioForm extends JFrame {

    private JTextField codigoField;
    private JTextField nomeField;
    private JTextField loginField;
    private JPasswordField senhaField;
    private JTextField cadastroField;
    private JCheckBox ativoCheckBox;

    public UsuarioForm() {
        // Configuração do JFrame
        setTitle("Cadastro de Usuário");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurar layout
        setLayout(new BorderLayout());

        // Painel principal
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Criar componentes
        JTextField codigoField = new JTextField(20);
        JTextField nomeField = new JTextField(20);
        JTextField loginField = new JTextField(20);
        JPasswordField senhaField = new JPasswordField(20);
        JTextField cadastroField = new JTextField(20);
        JCheckBox ativoCheckBox = new JCheckBox("Ativo");

        // Definir fonte
        Font font = new Font("Arial", Font.BOLD, 14);

        // Adicionar componentes ao painel principal
        addComponent(mainPanel, new JLabel("Código:"), gbc, 0, 0, font);
        addComponent(mainPanel, codigoField, gbc, 1, 0, font);
        addComponent(mainPanel, new JLabel("Nome:"), gbc, 0, 1, font);
        addComponent(mainPanel, nomeField, gbc, 1, 1, font);
        addComponent(mainPanel, new JLabel("Login:"), gbc, 0, 2, font);
        addComponent(mainPanel, loginField, gbc, 1, 2, font);
        addComponent(mainPanel, new JLabel("Senha:"), gbc, 0, 3, font);
        addComponent(mainPanel, senhaField, gbc, 1, 3, font);
        addComponent(mainPanel, new JLabel("Data de Cadastro:"), gbc, 0, 4, font);
        addComponent(mainPanel, cadastroField, gbc, 1, 4, font);
        addComponent(mainPanel, new JLabel("Ativo:"), gbc, 0, 5, font);
        addComponent(mainPanel, ativoCheckBox, gbc, 1, 5, font);

        // Painel de botões
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton saveButton = new JButton("Salvar");
        saveButton.setBackground(Color.GREEN);
        saveButton.setForeground(Color.WHITE);
        saveButton.setFont(font);
        JButton cancelButton = new JButton("Cancelar");
        cancelButton.setBackground(Color.RED);
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setFont(font);
        buttonPanel.add(saveButton);
        buttonPanel.add(cancelButton);

        // Adicionar painéis ao JFrame
        add(mainPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Ações dos botões (exemplo)
        saveButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Usuário salvo!"));
        cancelButton.addActionListener(e -> dispose());
    }

    private void addComponent(JPanel panel, Component component, GridBagConstraints gbc, int x, int y, Font font) {
        if (component instanceof JLabel || component instanceof JTextField || component instanceof JCheckBox) {
            component.setFont(font);
        }
        gbc.gridx = x;
        gbc.gridy = y;
        panel.add(component, gbc);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UsuarioForm().setVisible(true));
    }
}
