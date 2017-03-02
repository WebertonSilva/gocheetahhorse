import { Component, OnInit } from '@angular/core';
import { SetCiaService } from '../../services/setCia.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {


  constructor(private _setCiaService:SetCiaService) { 
    _setCiaService.changeCia('');
  }
  
  ngOnInit() {
    this._setCiaService.changeCia('');
    localStorage.removeItem('seguradoBB');
    localStorage.removeItem('segurado');
  }

}
