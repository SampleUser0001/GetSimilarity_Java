package sample.similarity;

import org.apache.lucene.search.spell.LevensteinDistance;

/**
 * とりあえずレーベンシュタイン距離を取得してみる。
 */
public class App {
  public static void main( String[] args ) {
    String str1 = args[0];
    String str2 = args[1];

    System.out.println( String.format("str1 : %s",str1) );
    System.out.println( String.format("str2 : %s",str2) );
    System.out.println( String.format("similarity : %f", new LevensteinDistance().getDistance(str1, str2)));
  }
}
