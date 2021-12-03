n = 30
a = 20
result = [] #空の格納庫
for i in 1..n #1からn回数分処理を繰り返す
    d = n%i
    if d == 0 && i <= a #答えが余りなし且つaよりも小さい数字
      result << i #3行目のresult[]にtrue条件の数字が格納される
    end
end
puts result.sum #result内に格納されている数字を全て足す