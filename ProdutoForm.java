import javax.swing.*;
import java.awt.*;

public class ProdutoForm extends JFrame {

    private JTextField codigoField;
    private JTextField nomeField;
    private JTextField estoqueField;
    private JTextField unidadeField;
    private JTextField precoField;
    private JTextField custoField;
    private JTextField atacadoField;
    private JTextField minField;
    private JTextField maxField;
    private JTextField embalagemDecimalField;
    private JTextField pesoField;
    private JTextField cadastroField;
    private JTextField obsField;
    private JCheckBox ativoCheckBox;

    public ProdutoForm() {
        // Configuração do JFrame
        setTitle("Cadastro de Produto");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurar layout
        setLayout(new GridLayout(16, 2));

        // Criar componentes
        Font font = new Font("Arial", Font.BOLD, 14);
        codigoField = new JTextField();
        nomeField = new JTextField();
        estoqueField = new JTextField();
        unidadeField = new JTextField();
        precoField = new JTextField();
        custoField = new JTextField();
        atacadoField = new JTextField();
        minField = new JTextField();
        maxField = new JTextField();
        embalagemDecimalField = new JTextField();
        pesoField = new JTextField();
        cadastroField = new JTextField();
        obsField = new JTextField();
        ativoCheckBox = new JCheckBox();

        // Aplicar fonte aos componentes
        codigoField.setFont(font);
        nomeField.setFont(font);
        estoqueField.setFont(font);
        unidadeField.setFont(font);
        precoField.setFont(font);
        custoField.setFont(font);
        atacadoField.setFont(font);
        minField.setFont(font);
        maxField.setFont(font);
        embalagemDecimalField.setFont(font);
        pesoField.setFont(font);
        cadastroField.setFont(font);
        obsField.setFont(font);
        ativoCheckBox.setFont(font);

        // Adicionar componentes ao JFrame
        add(new JLabel("Código:")).setFont(font);
        add(codigoField);
        add(new JLabel("Nome:")).setFont(font);
        add(nomeField);
        add(new JLabel("Estoque:")).setFont(font);
        add(estoqueField);
        add(new JLabel("Unidade:")).setFont(font);
        add(unidadeField);
        add(new JLabel("Preço:")).setFont(font);
        add(precoField);
        add(new JLabel("Custo:")).setFont(font);
        add(custoField);
        add(new JLabel("Atacado:")).setFont(font);
        add(atacadoField);
        add(new JLabel("Min:")).setFont(font);
        add(minField);
        add(new JLabel("Max:")).setFont(font);
        add(maxField);
        add(new JLabel("Embalagem Decimal:")).setFont(font);
        add(embalagemDecimalField);
        add(new JLabel("Peso:")).setFont(font);
        add(pesoField);
        add(new JLabel("Cadastro:")).setFont(font);
        add(cadastroField);
        add(new JLabel("Observações:")).setFont(font);
        add(obsField);
        add(new JLabel("Ativo:")).setFont(font);
        add(ativoCheckBox);

        // Botões de ação
        JButton saveButton = new JButton("Salvar");
        saveButton.setBackground(Color.GREEN);
        saveButton.setFont(font);
        JButton cancelButton = new JButton("Cancelar");
        cancelButton.setBackground(Color.RED);
        cancelButton.setFont(font);

        add(saveButton);
        add(cancelButton);

        // Ações dos botões
        saveButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Produto salvo!"));
        cancelButton.addActionListener(e -> dispose());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ProdutoForm().setVisible(true));
    }
}
