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

char a = '7'
int b = Character.getNumericValue(a); // bに 7 が入る
```
もしも c から num へそのまま渡すと53という数字になる  
char型の '5' は 53、char型の '0' は 48 なので、'0'を引くとint型の5になる
## charにintを入れる方法
```java
int cnt = 5;
char a = (char) ('0' + cnt);  // 数値を文字に変換
System.out.println(a);  // 出力: 5
```
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

## Stringに用意されているsplitを利用する
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

## Stringでよく使うメソッド
```java
s.length();             //文字列の長さを返す
s.compareTo(t);         //辞書順で比較する
s.charAt(0);            //指定したインデックスの値を返す
s.substring(2,5);       //部分文字列を返す
s.indexOf(t);           //指定した文字列が最初に出現するインデックスを返す
s.lastIndexOf(t);       //指定した文字列が最後に出現するインデックスを返す
s.startsWith(t);        //文字列が指定された接頭詞で始まるか判定する
s.endsWith(t);          //文字列が指定された接尾詞で終わるか判定する
s.contains(t);          //指定した文字列を含むか調べる
s.matches("\\w+");      //指定した正規表現と一致するか判定する
s.toLowerCase();        //小文字に変換する
s.toUpperCase();        //大文字に変換する
s.replace('b','m');     //文字を置換する
s.replace("b","tri");   //文字列を置換する
s.replaceAll("[0-9]+","10"); //正規表現を用いて置換する
s.split("n");           //文字列を正規表現によって分割する
String.format("%04d", 123); //フォーマットした文字列を返す
String.valueOf(5);      //Integer.toString(5) と同じ


```
## 出力の文字色を変える
### 方法
色変更のためのエスケープシークエンスを入れる
### 例
色のコード + [文字や変数] + "\u001b[00m"
```Java
static String red    = "\u001b[00;31m";
static String green  = "\u001b[00;32m";
static String yellow = "\u001b[00;33m";
static String purple = "\u001b[00;34m";
static String pink   = "\u001b[00;35m";
static String cyan   = "\u001b[00;36m";
static String end    = "\u001b[00m";

String[] names = new String[]{red,green,yellow,purple,pink,cyan};

for(int i=0; i< names.length; i++){
    System.out.println(names[i]+"hello"+end);
}
```
---
# 3次元の配列
```java
char[][][] sample = new char[3][4][5];
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++) {
        for (int k = 0; k < 5; k++) {
            sample[i][j][k] = '.';
        }
    }
}
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++) {
        for (int k = 0; k < 5; k++) {
            System.out.print(sample[i][j][k]);
        }
        System.out.println();
    }
	System.out.println();
}
.....
.....
.....
.....

.....
.....
.....
.....

.....
.....
.....
.....
```
配列に対してfor文でアクセスする場合、最初に変化する一番内側のループが配列の右端に対応する
つまり、配列の[]の順番でfor文を回せば良い

---
# sort
## int[]のソート
```java
int[] arr = {5, 3, 8, 1, 4};
Arrays.sort(arr);  // 昇順ソート
System.out.println(Arrays.toString(arr));  // [1, 3, 4, 5, 8]

Integer[] arr = {5, 3, 8, 1, 4};
Arrays.sort(arr, Collections.reverseOrder());  // 降順ソート
System.out.println(Arrays.toString(arr));  // [8, 5, 4, 3, 1]
※降順の場合はint[]からInteger[]に変換が必要です。
```
## Listのソート
```java
List<Integer> list = new ArrayList<>();
list.add(5);
list.add(3);
list.add(8);
list.add(1);
list.add(4);

Collections.sort(list);  // 昇順ソート
System.out.println(list);  // [1, 3, 4, 5, 8]

Collections.sort(list, Collections.reverseOrder());  // 降順ソート
System.out.println(list);  // [8, 5, 4, 3, 1]
```
## String[]のソート
```java
String[] num = new String[5];
num[0] = "4";
num[1] = "2";
num[2] = "10";
num[3] = "1";
num[4] = "22";

Arrays.sort(num)

num ==> String[5] { "1", "10", "2", "22", "4" }
// 最初の文字が比較され、同じであれば次の文字で比較される。
// つまり、1, 2 , 4 , 10 , 22とはならない。
// 最大値の桁数に満たない数字は0で埋める必要がある。（最大値が100であれば001）
num[0] = "04";
num[1] = "02";
num[2] = "10";
num[3] = "01";
num[4] = "22";

Arrays.sort(num)

num ==> String[5] { "01", "02", "04", "10", "22" }
```

## compareを利用したソート
```java
List<Integer> numbers = Arrays.asList(3, 2, 5, 4, 1);
Collections.sort(numbers, (a, b) -> a - b); // 昇順
Collections.sort(numbers, (a, b) -> b - a); // 降順
```

## 複数条件を指定してソート
```java
// MenuListクラスはint price , String itemを持っている
Collections.sort(menuList, (a, b) -> {

    // priceが最優先でソートされる
    if (a.price != b.price) {
        return (a.price - b.price);  // 昇順
        // return -(a.price - b.price);    // 降順

        // priceが同じあればitemでソート
    } else {
        return a.item.compareTo(b.item);        // 昇順
        // return -(a.item.compareTo(b.item));  // 降順

        // もしさらに項目を増やしたければ、上をelse ifにしてここからelseで条件を指定
        // else { // ここに追加 }
    }
});
```
### (a, b) -> a - b の場合分け（昇順）
- a > b なら、 b a  
正の値(1)が返り、aが後ろに回る  
- a < b なら、 a b の並びになる  
負の値(1)が返り、aの位置はそのまま。

### (a, b) -> b - a の場合分け（降順）
- b > a なら、 b a  
正の値(1)が返り、bの位置はそのまま。  
- b < a なら、 a b の並びになる  
負の値(1)が返り、bが後ろに回る  
### 意識すること
- aとbの位置関係とその大小の関係が重要
- 比較した時に、aが大きい場合は位置が変わる
- 単純な考え方をすれば、aが符号の向いている方に移動するということ
（a - b　なのに b < a といったように位置関係を変えてはいけない）


# bit全探索
## 外側のfor文
```java
for (int bit = 0; bit < 1 << N; bit++) { ... }
N = 3 の場合、1 << 3  = 8
つまり bit < 8 の条件式
bit = 0 (000): 空集合 []
bit = 1 (001): {C}
bit = 2 (010): {B}
bit = 3 (011): {B, C}
bit = 4 (100): {A}
bit = 5 (101): {A, C}
bit = 6 (110): {A, B}
bit = 7 (111): {A, B, C}
```
## 内側のfor文
```java
for (int i = 0; i < N; i++) {
    if ((bit & (1 << i)) != 0) { ... }
}
N = 3, bit = 5 の時、
i = 0,1,2 とループする
1 << 0 = 1 (001)
1 << 1 = 2 (010)
1 << 2 = 4 (100)
となり、bit & で各桁を比較して、共に1となっている場合は != 0 となる

bit 5 (101) と比較すると、
0b101 & 0b001 = 1
0b101 & 0b010 = 0
0b101 & 0b100 = 1
001,100 が != 0 となり、true を返す
(※Javaで2進数として計算する時は0bをつける)
```
## ビット全探索の利点
- メモリ効率が良い
- 高速な処理が可能
- 部分集合の全列挙が簡潔に記述できる
## 注意点
ビット全探索は要素数が限られている場合に最適
要素数が大きすぎると計算量が指数関数的に増加
# 座標などで重複しない2つの値を保持する方法

## AbstractMap.SimpleEntry
```java
Set<AbstractMap.SimpleEntry<Integer, Integer>> pos = new HashSet<>();

        // 座標[1,3]と[5,3]を追加
        pos.add(new AbstractMap.SimpleEntry<>(1, 3)); // true
        pos.add(new AbstractMap.SimpleEntry<>(5, 3)); // true

        // 同じ値を渡すとfalseが返り追加されない
        pos.add(new AbstractMap.SimpleEntry<>(1, 3)); // false

```

## HashSet\<String\> 
```java
Set<String> pos = new HashSet<>();
// 追加する座標など
int a = 1;
int b = 3;

// ","を追加して座標を表現
pos.add(a + "," + b);

// ただし、数値化する時はHashSetのためgetなどはできず、foreachなどで全てを呼び出さなければならない
```

## List<int[]>, List<object[]>

### List<int[]>
- int[]の要素をgetで取り出してから、[0]か[1]にアクセスする
- 要素の変更を行いたい場合は、set(index, new int[])で行う
```Java
List<int[]> list = new ArrayList<>();

// ペアを追加
list.add(new int[]{3, 5});
list.add(new int[]{7, 9});
list.add(new int[]{1, 2});

// 3つ目の要素のint[1]を取得
int[] thirdPair = list.get(2); 
int value = thirdPair[1];

System.out.println("3つ目の要素のint[1]: " + value);

// 2番目の要素を変更
list.set(1, new int[]{10, 100});
```
### List<Object[]>
- 取り出すときはList<int[]>の時と同じだが、必ずキャストして取り出す必要がある
```Java
List<Object[]> list = new ArrayList<>();

// 異なる型の要素を追加
list.add(new Object[]{3, "abc"});
list.add(new Object[]{7, "xyz"});

// リストの内容を出力
for (Object[] pair : list) {
    int number = (int) pair[0];
    String text = (String) pair[1];
    System.out.println("(" + number + ", " + text + ")");
}
# Deque クラス（デック）
## Dequeとは
double ended queue（両端キュー）の略
stackとqueue、どちらのようにも振る舞うことが可能
## Dequeの実装クラスは
- ArrayDeque: 挿入、削除、取得を両端でしか行わない場合、ArrayDequeのほうが高速に動作
- LinkedList: 配列の中間にアクセスする場合（containsやindexOfなど）は、LinkedListのほうが速い
```
