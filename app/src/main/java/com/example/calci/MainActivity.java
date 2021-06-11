package com.example.calci;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText display;
    Button clear, back, mod, div, multi, minus, add, equal, deci, zero, dzero, one, two, three, four, five, six, seven, eight, nine;
    Float result1, result2;
    Boolean modulus, division, multiplication, addition, subtraction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display= findViewById(R.id.display);
        clear= findViewById(R.id.btnclr);
        back= findViewById(R.id.btnback);
        mod= findViewById(R.id.btnmod);
        div= findViewById(R.id.btndiv);
        multi= findViewById(R.id.btnmul);
        minus= findViewById(R.id.btnmin);
        add= findViewById(R.id.btnadd);
        equal= findViewById(R.id.btneql);
        deci= findViewById(R.id.btndec);
        zero= findViewById(R.id.btnzero);
        dzero= findViewById(R.id.btndzero);
        one= findViewById(R.id.btn1);
        two= findViewById(R.id.btn2);
        three= findViewById(R.id.btn3);
        four= findViewById(R.id.btn4);
        five= findViewById(R.id.btn5);
        six= findViewById(R.id.btn6);
        seven= findViewById(R.id.btn7);
        eight= findViewById(R.id.btn8);
        nine= findViewById(R.id.btn9);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"0");
            }
        });

        dzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"00");
            }
        });

        deci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+".");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"9");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String back= null;
                if(display.getText().length()>0)
                {
                    StringBuilder stringBuilder= new StringBuilder(display.getText());
                    stringBuilder.deleteCharAt(display.getText().length()-1);
                    back= stringBuilder.toString();
                    display.setText(back);
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"+");

                if (display==null)
                {
                    display.setText(" ");
                }
                else
                {
                    result1= Float.parseFloat(display.getText()+"");
                    addition= true;
                    display.setText(null);
                }
            }
        });

         minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"-");

                if (display==null)
                {
                    display.setText(" ");
                }
                else
                {
                    result1= Float.parseFloat(display.getText()+"");
                    subtraction= true;
                    display.setText(null);
                }
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"x");

                if (display==null)
                {
                    display.setText(" ");
                }
                else
                {
                    result1= Float.parseFloat(display.getText()+"");
                    multiplication= true;
                    display.setText(null);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"/");

                if (display==null)
                {
                    display.setText(" ");
                }
                else
                {
                    result1= Float.parseFloat(display.getText()+"");
                    division= true;
                    display.setText(null);
                }
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"%");

                if (display==null)
                {
                    display.setText(" ");
                }
                else
                {
                    result1= Float.parseFloat(display.getText()+"");
                    modulus= true;
                    display.setText(null);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result2=Float.parseFloat(display.getText()+"");
                if(addition==true)
                {
                    display.setText(result1+result2+"");
                    addition=false;
                }
                if(subtraction==true)
                {
                    display.setText(result1-result2+"");
                    subtraction=false;
                }
                if(multiplication==true)
                {
                    display.setText(result1*result2+"");
                    multiplication=false;
                }
                if(division==true)
                {
                    display.setText(result1/result2+"");
                    division=false;
                }
                if(modulus==true)
                {
                    display.setText(result1%result2+"");
                    modulus=false;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("");
            }
        });
    }
}