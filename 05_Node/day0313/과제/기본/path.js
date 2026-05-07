const path = require('path');
const fullPath = path.join('some', 'work', 'ex.txt');

console.log(fullPath);

console.log(`파일 절대 경로 : ${__filename}`);

const dir = path.dirname(__filename);
console.log(`디렉토리 경로 : ${dir}`);

const filename = path.basename(__filename);
console.log(`확장명을 포함한 파일 이름 : ${filename}`);

const file = path.basename(__filename, '.js');
console.log(`확장명을 포함하지 않은 파일 이름 : ${file}`);

const ext = path.extname(__filename);
console.log(`파일 확장명 : ${ext}`);

const parsedPath = path.parse(__filename);
console.log(`파일 경로 요소 전체 : `, parsedPath);
