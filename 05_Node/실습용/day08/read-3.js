const path = require('path');

fs = require('fs');
filepath = path.join(__dirname, 'example.txt');

fs.readFile(filepath, 'utf-8', (err, data) => {
  if (err) {
    console.error(err);
  }
  console.log(data);
});
