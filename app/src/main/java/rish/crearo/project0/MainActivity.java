package rish.crearo.project0;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.btn_project_1)
    Button btnProject1;
    @Bind(R.id.btn_project_2)
    Button btnProject2;
    @Bind(R.id.btn_project_3)
    Button btnProject3;
    @Bind(R.id.btn_project_4)
    Button btnProject4;
    @Bind(R.id.btn_project_5)
    Button btnProject5;
    @Bind(R.id.btn_project_6)
    Button btnProject6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProject1.setOnClickListener(this);
        btnProject2.setOnClickListener(this);
        btnProject3.setOnClickListener(this);
        btnProject4.setOnClickListener(this);
        btnProject5.setOnClickListener(this);
        btnProject6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_project_1:
                Snackbar.make(v, "This is my first project!", Snackbar.LENGTH_SHORT).show();
                return;
            case R.id.btn_project_2:
                Snackbar.make(v, "This is my second project!", Snackbar.LENGTH_SHORT).show();
                return;
            case R.id.btn_project_3:
                Snackbar.make(v, "This is my third project!", Snackbar.LENGTH_SHORT).show();
                return;
            case R.id.btn_project_4:
                Snackbar.make(v, "This is my fourth project!", Snackbar.LENGTH_SHORT).show();
                return;
            case R.id.btn_project_5:
                Snackbar.make(v, "This is my fifth project!", Snackbar.LENGTH_SHORT).show();
                return;
            case R.id.btn_project_6:
                Snackbar.make(v, "This is my final project!", Snackbar.LENGTH_SHORT).show();
                return;
        }
    }
}
