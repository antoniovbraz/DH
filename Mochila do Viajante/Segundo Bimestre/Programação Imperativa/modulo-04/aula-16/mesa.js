let fizzOrBuzz = () => {
  for (n = 1; n <= 100; n++) {
    let fizzBuzz = ''
    if (n % 3 == 0) fizzBuzz += 'Fizz'
    if (n % 5 == 0) fizzBuzz += 'Buzz'
    console.log(fizzBuzz || n)
  }
}

fizzOrBuzz()
