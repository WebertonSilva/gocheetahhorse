import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Http, Headers, RequestOptions, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';


@Component({
  selector: 'app-callcenter',
  templateUrl: './callcenter.component.html',
  styleUrls: ['./callcenter.component.scss']
})
export class CallcenterComponent implements OnInit {
  cor;
  idAuth;
  atendente;

  formCallCenter: FormGroup = new FormGroup({
    cpf: new FormControl(),
    radio1: new FormControl(),
    radio2: new FormControl()
  });

  constructor() { 
    this.cor= 'green';
    this.idAuth = true;
    this.atendente = 'Joelma';
  }

  ngOnInit() {
  }

}
