package バンドメンバー募集掲示板;

class Account {
	private String username;
	private String sex;
	private String part;
	private int age = 31;

	Account(String username, String sex, String part, int age) {
		this.username = username;
		this.sex = sex;
		this.part = part;
		this.age = age;



	}
	public void printData() {
	    System.out.println("名前：" + this.username);
	    System.out.println("性別：" + this.sex);
	    System.out.println("担当パート：" + this.part);
	    System.out.println("年齢：" + this.age);
	  }

}