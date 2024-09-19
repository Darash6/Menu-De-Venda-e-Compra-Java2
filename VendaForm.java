import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VendaForm extends JFrame {
    private JTextField codigoVendaField;
    private JTextField dataVendaField;
    private JTextField valorTotalField;
    private JTextField clienteField;
    private JTextField datadeemissaoField;
    private JTable produtosTable;
    private DefaultTableModel tableModel;
    private String formaPagamento;
    private double valorPagamento;
    private int codigoProdutoSequencial = 1; // Código sequencial para produtos
    private int codigoVendaSequencial = 1; // Código sequencial para vendas
    private ArrayList<String> codigosProdutos = new ArrayList<>(); // Para armazenar códigos dos produtos

    public VendaForm() {
        // Configuração do JFrame
        setTitle("Venda");
        setSize(1300, 700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurar layout
        setLayout(new BorderLayout());

        // Criar painel superior com campos de venda
        JPanel vendaPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Margens internas

        // Tamanho dos campos
        Dimension fieldSize = new Dimension(150, 25);

        JLabel codigoVendaLabel = new JLabel("Código da Venda:");
        codigoVendaField = new JTextField();
        codigoVendaField.setPreferredSize(fieldSize);
        codigoVendaField.setEditable(false); // Desabilita edição direta

        JLabel usuarioLabel = new JLabel("Usuário:");
        dataVendaField = new JTextField();
        dataVendaField.setPreferredSize(fieldSize);

        JLabel clienteLabel = new JLabel("Cliente:");
        clienteField = new JTextField();
        clienteField.setPreferredSize(fieldSize);

        JLabel datadeemissaoLabel = new JLabel("Data de Emissão:");
        datadeemissaoField = new JTextField();
        datadeemissaoField.setPreferredSize(fieldSize);

        gbc.gridx = 0;
        gbc.gridy = 0;
        vendaPanel.add(codigoVendaLabel, gbc);

        gbc.gridx = 1;
        vendaPanel.add(codigoVendaField, gbc);

        gbc.gridx = 2;
        vendaPanel.add(usuarioLabel, gbc);

        gbc.gridx = 3;
        vendaPanel.add(dataVendaField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        vendaPanel.add(clienteLabel, gbc);

        gbc.gridx = 1;
        vendaPanel.add(clienteField, gbc);

        gbc.gridx = 2;
        vendaPanel.add(datadeemissaoLabel, gbc);

        gbc.gridx = 3;
        vendaPanel.add(datadeemissaoField, gbc);

        add(vendaPanel, BorderLayout.NORTH);

        // Tabela de produtos
        String[] colunas = {"Código", "Produto", "Código do Cliente", "Quantidade", "Preço Unitário", "Desconto", "Data de Entrada", "Obs", "Forma de Pagamento", "Valor do Pagamento"};
        tableModel = new DefaultTableModel(new Object[][]{}, colunas);
        produtosTable = new JTable(tableModel);
        produtosTable.setFont(new Font("Arial", Font.PLAIN, 12));
        produtosTable.setRowHeight(25);
        produtosTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        add(new JScrollPane(produtosTable), BorderLayout.CENTER);

        // Botões de ação
        JPanel botoesPanel = new JPanel();
        botoesPanel.setLayout(new FlowLayout()); // Usando FlowLayout para alinhamento

        // Campo de valor total
        JLabel valorTotalLabel = new JLabel("Valor Total:");
        valorTotalLabel.setFont(new Font("Arial", Font.BOLD, 14));
        valorTotalField = new JTextField();
        valorTotalField.setPreferredSize(new Dimension(150, 25));
        valorTotalField.setEditable(false); // Desabilita edição direta

        JButton addButton = new JButton("Adicionar Produto");
        JButton pagamentoButton = new JButton("Forma de Pagamento");
        JButton cancelButton = new JButton("Sair");

        addButton.setBackground(Color.BLUE);
        addButton.setForeground(Color.WHITE);
        addButton.setFont(new Font("Arial", Font.BOLD, 14));
        addButton.setPreferredSize(new Dimension(150, 30));

        pagamentoButton.setBackground(Color.GREEN);
        pagamentoButton.setForeground(Color.WHITE);
        pagamentoButton.setFont(new Font("Arial", Font.BOLD, 14));
        pagamentoButton.setPreferredSize(new Dimension(150, 30));

        cancelButton.setBackground(Color.RED);
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setFont(new Font("Arial", Font.BOLD, 14));
        cancelButton.setPreferredSize(new Dimension(150, 30));

        botoesPanel.add(valorTotalLabel);
        botoesPanel.add(valorTotalField);
        botoesPanel.add(addButton);
        botoesPanel.add(pagamentoButton);
        botoesPanel.add(cancelButton);

        add(botoesPanel, BorderLayout.SOUTH);

        // Ações dos botões
        addButton.addActionListener(e -> mostrarDialogoAdicionarProduto());
        pagamentoButton.addActionListener(e -> mostrarDialogoFormaPagamento());
        cancelButton.addActionListener(e -> dispose());

        // Inicializa o código da venda
        atualizarCodigoVenda();
    }

    private void atualizarCodigoVenda() {
        codigoVendaField.setText(String.valueOf(codigoVendaSequencial++));
    }

    private void mostrarDialogoAdicionarProduto() {
        JDialog dialog = new JDialog(this, "Adicionar Produto", true);
        dialog.setSize(400, 600);
        dialog.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Font e tamanho dos campos
        Font font = new Font("Arial", Font.BOLD, 14);
        Dimension fieldSize = new Dimension(150, 25);

        JTextField codigoField = new JTextField();
        codigoField.setPreferredSize(fieldSize);
        codigoField.setEditable(false); // Desabilita edição direta

        JTextField produtoField = new JTextField();
        produtoField.setPreferredSize(fieldSize);

        JTextField codigoClienteField = new JTextField();
        codigoClienteField.setPreferredSize(fieldSize);

        JTextField quantidadeField = new JTextField();
        quantidadeField.setPreferredSize(fieldSize);

        JTextField precoField = new JTextField();
        precoField.setPreferredSize(fieldSize);

        JTextField descontoField = new JTextField();
        descontoField.setPreferredSize(fieldSize);

        JTextField dataEntradaField = new JTextField();
        dataEntradaField.setPreferredSize(fieldSize);

        JTextField obsField = new JTextField();
        obsField.setPreferredSize(fieldSize);

        JLabel codigoLabel = new JLabel("Código:");
        JLabel produtoLabel = new JLabel("Produto:");
        JLabel codigoClienteLabel = new JLabel("Código do Cliente:");
        JLabel quantidadeLabel = new JLabel("Quantidade:");
        JLabel precoLabel = new JLabel("Preço Unitário:");
        JLabel descontoLabel = new JLabel("Desconto:");
        JLabel dataEntradaLabel = new JLabel("Data de Entrada:");
        JLabel obsLabel = new JLabel("Obs:");

        codigoLabel.setFont(font);
        produtoLabel.setFont(font);
        codigoClienteLabel.setFont(font);
        quantidadeLabel.setFont(font);
        precoLabel.setFont(font);
        descontoLabel.setFont(font);
        dataEntradaLabel.setFont(font);
        obsLabel.setFont(font);

        codigoField.setFont(font);
        produtoField.setFont(font);
        codigoClienteField.setFont(font);
        quantidadeField.setFont(font);
        precoField.setFont(font);
        descontoField.setFont(font);
        dataEntradaField.setFont(font);
        obsField.setFont(font);

        gbc.gridx = 0;
        gbc.gridy = 0;
        dialog.add(codigoLabel, gbc);

        gbc.gridx = 1;
        dialog.add(codigoField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        dialog.add(produtoLabel, gbc);

        gbc.gridx = 1;
        dialog.add(produtoField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        dialog.add(codigoClienteLabel, gbc);

        gbc.gridx = 1;
        dialog.add(codigoClienteField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        dialog.add(quantidadeLabel, gbc);

        gbc.gridx = 1;
        dialog.add(quantidadeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        dialog.add(precoLabel, gbc);

        gbc.gridx = 1;
        dialog.add(precoField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        dialog.add(descontoLabel, gbc);

        gbc.gridx = 1;
        dialog.add(descontoField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        dialog.add(dataEntradaLabel, gbc);

        gbc.gridx = 1;
        dialog.add(dataEntradaField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        dialog.add(obsLabel, gbc);

        gbc.gridx = 1;
        dialog.add(obsField, gbc);

        JButton adicionarButton = new JButton("Adicionar");
        adicionarButton.setBackground(Color.BLUE);
        adicionarButton.setForeground(Color.WHITE);
        adicionarButton.setFont(font);
        adicionarButton.setPreferredSize(new Dimension(150, 30));
        adicionarButton.addActionListener(e -> {
            try {
                String codigo = String.valueOf(codigoProdutoSequencial++);
                String produto = produtoField.getText();
                String codigoCliente = codigoClienteField.getText();
                int quantidade = Integer.parseInt(quantidadeField.getText());
                double preco = Double.parseDouble(precoField.getText());
                double desconto = Double.parseDouble(descontoField.getText());
                String dataEntrada = dataEntradaField.getText();
                String obs = obsField.getText();

                double precoComDesconto = preco * (1 - desconto / 100); // Aplicando o desconto
                double total = precoComDesconto * quantidade;
                tableModel.addRow(new Object[]{codigo, produto, codigoCliente, quantidade, preco, desconto, dataEntrada, obs, "", ""});
                codigosProdutos.add(codigo); // Adiciona o código do produto à lista

                atualizarValorTotal();

                dialog.dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(dialog, "Por favor, insira valores válidos para Quantidade, Preço Unitário e Desconto.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        JButton cancelButton = new JButton("Cancelar");
        cancelButton.setBackground(Color.RED);
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setFont(font);
        cancelButton.setPreferredSize(new Dimension(150, 30));
        cancelButton.addActionListener(e -> dialog.dispose());

        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(adicionarButton);
        buttonPanel.add(cancelButton);
        dialog.add(buttonPanel, gbc);

        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    private void atualizarValorTotal() {
        double total = 0.0;
        int rowCount = tableModel.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            Object quantidadeValue = tableModel.getValueAt(i, 3); // Quantidade
            Object precoValue = tableModel.getValueAt(i, 4); // Preço Unitário
            Object descontoValue = tableModel.getValueAt(i, 5); // Desconto
            if (quantidadeValue instanceof Number && precoValue instanceof Number && descontoValue instanceof Number) {
                int quantidade = ((Number) quantidadeValue).intValue();
                double preco = ((Number) precoValue).doubleValue();
                double desconto = ((Number) descontoValue).doubleValue();
                double precoComDesconto = preco * (1 - desconto / 100);
                total += precoComDesconto * quantidade;
            }
        }
        if (valorPagamento > 0) {
            total -= valorPagamento;
        }
        valorTotalField.setText(String.format("%.2f", total));
    }

    private void mostrarDialogoFormaPagamento() {
        JDialog dialog = new JDialog(this, "Forma de Pagamento", true);
        dialog.setSize(400, 300);
        dialog.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Font e tamanho dos campos
        Font font = new Font("Arial", Font.BOLD, 14);
        Dimension fieldSize = new Dimension(150, 25);

        JComboBox<String> codigoProdutoCombo = new JComboBox<>(codigosProdutos.toArray(new String[0]));
        JTextField valorPagarField = new JTextField();
        valorPagarField.setPreferredSize(fieldSize);
        JComboBox<String> formaPagamentoCombo = new JComboBox<>(new String[]{"Débito", "Crédito", "Dinheiro"});

        JLabel codigoProdutoLabel = new JLabel("Código do Produto:");
        JLabel valorPagarLabel = new JLabel("Valor a Pagar:");
        JLabel formaPagamentoLabel = new JLabel("Forma de Pagamento:");

        codigoProdutoLabel.setFont(font);
        valorPagarLabel.setFont(font);
        formaPagamentoLabel.setFont(font);

        valorPagarField.setFont(font);

        gbc.gridx = 0;
        gbc.gridy = 0;
        dialog.add(codigoProdutoLabel, gbc);

        gbc.gridx = 1;
        dialog.add(codigoProdutoCombo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        dialog.add(valorPagarLabel, gbc);

        gbc.gridx = 1;
        dialog.add(valorPagarField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        dialog.add(formaPagamentoLabel, gbc);

        gbc.gridx = 1;
        dialog.add(formaPagamentoCombo, gbc);

        JButton confirmarButton = new JButton("Confirmar");
        confirmarButton.setBackground(Color.GREEN);
        confirmarButton.setForeground(Color.WHITE);
        confirmarButton.setFont(font);
        confirmarButton.setPreferredSize(new Dimension(150, 30));
        confirmarButton.addActionListener(e -> {
            try {
                String codigoProduto = (String) codigoProdutoCombo.getSelectedItem();
                formaPagamento = (String) formaPagamentoCombo.getSelectedItem();
                valorPagamento = Double.parseDouble(valorPagarField.getText());

                // Atualizar o valor do pagamento na linha correspondente da tabela
                int rowCount = tableModel.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    String codigo = (String) tableModel.getValueAt(i, 0);
                    if (codigo.equals(codigoProduto)) {
                        tableModel.setValueAt(formaPagamento, i, 8); // Atualiza a coluna "Forma do Pagamento"
                        tableModel.setValueAt(valorPagamento, i, 9); // Atualiza a coluna "Valor do Pagamento"
                        break;
                    }
                }

                atualizarValorTotal();

                dialog.dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(dialog, "Por favor, insira um valor válido para o pagamento.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        JButton cancelarButton = new JButton("Cancelar");
        cancelarButton.setBackground(Color.RED);
        cancelarButton.setForeground(Color.WHITE);
        cancelarButton.setFont(font);
        cancelarButton.setPreferredSize(new Dimension(150, 30));
        cancelarButton.addActionListener(e -> dialog.dispose());

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(confirmarButton);
        buttonPanel.add(cancelarButton);
        dialog.add(buttonPanel, gbc);

        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VendaForm().setVisible(true));
    }
}
