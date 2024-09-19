import javax.swing.*;
import java.awt.*;

public class ClienteForm extends JFrame {

    private JTextField codigoField;
    private JTextField nomeField;
    private JTextField limiteCreditoField;

    public ClienteForm() {
        // Configuração do JFrame
        setTitle("Cadastro de Cliente");
        setSize(430, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurar layout
        setLayout(new GridLayout(4, 2, 10, 10)); // Adiciona espaçamento entre os componentes

        // Criar componentes
        codigoField = new JTextField();
        nomeField = new JTextField();
        limiteCreditoField = new JTextField();

        // Personalizar componentes
        JLabel codigoLabel = new JLabel("  Código:");
        JLabel nomeLabel = new JLabel("  Nome:");
        JLabel limiteCreditoLabel = new JLabel("  Limite de Crédito:");

        codigoLabel.setFont(new Font("Arial", Font.BOLD, 14));
        nomeLabel.setFont(new Font("Arial", Font.BOLD, 14));
        limiteCreditoLabel.setFont(new Font("Arial", Font.BOLD, 14));

        codigoField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        nomeField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        limiteCreditoField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

        // Adicionar componentes ao JFrame
        add(codigoLabel);
        add(codigoField);
        add(nomeLabel);
        add(nomeField);
        add(limiteCreditoLabel);
        add(limiteCreditoField);

        // Botões de ação
        JButton saveButton = new JButton("Salvar");
        JButton cancelButton = new JButton("Cancelar");

        saveButton.setPreferredSize(new Dimension(77, 26));
        cancelButton.setPreferredSize(new Dimension(77, 26));

        saveButton.setBackground(new Color(0, 153, 76));
        saveButton.setForeground(Color.WHITE);
        cancelButton.setBackground(new Color(204, 0, 0));
        cancelButton.setForeground(Color.WHITE);

        add(saveButton);
        add(cancelButton);

        // Ações dos botões (exemplo)
        saveButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Cliente salvo!"));
        cancelButton.addActionListener(e -> dispose());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ClienteForm().setVisible(true));
    }
}
