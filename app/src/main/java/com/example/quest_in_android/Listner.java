package com.example.quest_in_android;

import android.view.View;

public class Listner implements View.OnClickListener {
    int answer;
    MainActivity ma;

    public Listner(MainActivity m, int answer_num) {
        answer = answer_num;
        ma = m;
    }

    @Override
    public void onClick(View v) {
        ma.answer(answer);
    }
}
