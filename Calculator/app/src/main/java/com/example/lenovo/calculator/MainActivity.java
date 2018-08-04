package com.example.lenovo.calculator;

import android.icu.util.IslamicCalendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_UP;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView textView;
    private StringBuilder pending=new StringBuilder();//StringBuilder线程不安全，但是效率高
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.text_view);
        Button button1=(Button) findViewById(R.id.button1);
        Button button2=(Button) findViewById(R.id.button2);
        Button button3=(Button) findViewById(R.id.button3);
        Button button4=(Button) findViewById(R.id.button4);
        Button button5=(Button) findViewById(R.id.button5);
        Button button6=(Button) findViewById(R.id.button6);
        Button button7=(Button) findViewById(R.id.button7);
        Button button8=(Button) findViewById(R.id.button8);
        Button button9=(Button) findViewById(R.id.button9);
        Button button10=(Button) findViewById(R.id.button10);
        Button button11=(Button) findViewById(R.id.button11);
        Button button12=(Button) findViewById(R.id.button12);
        Button button13=(Button) findViewById(R.id.button13);
        Button button14=(Button) findViewById(R.id.button14);
        Button button15=(Button) findViewById(R.id.button15);
        Button button16=(Button) findViewById(R.id.button16);
        Button button17=(Button) findViewById(R.id.button17);
        Button button18=(Button) findViewById(R.id.button18);
        Button button19=(Button) findViewById(R.id.button19);
        Button button20=(Button) findViewById(R.id.button20);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);

    }
    private int flag=0;
    private int flag2=0;
    @Override
    public void onClick(View v) {
        int last=0;
        int last2=0;
        if(pending.length()!=0){
            last=pending.codePointAt(pending.length()-1);
            if(pending.length()>1){
                last2=pending.codePointAt(pending.length()-2);
            }
        }
        switch(v.getId()){
            case R.id.button1:
                if((last>='0'&&last<='9'||last==')')&&decide()!=0){
                    Toast.makeText(MainActivity.this,"括号不匹配",Toast.LENGTH_SHORT).show();
                }else if(last>='0'&&last<='9'||last==')'&&decide()==0) {
                    Arithmetic arithmetic = new Arithmetic();
                    String jieguo;
                    String a = "0";
                    try {
                        a= arithmetic.toSuffix(pending);
                        jieguo = arithmetic.result(a);
                    } catch (Exception ex) {
                        jieguo = "Error";
                    }
                    textView.setText(jieguo);
                    pending = pending.delete(0, pending.length());
                    pending = pending.append(jieguo);
                    flag2=1;
                }
                break;
            case R.id.button2:
                if(pending.length()!=0&&(last>='0'&&last<='9'||last==')')) {
                    pending = pending.append("+");
                    textView.setText(pending);
                    flag=0;
                }else if(last=='×'||last=='÷'){
                    pending=pending.replace(pending.length()-1,pending.length(),"+");
                    textView.setText(pending);
                }else if(last=='-'&&pending.length()!=1&&last2!='×'&&last2!='÷'&&last2!='('){
                    pending=pending.replace(pending.length()-1,pending.length(),"+");
                    textView.setText(pending);
                }
                break;
            case R.id.button3:
                if(last=='('||(last>='0'&&last<='9')||last==')'||pending.length()==0){
                    pending = pending.append("-");
                    textView.setText(pending);
                    flag=0;
                }
                if(last=='×'||last=='÷') {
                    pending = pending.append("(-");
                    textView.setText(pending);
                    flag=0;
                }else if(last=='+'){
                    pending=pending.replace(pending.length()-1,pending.length(),"-");
                    textView.setText(pending);
                }
                break;
            case R.id.button4:
                if(pending.length()!=0&&(last>='0'&&last<='9'||last==')')) {
                    pending = pending.append("×");
                    textView.setText(pending);
                    flag=0;
                }else if(last=='+'||last=='÷'){
                    pending=pending.replace(pending.length()-1,pending.length(),"×");
                    textView.setText(pending);
                }else if(last=='-'&&pending.length()!=1&&last2!='×'&&last2!='÷'&&last2!='('){
                    pending=pending.replace(pending.length()-1,pending.length(),"×");
                    textView.setText(pending);
                }
                break;
            case R.id.button5:
                if(pending.length()!=0&&(last>='0'&&last<='9'||last==')')) {
                    pending = pending.append("÷");
                    textView.setText(pending);
                    flag=0;
                }else if(last=='×'||last=='+'){
                    pending=pending.replace(pending.length()-1,pending.length(),"÷");
                    textView.setText(pending);
                }else if(last=='-'&&pending.length()!=1&&last2!='×'&&last2!='÷'&&last2!='('){
                    pending=pending.replace(pending.length()-1,pending.length(),"÷");
                    textView.setText(pending);
                }
                break;
            case R.id.button6:
                if(flag==1) break;
                if(flag2==1) break;
                else if(pending.length()!=0&&(last>='0'&&last<='9')) {
                    pending = pending.append(".");
                    textView.setText(pending);
                    flag=1;
                }
                break;
            case R.id.button7:
                if((flag2==1&&(last>='0'&&last<='9'))||last=='r'){
                    pending=pending.delete(0,pending.length());
                    pending = pending.append("3");
                    flag2=0;
                    flag=0;
                    textView.setText(pending);
                }
                else if(last!=')') {
                    pending = pending.append("3");
                    flag2=0;
                    textView.setText(pending);
                }
                break;
            case R.id.button8:
                if((flag2==1&&(last>='0'&&last<='9'))||last=='r'){
                    pending=pending.delete(0,pending.length());
                    pending = pending.append("6");
                    flag2=0;
                    flag=0;
                    textView.setText(pending);
                }else if(last!=')') {
                    pending = pending.append("6");
                    flag2=0;
                    textView.setText(pending);
                }
                break;
            case R.id.button9:
                if((flag2==1&&(last>='0'&&last<='9'))||last=='r'){
                    pending=pending.delete(0,pending.length());
                    pending = pending.append("9");
                    flag2=0;
                    flag=0;
                    textView.setText(pending);
                }else if(last!=')') {
                    pending = pending.append("9");
                    flag2=0;
                    textView.setText(pending);
                }
                break;
            case R.id.button10:
                if(pending.length()!=0&&((last>='0'&&last<='9')||last==')')&&decide()==1) {
                    pending = pending.append(")");
                    textView.setText(pending);
                }else if(decide()!=1){
                    Toast.makeText(MainActivity.this,"括号不匹配",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.button11:
                if((flag2==1&&(last>='0'&&last<='9'))||last=='r'){
                    pending=pending.delete(0,pending.length());
                    pending = pending.append("0");
                    flag2=0;
                    flag=0;
                    textView.setText(pending);
                }else
                if(last!=')') {
                    pending = pending.append("0");
                    flag2=0;
                    textView.setText(pending);
                }
                break;
            case R.id.button12:
                if((flag2==1&&(last>='0'&&last<='9'))||last=='r'){
                    pending=pending.delete(0,pending.length());
                    pending = pending.append("2");
                    flag2=0;
                    flag=0;
                    textView.setText(pending);
                }else if(last!=')') {
                    pending = pending.append("2");
                    flag2=0;
                    textView.setText(pending);
                }
                break;
            case R.id.button13:
                if((flag2==1&&(last>='0'&&last<='9'))||last=='r'){
                    pending=pending.delete(0,pending.length());
                    pending = pending.append("5");
                    flag2=0;
                    flag=0;
                    textView.setText(pending);
                }else if(last!=')') {
                    pending = pending.append("5");
                    flag2=0;
                    textView.setText(pending);
                }
                break;
            case R.id.button14:
                if((flag2==1&&(last>='0'&&last<='9'))||last=='r'){
                    pending=pending.delete(0,pending.length());
                    pending = pending.append("8");
                    flag2=0;
                    flag=0;
                    textView.setText(pending);
                }else if(last!=')') {
                    pending = pending.append("8");
                    flag2=0;
                    textView.setText(pending);
                }
                break;
            case R.id.button15:
                if((flag2==1&&(last>='0'&&last<='9'))||last=='r'){
                    pending=pending.delete(0,pending.length());
                    pending = pending.append("(");
                    flag2=0;
                }
                else if(last=='+'||last=='-'||last=='×'||last=='÷'||last=='('||pending.length()==0) {
                    pending = pending.append("(");
                }
                textView.setText(pending);
                break;
            case R.id.button16:
                if(pending.indexOf(".")!=-1)
                    flag=0;
                pending=pending.delete(0,pending.length());
                textView.setText(pending);
                break;
            case R.id.button17:
                if((flag2==1&&(last>='0'&&last<='9'))||last=='r'){
                    pending=pending.delete(0,pending.length());
                    pending = pending.append("1");
                    flag2=0;
                    flag=0;
                    textView.setText(pending);
                }else if(last!=')') {
                    pending = pending.append("1");
                    flag2=0;
                    textView.setText(pending);
                }
                break;
            case R.id.button18:
                if((flag2==1&&(last>='0'&&last<='9'))||last=='r'){
                    pending=pending.delete(0,pending.length());
                    pending = pending.append("4");
                    flag2=0;
                    flag=0;
                    textView.setText(pending);
                }else
                if(last!=')') {
                    pending = pending.append("4");
                    flag2=0;
                    textView.setText(pending);
                }
                break;
            case R.id.button19:
                if((flag2==1&&(last>='0'&&last<='9'))||last=='r'){
                    pending=pending.delete(0,pending.length());
                    pending = pending.append("7");
                    flag2=0;
                    flag=0;
                    textView.setText(pending);
                }else if(last!=')') {
                    pending = pending.append("7");
                    flag2=0;
                    flag=0;
                    textView.setText(pending);
                }
                break;
            case R.id.button20:
                if(last=='r'){
                    pending=pending.delete(0,pending.length());
                    textView.setText(pending);
                }else if(pending.length()!=0){
                    if(last=='.') flag=0;
                    pending=pending.delete(pending.length()-1,pending.length());
                    textView.setText(pending);
                }
                break;
        }
    }
    private int decide(){
        int a=0,b=0;
        for(int i = 0 ; i < pending.length() ;i++){
            if(pending.charAt(i)=='(' ) {
                a++;
            }
            if(pending.charAt(i)==')' ) {
                b++;
            }
        }
        if(a == b)
            return 0;
        if(a > b)
           return 1;
        return 2;     //把所有可能返回的值都要写出来
    }
}

