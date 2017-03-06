import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';

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

  constructor(private _service: UserService, private _setCiaService:SetCiaService, private _router: Router,) {}

  ngOnInit() {
    this._setCiaService.changeCia(2);
    localStorage.removeItem('seguradoBB');
  }

  getSegurado() {
    let cpf = this.formSeguradoBB.get('cpf').value;
    this.seguradoBB = {
      cpf: cpf,
      dtNascimento: '315543600000',
      indAcesso: '2'
    }
    console.log(this.seguradoBB);
    localStorage.setItem('seguradoBB', JSON.stringify(this.seguradoBB));
    this._router.navigate(['/menu-segurado']);
  }

}
