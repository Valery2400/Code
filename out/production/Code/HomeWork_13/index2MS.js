function getStudent(){
    return new Promise ((resolve, reject)=>{
        setTimeout(()=>{
            resolve({name: "Anri", age:32});
        },4000)
    });
};
let x;

getStudent().then((student)=>{
    console.log("hello");
    console.log(student.name)// Anri
    x = student.name;
    console.log("внутри колбека",x); // выведется вторым Anri
});
console.log("снаружи колбека",x) // выведется первым undefined