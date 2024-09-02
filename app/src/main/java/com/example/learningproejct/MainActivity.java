package com.example.learningproejct;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.Delayed;
import java.util.concurrent.Future;

import javax.xml.datatype.Duration;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;

    boolean isGameOver = false;

    boolean flag = true;
    int count = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

  /*      btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
  */    }


      public void check(View view) {
          Button currentBtn = (Button) view;
          if(!currentBtn.getText().toString().equals("")) {
              flag = !flag;
              count++;
              if (flag) {
                  currentBtn.setText("X");
              } else {
                  currentBtn.setText("O");
              }
              if (count > 4) {
                  validate();
              }
          }

          if(count>=9) {
              Toast.makeText(getApplicationContext(), "Winner is ", Toast.LENGTH_SHORT);
              setBlank();
          }
      }

      void validate() {
          b1 = btn1.getText().toString();
          b2 = btn2.getText().toString();
          b3 = btn3.getText().toString();
          b4 = btn4.getText().toString();
          b5 = btn5.getText().toString();
          b6 = btn6.getText().toString();
          b7 = btn7.getText().toString();
          b8 = btn8.getText().toString();
          b9 = btn9.getText().toString();

          if ((b1.equals(b2)) && (b2.equals(b3)) && !b1.equals("")) {
              isGameOver=true;
              Toast.makeText(getApplicationContext(), "Winner is "+b1, Toast.LENGTH_SHORT);
          } else if ((b1.equals(b4)) && (b4.equals(b7)) && !b1.equals("")) {
              isGameOver=true;
              Toast.makeText(getApplicationContext(), "Winner is "+b1,Toast.LENGTH_SHORT);
          } else if ((b4.equals(b5)) && (b5.equals(b6)) && !b4.equals("")) {
              isGameOver=true;
              Toast.makeText(getApplicationContext(), "Winner is "+b4, Toast.LENGTH_SHORT);
          } else if ((b7.equals(b8)) && (b8.equals(b9)) && !b7.equals("")) {
              isGameOver=true;
              Toast.makeText(getApplicationContext(), "Winner is "+b7, Toast.LENGTH_SHORT);
          } else if ((b2.equals(b5)) && (b5.equals(b8)) && !b2.equals("")) {
              isGameOver=true;
              Toast.makeText(getApplicationContext(), "Winner is "+b2, Toast.LENGTH_SHORT);
          } else if ((b3.equals(b6)) && (b6.equals(b9)) && !b1.equals("")) {
              isGameOver=true;
              Toast.makeText(getApplicationContext(), "Winner is "+b1, Toast.LENGTH_SHORT);
          } else if ((b1.equals(b5)) && (b5.equals(b9)) && !b1.equals("")) {
              isGameOver=true;
              Toast.makeText(getApplicationContext(), "Winner is "+b1, Toast.LENGTH_SHORT);
          } else if ((b3.equals(b5)) && (b5.equals(b7)) && !b3.equals("")) {
              isGameOver=true;
              Toast.makeText(getApplicationContext(), "Winner is "+b3, Toast.LENGTH_SHORT);
          }

          if(isGameOver) {
              

              setBlank();
          }
      }

      void setBlank() {

          count=0;
          btn1.setText("");
          btn2.setText("");
          btn3.setText("");
          btn4.setText("");
          btn5.setText("");
          btn6.setText("");
          btn7.setText("");
          btn8.setText("");
          btn9.setText("");
      }

}