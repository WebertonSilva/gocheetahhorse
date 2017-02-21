"use strict";
var express = require("express");
var path = require('path');
var bodyParser = require('body-parser');
var app = express();
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));
app.get('/jwt', function (req, res) {
    res.setHeader("Access-Control-Allow-Origin", "*");
    res.json([{ "nome": "João", "IsAuth": true, "seguradora": 1 },
        { "nome": "Maria", "IsAuth": true, "seguradora": 2 }]);
    console.log("Deu GET no /jwt");
});
app.get('/', function (req, res) {
    res.setHeader("Access-Control-Allow-Origin", "*");
    res.sendFile(path.join(__dirname + '/index.html'));
    console.log("Entrou no index");
});
app.post('/post', function (req, res) {
    res.header("Access-Control-Allow-Origin", "*");
    res.header("Access-Control-Allow-Headers", "Cache-Control, Pragma, Origin, Authorization, Content-Type, X-Requested-With");
    res.header("Access-Control-Allow-Methods", "GET, PUT, POST");
    console.log('req.body', req.body);
    if (req.body.seguradora === 1) {
        res.send({ "IsAuth": true, "seguradora": 1 });
    }
    else if (req.body.seguradora === 2) {
        res.send({ "IsAuth": true, "seguradora": 2 });
    }
});
app.listen(3000, function () {
    console.log('Funcionando na porta 3000!');
});
//# sourceMappingURL=servidor.js.map