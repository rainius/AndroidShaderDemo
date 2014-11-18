package app.jingz.com.shaderdemo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapShader;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {

    private Button mBitmapShader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBitmapShader = (Button) findViewById(R.id.btn_bitmap_shader);
        mBitmapShader.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_bitmap_shader:
                Intent intent = new Intent(this, BitmapShaderActivity.class);
                startActivity(intent);
                break;
        }
    }
}
