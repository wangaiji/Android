package com.example.lenovo.calculator;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static java.math.BigDecimal.ROUND_HALF_UP;


public class Arithmetic {
   private static final Map<Character,Integer> operator=new HashMap<>();

    static{
        operator.put('+', 1);
        operator.put('-', 1);
        operator.put('×', 2);
        operator.put('÷', 2);
        operator.put('(', 0);
    }
   //将中缀表达式转换成后缀表达式
    public String toSuffix(StringBuilder pending){
        List<Character> stack=new ArrayList<>();
        List<String> queue=new ArrayList<>();
        StringBuilder a=pending;//String是不可变类
        String standard="+-×÷()";

        char ch;
        int len=0;//数字的长度
        for(int i=0;i<a.length();i++){
            int last=0;
            if(i>0){
                last=a.charAt(i-1);//此元素的前一个元素
            }
            ch=a.charAt(i);
            if(Character.isDigit(ch)){
                len++;
            }else if(ch=='.'){
                len++;
            }else if(ch=='-'&&(last=='×'||last=='÷'||last=='('||i==0)) {
                len++;
                continue;
            }else if(ch=='('&&last=='-'){
                a.insert(i,"1×");
                i--;
                continue;
            }else if(standard.indexOf(ch)!=-1){//是运算符其中的一个
                if(len>0) {
                    queue.add(a.substring(i-len,i));//左闭右开
                    len = 0;
                }
                if(ch=='('){
                   stack.add(ch);
                }
                if(stack.isEmpty()&&ch!='('){  //栈为空
                   stack.add(ch);
                   continue;
                }
                if(!stack.isEmpty()){  //栈不为空
                    int size=stack.size()-1;//栈顶元素下标
                    boolean flag=false;
                    while(size>=0&&ch==')'&&stack.get(size)!='('){
                        queue.add(String.valueOf(stack.remove(size)));//删除的元素
                        size--;

                    }
                   if(ch==')'&&stack.get(size)=='('){
                       flag=true;
                       }
                    while (size >= 0  &&!flag&&ch!='('&& operator.get(stack.get(size)) >= operator.get(ch)) {
                        queue.add(String.valueOf(stack.remove(size)));
                        size--;
                    }


                if(ch!= ')'&&ch!='(') {
                    stack.add(ch);
                } else if(ch==')'){
                    stack.remove(stack.size()-1);

                }
              }
            }

            if(i==a.length()-1){
                if(len>0){
                    queue.add(a.substring(i-len+1,i+1));//左闭右开
                }
                int size=stack.size()-1;
                while(size>=0){
                    queue.add(String.valueOf(stack.remove(size)));
                    size--;
                }
            }

        }
        String s=queue.toString();
        return s.substring(1,s.length()-1);//把中括号去掉
    }


    public String result(String x){
        String[] arr=x.split(", ");
        List<String> list =new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int size=list.size();
            switch (arr[i]){
                case "+":BigDecimal a=new BigDecimal(list.remove(size-2)).add(new BigDecimal(list.remove(size-2)));list.add(String.valueOf(a));break;
                case "-":BigDecimal b=new BigDecimal(list.remove(size-2)).subtract(new BigDecimal(list.remove(size-2)));list.add(String.valueOf(b));break;
                case "×":BigDecimal c=new BigDecimal(list.remove(size-2)).multiply(new BigDecimal(list.remove(size-2)));list.add(String.valueOf(c));break;
                case "÷": BigDecimal d = new BigDecimal(list.remove(size - 2)).divide(new BigDecimal(list.remove(size - 2)),8,ROUND_HALF_UP);
                    DecimalFormat df = new DecimalFormat("#.#########");
                    list.add( String.valueOf((df.format(d))));break;//将结果格式化

                default:list.add(arr[i]);break;
            }
        }
        if(list.size()==1){
            if(list.get(0).length()<11){
                BigDecimal bigDecimal = new BigDecimal(list.get(0));
                return bigDecimal.toPlainString();
            }else{
                double d=Double.valueOf(list.get(0));
                return String.valueOf(d);//科学计数法
            }
        }else{
            return "运算失败";
        }
   }
    public static void main(String[] args){
       Arithmetic arithmetic=new Arithmetic();
       StringBuilder pending=new StringBuilder("8+(-(-1×2+4))×10");
       String result=arithmetic.toSuffix(pending);
       System.out.println(result);
       String sum=arithmetic.result(result);
       System.out.println(sum);
    }
}

