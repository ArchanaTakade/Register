// async function getApi() {
//     const aa = document.getElementById('inp-1').value;
//     const url = 'http://localhost:8080/usr/'+ aa;
//     let result = await fetch(url, {method: 'DELETE'});
//     let rs = await result.json();
//     console.log(rs);
// }
// document.getElementById('btn-2').addEventListener('click', function () {
//     addStd();
// });

// function getData(){
//     const name = document.getElementById('inp-1').value;
//     // localStorage.setItem("my-name",'name')
//     document.getElementById('name').innerHTML = 'hello'+ name;
// }

// document.getElementById('btn-1').addEventListener('click',function({
//     m1
// }))

 async function addStd() {
    let result = await fetch('https://dummy.restapiexample.com/api/v1/employees');
    const url = 'http://localhost:8080/signup'
    let result = await fetch(  url,    { method: 'POST',
      headers: {"Content-Type": "application/json"}, 
     body: JSON.stringify({
      username: "kirti@gmail.com", 
  password: "9763455" })  }  );
    let rs = await result.json();
    console.log("Hello");

    for(let )
}

document.getElementById('btn-1').addEventListener('click', function () {
    getStd();
});

// async function addStd() {
//     // let result = await fetch('https://dummy.restapiexample.com/api/v1/employees');
//     const url = 'http://localhost:8080/login'
//     let result = await fetch(  url,    { method: 'POST',
//       headers: {"Content-Type": "application/json"}, 
//      body: JSON.stringify({
//       name: "Ramu Kaka", 
//   address: "vadodara" })  }  );
//     let rs = await result.json();
//     console.log(rs);
// }

// document.getElementById('btn-1').addEventListener('click', function () {
//     getStudentData();
// });


// async function getStudentData() {
//     const password = document.getElementById('inp-1').value;
//     const url = 'http://localhost:8080/student?dashboard'+ password;
//     let result = await fetch(url, {method: 'GET',
//      headers: {"content-Type": "application/json"},
//       body: JSON.stringify({
//         name:"",
//         address:""})});
//     let rs = await result.json();
//     console.log(rs);
// }
// document.getElementById('btn-1').addEventListener('click', function () {
//     getStudentData();
// });

