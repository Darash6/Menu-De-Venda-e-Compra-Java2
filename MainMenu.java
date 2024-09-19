import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class MainMenu extends JFrame {

    public MainMenu() {
        // Configuração do JFrame
        setTitle("Menu Principal");
        JFrame frame = new JFrame("Menu Principal");
        setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(300, 100);
        frame.setLayout(new BorderLayout());

        // Criar barra de menu
        JMenuBar menuBar = new JMenuBar();

        // Menu Cadastros
        JMenu cadastrosMenu = new JMenu("Cadastros");
        cadastrosMenu.setMnemonic(KeyEvent.VK_C); // Atalho de teclado Alt+C

        JMenuItem clienteItem = new JMenuItem("Cliente");
        clienteItem.setMnemonic(KeyEvent.VK_L); // Atalho de teclado Alt+L
        clienteItem.setIcon(new ImageIcon("icons/cliente.png"));
        clienteItem.addActionListener(e -> new ClienteForm().setVisible(true));

        JMenuItem fornecedorItem = new JMenuItem("Fornecedor");
        fornecedorItem.setMnemonic(KeyEvent.VK_F); // Atalho de teclado Alt+F
        fornecedorItem.setIcon(new ImageIcon("icons/fornecedor.png"));
        fornecedorItem.addActionListener(e -> new FornecedorForm().setVisible(true));

        JMenuItem formaPessoaItem = new JMenuItem("Pessoa");
        formaPessoaItem.setMnemonic(KeyEvent.VK_P); // Atalho de teclado Alt+P
        formaPessoaItem.setIcon(new ImageIcon("icons/forma_pagto.png"));
        formaPessoaItem.addActionListener(e -> new PessoaForm().setVisible(true));

        JMenuItem usuarioItem = new JMenuItem("Usuário");
        usuarioItem.setMnemonic(KeyEvent.VK_U); // Atalho de teclado Alt+U
        usuarioItem.setIcon(new ImageIcon("icons/usuario.png"));
        usuarioItem.addActionListener(e -> new UsuarioForm().setVisible(true));

        JMenuItem produtoItem = new JMenuItem("Produto");
        produtoItem.setMnemonic(KeyEvent.VK_R); // Atalho de teclado Alt+R
        produtoItem.setIcon(new ImageIcon("icons/produto.png"));
        produtoItem.addActionListener(e -> new ProdutoForm().setVisible(true));

        cadastrosMenu.add(clienteItem);
        cadastrosMenu.add(fornecedorItem);
        cadastrosMenu.add(formaPessoaItem);
        cadastrosMenu.add(usuarioItem);
        cadastrosMenu.add(produtoItem);

        // Menu Movimentos
        JMenu movimentosMenu = new JMenu("Movimentos");
        movimentosMenu.setMnemonic(KeyEvent.VK_M); // Atalho de teclado Alt+M

        JMenuItem vendaItem = new JMenuItem("Venda");
        vendaItem.setMnemonic(KeyEvent.VK_V); // Atalho de teclado Alt+V
        vendaItem.setIcon(new ImageIcon("icons/venda.png"));
        vendaItem.addActionListener(e -> new VendaForm().setVisible(true));

        JMenuItem compraItem = new JMenuItem("Compra");
        compraItem.setMnemonic(KeyEvent.VK_O); // Atalho de teclado Alt+O
        compraItem.setIcon(new ImageIcon("icons/compra.png"));
        compraItem.addActionListener(e -> new CompraForm().setVisible(true));

        movimentosMenu.add(vendaItem);
        movimentosMenu.add(compraItem);

        // Menu Sair
        JMenu sairMenu = new JMenu("Sair");
        sairMenu.setMnemonic(KeyEvent.VK_S); // Atalho de teclado Alt+S

        JMenuItem sairItem = new JMenuItem("Sair");
        sairItem.setMnemonic(KeyEvent.VK_Q); // Atalho de teclado Alt+Q
        sairItem.setIcon(new ImageIcon("icons/sair.png"));
        sairItem.addActionListener(e -> System.exit(0));

        sairMenu.add(sairItem);

        // Adicionar menus à barra de menu
        menuBar.add(cadastrosMenu);
        menuBar.add(movimentosMenu);
        menuBar.add(sairMenu);

        // Configurar a barra de menu no JFrame
        setJMenuBar(menuBar);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainMenu().setVisible(true));
    }
}
