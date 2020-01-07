package empresasconsultoria.gcsapps.com.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends Activity {
    private ListView lista_signos;
    private String[] signos = {"Áries","Touro","Gêmeos","Câncer","Leão","Virgem",
                                "Libra","Escorpião","Sagitário","Capricórnio","Aquário","Peixes"};
    private String[] textoSigno= {"Com muita alegria poderá fazer coisas que deseja com uma maestria" +
            " muito maior neste momento, tente ter o brio necessário. O Sol irá iluminar muito o caminho " +
            "que deseja neste momento","Muitas coisas fora do seu controle irão ocorrer para que venha a fazer " +
            "algo bom. O planeta Júpiter irá obstruir muito o caminho para você neste momento.","Precisa manter as coisas no campo da simplicidade para poder " +
            "tirar proveito melhor de cada situação.","Muitos sentimentos invadirão o seu coração com algumas coisas novas" +
            " para você agora. ","Impor-se contra qualquer tipo de coisa que for proferida contra " +
            "você demonstrará o quanto é forte.","As atividades que ocorrem do satélite natural da terra em relação " +
            "ao planeta Urano tende a modificar este seu dia.","As coisas que ocorrem no planeta Saturno serão muito importantes para " +
            "você e, criarão uma grande liberdade para você atingir um novo nível de democracia.","Mudar é algo constante dentro de você, mas precisará ficar " +
            "firme nos seus principais ideais. ","Vivenciará momentos de discordância com os membros da forte " +
            "constelação de Gêmeos.","Competir será uma grande iniciativa que você poderá ter para " +
            "que o seu signo ganhe ainda mais forças nesses momentos. ","Sua habilidade para controlar as condições que incomodam muito" +
            " o que irá acontecer no seu dia.",
            "Terá bastante amor no decorrer deste seu dia, irá cativar muita gente agora."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista_signos = findViewById(R.id.lista_id);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                getApplicationContext(),// contexto da array
                android.R.layout.simple_list_item_1, // layotu padrao
                android.R.id.text1, //text1 paga o lista item 1
                signos //nome da lista

        );
        lista_signos.setAdapter(arrayAdapter); // assim podemos ver a nossa lista de itens

        lista_signos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int posicao_atual = position;
                Toast.makeText(getApplicationContext(),textoSigno[posicao_atual],Toast.LENGTH_LONG).show();
            }
        });
    }
}
