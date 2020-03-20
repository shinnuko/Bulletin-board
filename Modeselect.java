import java.util.Scanner;
public class Modeselect {
	public static void main(String[] args) {
		  String secretword = new String("member");
		  
		  System.out.print("投稿を行う場合は合言葉を入力して下さい。＞：");
	      Scanner use = new Scanner(System.in);
	      String input = use.nextLine();
	      //パスワード認証判定
	          System.out.println("投稿を行う場合は合言葉を入力して下さい。＞：");
	          System.out.println("------------------");
	      //掲示板利用モード選択
	     
	          
	          
	          
	      if(secretword.equals("member")){
	      		System.out.println("認証できました。投稿モードに移行します。");
	      	}
	      	else {
	      		System.out.println("認証できません。合言葉が間違っています。");
	      
	      	
	    }       
	  }

	}

