package qualhato.dev.mvp.presenter;

import qualhato.dev.mvp.model.Pessoa;

public class MainActivityPresenter {

    private Pessoa oPessoa;
    private View view;

    public MainActivityPresenter(View view) {
        this.oPessoa = new Pessoa();
        this.view = view;
    }

    public void atualizarNome(String fullName) {
        oPessoa.setNome(fullName);
        view.updateUserInfoTextView(oPessoa.toString());

    }

    public void atualizarEmail(String email) {
        oPessoa.setEmail(email);
        view.updateUserInfoTextView(oPessoa.toString());

    }


    public void atualizarIdade(int idade) {
        oPessoa.setidade(idade);
        view.updateUserInfoTextView(oPessoa.toString());

    }

    public interface View {

        void updateUserInfoTextView(String info);

        void showProgressBar();

        void hideProgressBar();

    }
}