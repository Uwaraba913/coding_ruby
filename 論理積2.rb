#論理積の式2
A,B = gets.split(" ").map &:to_i #2つの数値を入力する
if A == 1 || B == 1 #AもしくはBが1のときtrue
    answer = 1
else
    answer = 0
end
puts answer