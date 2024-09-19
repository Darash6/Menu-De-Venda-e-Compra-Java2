import javax.swing.*;
import java.awt.*;

public class PessoaForm extends JFrame {

    private JTextField codigoField;
    private JTextField nomeField;
    private JTextField fantasiaField;
    private JTextField fisicaField;
    private JTextField cpfCnpjField;
    private JTextField rgField;
    private JTextField cadastroDataField;
    private JTextField enderecoField;
    private JTextField numeroField;
    private JTextField complementoField;
    private JTextField bairroField;
    private JTextField cidadeField;
    private JTextField ufField;
    private JTextField cepField;
    private JTextField fone1Field;
    private JTextField fone2Field;
    private JTextField celularField;
    private JTextField siteField;
    private JTextField emailField;
    private JCheckBox ativoCheckBox;

    public PessoaForm() {
        // Configuração do JFrame
        setTitle("Cadastro de Pessoa");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurar layout
        setLayout(new GridLayout(21, 2));

        // Criar componentes
        codigoField = new JTextField();
        nomeField = new JTextField();
        fantasiaField = new JTextField();
        fisicaField = new JTextField();
        cpfCnpjField = new JTextField();
        rgField = new JTextField();
        cadastroDataField = new JTextField();
        enderecoField = new JTextField();
        numeroField = new JTextField();
        complementoField = new JTextField();
        bairroField = new JTextField();
        cidadeField = new JTextField();
        ufField = new JTextField();
        cepField = new JTextField();
        fone1Field = new JTextField();
        fone2Field = new JTextField();
        celularField = new JTextField();
        siteField = new JTextField();
        emailField = new JTextField();
        ativoCheckBox = new JCheckBox("Ativo");

        // Adicionar componentes ao JFrame
        Font fonte = new Font("Arial", Font.BOLD, 14);

// Adicionar componentes ao JFrame
        JLabel codigoLabel = new JLabel("  Código:");
        codigoLabel.setFont(fonte);
        add(codigoLabel);
        codigoField.setFont(fonte);
        add(codigoField);

        JLabel nomeLabel = new JLabel("  Nome:");
        nomeLabel.setFont(fonte);
        add(nomeLabel);
        nomeField.setFont(fonte);
        add(nomeField);

        JLabel fantasiaLabel = new JLabel("  Nome Fantasia:");
        fantasiaLabel.setFont(fonte);
        add(fantasiaLabel);
        fantasiaField.setFont(fonte);
        add(fantasiaField);

        JLabel fisicaLabel = new JLabel("  Pessoa Física:");
        fisicaLabel.setFont(fonte);
        add(fisicaLabel);
        fisicaField.setFont(fonte);
        add(fisicaField);

        JLabel cpfCnpjLabel = new JLabel("  CPF/CNPJ:");
        cpfCnpjLabel.setFont(fonte);
        add(cpfCnpjLabel);
        cpfCnpjField.setFont(fonte);
        add(cpfCnpjField);

        JLabel rgLabel = new JLabel("  RG:");
        rgLabel.setFont(fonte);
        add(rgLabel);
        rgField.setFont(fonte);
        add(rgField);

        JLabel cadastroDataLabel = new JLabel("  Data de Cadastro:");
        cadastroDataLabel.setFont(fonte);
        add(cadastroDataLabel);
        cadastroDataField.setFont(fonte);
        add(cadastroDataField);

        JLabel enderecoLabel = new JLabel("  Endereço:");
        enderecoLabel.setFont(fonte);
        add(enderecoLabel);
        enderecoField.setFont(fonte);
        add(enderecoField);

        JLabel numeroLabel = new JLabel("  Número:");
        numeroLabel.setFont(fonte);
        add(numeroLabel);
        numeroField.setFont(fonte);
        add(numeroField);

        JLabel complementoLabel = new JLabel("  Complemento:");
        complementoLabel.setFont(fonte);
        add(complementoLabel);
        complementoField.setFont(fonte);
        add(complementoField);

        JLabel bairroLabel = new JLabel("  Bairro:");
        bairroLabel.setFont(fonte);
        add(bairroLabel);
        bairroField.setFont(fonte);
        add(bairroField);

        JLabel cidadeLabel = new JLabel("  Cidade:");
        cidadeLabel.setFont(fonte);
        add(cidadeLabel);
        cidadeField.setFont(fonte);
        add(cidadeField);

        JLabel ufLabel = new JLabel("  UF:");
        ufLabel.setFont(fonte);
        add(ufLabel);
        ufField.setFont(fonte);
        add(ufField);

        JLabel cepLabel = new JLabel("  CEP:");
        cepLabel.setFont(fonte);
        add(cepLabel);
        cepField.setFont(fonte);
        add(cepField);

        JLabel fone1Label = new JLabel("  Telefone 1:");
        fone1Label.setFont(fonte);
        add(fone1Label);
        fone1Field.setFont(fonte);
        add(fone1Field);

        JLabel fone2Label = new JLabel("  Telefone 2:");
        fone2Label.setFont(fonte);
        add(fone2Label);
        fone2Field.setFont(fonte);
        add(fone2Field);

        JLabel celularLabel = new JLabel("  Celular:");
        celularLabel.setFont(fonte);
        add(celularLabel);
        celularField.setFont(fonte);
        add(celularField);

        JLabel siteLabel = new JLabel("  Site:");
        siteLabel.setFont(fonte);
        add(siteLabel);
        siteField.setFont(fonte);
        add(siteField);

        JLabel emailLabel = new JLabel("  Email:");
        emailLabel.setFont(fonte);
        add(emailLabel);
        emailField.setFont(fonte);
        add(emailField);

        JLabel ativoLabel = new JLabel("  Ativo:");
        ativoLabel.setFont(fonte);
        add(ativoLabel);
        ativoCheckBox.setFont(fonte);
        add(ativoCheckBox);

        // Botões de ação
        JButton saveButton = new JButton("Salvar");
        JButton cancelButton = new JButton("Cancelar");

        // Estilizar botões
        saveButton.setFont(new Font("Arial", Font.BOLD, 12));
        saveButton.setForeground(Color.WHITE);
        saveButton.setBackground(Color.GREEN);

        cancelButton.setFont(new Font("Arial", Font.BOLD, 12));
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setBackground(Color.RED);

        add(saveButton);
        add(cancelButton);

        // Ações dos botões (exemplo)
        saveButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Dados salvos!"));
        cancelButton.addActionListener(e -> dispose());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PessoaForm().setVisible(true));
    }
}
