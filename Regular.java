package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Regular {

        public static void main(String[] args) {
            /*
1 Должна быть заглавная буква
2 Должна быть хотябы 1 цифра
3 Минимум 8 символов
4 Латиница
5 Спец. символ
             */
//            (?=.*[A-Z]) письмо с Заглавной буквой
//            (?=.*[0-9]) цифра должна появляться по крайней мере один раз
//            (?=.*[a-z]) строчная буква должна появляться как минимум раз
//            (?=.*[@#$%^&+=]) специальный символ должен появляться по крайней мере один раз
//            .{8,} не менее 8 символов
//
            InputHelper inputHelper = new InputHelper();
            String passwd = inputHelper.inputHelp("Введите строку /хотя бы 1 цифра, 1 заглавная, латиница +\n 1 спец символ, минимум 8 символов");
            String pattern = "(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=]).{8,}";
            System.out.println(passwd.matches(pattern));
        }

}
class InputHelper
{
    public String inputHelp(String prompt)
    {
        System.out.println(prompt);
        String line = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            line = bufferedReader.readLine();
        }catch (IOException e)
        {
            System.out.println("IOException ");
            e.printStackTrace();
        }
        return line;
    }
}