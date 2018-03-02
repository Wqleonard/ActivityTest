package com.wangqian.activitytest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
                break;
                default:
        }
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1=findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(FirstActivity.this,"You clicked Button 1",
//                Toast.LENGTH_SHORT).show();
//                finish();
                String data="Hello SecondActivity";
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
//                intent.putExtra("extra_data",data);
//                Intent intent=new Intent("com.wangqian.activitytest.ACTION_START");
//                intent.addCategory("com.wangqian.activitytest.MY_CATEGORY");
//                Intent intent=new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.baidu.com"));//data 表示一种协议
//                Intent intent=new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:10086"));
//                startActivity(intent);
                startActivityForResult(intent,1);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if(resultCode==RESULT_OK){
                    String returnedData=data.getStringExtra("data_return");
                    Log.e("FirstActivity",returnedData);
                }
                break;
                default:
        }
    }
}
