import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { Http, Headers, RequestOptions, Response } from '@angular/http';
import { FormGroup, FormControl } from '@angular/forms';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

import { UserService } from '../../services/user.service';
import { SetCiaService } from '../../services/setCia.service';

@Component({
  selector: 'app-corretor',
  templateUrl: './corretor.component.html',
  styleUrls: ['./corretor.component.scss']
})
export class CorretorComponent implements OnInit {
  
  credentials = {cpf: '38961873091', indAcesso: '1'};
  idAuth;
  corretor;

  formCpfSegurado: FormGroup = new FormGroup({
    cpf: new FormControl()
  });
  
  constructor(private _service: UserService, private _setCiaService:SetCiaService) {}

  ngOnInit() {
    this._setCiaService.changeCia(1);
    this._service.addUser('https://gch-back-rest.herokuapp.com/rest/login', this.credentials).subscribe(
      user => {
          this.corretor = user;
          localStorage.setItem('corretor', JSON.stringify(this.corretor));
          this.idAuth = true;
      },
      erro => {
        this.idAuth = false;
      }
    );
  } 

  // getSegurado() {
  //   let cpf = this.formCpfSegurado.get('cpf').value;
  //   let segurador = {
  //     cpf: cpf,
  //     codCia: 1
  //   }

  //   console.log(segurador);
  //    this._service.addUser('https://gch-back-rest.herokuapp.com/rest/login', segurador).subscribe(user => {
  //       this.segurado = user;
  //       console.log(this.segurado);
  //     });
  // }

}
