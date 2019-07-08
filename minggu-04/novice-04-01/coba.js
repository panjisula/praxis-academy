var http = require("http");

http.createServer(function (request, response){
    //mengirim ke header HTTP
    //HTTP Status:200 : OK
    //Content Type: text/plain
    response.writeHead(200, {'Content-Type': 'text/plain'});

    //mengirim response ke body sebagai "Hello World"
    response.end('Hello World\n');
}).listen(8081);

//console akan mencetak pesan
console.log('server running at http://127.0.0.1:8081/');