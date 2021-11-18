def fibonacci(n)
  return if n < 0 #nが0より小さいなら処理を抜け出す
  a, b = 0, 1 
  (n - 1).times { a, b = b, a + b} #n回分{}内の処理を繰り返す
  a
end

puts "数を出したいのは何番目の項ですか？"
n = gets.to_i
puts "#{n}項目の数字は#{fibonacci(n)}"