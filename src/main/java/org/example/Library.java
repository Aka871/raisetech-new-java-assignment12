//このクラスは、org.exampleパッケージに属す
package org.example;

//java.utilパッケージのArrayListクラスを取り込め

import java.util.ArrayList;
import java.util.List;

//パブリック設定でLibraryという名前のクラスを作成せよ
public class Library {

  //プライベート設定で要素がBook型のList型で作成したbooksという名前の変数を宣言せよ
  //booksリストは図書館の全ての本を保持するために使用される
  private List<Book> books;

  //パブリック設定で、引数を受け取らないLibraryという名前のメソッド(コンストラクタ)を作成せよ
  //Libraryクラスのインスタンスを作成するときに呼び出される
  public Library() {

    //ArrayListクラスのインスタンスを新規作成し、このメンバー変数(インスタンス変数)booksに代入せよ
    //booksリストを初期化
    this.books = new ArrayList<>();
  }

  //パブリック設定で戻り値のない、Bookクラスの引数bookを受け取るaddBookという名前のメソッドを作成せよ
  //図書館に本を追加するためのメソッド
  public void addBook(Book book) {

    //メンバー変数(インスタンス変数)booksのaddメソッドを呼び出し、引数bookを追加せよ
    //booksリストに新しい本を追加
    books.add(book);
  }
}
