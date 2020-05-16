package com.example.itconsultoria.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.itconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {

    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_sobre, container, false);

        String descricao = "A IT Consultoria tem como missão apoiar organizações " +
                "que desejam alcançar o sucesso atráves da excelência em gestão e da busca pela qualidade.";

        Element versao = new Element();
        versao.setTitle("Versão 1.0");

        return new AboutPage(getActivity()) //no lugar do this pois estamos em fragment
                .isRTL(false)
                .setImage(R.drawable.logo)
                .setDescription(descricao)
                .addGroup("Entre em contato")
                .addEmail("atendimento@itconsultoria.com.br","Envie um e-mail")
                .addWebsite("http://www.google.com.br/", "Acesse nosso site")
                .addGroup("Redes sociais")
                .addFacebook("adolfo.bocchi", "Facebook")
                .addTwitter("adolfo_bocchi", "Twitter")
                .addInstagram("adolfo_bocchi", "Instagram")
                .addYoutube("adolfo_bocchi", "Youtube")
                .addItem(versao)
                .create();
    }
}
