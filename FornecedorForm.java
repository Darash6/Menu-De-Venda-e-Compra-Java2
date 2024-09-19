import javax.swing.*;
import java.awt.*;

public class FornecedorForm extends JFrame {

    private JTextField codigoField;
    private JTextField nomeField;
    private JTextField contatoField;

    public FornecedorForm() {
        // Configuração do JFrame
        setTitle("Cadastro de Fornecedor");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurar layout
        setLayout(new BorderLayout(10, 10));

        // Painel principal
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Criar componentes
        codigoField = new JTextField(20);
        nomeField = new JTextField(20);
        contatoField = new JTextField(20);

        // Definir fonte
        Font font = new Font("Arial", Font.BOLD, 14);

        // Adicionar componentes ao painel principal
        JLabel codigoLabel = new JLabel("Código:");
        codigoLabel.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(codigoLabel, gbc);
        codigoField.setFont(font);
        gbc.gridx = 1;
        mainPanel.add(codigoField, gbc);

        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(nomeLabel, gbc);
        nomeField.setFont(font);
        gbc.gridx = 1;
        mainPanel.add(nomeField, gbc);

        JLabel contatoLabel = new JLabel("Contato:");
        contatoLabel.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 2;
        mainPanel.add(contatoLabel, gbc);
        contatoField.setFont(font);
        gbc.gridx = 1;
        mainPanel.add(contatoField, gbc);

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

        // Ações dos botões
        saveButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Fornecedor salvo!"));
        cancelButton.addActionListener(e -> dispose());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FornecedorForm().setVisible(true));
    }
}
