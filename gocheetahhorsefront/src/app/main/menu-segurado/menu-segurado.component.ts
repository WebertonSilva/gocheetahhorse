import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';

import { UserService } from '../../services/user.service';
import { SetCiaService } from '../../services/setCia.service';

@Component({
  selector: 'app-menu-segurado',
  templateUrl: './menu-segurado.component.html',
  styleUrls: ['./menu-segurado.component.scss']
})
export class MenuSeguradoComponent implements OnInit {

  indAcesso;

  constructor(private route:ActivatedRoute, private _service: UserService, private _setCiaService:SetCiaService ){}

  ngOnInit() {
    this.indAcesso = this.route.snapshot.params['indAcesso']; 
    this._setCiaService.changeCia(this.indAcesso);
  }

}
