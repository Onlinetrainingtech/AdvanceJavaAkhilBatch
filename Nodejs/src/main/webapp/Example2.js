/**
 * 
 */
 
 var h1=require('http')
h1.createServer(function(req,res){
    res.writeHead(500);
    res.end("Welcome to the Nodejs Application")
    
}).listen(8081)
console.log("Server is Running..")