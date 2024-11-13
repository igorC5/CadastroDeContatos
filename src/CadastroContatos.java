import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroContatos {
    private JPanel CadastroCtt;
    private JTextField inputNome;
    private JTextField inputTelefone;
    private JTextField inputEmail;
    private JButton btnAdd;
    private JButton btnDel;
    private JList listaCtt;
    private DefaultListModel<String> listaModel;

    public static void main(String[] args){

        JFrame tela = new JFrame("eita");
        tela.setContentPane(new CadastroContatos().CadastroCtt);
        tela.pack();
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.setVisible(true);

    }

    public void adicionarCtt(){

        if (!inputNome.getText().isEmpty() && !inputEmail.getText().isEmpty() && !inputTelefone.getText().isEmpty()){
            listaModel.addElement(
                    "Nome: " + inputNome.getText()  +
                    ", Telefone: " + inputTelefone.getText() +
                    ", Email: " + inputEmail.getText()
            );
        }
    }

    public void removerCtt(){
        listaModel.removeElement(listaCtt.getSelectedValue());
    }

    public CadastroContatos(){
        listaModel = new DefaultListModel<>();
        listaCtt.setModel(listaModel);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarCtt();
            }
        });

        btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerCtt();
            }
        });

    }

}
