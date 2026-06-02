//promise


 let promise1= new Promise((resolve,reject) =>{
       setTimeout(()=>{
        let here = true;
        if(here){
            resolve("success");
        }
        else{
            reject("fail");
        }
       },2000);
    });


promise1 
.then((resolve) =>{
    console.log(resolve);
})
.catch((error)=>{
    console.log(error);
})

console.log("In Progress..");