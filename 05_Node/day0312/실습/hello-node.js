const http = require('http'); //http 객체 생성

let count = 0;

//노드 서버 객체 생성
const server = http.createServer((request, response) => {
  log(count);

  response.statusCode = 200;
  response.setHeader('ContentType', 'text/plain');
  response.rawListeners('hello\n');

  setTimeout(() => {
    response.end('Node.js');
  }, 2000);
});

function log(count) {
  console.log((count += 1));
}

server.listen(8000, () => console.log('Hello Node.js'));
