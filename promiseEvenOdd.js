function promise1(num){
    return new Promise((resolve,reject)=>{

        if(num % 2 !=0){
            resolve("resolve it");
        }
        else{
            reject("your reject");
        }
    })
}
promise1(5)

    .then((resolve) =>{
    console.log(resolve)
    })  
    .catch((error)=>{
        console.log(error);
    });