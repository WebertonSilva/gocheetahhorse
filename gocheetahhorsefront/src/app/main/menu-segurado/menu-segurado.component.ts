import { Component, OnInit } from '@angular/core';
import { Http, Headers, RequestOptions, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

import { UserService } from '../../services/user.service';
import { SetCiaService } from '../../services/setCia.service';

@Component({
  selector: 'app-menu-segurado',
  templateUrl: './menu-segurado.component.html',
  styleUrls: ['./menu-segurado.component.scss']
})
export class MenuSeguradoComponent implements OnInit {

  segurado;
  isAuth;
  localCredentials = localStorage.getItem('seguradoBB');
  empresa;
  credentials;

  constructor(private _service: UserService, private _setCiaService:SetCiaService){}
  

  ngOnInit() {
    if (this.localCredentials) {
      this.credentials = this.localCredentials;
      
    } else {
      this.credentials = {cpf: '38961873091', indAcesso: '1'};
    }
    

    this._service.addUser('https://gch-back-rest.herokuapp.com/rest/login', this.credentials).subscribe(
      user => {
          localStorage.setItem('segurado', JSON.stringify(user));
          this.segurado = JSON.parse(localStorage.getItem('segurado'));
          console.log(this.segurado);
          this.isAuth = true;
          if (this.segurado.empresa === 'Cheetah') {
            this.empresa = 1;
          }
          else if (this.segurado.empresa === 'Horse') {
            this.empresa = 2
          }
          this._setCiaService.changeCia(this.empresa);
          
      },
      erro => {
        this.isAuth = false;
        this._setCiaService.changeCia('');
      }
    );

    
  }

}
