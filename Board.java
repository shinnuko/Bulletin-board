import java.util.Scanner;
public class Board {
  public static void main(String[] args) {
	  String password = new String("Hello");

	  System.out.print("パスワードを入力してください＞:");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();

      //パスワード認証判定
      if(password.equals(input)) {
          System.out.println("認証しました！参加ありがとうございます！");
          System.out.println("------------------");

      //掲示板利用モード選択
          System.out.println("投稿を行う場合は合言葉を入力して下さい。＞：");
          System.out.println("------------------");


      } else if(input.length() > 5) {
          System.out.println("ヒント：パスワードはメールに記載された5文字です。");
      } else if(input.length() < 6) {
          System.out.println("ヒント：パスワードはメールに記載された5文字です。");


      }
      String secretword = new String("member");
      String modeselect =scanner.nextLine();
      if(secretword.equals(modeselect)) {
          System.out.println("合言葉を確認しました。投稿モードに移行します。");
          System.out.println("アカウント情報を反映します。募集内容を記入してください。");
          System.out.println("------------------");


      } else if(input.length() > 6) {
          System.out.println("合言葉が異なります。閲覧モードになります。");
      } else if(input.length() < 7) {
          System.out.println("合言葉が違います。閲覧モードになります。");



      }
      Account account = new Account("しんぬこ","男性","Gt_Vo",31);
      System.out.println("【アカウント情報】");
      account.printData();

      System.out.println("メンバー加入希望ですか？募集希望ですか？。＞：");
      System.out.println("------------------");
      String recruitment_format = scanner.nextLine();
      
      System.out.println("希望の地域はどこですか？。＞：");
      System.out.println("------------------");
      String recruitment_place = scanner.nextLine();
      
      System.out.println("最後に何か一言！！。＞：");
      System.out.println("------------------");
      String comment = scanner.nextLine();
      
      System.out.println("お疲れ様でした！当掲示板の主催イベントは2/12です。メンバーを見つけて是非ご参加ください。＞：");  
  }


}

