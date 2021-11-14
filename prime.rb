#素数を判定するためのコード
require "prime"
N = gets.to_i
    if N.prime?
        judge = "YES"
    else
        judge = "NO"
    end
puts judge