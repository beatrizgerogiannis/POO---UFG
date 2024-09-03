import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FichaAvaliacao extends JFrame {

    public FichaAvaliacao() {
        // Configuração da janela principal
        setTitle("Ficha de Avaliação");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configuração do menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menuArquivo = new JMenu("Arquivo");
        JMenu menuEditar = new JMenu("Editar");
        JMenuItem menuItemEnviarEmail = new JMenuItem("email");
        JMenuItem menuItemEnviarImpressora = new JMenuItem("impressora");
        JMenuItem menuItemSalvar = new JMenuItem("Salvar");
        JMenuItem menuItemSair = new JMenuItem("Sair");

        JMenu menuEnviar = new JMenu("Enviar");
        menuEnviar.add(menuItemEnviarEmail);
        menuEnviar.add(menuItemEnviarImpressora);

        menuArquivo.add(menuEnviar);
        menuArquivo.add(menuItemSalvar);
        menuArquivo.add(menuItemSair);

        menuBar.add(menuArquivo);
        menuBar.add(menuEditar);
        setJMenuBar(menuBar);

        // Configuração do painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Código
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Código:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        JTextField txtCodigo = new JTextField(15);
        panel.add(txtCodigo, gbc);

        // Nome
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Nome:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        JTextField txtNome = new JTextField(15);
        panel.add(txtNome, gbc);

        // Sexo
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Sexo:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        JPanel panelSexo = new JPanel();
        JRadioButton rbFeminino = new JRadioButton("Feminino");
        JRadioButton rbMasculino = new JRadioButton("Masculino");
        ButtonGroup groupSexo = new ButtonGroup();
        groupSexo.add(rbFeminino);
        groupSexo.add(rbMasculino);
        panelSexo.add(rbFeminino);
        panelSexo.add(rbMasculino);
        panel.add(panelSexo, gbc);

        // Curriculum Vitae
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(new JLabel("Curriculum Vitae"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        JTextArea txtCurriculum = new JTextArea(5, 30);
        JScrollPane scrollPane = new JScrollPane(txtCurriculum);
        panel.add(scrollPane, gbc);

        // Áreas
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        panel.add(new JLabel("Interesse:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        String[] interesses = {"Desenvolvedor", "Designer", "Gerente"};
        JComboBox<String> comboInteresse = new JComboBox<>(interesses);
        comboInteresse.setSelectedIndex(0);
        panel.add(comboInteresse, gbc);

        gbc.gridx = 2;
        gbc.gridy = 5;
        panel.add(new JLabel("Atuação:"), gbc);

        gbc.gridx = 3;
        gbc.gridy = 5;
        String[] atuacoes = {"Programação", "Design", "Gestão"};
        JComboBox<String> comboAtuacao = new JComboBox<>(atuacoes);
        comboAtuacao.setSelectedIndex(0);
        panel.add(comboAtuacao, gbc);

        // Botões
        JPanel panelBotoes = new JPanel();
        JButton btnSalvar = new JButton("Salvar");
        JButton btnAnterior = new JButton("Anterior");
        JButton btnProximo = new JButton("Próximo");
        JButton btnNovo = new JButton("Novo");
        JButton btnCancelar = new JButton("Cancelar");

        panelBotoes.add(btnSalvar);
        panelBotoes.add(btnAnterior);
        panelBotoes.add(btnProximo);
        panelBotoes.add(btnNovo);
        panelBotoes.add(btnCancelar);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 4;
        panel.add(panelBotoes, gbc);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FichaAvaliacao().setVisible(true);
            }
        });
    }
}
