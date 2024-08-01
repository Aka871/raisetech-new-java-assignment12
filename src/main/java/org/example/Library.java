//このクラスは、org.exampleパッケージに属す
package org.example;

//java.utilパッケージのArrayListクラスを取り込め
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    //パブリック設定で、String型の引数titleを受け取るsearchByTitleという名前のメソッドを作成し、要素がBook型のList型で返せ
    //タイトルで本を検索するメソッド
  public List<Book> searchByTitle(String title) {

      //ArrayListクラスのインスタンスを新規作成し、要素がBook型のList型で作成した変数resultに代入せよ
      //検索結果を格納するリストを初期化。空のリストresultを作成
      //変数booksの要素を先頭から順に取り出し、各要素をBook型の変数bookに入れよ
      //すべての本を順にチェック
      //変数bookのgetTitleメソッドを呼び出し、メンバー変数(インスタンス変数)titleの中身(本のタイトル)を取り出せ
      //次に、toLowerCaseメソッドを呼び出し、取り出したものを小文字に変換せよ
      //さらに、変数titleのtoLowerCaseメソッドを呼び出し、検索文字列を小文字に変換
      //(大文字を小文字に変換して比較することで、大文字小文字を区別せずに検索できる。タイトルが部分一致する本を見つける)
      //変数title(検索文字列)を小文字に変換した文字列を含んでいる場合、trueを返し、以下の処理を実行せよ
      //変数resultのaddメソッドを呼び出し、引数bookを追加せよ
      List<Book> result = books.stream()
          .filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase()))
          .collect(Collectors.toList());

      //変数result(検索結果)を返せ
      return result;
  }

    //パブリック設定で、String型の引数authorを受け取るsearchByAuthorという名前のメソッドを作成し、要素がBook型のList型で返せ
    //著者名で本を検索するメソッド
    public List<Book> searchByAuthor(String author) {

      //ArrayListクラスのインスタンスを新規作成し、要素がBook型のList型で作成した変数resultに代入せよ
      //検索結果を格納するリストを初期化。空のリストresultを作成
      //変数booksの要素を先頭から順に取り出し、各要素をBook型の変数bookに入れよ
      //すべての本を順にチェック
      //変数bookのgetAuthorメソッドを呼び出し、メンバー変数(インスタンス変数)authorの中身(著者名)を取り出せ
      //次に、toLowerCaseメソッドを呼び出し、取り出したものを小文字に変換せよ
      //さらに、変数authorのtoLowerCaseメソッドを呼び出し、検索文字列を小文字に変換
      //(大文字を小文字に変換して比較することで、大文字小文字を区別せずに検索できる。著者名が部分一致する本を見つける)
      //変数author(検索文字列)を小文字に変換した文字列を含んでいる場合、trueを返し、以下の処理を実行せよ
      //変数resultのaddメソッドを呼び出し、引数bookを追加せよ
      //見つけた本を結果リストに追加
      List<Book> result = books.stream()
          .filter(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase()))
          .collect(Collectors.toList());

      //変数result(検索結果)を返せ
      return result;
    }

    //パブリック設定で、int型の引数numberを受け取るsearchByNumberという名前のメソッドを作成し、Book型で返せ
    //番号で本を検索するメソッド
    public Book searchByNumber(int number) {

      //変数booksの要素を先頭から順に取り出し、各要素をBook型の変数bookに入れよ
      //すべての本を順にチェック
      //もし、変数bookのgetNumberメソッドを呼び出し、その戻り値が引数numberと等しい場合、以下の処理を実行せよ
      //番号が一致する本を見つける
      //変数result(検索結果)を返せ
      //(本が見つからない場合は)nullを返せ
      return books.stream().filter(book -> book.getNumber() == number).findFirst().orElse(null);
    }

    //パブリック設定で、要素がBook型のList型で返す、getAllBooksという名前のメソッドを作成せよ
    //すべての本を取得するメソッド
    public List<Book> getAllBooks() {

      //変数booksを引数に取るArrayListクラスのインスタンスを新規作成し、返せ
      //全ての本を含む新しいリストを返せ
      return new ArrayList<>(books);
    }
  }
}
