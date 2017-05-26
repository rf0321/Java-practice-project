package refactor;
import java.io.*;



public class Main {

    public static void main(String...args){
        System.out.println("コマンドExitでアプリケーションを終了します。>");
        String EXIT_COMMAND = "Exit";
        String str = "";
        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(System.in, "UTF-8"))) {
            while (!(str = reader.readLine()).equals(EXIT_COMMAND)) {
                System.out.println("入力されたコマンド["+str+"]は正しくありません。");
            }
        } catch(IOException e) {
            System.out.println("Error:"+e);
        }
        System.out.println("アプリケーションは正しい方法で終了しました。");
    }
}




