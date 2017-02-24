import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Http, Headers, RequestOptions, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

import { UserService } from '../../services/user.service';
import { SetCiaService } from '../../services/setCia.service';

@Component({
  selector: 'app-callcenter',
  templateUrl: './callcenter.component.html',
  styleUrls: ['./callcenter.component.scss']
})
export class CallcenterComponent implements OnInit {

  credentials = {cpf: '22666755592', indAcesso: '1'};
  idAuth;
  atendente;
  tipoSeguradora;

  formCallCenter: FormGroup = new FormGroup({
    cpf: new FormControl(),
    seguradora: new FormControl(),
  });

  constructor(private _service: UserService, private _setCiaService:SetCiaService) {}

  ngOnInit() {
    this._setCiaService.changeCia('');
    this._service.addUser('https://gch-back-rest.herokuapp.com/rest/login', this.credentials).subscribe(
      user => {
          this.atendente = user;
          localStorage.setItem('atendente', JSON.stringify(this.atendente));
          this.idAuth = true;
      },
      erro => {
        this.idAuth = false;
      }
    );
  } 

  setSeguradora (option) {
    if (option === 1) {
      this._setCiaService.changeCia(1);
      this.tipoSeguradora = 1;
    } else {
      this._setCiaService.changeCia(2);
      this.tipoSeguradora = 2;
    }
  }

}
