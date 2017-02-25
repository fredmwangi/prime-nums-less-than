#!/usr/bin/ruby

prime = true
primes = []
puts "Enter and integer:"
number = gets.to_i

for x in (2...number)
  prime = true
  for j in (2...x)
    if x % j == 0
      prime = false
      break
    end
  end
  if prime == true
    primes.push(x)
  end
end

p primes
