#入力された文字を+で囲む
S = gets
F = S.length + 1
puts "+" * F
puts "+" + S.chomp + "+" #chompは改行をしなくなるメソッド
puts "+" * F