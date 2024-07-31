//このクラスは、org.exampleパッケージに属す
package org.example;

//パブリック設定でBookという名前のクラスを作成せよ
public class Book {

  //プライベート設定で、String型のtitleという名前のメンバー変数(インスタンス変数)を作成せよ
  private String title;
  private String author;
  private int number;

  //パブリック設定で、String型のtitle、String型のauthor、int型のnumberという引数を受け取る、
  //Bookという名前のメソッド(コンストラクタ)を作成せよ
  public Book(String title, String author, int number) {

    //このメンバー変数(インスタンス変数)titleに引数titleを代入せよ
    this.title = title;
    this.author = author;
    this.number = number;
  }

  //パブリック設定で、String型の戻り値があり、引数を受け取らないgetTitleという名前のメソッドを作成せよ
  public String getTitle() {

    //メンバー変数(インスタンス変数)titleを呼び出し元に返せ
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getNumber() {
    return number;
  }
}
