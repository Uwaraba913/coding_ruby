#素数を判定するためのコード
require "prime"
def
N = gets.to_i
    if N.prime?
        judge = "YES"
    else
        judge = "NO"
    end
    
end
puts judge