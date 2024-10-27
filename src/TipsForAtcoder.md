# 覚えたアルゴリズム
- 二分探索  
- lowerbound (x.copareTo(y) ≥ 0) ? 1 : -1　(key以上)  
- upperbound (x.copareTo(y) > 0) ? 1 : -1　(keyより大きい)  
- bit全探索  　
---
# 忘れがちな解法
## 座標の移動
- 上下左右斜めの8か所  
di { -1, -1, -1,  0, 0,  1, 1, 1}  
dj { -1,  0,  1, -1, 1, -1, 0 ,1}  
- 上下左右の4か所
di {-1, 1,  0, 0}  
dj { 0, 0, -1, 1} 
これをforでループさせれば8方向すべてを見ることができる  


## intとlongに注意  
左辺がlongでも、右辺でintの変数を扱っていてintの範囲を超えればオーバーフローを起こす
対策は右辺でintの範囲を超える可能性がある計算には(long)でキャストをしておく

----------------
# 変換

## charから数字に変換  
charから'0'を引くとint型に変換できる
```java
char c = '5';
int num = c - '0';  // numに 5 が入る
```
もしも c から num へそのまま渡すと53という数字になる  
char型の '5' は 53、char型の '0' は 48 なので、'0'を引くとint型の5になる

### 数字が入っているStringから一桁ずつ取り出す
```java
String A = "123";
List<Integer> digitsA = new ArrayList<>();
for (int i = 0; i < A.length(); i++) {
    int digit = A.charAt(i) - '0';  // charをintに変換
    digitsA.add(digit);             // {1, 2, 3}というリストになる
}
```
-----
# Stringから特定の文字を取り除く

### Stringに用意されているsplitを利用する
```java
// split
String str = "One／Two／Three";
String[] count1 = str.split("／");
String[] count2 = str.split("／", 2);　// 二つ目の引数はlimit

count1 -> {One, Two, Three} // 要素数3
count2 -> {One, Two／Three} // 要素数2
// limitを指定するとlimit以降を全て受け取る
// つまり、2番目の引数が2の場合は最大2つに分割

-----------------------------------------------------

String str = "A.BC..D";
String[] split1 = str.split("."); // 正規表現の.は何か一文字を表すので全て該当する
String[] split2 = str.split("\\."); // JavaとRegex両方で\が必要になるので\\となる
String[] split4 = str.split(Pattern.quote("."));
String[] split3 = str.split("[.]");
(Arrays.toString(split1)); // → [] ※長さ0の文字列
(Arrays.toString(split2)); // → ["A", "BC", "", "D"]
(Arrays.toString(split3)); // → 同上
(Arrays.toString(split4)); // → 同上
```
## String.split(String regex, int limit)
### -1をつける意味  
もしも最後の文字が分割に指定された文字だった場合、""の要素が追加される

```java
/*   [,] で分割   */
String text = "apple,banana,,cherry,";

String[] fruits = text.split(",");
fruits ==> String[4] { "apple", "banana", "", "cherry" }

String[] fruitsNoEmpty = text.split(",", -1);
fruitsNoEmpty ==> String[5] { "apple", "banana", "", "cherry", "" }
```
---
## String.formatの例
```java
(String.format("整数: %d, 文字列: %s", 42, "テスト"));   // 基本的な使用法
(String.format("小数点以下2桁: %.2f", 3.14159));       // 小数点以下の桁数指定
(String.format("5桁で0埋め: %05d", 42));               // 0埋め
(String.format("左寄せ(10文字):<%-10s>", "左"));       // 左寄せ
(String.format("右寄せ(10文字):|%10s|", "右"));        // 右寄せ
// 整数: 42, 文字列: テスト
// 小数点以下2桁: 3.14
// 5桁で0埋め: 00042
// 左寄せ(10文字):<左         >
// 右寄せ(10文字):|         右|
``` 
---
