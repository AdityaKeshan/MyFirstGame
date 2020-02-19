package com.example.myfirstgame;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static int active=0;
    TextView result;
    Button restart;
    LinearLayout lay;
    int b[][]={{2,2,2},{2,2,2},{2,2,2}};
    public void foder(View view)
    {
        int win=2;
        ImageView t=(ImageView)view;
        String l=t.getTag().toString();
        int n=(int)l.charAt(0)-48;
        int m=(int)l.charAt(1)-48;
        t.setTranslationY(-1000f);
        if((b[n][m]==2)&&(full(b)==1))
        {
            if (active ==0)
            {
                t.setImageResource(R.drawable.cross);
                t.animate().translationYBy(+1000f).rotation(360f).setDuration(1000);
                active=1;
                b[n][m]=0;
            }
            else
            {
                t.setImageResource(R.drawable.tick);
                t.animate().translationYBy(+1000f).rotation(360f).setDuration(1000);
                active=0;
                b[n][m]=1;
            }
            if(checker(b,0)==0)
            {
                result.setText("Cross wins");
                lay.setVisibility(View.VISIBLE);
            }
            else if(checker(b,1)==0)
            {
                result.setText("Cross wins");
                lay.setVisibility(View.VISIBLE);
            }
            else
            {
                if(full(b)==0)
                {
                    result.setText("Draw");
                    lay.setVisibility(View.VISIBLE);
                }
            }
        }
    }
    int full(int c[][])
    {
        int o=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(c[i][j]==2)
                {
                    o=1;
                    return o;
                }
            }
        }
        return 0;
    }
    int checker(int c[][],int d) {
        int o=0;
        for (int i = 0; i < 3; i++) {
                if (c[i][i] == d){
                    o++;
                }
        }
            if (o == 3) {
                return 1;
            }
            o=0;
        for (int i = 0; i < 3; i++) {
            if (c[i][2-i] == d){
                o++;
            }
        }
        if (o == 3) {
            return 1;
        }
        for (int i = 0; i < 3; i++) {
            o=0;
            for (int j = 0; j < 3; j++) {
                if ((c[i][j] == d)) {
                    o++;
                }
            }
            if (o == 3) {
                return 1;
            }
        }
        for (int i = 0; i < 3; i++) {
            o = 0;
            for (int j = 0; j < 3; j++) {
                if ((c[j][i] == d)) {
                    o++;
                }
            }
            if (o == 3) {
                return 1;
            }
        }
        return 0;
    }
    public void again(View view)
    {
        active=0;
        GridLayout griddy=(GridLayout)findViewById(R.id.griddy);
        for(int i=0;i<griddy.getChildCount();i++)
        {
            ((ImageView)griddy.getChildAt(i)).setImageResource(0);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); int active=0;
        result=(TextView)findViewById(R.id.result);
        restart=(Button)findViewById(R.id.restart);
        lay=(LinearLayout)findViewById(R.id.lay);
        lay.setVisibility(View.INVISIBLE);

    }
}
