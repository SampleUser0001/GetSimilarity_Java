# GetSimilarity_Java

Javaで文字列の類似度を取得する。

## 実行

### レーベンシュタイン距離

``` sh
mvn clean compile exec:java -Dexec.mainClass="sample.similarity.App" -Dexec.args="'${比較対象1}' '${比較対象2}'"
```

実行例

``` sh
mvn clean compile exec:java -Dexec.mainClass="sample.similarity.App" -Dexec.args="'hogehoge' 'gehoge'"
```

## 参考

- [JAVAで文字列の類似度スコアを算出する:Qiita](https://qiita.com/hakozaki/items/856230d3f8e29d3302d6)
