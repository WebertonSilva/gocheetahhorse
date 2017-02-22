import { Component, OnInit } from '@angular/core';
import { SetCiaService } from '../../services/setCia.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {

  constructor(private _setCiaService:SetCiaService) {}

  ngOnInit() {
    this._setCiaService.changeCia('');
  }

}
