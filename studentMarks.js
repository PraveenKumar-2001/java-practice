function student(mark){
    return new Promise((resolve,reject)=>{

        if(mark >= 50){
            resolve("Pass");
        }
        else{
            reject("Fail");
        }
    })
}
student(45)

    .then((resolve) =>{
    console.log(resolve)
    })  
    .catch((error)=>{
        console.log(error);
    });