def tribonacci(n)
  return if n < 0
  a, b, c = 1, 0, 5
  (n - 1).times { a, b, c = b, c, a + b + c}
  a
end

puts "数を出したいのは何番目の項ですか？"
n = gets.to_i
puts "#{n}項目の数字は#{tribonacci(n)}"