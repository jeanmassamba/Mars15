package cg.beto.massamba.mars15;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.txv);

        tv.setText(Html.fromHtml("<h1>Bievenu sur beto.cg</h1>"));
        String ma_method_dis_fr = "[ma méthode personnelle de la dissertation]\n" +
                "\n" +
                "INTRODUCTION\n" +
                "1-SITUATION OU PRÈSENTÀTION DU SUJET:\n" +
                "Définition ou l'importance sinon la place\n" +
                "qu'occupe le sujet.\n" +
                "2-MOT DE LIAISON + ANNONCE DU SUJET:\n" +
                "[-c'est pourquoi,\n" +
                "-convaincu de cette réalité,\n" +
                "-cependant,\n" +
                "-c'est ainsi que,\n" +
                "-c'est dans ce sens que\n" +
                "-or,\n" +
                "-fort de cette expérience,]\n" +
                "+[déclaration de l'auteur ou réformulation du\n" +
                "sujet]\n" +
                "3-ANNONCE DU PLAN:\n" +
                "-pour cela,nous étudierons tout d'abord[mettre\n" +
                "le titre de l'axe 1],puis[-||- l'axe 2] et enfin\n" +
                "[--||-- l'axe 3]. -par rapport à ce constat,\n" +
                "-soit terminer par un question.\n" +
                "-après avoir clarifié cette déclaration,\n" +
                "*Dans un premier temps/Tout d'abord nous\n" +
                "présenterons,intéreserons à... *puis/en suite\n" +
                "nous analyserons/la deuxième partie sera\n" +
                "consacré à ... *et enfin nous verrons...\n" +
                "\n" +
                "\n" +
                "\n" +
                "DÉVELOPPEMENT:\n" +
                "Comme nous l'avons expliqué/annoncé/plus\n" +
                "haut/auparavant\n" +
                "1-thèse:\n" +
                "Êxplication du sujet ou point de vu de l'auteur\n" +
                "avec exemple et citations. \n" +
                "2-antithèse(bien\n" +
                "que,pourtant,néanmoins)\n" +
                "Contraire de la thèse.\n" +
                "3-synthèse:\n" +
                "Bilan de la thèse et antithèse c'est a dire\n" +
                "apporté une vérité nuancée(différenciée).\n" +
                "\n" +
                "\n" +
                "\n" +
                "CONCLUSION:\n" +
                "En définitif,en bref,C’est ainsi que nous\n" +
                "pouvons dire que.... \n" +
                "1-bilan de la thèse et\n" +
                "antithèse\n" +
                "2-point de vu du confidat.\n\n";
    }

}
