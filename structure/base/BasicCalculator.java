package structure.base;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author vetstein
 * @creat 2021-03-2021/3/10-8:40
 */
//224. Basic Calculator
    //实现一个基本的计算器来计算一个简单的字符串表达式 s 的值。
public class BasicCalculator {
        public static int calculate1(String s) {
            //每遇到一个'('压入一个当前sign
            Deque<Integer> ops = new LinkedList<>();
            //标记当前sign: 1为正，-1为负
            ops.push(1);

            int sign = 1;
            int ret = 0;
            //字符串指针
            int i = 0;
            int n = s.length();

            while (i < n){
                if (s.charAt(i) == '+'){//sign变为当前栈顶元素，即为括号前元素
                    sign = ops.peek();
                    i++;
                }
                else if (s.charAt(i) == ' '){//空格直接跳过
                    i++;
                }else if ( s.charAt(i) == '-'){//进行变号
                    sign = - ops.peek();
                    i++;
                } else if (s.charAt(i) == '('){//压栈，记录状态
                    ops.push(sign);
                    i++;
                }else if (s.charAt(i) == ')'){//出栈，解除状态
                    ops.pop();
                    i++;
                }
                else{
                    int num = 0;
                    while(i < n && Character.isDigit(s.charAt(i))){
                        num = num *10 +s.charAt(i)-'0';
                        i++;
                    }
                    ret+=sign*num;
                }
            }
            return ret;
        }


        //1047. 删除字符串中的所有相邻重复项
    //充分理解题意后，我们可以发现，当字符串中同时有多组相邻重复项时，我们无论是先删除哪一个，都不会影响最终的结果。因此我们可以从左向右顺次处理该字符串。
    //
    //而消除一对相邻重复项可能会导致新的相邻重复项出现，如从字符串 \text{abba}abba 中删除 \text{bb}bb 会导致出现新的相邻重复项 \text{aa}aa 出现。
    // 因此我们需要保存当前还未被删除的字符。一种显而易见的数据结构呼之欲出：栈。
    // 我们只需要遍历该字符串，如果当前字符和栈顶字符相同，我们就贪心地将其消去，否则就将其入栈即可。
    //

    public static String removeDuplicates(String S) {

            StringBuffer stack = new StringBuffer();
            int TOP = -1;
            for (int i = 1; i < S.length();i++){
                char ch = S.charAt(i);
                if (TOP >= 0 && stack.charAt(TOP) == ch){
                    stack.deleteCharAt(TOP);
                    TOP--;
                }else{
                    stack.append(ch);
                    TOP++;
                }
            }
            return stack.toString();
    }

    //227. 基本计算器 II
    //给你一个字符串表达式 s ，请你实现一个基本计算器来计算并返回它的值。
    //
    //整数除法仅保留整数部分。
    public static  int calculate(String s){
            //使用栈来存转换后的表达式
            Deque<Integer> stack = new LinkedList<>();
            //默认第一个运算符号是'+'
            int preSign = '+';
            //记录结果
            int num = 0;
            int ret = 0;
            //遍历表达式
            for (int i = 0; i < s.length(); ++i){
                char ch = s.charAt(i);
                if (Character.isDigit(ch)){
                    num = 10 * num + ch - '0';//数字转换
                }
                if (!Character.isDigit(ch) && (ch != ' ') ||  (i == s.length()-1)){
                    switch (preSign){
                        case '+'://数字前是加号，压入栈中
                            stack.push(num);
                            break;
                        case '-'://数字前是加号，相反数压入栈中
                            stack.push(-num);
                            break;
                        case '*'://数字前是'*’号，取出栈顶元素与数字相乘，再压入栈中
                            num = stack.pop() * num;
                            stack.push(num);
                            break;
                        case '/'://数字前是'/’号，取出栈顶元素与数字相除，再压入栈中
                            num = stack.pop() / num;
                            stack.push(num);
                            break;
                    }
                    num = 0;
                    preSign = ch;
                }
            }
            //计算表达式的值
            while (!stack.isEmpty()){
                ret+=stack.pop();
            }
            return ret;
    }
    }




