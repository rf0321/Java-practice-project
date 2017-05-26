package itinose.com.jp;
import java.io.IOException;


public class Main {

  public static void main(String...args){
        System.out.println("コマンドExitでアプリケーションを終了します。>");
    try {
        String ExitCommand = "Exit";
        java.io.BufferedReader reader =
                new java.io.BufferedReader(new java.io.InputStreamReader(System.in, "UTF-8"));
        String str = reader.readLine();
        if (str.equals(ExitCommand)) {
            System.out.println("アプリケーションは正しい方法で終了しました。");
            System.exit(1);
        }
        else if(!str.equals(ExitCommand)){
            System.out.println("入力されたコマンド["+str+"]は正しくありません。");
            Main m=new Main();
            m.main();
        }
    }
    catch(IOException e){

        System.out.println("Error:"+e);
    }
  }
}
