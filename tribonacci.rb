def tribonacci(n)
  return if n < 1
  a, b, c = 0, 0, 1 #0 0 1 1 2 4 7 13 23
  (n - 1).times { a, b, c = b, c, a + b + c}
  a
end

puts "数を出したいのは何番目の項ですか？"
n = gets.to_i
puts "#{n}項目の数字は#{tribonacci(n)}"