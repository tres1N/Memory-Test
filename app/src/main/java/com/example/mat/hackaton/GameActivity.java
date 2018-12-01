package com.example.mat.hackaton;

import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;


public class GameActivity extends AppCompatActivity {
    private static final int VisibilityTime = 3000;
    private static final int NumberOfButtons = 16;

    private int level;
    public List<Integer> OrderGeneratedButtons;

    @BindView(R.id.button1) Button button1;
    @BindView(R.id.button2) Button button2;
    @BindView(R.id.button3) Button button3;
    @BindView(R.id.button4) Button button4;
    @BindView(R.id.button5) Button button5;
    @BindView(R.id.button6) Button button6;
    @BindView(R.id.button7) Button button7;
    @BindView(R.id.button8) Button button8;
    @BindView(R.id.button9) Button button9;
    @BindView(R.id.button10) Button button10;
    @BindView(R.id.button11) Button button11;
    @BindView(R.id.button12) Button button12;
    @BindView(R.id.button13) Button button13;
    @BindView(R.id.button14) Button button14;
    @BindView(R.id.button15) Button button15;
    @BindView(R.id.button16) Button button16;
    private Timer timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        ButterKnife.bind(this);
        OrderGeneratedButtons = new ArrayList<Integer>();
        Intent intent = getIntent();
        level = intent.getIntExtra("level", 0);
        GenerateButtonOrder(level);

    }


    public void StartGame(View v){
            int index = 1;
            for (Integer buttonNum : OrderGeneratedButtons) {
                switch (buttonNum) {
                    case 1:
                        SetBackground(button1, index);
                        break;
                    case 2:
                        SetBackground(button2, index);
                        break;
                    case 3:
                        SetBackground(button3, index);
                        break;
                    case 4:
                        SetBackground(button4, index);
                        break;
                    case 5:
                        SetBackground(button5, index);
                        break;
                    case 6:
                        SetBackground(button6, index);
                        break;
                    case 7:
                        SetBackground(button7, index);
                        break;
                    case 8:
                        SetBackground(button8, index);
                        break;
                    case 9:
                        SetBackground(button9, index);
                        break;
                    case 10:
                        SetBackground(button10, index);
                        break;
                    case 11:
                        SetBackground(button11, index);
                        break;
                    case 12:
                        SetBackground(button12, index);
                        break;
                    case 13:
                        SetBackground(button13, index);
                        break;
                    case 14:
                        SetBackground(button14, index);
                        break;
                    case 15:
                        SetBackground(button15, index);
                        break;
                    case 16:
                        SetBackground(button16, index);
                        break;
                }
                index++;
            }
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                SetBlack();
            }
        },VisibilityTime);
    }

    public void SetBlack(){
        for (Integer buttonNum : OrderGeneratedButtons) {
            switch (buttonNum) {
                case 1:
                    button1.setBackgroundResource(R.drawable.blackbutton);
                    break;
                case 2:
                    button2.setBackgroundResource(R.drawable.blackbutton);
                    break;
                case 3:
                    button3.setBackgroundResource(R.drawable.blackbutton);
                    break;
                case 4:
                    button4.setBackgroundResource(R.drawable.blackbutton);
                    break;
                case 5:
                    button5.setBackgroundResource(R.drawable.blackbutton);
                    break;
                case 6:
                    button6.setBackgroundResource(R.drawable.blackbutton);
                    break;
                case 7:
                    button7.setBackgroundResource(R.drawable.blackbutton);
                    break;
                case 8:
                    button8.setBackgroundResource(R.drawable.blackbutton);
                    break;
                case 9:
                    button9.setBackgroundResource(R.drawable.blackbutton);
                    break;
                case 10:
                    button10.setBackgroundResource(R.drawable.blackbutton);
                    break;
                case 11:
                    button11.setBackgroundResource(R.drawable.blackbutton);
                    break;
                case 12:
                    button12.setBackgroundResource(R.drawable.blackbutton);
                    break;
                case 13:
                    button13.setBackgroundResource(R.drawable.blackbutton);
                    break;
                case 14:
                    button14.setBackgroundResource(R.drawable.blackbutton);
                    break;
                case 15:
                    button15.setBackgroundResource(R.drawable.blackbutton);
                    break;
                case 16:
                    button16.setBackgroundResource(R.drawable.blackbutton);
                    break;
            }
        }
    }



    private void SetBackground(Button button, int index){
        switch (index){
            case 1:
                button1 = findViewById(R.id.button1);
                button.setBackgroundResource(R.drawable.button1);
                break;
            case 2:
                button2 = findViewById(R.id.button2);
                button.setBackgroundResource(R.drawable.button2);
                break;
            case 3:
                button3 = findViewById(R.id.button3);
                button.setBackgroundResource(R.drawable.button3);
                break;
            case 4:
                button4 = findViewById(R.id.button4);
                button.setBackgroundResource(R.drawable.button4);
                break;
            case 5:
                button5 = findViewById(R.id.button5);
                button.setBackgroundResource(R.drawable.button5);
                break;
            case 6:
                button6 = findViewById(R.id.button6);
                button.setBackgroundResource(R.drawable.button6);
                break;
            case 7:
                button7 = findViewById(R.id.button7);
                button.setBackgroundResource(R.drawable.button7);
                break;
            case 8:
                button8 = findViewById(R.id.button8);
                button.setBackgroundResource(R.drawable.button8);
                break;
            case 9:
                button9 = findViewById(R.id.button9);
                button.setBackgroundResource(R.drawable.button9);
                break;
            case 10:
                button10 = findViewById(R.id.button10);
                button.setBackgroundResource(R.drawable.button10);
                break;
            case 11:
                button11 = findViewById(R.id.button11);
                button.setBackgroundResource(R.drawable.button11);
                break;
            case 12:
                button12 = findViewById(R.id.button12);
                button.setBackgroundResource(R.drawable.button12);
                break;
            case 13:
                button13 = findViewById(R.id.button13);
                button.setBackgroundResource(R.drawable.button13);
                break;
            case 14:
                button14 = findViewById(R.id.button14);
                button.setBackgroundResource(R.drawable.button14);
                break;
            case 15:
                button15 = findViewById(R.id.button15);
                button.setBackgroundResource(R.drawable.button15);
                break;
            case 16:
                button16 = findViewById(R.id.button16);
                button.setBackgroundResource(R.drawable.button16);
                break;
        }
    }

    private void GenerateButtonOrder(int level){
        Random rand = new Random();
        for(int i=0; i < level+1; i++){
            boolean wrong = false;
            int n = rand.nextInt(NumberOfButtons) + 1;
            if(OrderGeneratedButtons.isEmpty()){
                OrderGeneratedButtons.add(n);
            }else{
                for(Integer buttonNumber : OrderGeneratedButtons){
                    if(buttonNumber == n){
                        wrong = true;
                    }
                }
                if(!wrong){
                    OrderGeneratedButtons.add(n);
                }
            }
        }
    }


}
