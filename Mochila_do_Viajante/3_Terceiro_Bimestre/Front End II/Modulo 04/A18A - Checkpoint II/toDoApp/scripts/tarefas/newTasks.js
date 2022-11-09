// @ Criando um novo usuário pela API
// let cadastroJson = JSON.stringify(novoUsuario);
let endPointTasks = "https://ctd-todo-api.herokuapp.com/v1/tasks";
let tokenJwt = localStorage.getItem("jwt");

let newTask =
{
  "description": "Aprender avascript",
    "completed": false
}

let configNewTasks = {
  method: 'POST',
  body:
    newTask,
  headers: {
    'content-type': 'application/json',
    'authorization': tokenJwt,
  },
};

fetch(endPointTasks, configNewTasks).then(
  result => {
    if (result.status == 201) {
      return result.json();
    }
  }
).then((result) => {
  console.log(result);
 })
// .catch(
//   erro => {
//     console.log(erro);
//   }
// );
//   } else {
//   alert("Ambos os campos devem ser preenchidos !");
// }
// });
