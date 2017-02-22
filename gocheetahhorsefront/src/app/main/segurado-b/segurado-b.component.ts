import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

import { UserService } from '../../services/user.service';
import { SetCiaService } from '../../services/setCia.service';

@Component({
  selector: 'app-segurado-b',
  templateUrl: './segurado-b.component.html',
  styleUrls: ['./segurado-b.component.scss']
})
export class SeguradoBComponent implements OnInit {

  seguradoBB;

  formSeguradoBB: FormGroup = new FormGroup({
    dtNascimento: new FormControl(),
    cpf: new FormControl()
  });

  constructor(private _service: UserService, private _setCiaService:SetCiaService) {}

  ngOnInit() {
    this._setCiaService.changeCia(2);
  }

  getSegurado() {
    let cpf = this.formSeguradoBB.get('cpf').value;
    let segurado = {
      cpf: '38961873091',
      dataNascimento: 315532800000,
      indAcesso: '1'
    }

    console.log(segurado);

     this._service.addUser('https://gch-back-rest.herokuapp.com/rest/login', segurado).subscribe(user => {
        this.seguradoBB = user;
        console.log(this.seguradoBB);
      });
  }

}
