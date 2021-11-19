def tetoranatchi(n)
  return if n < 1
  a, b, c, d = 0, 0, 1, 2 #0 0 1 2 3 6 12 23 44 
  (n - 1).times { a, b, c, d = b, c, d, a + b + c + d}
  a
end

puts "数を出したいのは何列目の項ですか？"
n = gets.to_i
puts "#{n}列目の項は#{tetoranatchi(n)}です"