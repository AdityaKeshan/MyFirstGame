package com.example.myfirstgame;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void foder(View view)
    {
        int active=0;
        int win;
        int b[][]={{2,2,2},{2,2,},{2,2,2}};
        ImageView t=(ImageView)view;
        String l=t.getTag().toString();


    }
    int checker(int c[][],int d)
    {
        int z=0;
        for(int i=0;i<3;i++)
        {
            int o=0;
            for(int j=0;j<3;j++)
            {
                if(((c[i][j]==c[j][i])||(c[i][j]==c[i][2-j]))&&(c[i][j]==d))
                {
                    o++;
                }
            }
            if(o==3)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        for(int i=0;i<3;i++) {
            int o = 0;
            for (int j = 0; j < 2; j++) {
                if ((c[i][j] == c[i][j + 1]) && (c[i][j] == d)) {
                    o++;
                }
            }
            if (o == 3) {
                return 1;
            }
        }
            for(int i=0;i<3;i++) {
                int o = 0;
                for (int j = 0; j < 2; j++) {
                    if ((c[j][i] == c[j + 1][i]) && (c[i][j] == d)) {
                        o++;
                    }
                }
                if (o == 3) {
                    return 1;
                }
            }
            return 0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); int active=0;
        int b[][]={{2,2,2},{2,2,},{2,2,2}};


    }
}
