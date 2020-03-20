import java.util.Scanner;
public class Board {
  public static void main(String[] args) {
	  String password = new String("Hello");

	  System.out.print("パスワードを入力してください＞");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
     
      //パスワード認証判定
      if(password.equals(input)) {
          System.out.println("認証しました！参加ありがとうございます！");
          System.out.println("------------------");
      //掲示板利用モード選択
          System.out.println("投稿を行う場合は合言葉を入力して下さい。＞：");
          System.out.println("------------------");
      String modeselect =scanner.nextLine();
      



      } else if(input.length() > 5) { // input の長さは？それは10より大きい？
          System.out.println("ヒント：パスワードはメールに記載された5文字です。");
      } else if(input.length() < 6) { // input の長さは？それは10より大きい？
          System.out.println("ヒント：パスワードはメールに記載された5文字です。");


    }
  }
    
      
}

 