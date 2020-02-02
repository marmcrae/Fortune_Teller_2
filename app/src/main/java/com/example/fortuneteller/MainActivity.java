package com.example.fortuneteller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView fortuneTextView;
    private Button loveButton;
    private Button generalButton;
    private Button moneyButton;
    private ImageView fortuneBorder;


    public String[] loveArray;
    public String[] generalArray;
    public String[] moneyArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fortuneTextView = (TextView) findViewById(R.id.fortuneTextView);
        loveButton = (Button) findViewById(R.id.loveButtonID);
        generalButton = (Button) findViewById(R.id.generalButton);
        moneyButton = (Button) findViewById(R.id.moneyButtonID);
        fortuneBorder = (ImageView) findViewById(R.id.fortuneBorderID);


        loveArray = new String[]{
                "You have or will soon find the ONE!",
                "Give love inwards as well as outwards",
                "Heartbreak is coming........",
                "Your outlook for love is bright!",
                "You have a secret admirer!",
                "Let them put in the effort.....",
                "You will meet a new love interest soon!",
                "Someone is being deceitful",
                "Lots of love and light surrounds you!",
                "Outlook not good.....",
                "Many love blessings are coming your way!",
                "An admirer or loved one will surprise you with an unexpected gift!",
                "Tell that special someone how you feel!"
        };

        generalArray = new String[]{
                "You have an unexpected surprise coming your way!",
                "A Baby is coming",
                "Karmic lesson is to come. Learn and transcend from the experience",
                "Your spirit guides want you to listen more closely!",
                "You have a bright future ahead!",
                "Now is the time for cleansing and renewal",
                "A blessing is coming your way!",
                "Someone is being deceitful",
                "Lots of love and light surrounds you!",
                "Outlook not good.....",
                "Many love blessings are coming your way!",
                "Nobody ever got anywhere by Standing Still. Now is the time",
                "Get lost in the right direction",
                "Follow your heart",
                "There are no rules.",
                "Self Acceptance > Self Improvement",

        };

        moneyArray = new String[]{
                "You have unexpected abundance coming your way!",
                "Positive outlook for a business decision you've been pondering",
                "Clear your energy and money will be drawn to you",
                "New avenues of income are on their way!",
                "The most fulfilling abundance in life does not come from money",
                "Now is the time for cleansing and renewal then money will come",
                "A breakthrough is on the horizon. Keep your faith.",
                "Be careful of not over spending at this time.",
                "You will live a very comfortable life."


        };

        loveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                        int num = random.nextInt(loveArray.length);
                        fortuneTextView.setText(loveArray[num]);
                        fortuneBorder.setVisibility(View.VISIBLE);



            }
        });

        generalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int num = random.nextInt(generalArray.length);
                fortuneTextView.setText(generalArray[num]);
                fortuneBorder.setVisibility(View.VISIBLE);



            }
        });

        moneyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int num = random.nextInt(moneyArray.length);
                fortuneTextView.setText(moneyArray[num]);
                fortuneBorder.setVisibility(View.VISIBLE);



            }
        });
    }


}
