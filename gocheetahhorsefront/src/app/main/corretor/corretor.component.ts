import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { Http, Headers, RequestOptions, Response } from '@angular/http';
import { FormGroup, FormControl } from '@angular/forms';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';

import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-corretor',
  templateUrl: './corretor.component.html',
  styleUrls: ['./corretor.component.scss']
})
export class CorretorComponent implements OnInit {

  
  credentials = {name: 'Alfredo Luis', cpf: 53313447635, seguradora: 1};

  @Output()
  tipoSeguradora: EventEmitter<string> = new EventEmitter;

  isAuth;

  segurado;

  formCpfSegurado: FormGroup = new FormGroup({
    cpf: new FormControl(),
  });
  
  constructor(private _service: UserService) {}

  ngOnInit() {
    this._service.addUser('http://localhost:3000/post', this.credentials).subscribe(users => {
        this.isAuth = users.IsAuth;
        this.tipoSeguradora.emit(users.seguradora);
        console.log(users);
      });
  } 

  getSegurado() {
    let cpf = this.formCpfSegurado.get('cpf').value;
    let segurador = {
      dataNascimento: 1340128712111,
      cpf: cpf,
      codCia: 1
    }

    console.log(segurador);
     this._service.addUser('https://gch-back-rest.herokuapp.com/rest/login', segurador).subscribe(users => {
        this.segurado = users;
        console.log(this.segurado);
      });
  }

}
