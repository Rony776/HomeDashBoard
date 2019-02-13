package techdoctorbd.com.homedashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    CardView cardTop,CardRight1,CardRight2,cardLeft,cardLeft2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardTop = findViewById(R.id.cardTop);
        CardRight1 = findViewById(R.id.card_Right);
        CardRight2 = findViewById(R.id.cardRight2);
        cardLeft = findViewById(R.id.cardLeft);
        cardLeft2 = findViewById(R.id.cardLeft2) ;
        // ini Animations

        Animation animeBottomToTop = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anime_bottom_to_top);
        Animation animeTopToBottom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anime_top_to_bottom);
        Animation animeRightToleft = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anime_right_to_left);
        Animation animeLeftToRight = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anime_left_to_right);


        // setup Animation :
        cardLeft2.setAnimation(animeBottomToTop);
        cardTop.setAnimation(animeTopToBottom);
        CardRight1.setAnimation(animeRightToleft);
        CardRight2.setAnimation(animeLeftToRight);
        cardLeft.setAnimation(animeLeftToRight);

    }
}
