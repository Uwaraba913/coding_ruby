#入力した値を素因数分解する処理
require 'prime'
input = gets.to_i
judge = Prime.prime_division(input).map {|p, e| [p] * e }.flatten
puts judge