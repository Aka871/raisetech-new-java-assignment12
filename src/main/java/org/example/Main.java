//このクラスは、org.exampleパッケージに属す
package org.example;

//java.utilパッケージからListクラスを取り込め

import java.util.List;
import java.util.Scanner;

//パブリック設定でMainという名前のクラスを作成せよ
public class Main {

  //パブリック設定かつ静的で、戻り値がなく、String[]型の引数argsを受け取るmainという名前のメソッドを作成せよ
  public static void main(String[] args) {

    //Libraryクラスのインスタンスを新規作成し、Library型で作成した変数libraryに入れよ
    Library library = new Library();

    //標準入力(キーボードからの入力)を受け取る、Scannerクラスのインスタンスを新規作成し、Scanner型で作成した変数scannerに入れよ
    Scanner scanner = new Scanner(System.in);

    //変数libraryのaddBookメソッドを呼び出し、引数に新規作成したBookクラスのインスタンスを渡せ
    //Bookクラスのインスタンスは、String型のtitle、String型のauthor、int型のnumberという引数をもつ
    library.addBook(new Book("どんどこももんちゃん", "とよたかずひこ", 5678));
    library.addBook(new Book("どろぼうがっこう", "かこさとし", 9012));
    library.addBook(new Book("エルマーとりゅう", "ルース・スタイルス・ガネット", 153));
    library.addBook(new Book("100ぴきねことまほうつかい", "間瀬なおかた", 8078));
    library.addBook(new Book("世界動物大図鑑", "デイヴィッド・バーニー", 112));
    library.addBook(new Book("1Q84BOOK1", "村上春樹", 4481));
    library.addBook(new Book("重力ピエロ", "伊坂幸太郎", 14));
    library.addBook(new Book("頭のいい人が話す前に考えていること", "安達裕哉", 3077));
    library.addBook(new Book("苦しかったときの話をしようか", "森岡毅", 1031));
    library.addBook(new Book("スラスラ読めるJavaふりがなプログラミング", "谷本心", 905));

    //無限ループを開始せよ
    while (true) {

      //改行してから"図書管理システム"という文字列を出力し、さらに改行せよ
      System.out.println("\n図書管理システム");

      //"1: 本の一覧表示"という文字列を出力し、改行せよ
      System.out.println("1: 本の一覧表示");
      System.out.println("2: タイトルで検索");
      System.out.println("3: 著者で検索");
      System.out.println("4: 番号で検索");
      System.out.println("5: 終了");

      //"選択してください (1-5): "という文字列を出力せよ(出力後に改行はしない)
      System.out.print("選択してください (1-5): ");

      //int型の変数choiceに-1を入れよ
      //プログラムの初期状態が明確、無効な入力に対して処理を簡単にするために-1を代入
      int choice = -1;

      //このブロック内のコードが正常に実行されるかどうかを試すためにtryブロックを使用
      try {

        //変数scannerのnextIntメソッドを呼び出し、標準入力(キーボードからの入力)から文字列を読み込み、
        //Integer.parseIntメソッドを使って整数に変換、変換に成功した場合、その値を変数choiceに入れよ
        choice = Integer.parseInt(scanner.nextLine());

        //ブロック内で発生した特定の例外(NumberFormatException)を捕捉し、適切な処理を実行するためにcatchブロックを使用
        //文字列を整数に変換しようとしたときに、その文字列が有効な整数ではない場合の処理を記述
      } catch (NumberFormatException e) {

        //"無効な選択です。1から5の数字を入力してください。"というメッセージを出力せよ
        System.out.println("無効な選択です。1から5の数字を入力してください。");

        //現在の反復を終了し、次の反復に進め
        continue;
      }

      //変数choiceの値によって処理を分岐せよ
      //入力された番号に応じて、対応するメソッドを呼び出し、処理を実行
      switch (choice) {

        //変数choiceが1の場合、以下の処理を実行せよ
        case 1:

          //displayAllBooksメソッドを呼び出し、引数に変数libraryを渡せ
          displayAllBooks(library);

          //このケースの処理を終了し、switch文を抜けよ
          break;

        //変数choiceが2の場合、以下の処理を実行せよ
        case 2:

          //"検索するタイトルを入力してください: "という文字列を出力せよ(出力後に改行はしない)
          System.out.print("検索するタイトルを入力してください: ");

          //変数scannerのnextLineメソッドを呼び出し、標準入力(キーボードからの入力)から改行までの1行分を読み込み、
          //その内容を文字列として返し、String型で作成した変数titleに代入せよ
          String title = scanner.nextLine();

          //変数libraryのsearchByTitleメソッドを呼び出し、引数に変数titleを渡し、
          //その戻り値をList<Book>型で作成した変数titleResultsに代入せよ
          List<Book> titleResults = library.searchByTitle(title);

          //displayResultsメソッドを呼び出し、引数に変数titleResultsを渡せ
          displayResults(titleResults);

          //このケースの処理を終了し、switch文を抜けよ
          break;

        //変数choiceが3の場合、以下の処理を実行せよ
        case 3:

          //"検索する著者名を入力してください: "という文字列を出力せよ(出力後に改行はしない)
          System.out.print("検索する著者名を入力してください: ");

          //変数scannerのnextLineメソッドを呼び出し、標準入力(キーボードからの入力)から改行までの1行分を読み込み、
          //その内容を文字列として返し、String型で作成した変数authorに代入せよ
          String author = scanner.nextLine();

          //変数libraryのsearchByAuthorメソッドを呼び出し、引数に変数authorを渡し、
          // その戻り値をList<Book>型で作成した変数authorResultsに代入せよ
          List<Book> authorResults = library.searchByAuthor(author);

          //displayResultsメソッドを呼び出し、引数に変数authorResultsを渡せ
          displayResults(authorResults);

          //このケースの処理を終了し、switch文を抜けよ
          break;

        //変数choiceが4の場合、以下の処理を実行せよ
        case 4:

          //"検索する番号を入力してください: "という文字列を出力せよ(出力後に改行はしない)
          System.out.print("検索する番号を入力してください: ");

          //変数scannerのnextIntメソッドを呼び出し、入力された整数をint型で作成した変数numberに代入せよ
          int number = scanner.nextInt();

          //変数libraryのsearchByNumberメソッドを呼び出し、引数に変数numberを渡し、
          //その戻り値をBook型で作成した変数numberResultに代入せよ
          Book numberResult = library.searchByNumber(number);

          //もし変数numberResultがnullでない場合、以下の処理を実行せよ
          if (numberResult != null) {

            //numberResultのgetTitleメソッドを呼び出し、その戻り値の前に"・『 "を連結、後に" 』, 著者: "を連結し、
            //numberResultのgetAuthorメソッドを呼び出し、その戻り値に", 番号: "を連結し、
            //さらにnumberResultのgetNumberメソッドを呼び出し、その戻り値を連結したものを出力せよ
            System.out.println(
                "・『 " + numberResult.getTitle() + " 』, 著者: "
                    + numberResult.getAuthor() + ", 番号: "
                    + numberResult.getNumber());

            //もし変数numberResultがnullの場合、以下の処理を実行せよ
          } else {

            //"本が見つかりません"という文字列を出力せよ(出力後に改行はしない)
            System.out.println("本が見つかりません");
          }
          //このケースの処理を終了し、switch文を抜けよ
          break;

        //変数choiceが5の場合、以下の処理を実行せよ
        case 5:

          //"プログラムを終了します。"という文字列を出力せよ(出力後に改行はしない)
          System.out.println("プログラムを終了します。");

          //scannerのcloseメソッドを呼び出し、scannerを閉じよ
          scanner.close();

          //このメソッドの実行を終了し、呼び出し元に戻れ
          return;

        //変数choiceが1から5のいずれでもない場合、以下の処理を実行せよ
        default:

          //"無効な選択です。1から5の数字を入力してください。"という文字列を出力せよ(出力後に改行はしない)
          System.out.println("無効な数字の選択です。1から5の数字を入力してください。");
      }
    }
  }

  //プライベート設定かつ静的で、戻り値がなく、Library型の引数libraryを受け取るdisplayAllBooksという名前のメソッドを作成せよ
  private static void displayAllBooks(Library library) {

    //変数libraryのgetAllBooksメソッドを呼び出し、その戻り値をList<Book>型で作成した変数allBooksに代入せよ
    List<Book> allBooks = library.getAllBooks();

    //改行してから"登録されている本の一覧:"という文字列を出力し、さらに改行せよ
    System.out.println("\n-----登録されている本の一覧----------------------------------------");

    //displayResultsメソッドを呼び出し、引数に変数allBooksを渡せ
    displayResults(allBooks);
  }

  //プライベート設定かつ静的で、戻り値がなく、List<Book>型の引数booksを受け取るdisplayResultsという名前のメソッドを作成せよ
  private static void displayResults(List<Book> books) {

    //もし変数booksのisEmptyメソッドを呼び出し、変数booksが空かどうかを判定。空である(trueを返す)場合、以下の処理を実行せよ
    if (books.isEmpty()) {

      //"本が見つかりません"という文字列を出力し、改行せよ
      System.out.println("本が見つかりません");

      //変数booksが空でない(falseを返す)場合、以下の処理を実行せよ
    } else {

      //変数booksの要素を先頭から順に取り出し、各要素をBook型の変数bookに入れよ
      for (Book book : books) {

        //変数bookのgetTitleメソッドを呼び出し、その戻り値の前に"・『 "を連結、後に" 』, 著者: "を連結し、bookのgetAuthorメソッドを呼び出し、
        //その戻り値に", 番号: "を連結し、さらにbookのgetNumberメソッドを呼び出し、その戻り値を連結したものを出力せよ
        System.out.println(
            "・『 " + book.getTitle() + " 』, 著者: "
                + book.getAuthor() + ", 番号: " + book.getNumber());
      }
    }
  }
}
