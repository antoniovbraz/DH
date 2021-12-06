const person = [
  {
    sexo: 'F',
    nome: 'Abigael Natte',
    altura: 1.61,
  },
  {
    sexo: 'M',
    nome: 'Ramon Connell',
    altura: 1.75,
  },
  {
    sexo: 'M',
    nome: 'Jarret Lafuente',
    altura: 1.55,
  },
  {
    sexo: 'F',
    nome: 'Ansel Ardley',
    altura: 1.67,
  },
  {
    sexo: 'F',
    nome: 'Jacki Shurmer',
    altura: 1.75,
  },
  {
    sexo: 'M',
    nome: 'Jobi Mawtus',
    altura: 1.88,
  },
  {
    sexo: 'M',
    nome: 'Thomasin Latour',
    altura: 1.67,
  },
  {
    sexo: 'F',
    nome: 'Lonnie Verheijden',
    altura: 1.63,
  },
  {
    sexo: 'M',
    nome: 'Alonso Wannan',
    altura: 1.92,
  },
  {
    sexo: 'F',
    nome: 'Bendite Huggett',
    altura: 1.8,
  },
]

function smallerTaller(person) {
  let height = person.sort((a, b) => {
    return a.altura - b.altura
  })

  let smaller = height[0]
  let taller = height[person.length - 1]
  return `A maior pessoa do grupo é ${taller.nome}: ${taller.altura}m, e \n menor pessoa é ${smaller.nome}: ${smaller.altura}m.`
}

console.log(smallerTaller(person))

function mediaAlturaMulheres(person) {
  let listaMulheres = person
    .filter((item) => {
      return item.sexo === 'F'
    })
    .map((item) => {
      return item.altura
    })

  return (
    listaMulheres.reduce((acc, num) => {
      return acc + num
    }) / listaMulheres.length
  )
}

console.log(mediaAlturaMulheres(person))

function numeroHomens(person) {
  return person.filter((item) => {
    return item.sexo === 'M'
  }).length
}
console.log(numeroHomens(person))
