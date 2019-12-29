package com.danyal_jsh.ratingbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private ImageView imgRate;
  private TextView tvRate;
  private RatingBar rateBar;
  private Button btnFeedBack;
  private String answerValue;

  Animation imgRateAnim,btnFeedbackAnimation;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    imgRate =(ImageView) findViewById(R.id.img_rate);

    tvRate =(TextView) findViewById(R.id.tv_rate);

    rateBar =(RatingBar) findViewById(R.id.ratebar);

    btnFeedBack =(Button) findViewById(R.id.btn_feedback);

    //load Animation
    imgRateAnim = AnimationUtils.loadAnimation(this,R.anim.img_rate_animation);
    btnFeedbackAnimation = AnimationUtils.loadAnimation(this,R.anim.btn_feedback_animation);

    //Start Animation
    imgRate.startAnimation(imgRateAnim);
    btnFeedBack.startAnimation(btnFeedbackAnimation);
    //give Condition
    rateBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
      @Override
      public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
       answerValue =String.valueOf((int) rateBar.getRating());

       switch (answerValue){
         case "1": {
           imgRate.setImageResource(R.drawable.ic_smiley_onestar);
           imgRate.startAnimation(imgRateAnim);

           tvRate.setText("Too Fucking Bad");

           btnFeedBack.startAnimation(btnFeedbackAnimation);
           break;
         }

         case "2":{
           imgRate.setImageResource(R.drawable.ic_smiley_twostar);
           imgRate.startAnimation(imgRateAnim);

           tvRate.setText("Bad As Shit");

           btnFeedBack.startAnimation(btnFeedbackAnimation);
           break;
         }

         case "3":{
           imgRate.setImageResource(R.drawable.ic_smiley_threestar);
           imgRate.startAnimation(imgRateAnim);

           tvRate.setText("Not Bad");

           btnFeedBack.startAnimation(btnFeedbackAnimation);
           break;
         }

         case "4":{
           imgRate.setImageResource(R.drawable.ic_smiley_fourstar);
           imgRate.startAnimation(imgRateAnim);

           tvRate.setText("Good");

           btnFeedBack.startAnimation(btnFeedbackAnimation);
           break;
         }

         case "5":{
           imgRate.setImageResource(R.drawable.ic_smiley_fivestar);
           imgRate.startAnimation(imgRateAnim);

           tvRate.setText("Too Fucking Good");

           btnFeedBack.startAnimation(btnFeedbackAnimation);
           break;
         }

       }

      }
    });

  }
}
