//このクラスは、org.exampleパッケージに属す
package org.example;

//java.utilパッケージからListクラスを取り込め

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
  }
}
